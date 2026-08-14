/**
 * Anger of Stick 5 - Ultra-Low-Latency 4-Player UDP Relay Server
 * Protocol: Binary UDP
 * Default Port: 7777
 */

const dgram = require('dgram');

const PORT = parseInt(process.env.PORT || '7777', 10);
const HOST = process.env.HOST || '0.0.0.0';
const HEARTBEAT_TIMEOUT_MS = 10000; // 10 seconds timeout

// Protocol constants
const MAGIC_BYTE = 0x53; // 'S'
const PROTO_VERSION = 0x01;

const PacketType = {
    JOIN_REQUEST: 0x01,
    JOIN_RESPONSE: 0x02,
    HEARTBEAT: 0x03,
    PLAYER_STATE: 0x04,
    ACTION_EVENT: 0x05,
    DAMAGE_EVENT: 0x06,
    SPAWN_PROXY: 0x07,
    DISCONNECT: 0x08,
    ROOM_LIST: 0x09
};

// Rooms storage: roomId -> Room object
// Room object: { id, createdAt, peers: Map<peerId, { address, port, lastSeen, slot }> }
const rooms = new Map();

// Client endpoint key -> { roomId, peerId }
const clientMap = new Map();

function getEndpointKey(address, port) {
    return `${address}:${port}`;
}

const server = dgram.createSocket('udp4');

server.on('error', (err) => {
    console.error(`[Server Error] ${err.stack}`);
    server.close();
});

server.on('message', (msg, rinfo) => {
    if (msg.length < 3) return;

    const magic = msg.readUInt8(0);
    const version = msg.readUInt8(1);
    const packetType = msg.readUInt8(2);

    if (magic !== MAGIC_BYTE || version !== PROTO_VERSION) {
        return; // Invalid packet
    }

    const endpointKey = getEndpointKey(rinfo.address, rinfo.port);

    switch (packetType) {
        case PacketType.JOIN_REQUEST: {
            handleJoinRequest(msg, rinfo, endpointKey);
            break;
        }
        case PacketType.HEARTBEAT: {
            handleHeartbeat(msg, rinfo, endpointKey);
            break;
        }
        case PacketType.PLAYER_STATE:
        case PacketType.ACTION_EVENT:
        case PacketType.DAMAGE_EVENT:
        case PacketType.SPAWN_PROXY: {
            handleRelayPacket(msg, rinfo, endpointKey, packetType);
            break;
        }
        case PacketType.DISCONNECT: {
            handleDisconnect(msg, rinfo, endpointKey);
            break;
        }
        default: {
            console.warn(`[Unknown Packet] Type 0x${packetType.toString(16)} from ${endpointKey}`);
            break;
        }
    }
});

function handleJoinRequest(msg, rinfo, endpointKey) {
    // Expected payload: magic(1) + ver(1) + type(1) + roomId(4) + preferredSlot(1)
    let roomId = 1;
    let preferredSlot = 0xFF; // 255 = any

    if (msg.length >= 7) {
        roomId = msg.readUInt32LE(3);
    }
    if (msg.length >= 8) {
        preferredSlot = msg.readUInt8(7);
    }

    let room = rooms.get(roomId);
    if (!room) {
        room = {
            id: roomId,
            createdAt: Date.now(),
            peers: new Map() // slot (0..3) -> client info
        };
        rooms.set(roomId, room);
        console.log(`[Room Created] Room ID: ${roomId}`);
    }

    // Check if client is already in room
    let assignedSlot = -1;
    for (const [slot, peer] of room.peers.entries()) {
        if (peer.endpointKey === endpointKey) {
            assignedSlot = slot;
            break;
        }
    }

    if (assignedSlot === -1) {
        // Find available slot (0 to 3)
        if (preferredSlot >= 0 && preferredSlot <= 3 && !room.peers.has(preferredSlot)) {
            assignedSlot = preferredSlot;
        } else {
            for (let s = 0; s < 4; s++) {
                if (!room.peers.has(s)) {
                    assignedSlot = s;
                    break;
                }
            }
        }
    }

    if (assignedSlot === -1) {
        // Room is full
        console.log(`[Join Rejected] Room ${roomId} full for ${endpointKey}`);
        sendJoinResponse(rinfo, 0x01 /* FULL */, 0xFF, roomId);
        return;
    }

    // Register peer
    const now = Date.now();
    const peerInfo = {
        slot: assignedSlot,
        address: rinfo.address,
        port: rinfo.port,
        endpointKey: endpointKey,
        lastSeen: now
    };
    room.peers.set(assignedSlot, peerInfo);
    clientMap.set(endpointKey, { roomId, peerId: assignedSlot });

    console.log(`[Peer Joined] Endpoint: ${endpointKey} assigned Slot: ${assignedSlot} in Room: ${roomId} (Total: ${room.peers.size}/4)`);
    sendJoinResponse(rinfo, 0x00 /* SUCCESS */, assignedSlot, roomId);

    // Notify all other peers in the room about the new peer
    const spawnNotice = Buffer.alloc(13);
    spawnNotice.writeUInt8(MAGIC_BYTE, 0);
    spawnNotice.writeUInt8(PROTO_VERSION, 1);
    spawnNotice.writeUInt8(PacketType.SPAWN_PROXY, 2);
    spawnNotice.writeUInt8(assignedSlot, 3);
    spawnNotice.writeUInt8(0 /* default hero */, 4);
    spawnNotice.writeFloatLE(0.0, 5); // x
    spawnNotice.writeFloatLE(0.0, 9); // y
    broadcastToRoom(room, spawnNotice, assignedSlot);
}

