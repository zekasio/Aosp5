#include "net_client.h"
#include <cstring>
#include <fcntl.h>
#include <chrono>
#include <android/log.h>

#define NET_LOG_TAG "AOS_NET"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, NET_LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, NET_LOG_TAG, __VA_ARGS__)

static uint32_t get_current_time_ms() {
    auto now = std::chrono::steady_clock::now().time_since_epoch();
    return (uint32_t)std::chrono::duration_cast<std::chrono::milliseconds>(now).count();
}

NetClient::NetClient() {
    for (int i = 0; i < 4; ++i) {
        m_remote_peers[i].active.store(false);
    }
}

NetClient::~NetClient() {
    shutdown();
}

bool NetClient::init(const std::string& host, int port, uint32_t room_id, uint8_t preferred_slot) {
    if (m_running.load()) return true;

    m_host = host;
    m_port = port;
    m_room_id = room_id;
    m_preferred_slot = preferred_slot;

    m_sockfd = socket(AF_INET, SOCK_DGRAM, 0);
    if (m_sockfd < 0) {
        LOGE("Failed to create UDP socket");
        return false;
    }

    // Set non-blocking
    int flags = fcntl(m_sockfd, F_GETFL, 0);
    fcntl(m_sockfd, F_SETFL, flags | O_NONBLOCK);

    memset(&m_server_addr, 0, sizeof(m_server_addr));
    m_server_addr.sin_family = AF_INET;
    m_server_addr.sin_port = htons(m_port);
    if (inet_pton(AF_INET, m_host.c_str(), &m_server_addr.sin_addr) <= 0) {
        LOGE("Invalid address/host: %s", m_host.c_str());
        close(m_sockfd);
        m_sockfd = -1;
        return false;
    }

    m_running.store(true);
    m_net_thread = std::thread(&NetClient::network_thread_func, this);

    LOGI("NetClient initialized, target: %s:%d, Room: %u", m_host.c_str(), m_port, m_room_id);
    return true;
}

void NetClient::shutdown() {
    if (!m_running.load()) return;

    m_running.store(false);

    if (m_connected.load() && m_sockfd >= 0) {
        DisconnectPacket disc{};
        disc.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_DISCONNECT};
        disc.peer_id = m_my_peer_id.load();
        sendto(m_sockfd, &disc, sizeof(disc), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
    }

    if (m_net_thread.joinable()) {
        m_net_thread.join();
    }

    if (m_sockfd >= 0) {
        close(m_sockfd);
        m_sockfd = -1;
    }
    m_connected.store(false);
    LOGI("NetClient shutdown complete");
}

