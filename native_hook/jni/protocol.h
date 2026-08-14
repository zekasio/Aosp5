#ifndef AOS_PROTOCOL_H
#define AOS_PROTOCOL_H

#include <cstdint>

#define AOS_MAGIC_BYTE    0x53 // 'S'
#define AOS_PROTO_VERSION 0x01

#pragma pack(push, 1)

enum PacketType : uint8_t {
    PKT_JOIN_REQUEST  = 0x01,
    PKT_JOIN_RESPONSE = 0x02,
    PKT_HEARTBEAT     = 0x03,
    PKT_PLAYER_STATE  = 0x04,
    PKT_ACTION_EVENT  = 0x05,
    PKT_DAMAGE_EVENT  = 0x06,
    PKT_SPAWN_PROXY   = 0x07,
    PKT_DISCONNECT    = 0x08
};

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

struct HeartbeatPacket {
    PacketHeader header;
    uint8_t peer_id;
    uint32_t timestamp;
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

struct SpawnProxyPacket {
    PacketHeader header;
    uint8_t peer_id;
    uint8_t hero_type;
    float x;
    float y;
};

struct DisconnectPacket {
    PacketHeader header;
    uint8_t peer_id;
};

#pragma pack(pop)

#endif // AOS_PROTOCOL_H