function sendJoinResponse(rinfo, status, assignedSlot, roomId) {
    // Response: magic(1) + ver(1) + type(1) + status(1) + peerId(1) + roomId(4)
    const resp = Buffer.alloc(9);
    resp.writeUInt8(MAGIC_BYTE, 0);
    resp.writeUInt8(PROTO_VERSION, 1);
    resp.writeUInt8(PacketType.JOIN_RESPONSE, 2);
    resp.writeUInt8(status, 3);
    resp.writeUInt8(assignedSlot, 4);
    resp.writeUInt32LE(roomId, 5);

    server.send(resp, 0, resp.length, rinfo.port, rinfo.address);
}

function handleHeartbeat(msg, rinfo, endpointKey) {
    const client = clientMap.get(endpointKey);
    if (!client) return;

    const room = rooms.get(client.roomId);
    if (!room) return;

    const peer = room.peers.get(client.peerId);
    if (peer) {
        peer.lastSeen = Date.now();
    }

    // Echo heartbeat back
    server.send(msg, 0, msg.length, rinfo.port, rinfo.address);
}

function handleRelayPacket(msg, rinfo, endpointKey, packetType) {
    const client = clientMap.get(endpointKey);
    if (!client) return;

    const room = rooms.get(client.roomId);
    if (!room) return;

    const peer = room.peers.get(client.peerId);
    if (peer) {
        peer.lastSeen = Date.now();
    }

    // Fan-out to all OTHER peers in the room
    broadcastToRoom(room, msg, client.peerId);
}

function handleDisconnect(msg, rinfo, endpointKey) {
    const client = clientMap.get(endpointKey);
    if (!client) return;

    removeClient(endpointKey, client.roomId, client.peerId);
}

function broadcastToRoom(room, buffer, senderSlot) {
    for (const [slot, peer] of room.peers.entries()) {
        if (slot !== senderSlot) {
            server.send(buffer, 0, buffer.length, peer.port, peer.address);
        }
    }
}

function removeClient(endpointKey, roomId, peerId) {
    clientMap.delete(endpointKey);
    const room = rooms.get(roomId);
    if (room) {
        room.peers.delete(peerId);
        console.log(`[Peer Left] Slot ${peerId} left Room ${roomId}. Remaining: ${room.peers.size}/4`);

        // Broadcast disconnect to remaining peers
        const discMsg = Buffer.alloc(4);
        discMsg.writeUInt8(MAGIC_BYTE, 0);
        discMsg.writeUInt8(PROTO_VERSION, 1);
        discMsg.writeUInt8(PacketType.DISCONNECT, 2);
        discMsg.writeUInt8(peerId, 3);
        broadcastToRoom(room, discMsg, peerId);

        if (room.peers.size === 0) {
            rooms.delete(roomId);
            console.log(`[Room Destroyed] Room ${roomId} empty and cleaned up.`);
        }
    }
}

// Timeout garbage collection for inactive peers
setInterval(() => {
    const now = Date.now();
    for (const [roomId, room] of rooms.entries()) {
        for (const [slot, peer] of room.peers.entries()) {
            if (now - peer.lastSeen > HEARTBEAT_TIMEOUT_MS) {
                console.log(`[Timeout Disconnect] Peer ${peer.endpointKey} (Slot ${slot}) timed out.`);
                removeClient(peer.endpointKey, roomId, slot);
            }
        }
    }
}, 3000);

server.on('listening', () => {
    const addr = server.address();
    console.log(`=======================================================`);
    console.log(`  Anger of Stick 5 UDP Relay Server Listening on ${addr.address}:${addr.port}`);
    console.log(`  Protocol Version: 0x01 | Magic: 0x53 ('S')`);
    console.log(`  Room Capacity: 4 Players per Room`);
    console.log(`=======================================================`);
});

server.bind(PORT, HOST);
