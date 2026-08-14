/**
 * Anger of Stick 5 - Dedicated 4-Player Matchmaking & UDP Relay Server
 * Handles rooms, player slots 0..3, lobby ready states, armory sync, and 60Hz telemetry fanout.
 */

const dgram = require('dgram');

const PORT = parseInt(process.env.PORT || '7777', 10);
const HOST = process.env.HOST || '0.0.0.0';

const AOS_MAGIC = 0x53; // 'S'
const AOS_VERSION = 0x02;

const PKT = {
    JOIN_REQUEST:   0x01,
    JOIN_RESPONSE:  0x02,
    HEARTBEAT:      0x03,
    PLAYER_STATE:   0x04,
    ACTION_EVENT:   0x05,
    DAMAGE_EVENT:   0x06,
    SPAWN_PROXY:    0x07,
    DISCONNECT:     0x08,
    LOBBY_STATE:    0x10,
    READY_TOGGLE:   0x11,
    START_GAME:     0x12,
    STAGE_CHANGE:   0x13,
    ARMORY_READY:   0x14
};

const STAGE = {
    LOBBY:        0,
    LEVEL_SELECT: 1,
    ARMORY:       2,
    IN_GAME:      3
};

class Room {
    constructor(id) {
        this.id = id;
        this.slots = [null, null, null, null]; // Slot 0 = Host, 1..3 = Clients
        this.readyMask = 0x01; // Host (Slot 0) is ready by default
        this.stage = STAGE.LOBBY;
        this.selectedLevel = 1;
        this.lastActivity = Date.now();
    }

    addPeer(address, port, preferredSlot) {
        this.lastActivity = Date.now();

        // Check if this peer already in a slot
        for (let i = 0; i < 4; i++) {
            const p = this.slots[i];
            if (p && p.address === address && p.port === port) {
                return i;
            }
        }

        // Try preferred slot first
        if (preferredSlot >= 0 && preferredSlot < 4 && !this.slots[preferredSlot]) {
            this.slots[preferredSlot] = { address, port, lastSeen: Date.now() };
            if (preferredSlot === 0) this.readyMask |= 0x01;
            return preferredSlot;
        }

        // Assign first free slot
        for (let i = 0; i < 4; i++) {
            if (!this.slots[i]) {
                this.slots[i] = { address, port, lastSeen: Date.now() };
                if (i === 0) this.readyMask |= 0x01;
                return i;
            }
        }

        return -1; // Room full
    }

    removePeer(peerId) {
        if (peerId >= 0 && peerId < 4 && this.slots[peerId]) {
            this.slots[peerId] = null;
            this.readyMask &= ~(1 << peerId);
            this.lastActivity = Date.now();
            return true;
        }
        return false;
    }

    getOccupiedMask() {
        let mask = 0;
        for (let i = 0; i < 4; i++) {
            if (this.slots[i]) mask |= (1 << i);
        }
        return mask;
    }

    getPlayersCount() {
        let count = 0;
        for (let i = 0; i < 4; i++) {
            if (this.slots[i]) count++;
        }
        return count;
    }

    broadcast(server, buffer, exceptPeerId = -1) {
        for (let i = 0; i < 4; i++) {
            const peer = this.slots[i];
            if (peer && i !== exceptPeerId) {
                server.send(buffer, 0, buffer.length, peer.port, peer.address, (err) => {
                    if (err) console.error(`[Room ${this.id}] Send error to Slot ${i}:`, err.message);
                });
            }
        }
    }

    broadcastLobbyState(server) {
        const buf = Buffer.alloc(11);
        buf.writeUInt8(AOS_MAGIC, 0);
        buf.writeUInt8(AOS_VERSION, 1);
        buf.writeUInt8(PKT.LOBBY_STATE, 2);
        buf.writeUInt8(this.getPlayersCount(), 3);
        buf.writeUInt8(this.getOccupiedMask(), 4);
        buf.writeUInt8(this.readyMask, 5);
        buf.writeUInt8(this.stage, 6);
        buf.writeUInt32LE(this.selectedLevel, 7);

        this.broadcast(server, buf);
    }
}

const rooms = new Map();

function getOrCreateRoom(roomId) {
    let room = rooms.get(roomId);
    if (!room) {
        room = new Room(roomId);
        rooms.set(roomId, room);
        console.log(`[LOBBY] Created Room ${roomId}`);
    }
    return room;
}

const server = dgram.createSocket('udp4');

server.on('error', (err) => {
    console.error('[SERVER ERROR]', err);
});

