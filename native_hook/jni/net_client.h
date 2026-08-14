#ifndef AOS_NET_CLIENT_H
#define AOS_NET_CLIENT_H

#include "protocol.h"
#include <string>
#include <thread>
#include <atomic>
#include <mutex>
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

    bool init(const std::string& host, int port, uint32_t room_id, uint8_t preferred_slot);
    void shutdown();

    void send_player_state(float x, float y, uint8_t anim_id, uint8_t flip_x, int16_t hp, uint16_t flags);
    void send_action_event(uint8_t action_id, float target_x, float target_y, int32_t extra);
    void send_damage_event(uint8_t target_slot, uint8_t damage_type, int16_t damage_amount);

    uint8_t get_my_peer_id() const { return m_my_peer_id.load(); }
    bool is_connected() const { return m_connected.load(); }

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
    std::string m_host{"127.0.0.1"};
    int m_port{7777};
    uint32_t m_room_id{1};
    uint8_t m_preferred_slot{0xFF};

    std::atomic<bool> m_running{false};
    std::atomic<bool> m_connected{false};
    std::atomic<uint8_t> m_my_peer_id{0};
    std::atomic<uint32_t> m_seq{0};

    std::thread m_net_thread;
    RemotePeerState m_remote_peers[4];
};

#endif // AOS_NET_CLIENT_H
