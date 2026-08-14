#ifndef AOS_NET_CLIENT_H
#define AOS_NET_CLIENT_H

#include "protocol.h"
#include <string>
#include <thread>
#include <atomic>
#include <mutex>
#include <queue>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <unistd.h>

struct RemotePeerState {
    std::atomic<bool> active{false};
    std::atomic<float> x{0.0f};
    std::atomic<float> y{0.0f};
    std::atomic<uint8_t> anim_id{0};
    std::atomic<uint8_t> flip_x{0};
    std::atomic<int16_t> hp{100};
    std::atomic<uint16_t> flags{0};
    std::atomic<uint32_t> last_update_ms{0};
};

class NetClient {
public:
    static NetClient& instance() {
        static NetClient inst;
        return inst;
    }

    bool init(const std::string& host, int port, uint32_t room_id, uint8_t preferred_slot, const std::string& player_name = "Player");
    void shutdown();

    void send_player_state(float x, float y, uint8_t anim_id, uint8_t flip_x, int16_t hp, uint16_t flags);
    void send_action_event(uint8_t action_id, float target_x, float target_y, int32_t extra);
    void send_damage_event(uint8_t target_slot, uint8_t damage_type, int16_t damage_amount);

    // Lobby, Stage & Chat
    void send_ready_toggle(bool ready);
    void send_stage_change(uint8_t new_stage, uint32_t level_id);
    void send_armory_ready(bool ready);
    void send_chat_message(const std::string& sender_name, const std::string& text);
    bool poll_chat_message(ChatMessagePacket& out_msg);

    uint8_t get_my_peer_id() const { return m_my_peer_id.load(); }
    bool is_connected() const { return m_connected.load(); }

    uint8_t get_lobby_total_players() const { return m_total_players.load(); }
    uint8_t get_lobby_occupied_mask() const { return m_occupied_mask.load(); }
    uint8_t get_lobby_ready_mask() const { return m_ready_mask.load(); }
    uint8_t get_lobby_stage() const { return m_stage.load(); }
    uint32_t get_lobby_selected_level() const { return m_selected_level.load(); }

    RemotePeerState& get_remote_peer(uint8_t slot) {
        if (slot >= 4) return m_remote_peers[0];
        return m_remote_peers[slot];
    }

private:
    NetClient();
    ~NetClient();

    void network_thread_func();

    int m_sockfd{-1};
    sockaddr_in m_server_addr{};
    std::string m_host{"147.185.221.225"};
    int m_port{22480};
    uint32_t m_room_id{101};
    uint8_t m_preferred_slot{0xFF};
    std::string m_player_name{"Player"};

    std::atomic<bool> m_running{false};
    std::atomic<bool> m_connected{false};
    std::atomic<uint8_t> m_my_peer_id{0};
    std::atomic<uint32_t> m_seq{0};

    // Lobby state atomics
    std::atomic<uint8_t> m_total_players{1};
    std::atomic<uint8_t> m_occupied_mask{1};
    std::atomic<uint8_t> m_ready_mask{1};
    std::atomic<uint8_t> m_stage{STAGE_PRE_GAME_LOBBY};
    std::atomic<uint32_t> m_selected_level{1};

    // Chat message queue
    std::mutex m_chat_mutex;
    std::queue<ChatMessagePacket> m_chat_queue;

    std::thread m_net_thread;
    RemotePeerState m_remote_peers[4];
};

#endif // AOS_NET_CLIENT_H