server.on('message', (msg, rinfo) => {
    if (msg.length < 3) return;

    const magic = msg.readUInt8(0);
    const version = msg.readUInt8(1);
    const type = msg.readUInt8(2);

    if (magic !== AOS_MAGIC) return;

    switch (type) {
        case PKT.JOIN_REQUEST: {
            if (msg.length < 8) return;
            const roomId = msg.readUInt32LE(3);
            const preferredSlot = msg.readUInt8(7);

            const room = getOrCreateRoom(roomId);
            const peerId = room.addPeer(rinfo.address, rinfo.port, preferredSlot);

            const resp = Buffer.alloc(9);
            resp.writeUInt8(AOS_MAGIC, 0);
            resp.writeUInt8(AOS_VERSION, 1);
            resp.writeUInt8(PKT.JOIN_RESPONSE, 2);
            resp.writeUInt8(peerId >= 0 ? 0 : 1, 3); // Status: 0 = SUCCESS, 1 = FULL
            resp.writeUInt8(peerId >= 0 ? peerId : 0xFF, 4);
            resp.writeUInt32LE(roomId, 5);

            server.send(resp, 0, resp.length, rinfo.port, rinfo.address);

            if (peerId >= 0) {
                console.log(`[ROOM ${roomId}] Peer ${rinfo.address}:${rinfo.port} -> Slot ${peerId} (Total: ${room.getPlayersCount()}/4)`);
                room.broadcastLobbyState(server);
            }
            break;
        }

        case PKT.HEARTBEAT: {
            if (msg.length < 8) return;
            const peerId = msg.readUInt8(3);
            // Search peer's room and update heartbeat
            for (const room of rooms.values()) {
                if (room.slots[peerId] && room.slots[peerId].address === rinfo.address) {
                    room.slots[peerId].lastSeen = Date.now();
                    break;
                }
            }
            break;
        }

        case PKT.READY_TOGGLE: {
            if (msg.length < 5) return;
            const peerId = msg.readUInt8(3);
            const isReady = msg.readUInt8(4);

            for (const room of rooms.values()) {
                if (room.slots[peerId] && room.slots[peerId].address === rinfo.address) {
                    if (isReady) {
                        room.readyMask |= (1 << peerId);
                    } else {
                        room.readyMask &= ~(1 << peerId);
                    }
                    console.log(`[ROOM ${room.id}] Slot ${peerId} Ready: ${isReady === 1 ? 'YES' : 'NO'} (ReadyMask: 0b${room.readyMask.toString(2)})`);
                    room.broadcastLobbyState(server);
                    break;
                }
            }
            break;
        }

        case PKT.STAGE_CHANGE: {
            if (msg.length < 9) return;
            const hostPeerId = msg.readUInt8(3);
            const newStage = msg.readUInt8(4);
            const levelId = msg.readUInt32LE(5);

            for (const room of rooms.values()) {
                if (room.slots[0] && room.slots[0].address === rinfo.address) {
                    room.stage = newStage;
                    room.selectedLevel = levelId;
                    console.log(`[ROOM ${room.id}] Host changed stage to ${newStage}, Level: ${levelId}`);
                    room.broadcastLobbyState(server);
                    break;
                }
            }
            break;
        }

        case PKT.ARMORY_READY: {
            if (msg.length < 5) return;
            const peerId = msg.readUInt8(3);
            const isReady = msg.readUInt8(4);

            for (const room of rooms.values()) {
                if (room.slots[peerId] && room.slots[peerId].address === rinfo.address) {
                    if (isReady) {
                        room.readyMask |= (1 << peerId);
                    } else {
                        room.readyMask &= ~(1 << peerId);
                    }
                    console.log(`[ROOM ${room.id}] Armory Slot ${peerId} Ready: ${isReady}`);
                    room.broadcastLobbyState(server);
                    break;
                }
            }
            break;
        }

        case PKT.PLAYER_STATE:
        case PKT.ACTION_EVENT:
        case PKT.DAMAGE_EVENT:
        case PKT.SPAWN_PROXY: {
            // High-frequency telemetry fanout to room
            const peerId = msg.readUInt8(3);
            for (const room of rooms.values()) {
                if (room.slots[peerId] && room.slots[peerId].address === rinfo.address) {
                    room.broadcast(server, msg, peerId);
                    break;
                }
            }
            break;
        }

        case PKT.DISCONNECT: {
            if (msg.length < 4) return;
            const peerId = msg.readUInt8(3);
            for (const room of rooms.values()) {
                if (room.slots[peerId] && room.slots[peerId].address === rinfo.address) {
                    console.log(`[ROOM ${room.id}] Peer disconnected from Slot ${peerId}`);
                    room.removePeer(peerId);
                    room.broadcastLobbyState(server);
                    break;
                }
            }
            break;
        }
    }
});

// Periodic inactive peer and empty room cleanup
setInterval(() => {
    const now = Date.now();
    for (const [roomId, room] of rooms.entries()) {
        for (let i = 0; i < 4; i++) {
            const p = room.slots[i];
            if (p && (now - p.lastSeen > 10000)) { // 10s timeout
                console.log(`[ROOM ${roomId}] Slot ${i} timed out`);
                room.removePeer(i);
                room.broadcastLobbyState(server);
            }
        }

        if (room.getPlayersCount() === 0 && (now - room.lastActivity > 60000)) {
            rooms.delete(roomId);
            console.log(`[LOBBY] Cleaned up inactive Room ${roomId}`);
        }
    }
}, 3000);

server.bind(PORT, HOST, () => {
    console.log(`=======================================================`);
    console.log(`  AOS5 Dedicated 4-Player UDP Relay & Lobby Server   `);
    console.log(`  Listening on ${HOST}:${PORT} (Protocol v${AOS_VERSION})    `);
    console.log(`=======================================================`);
});
