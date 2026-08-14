#ifndef AOS_PROTOCOL_H
#define AOS_PROTOCOL_H

#include <cstdint>

#define AOS_MAGIC_BYTE    0x53 // 'S'
#define AOS_PROTO_VERSION 0x03

#pragma pack(push, 1)

enum PacketType : uint8_t {
    PKT_JOIN_REQUEST        = 0x01,
    PKT_JOIN_RESPONSE       = 0x02,
    PKT_HEARTBEAT           = 0x03,
    PKT_PLAYER_STATE        = 0x04,
    PKT_ACTION_EVENT        = 0x05,
    PKT_DAMAGE_EVENT        = 0x06,
    PKT_SPAWN_PROXY         = 0x07,
    PKT_DISCONNECT          = 0x08,

    // Lobby & Match Flow Packets
    PKT_LOBBY_STATE         = 0x10,
    PKT_READY_TOGGLE        = 0x11,
    PKT_START_GAME          = 0x12,
    PKT_STAGE_CHANGE        = 0x13,
    PKT_ARMORY_READY        = 0x14,

    // Real-Time Chat & Room Discovery
    PKT_CHAT_MESSAGE        = 0x20,
    PKT_ROOM_LIST_REQUEST   = 0x21,
    PKT_ROOM_LIST_RESPONSE  = 0x22
};

enum MatchStage : uint8_t {
    STAGE_PRE_GAME_LOBBY = 0, // In clean fullscreen lobby before engine launch
    STAGE_LEVEL_SELECT   = 1, // Host selecting level (clients see waiting screen + chat)
    STAGE_ARMORY         = 2, // Gun selection and upgrades (all players picking guns & readying up)
    STAGE_IN_GAME        = 3  // Playing in level
};

struct PacketHeader {
    uint8_t magic;    // 0x53 ('S')
    uint8_t version;  // 0x03
    uint8_t type;     // PacketType
};

struct JoinRequestPacket {
    PacketHeader header;
    uint32_t room_id;
    uint8_t preferred_slot;
    char player_name[16];
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

// Lobby State Broadcast
struct LobbyStatePacket {
    PacketHeader header;
    uint8_t total_players; // 1..4
    uint8_t occupied_mask; // bits 0..3
    uint8_t ready_mask;    // bits 0..3
    uint8_t stage;         // MatchStage
    uint32_t selected_level;
};

// Toggle Ready in Lobby
struct ReadyTogglePacket {
    PacketHeader header;
    uint8_t peer_id;
    uint8_t is_ready;
};

// Host Triggers Stage Transition
struct StageChangePacket {
    PacketHeader header;
    uint8_t host_peer_id;
    uint8_t new_stage;
    uint32_t level_id;
};

// Armory / Shop Ready Packet
struct ArmoryReadyPacket {
    PacketHeader header;
    uint8_t peer_id;
    uint8_t is_ready;
};

// Real-Time Chat Packet
struct ChatMessagePacket {
    PacketHeader header;
    uint8_t sender_slot;
    char sender_name[16];
    char text[128];
};

#pragma pack(pop)

#endif // AOS_PROTOCOL_H
