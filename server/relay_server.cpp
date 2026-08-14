#include <iostream>
#include <vector>
#include <unordered_map>
#include <chrono>
#include <cstring>
#include <cstdint>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <unistd.h>
#include <fcntl.h>

#pragma pack(push, 1)
struct PacketHeader {
    uint8_t magic;    // 0x53 ('S')
    uint8_t version;  // 0x01
    uint8_t type;     // PacketType
};

struct JoinRequestPacket {
    PacketHeader header;
    uint32_t room_id;
    uint8_t preferred_slot;
};

struct JoinResponsePacket {
    PacketHeader header;
    uint8_t status; // 0 = SUCCESS, 1 = FULL
    uint8_t peer_id;
    uint32_t room_id;
};

struct PlayerStatePacket {
    PacketHeader header;
    uint8_t peer_id;
    float x;
    float y;
    uint8_t anim_id;
    uint8_t flip_x;
    int16_t hp;
    uint16_t flags;
    uint32_t seq;
};

struct ActionEventPacket {
    PacketHeader header;
    uint8_t peer_id;
    uint8_t action_id;
    float target_x;
    float target_y;
    int32_t extra;
};

struct DamageEventPacket {
    PacketHeader header;
    uint8_t attacker_id;
    uint8_t target_slot;
    uint8_t damage_type;
    int16_t damage_amount;
};
#pragma pack(pop)

enum PacketType : uint8_t {
    JOIN_REQUEST  = 0x01,
    JOIN_RESPONSE = 0x02,
    HEARTBEAT     = 0x03,
    PLAYER_STATE  = 0x04,
    ACTION_EVENT  = 0x05,
    DAMAGE_EVENT  = 0x06,
    SPAWN_PROXY   = 0x07,
    DISCONNECT    = 0x08
};

struct Peer {
    uint8_t slot;
    sockaddr_in addr;
    std::chrono::steady_clock::time_point last_seen;
    bool active;
};

struct Room {
    uint32_t id;
    Peer peers[4];
};

static uint64_t endpoint_hash(const sockaddr_in& addr) {
    return ((uint64_t)addr.sin_addr.s_addr << 32) | (uint64_t)addr.sin_port;
}

int main(int argc, char* argv[]) {
    int port = 7777;
    if (argc > 1) {
        port = std::atoi(argv[1]);
    }

    int sockfd = socket(AF_INET, SOCK_DGRAM, 0);
    if (sockfd < 0) {
        std::cerr << "Failed to create socket\n";
        return 1;
    }

    // Set SO_REUSEADDR
    int opt = 1;
    setsockopt(sockfd, SOL_SOCKET, SO_REUSEADDR, &opt, sizeof(opt));

    sockaddr_in servaddr{};
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = INADDR_ANY;
    servaddr.sin_port = htons(port);

    if (bind(sockfd, (const struct sockaddr*)&servaddr, sizeof(servaddr)) < 0) {
        std::cerr << "Bind failed on port " << port << "\n";
        close(sockfd);
        return 1;
    }

    std::cout << "=======================================================\n";
    std::cout << "  Anger of Stick 5 C++ Native UDP Relay Server (Port: " << port << ")\n";
    std::cout << "  Protocol: Binary UDP | Max 4 Players / Room\n";
    std::cout << "=======================================================\n";

    std::unordered_map<uint32_t, Room> rooms;
    std::unordered_map<uint64_t, std::pair<uint32_t, uint8_t>> client_to_room; // endpoint -> (roomId, slot)

    uint8_t buffer[2048];
    sockaddr_in cliaddr{};
    socklen_t len = sizeof(cliaddr);

    while (true) {
        ssize_t n = recvfrom(sockfd, buffer, sizeof(buffer), 0, (struct sockaddr*)&cliaddr, &len);
        if (n < (ssize_t)sizeof(PacketHeader)) continue;

        auto* hdr = (PacketHeader*)buffer;
        if (hdr->magic != 0x53 || hdr->version != 0x01) continue;

        uint64_t ep = endpoint_hash(cliaddr);
        auto now = std::chrono::steady_clock::now();

        if (hdr->type == JOIN_REQUEST && n >= (ssize_t)sizeof(JoinRequestPacket)) {
            auto* req = (JoinRequestPacket*)buffer;
            uint32_t room_id = req->room_id;
            uint8_t preferred = req->preferred_slot;

            auto& room = rooms[room_id];
            room.id = room_id;

            int assigned_slot = -1;
            // Check existing
            for (int s = 0; s < 4; ++s) {
                if (room.peers[s].active && endpoint_hash(room.peers[s].addr) == ep) {
                    assigned_slot = s;
                    break;
                }
            }

            if (assigned_slot == -1) {
                if (preferred < 4 && !room.peers[preferred].active) {
                    assigned_slot = preferred;
                } else {
                    for (int s = 0; s < 4; ++s) {
                        if (!room.peers[s].active) {
                            assigned_slot = s;
                            break;
                        }
                    }
                }
            }

            JoinResponsePacket resp{};
            resp.header = {0x53, 0x01, JOIN_RESPONSE};
            resp.room_id = room_id;

            if (assigned_slot == -1) {
                resp.status = 1; // FULL
                resp.peer_id = 0xFF;
                sendto(sockfd, &resp, sizeof(resp), 0, (struct sockaddr*)&cliaddr, len);
                std::cout << "[Join Denied] Room " << room_id << " is full.\n";
            } else {
                resp.status = 0; // SUCCESS
                resp.peer_id = assigned_slot;
                room.peers[assigned_slot] = { (uint8_t)assigned_slot, cliaddr, now, true };
                client_to_room[ep] = { room_id, (uint8_t)assigned_slot };

                sendto(sockfd, &resp, sizeof(resp), 0, (struct sockaddr*)&cliaddr, len);
                std::cout << "[Join Accepted] Room " << room_id << " Assigned Slot " << assigned_slot << "\n";
            }
        }
        else if (hdr->type == HEARTBEAT) {
            auto it = client_to_room.find(ep);
            if (it != client_to_room.end()) {
                auto& room = rooms[it->second.first];
                room.peers[it->second.second].last_seen = now;
                sendto(sockfd, buffer, n, 0, (struct sockaddr*)&cliaddr, len); // Echo
            }
        }
        else if (hdr->type == PLAYER_STATE || hdr->type == ACTION_EVENT || hdr->type == DAMAGE_EVENT) {
            auto it = client_to_room.find(ep);
            if (it != client_to_room.end()) {
                uint32_t room_id = it->second.first;
                uint8_t sender_slot = it->second.second;
                auto& room = rooms[room_id];
                room.peers[sender_slot].last_seen = now;

                // Fan out to all other peers in the same room
                for (int s = 0; s < 4; ++s) {
                    if (s != sender_slot && room.peers[s].active) {
                        sendto(sockfd, buffer, n, 0, (struct sockaddr*)&room.peers[s].addr, sizeof(sockaddr_in));
                    }
                }
            }
        }
        else if (hdr->type == DISCONNECT) {
            auto it = client_to_room.find(ep);
            if (it != client_to_room.end()) {
                uint32_t room_id = it->second.first;
                uint8_t slot = it->second.second;
                rooms[room_id].peers[slot].active = false;
                client_to_room.erase(it);
                std::cout << "[Client Left] Room " << room_id << " Slot " << (int)slot << "\n";
            }
        }
    }

    close(sockfd);
    return 0;
}