void NetClient::send_player_state(float x, float y, uint8_t anim_id, uint8_t flip_x, int16_t hp, uint16_t flags) {
    if (!m_connected.load() || m_sockfd < 0) return;

    PlayerStatePacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_PLAYER_STATE};
    pkt.peer_id = m_my_peer_id.load();
    pkt.x = x;
    pkt.y = y;
    pkt.anim_id = anim_id;
    pkt.flip_x = flip_x;
    pkt.hp = hp;
    pkt.flags = flags;
    pkt.seq = m_seq.fetch_add(1);

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::send_action_event(uint8_t action_id, float target_x, float target_y, int32_t extra) {
    if (!m_connected.load() || m_sockfd < 0) return;

    ActionEventPacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_ACTION_EVENT};
    pkt.peer_id = m_my_peer_id.load();
    pkt.action_id = action_id;
    pkt.target_x = target_x;
    pkt.target_y = target_y;
    pkt.extra = extra;

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::send_damage_event(uint8_t target_slot, uint8_t damage_type, int16_t damage_amount) {
    if (!m_connected.load() || m_sockfd < 0) return;

    DamageEventPacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_DAMAGE_EVENT};
    pkt.attacker_id = m_my_peer_id.load();
    pkt.target_slot = target_slot;
    pkt.damage_type = damage_type;
    pkt.damage_amount = damage_amount;

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::network_thread_func() {
    uint8_t recv_buffer[2048];
    uint32_t last_join_attempt = 0;
    uint32_t last_heartbeat = 0;

    while (m_running.load()) {
        uint32_t now = get_current_time_ms();

        // If not connected, retry join every 1 second
        if (!m_connected.load() && (now - last_join_attempt > 1000)) {
            last_join_attempt = now;
            JoinRequestPacket req{};
            req.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_JOIN_REQUEST};
            req.room_id = m_room_id;
            req.preferred_slot = m_preferred_slot;

            sendto(m_sockfd, &req, sizeof(req), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
            LOGI("Sent JOIN_REQUEST for room %u", m_room_id);
        }

        // Send heartbeat every 2 seconds if connected
        if (m_connected.load() && (now - last_heartbeat > 2000)) {
            last_heartbeat = now;
            HeartbeatPacket hb{};
            hb.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_HEARTBEAT};
            hb.peer_id = m_my_peer_id.load();
            hb.timestamp = now;

            sendto(m_sockfd, &hb, sizeof(hb), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
        }

        // Poll incoming packets
        while (true) {
            sockaddr_in from_addr{};
            socklen_t from_len = sizeof(from_addr);
            ssize_t n = recvfrom(m_sockfd, recv_buffer, sizeof(recv_buffer), 0,
                                 (struct sockaddr*)&from_addr, &from_len);
            if (n <= 0) break;

            if (n < (ssize_t)sizeof(PacketHeader)) continue;
            auto* hdr = (PacketHeader*)recv_buffer;
            if (hdr->magic != AOS_MAGIC_BYTE || hdr->version != AOS_PROTO_VERSION) continue;

            switch (hdr->type) {
                case PKT_JOIN_RESPONSE: {
                    if (n >= (ssize_t)sizeof(JoinResponsePacket)) {
                        auto* resp = (JoinResponsePacket*)recv_buffer;
                        if (resp->status == 0) {
                            m_my_peer_id.store(resp->peer_id);
                            m_connected.store(true);
                            LOGI("JOIN SUCCESS! Assigned Peer ID: %u in Room: %u", resp->peer_id, resp->room_id);
                        } else {
                            LOGE("JOIN FAILED: Room %u is full", resp->room_id);
                        }
                    }
                    break;
                }
                case PKT_PLAYER_STATE: {
                    if (n >= (ssize_t)sizeof(PlayerStatePacket)) {
                        auto* state = (PlayerStatePacket*)recv_buffer;
                        uint8_t pid = state->peer_id;
                        if (pid < 4 && pid != m_my_peer_id.load()) {
                            auto& rp = m_remote_peers[pid];
                            rp.x.store(state->x);
                            rp.y.store(state->y);
                            rp.anim_id.store(state->anim_id);
                            rp.flip_x.store(state->flip_x);
                            rp.hp.store(state->hp);
                            rp.flags.store(state->flags);
                            rp.last_update_ms.store(now);
                            rp.active.store(true);
                        }
                    }
                    break;
                }
                case PKT_SPAWN_PROXY: {
                    if (n >= (ssize_t)sizeof(SpawnProxyPacket)) {
                        auto* spawn = (SpawnProxyPacket*)recv_buffer;
                        uint8_t pid = spawn->peer_id;
                        if (pid < 4 && pid != m_my_peer_id.load()) {
                            auto& rp = m_remote_peers[pid];
                            rp.x.store(spawn->x);
                            rp.y.store(spawn->y);
                            rp.hp.store(100);
                            rp.anim_id.store(0);
                            rp.last_update_ms.store(now);
                            rp.active.store(true);
                            LOGI("Remote peer %u spawned proxy at (%f, %f)", pid, spawn->x, spawn->y);
                        }
                    }
                    break;
                }
                case PKT_DISCONNECT: {
                    if (n >= (ssize_t)sizeof(DisconnectPacket)) {
                        auto* disc = (DisconnectPacket*)recv_buffer;
                        uint8_t pid = disc->peer_id;
                        if (pid < 4) {
                            m_remote_peers[pid].active.store(false);
                            LOGI("Remote peer %u disconnected", pid);
                        }
                    }
                    break;
                }
                default:
                    break;
            }
        }

        // Sleep 5ms for smooth 200Hz polling rate
        usleep(5000);
    }
}
