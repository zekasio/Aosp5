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

bool NetClient::init(const std::string& host, int port, uint32_t room_id, uint8_t preferred_slot, const std::string& player_name) {
    if (m_running.load()) return true;

    m_host = host;
    m_port = port;
    m_room_id = room_id;
    m_preferred_slot = preferred_slot;
    m_player_name = player_name.empty() ? "Player" : player_name;

    m_sockfd = socket(AF_INET, SOCK_DGRAM, 0);
    if (m_sockfd < 0) {
        LOGE("Failed to create UDP socket");
        return false;
    }

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

    LOGI("NetClient initialized -> %s:%d, Room: %u, Slot: %u", m_host.c_str(), m_port, m_room_id, (unsigned)m_preferred_slot);
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
    for (int i = 0; i < 4; ++i) {
        m_remote_peers[i].active.store(false);
    }
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
    pkt.seq = ++m_seq;

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

void NetClient::send_ready_toggle(bool ready) {
    if (m_sockfd < 0) return;

    ReadyTogglePacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_READY_TOGGLE};
    pkt.peer_id = m_my_peer_id.load();
    pkt.is_ready = ready ? 1 : 0;

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::send_stage_change(uint8_t new_stage, uint32_t level_id) {
    if (m_sockfd < 0) return;

    StageChangePacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_STAGE_CHANGE};
    pkt.host_peer_id = m_my_peer_id.load();
    pkt.new_stage = new_stage;
    pkt.level_id = level_id;

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::send_armory_ready(bool ready) {
    if (m_sockfd < 0) return;

    ArmoryReadyPacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_ARMORY_READY};
    pkt.peer_id = m_my_peer_id.load();
    pkt.is_ready = ready ? 1 : 0;

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

void NetClient::send_chat_message(const std::string& sender_name, const std::string& text) {
    if (m_sockfd < 0) return;

    ChatMessagePacket pkt{};
    pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_CHAT_MESSAGE};
    pkt.sender_slot = m_my_peer_id.load();
    strncpy(pkt.sender_name, sender_name.c_str(), sizeof(pkt.sender_name) - 1);
    strncpy(pkt.text, text.c_str(), sizeof(pkt.text) - 1);

    sendto(m_sockfd, &pkt, sizeof(pkt), 0, (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
}

bool NetClient::poll_chat_message(ChatMessagePacket& out_msg) {
    std::lock_guard<std::mutex> lock(m_chat_mutex);
    if (m_chat_queue.empty()) return false;
    out_msg = m_chat_queue.front();
    m_chat_queue.pop();
    return true;
}

void NetClient::network_thread_func() {
    LOGI("AOS Network thread started.");

    uint32_t last_join_retry_ms = 0;
    uint32_t last_heartbeat_ms = 0;
    char recv_buf[512];

    while (m_running.load()) {
        uint32_t now = get_current_time_ms();

        // 1. Join negotiation
        if (!m_connected.load()) {
            if (now - last_join_retry_ms >= 1000) {
                last_join_retry_ms = now;

                JoinRequestPacket join_pkt{};
                join_pkt.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_JOIN_REQUEST};
                join_pkt.room_id = m_room_id;
                join_pkt.preferred_slot = m_preferred_slot;
                strncpy(join_pkt.player_name, m_player_name.c_str(), sizeof(join_pkt.player_name) - 1);

                sendto(m_sockfd, &join_pkt, sizeof(join_pkt), 0,
                       (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
            }
        } else {
            // 2. Heartbeat (every 1.5 seconds)
            if (now - last_heartbeat_ms >= 1500) {
                last_heartbeat_ms = now;

                HeartbeatPacket hb{};
                hb.header = {AOS_MAGIC_BYTE, AOS_PROTO_VERSION, PKT_HEARTBEAT};
                hb.peer_id = m_my_peer_id.load();
                hb.timestamp = now;

                sendto(m_sockfd, &hb, sizeof(hb), 0,
                       (struct sockaddr*)&m_server_addr, sizeof(m_server_addr));
            }
        }

        // 3. Receive packets
        while (true) {
            sockaddr_in from_addr{};
            socklen_t from_len = sizeof(from_addr);
            ssize_t bytes = recvfrom(m_sockfd, recv_buf, sizeof(recv_buf), 0,
                                     (struct sockaddr*)&from_addr, &from_len);

            if (bytes <= 0) break;
            if (bytes < (ssize_t)sizeof(PacketHeader)) continue;

            auto* hdr = (PacketHeader*)recv_buf;
            if (hdr->magic != AOS_MAGIC_BYTE) continue;

            switch (hdr->type) {
                case PKT_JOIN_RESPONSE: {
                    if (bytes >= (ssize_t)sizeof(JoinResponsePacket)) {
                        auto* resp = (JoinResponsePacket*)recv_buf;
                        if (resp->status == 0) {
                            m_my_peer_id.store(resp->peer_id);
                            m_connected.store(true);
                            LOGI("JOIN SUCCESS! Assigned Peer ID: %u in Room: %u", resp->peer_id, resp->room_id);
                        } else {
                            LOGE("JOIN REJECTED: Room %u is full", resp->room_id);
                        }
                    }
                    break;
                }

                case PKT_LOBBY_STATE: {
                    if (bytes >= (ssize_t)sizeof(LobbyStatePacket)) {
                        auto* lobby = (LobbyStatePacket*)recv_buf;
                        m_total_players.store(lobby->total_players);
                        m_occupied_mask.store(lobby->occupied_mask);
                        m_ready_mask.store(lobby->ready_mask);
                        m_stage.store(lobby->stage);
                        m_selected_level.store(lobby->selected_level);

                        LOGI("Lobby Update: %u/4 Players, ReadyMask: 0x%02X, Stage: %u",
                             lobby->total_players, lobby->ready_mask, lobby->stage);
                    }
                    break;
                }

                case PKT_CHAT_MESSAGE: {
                    if (bytes >= (ssize_t)sizeof(ChatMessagePacket)) {
                        auto* chat = (ChatMessagePacket*)recv_buf;
                        std::lock_guard<std::mutex> lock(m_chat_mutex);
                        m_chat_queue.push(*chat);
                    }
                    break;
                }

                case PKT_PLAYER_STATE: {
                    if (bytes >= (ssize_t)sizeof(PlayerStatePacket)) {
                        auto* state = (PlayerStatePacket*)recv_buf;
                        uint8_t slot = state->peer_id;
                        if (slot < 4 && slot != m_my_peer_id.load()) {
                            auto& peer = m_remote_peers[slot];
                            peer.active.store(true);
                            peer.x.store(state->x);
                            peer.y.store(state->y);
                            peer.anim_id.store(state->anim_id);
                            peer.flip_x.store(state->flip_x);
                            peer.hp.store(state->hp);
                            peer.flags.store(state->flags);
                            peer.last_update_ms.store(now);
                        }
                    }
                    break;
                }

                case PKT_DISCONNECT: {
                    if (bytes >= (ssize_t)sizeof(DisconnectPacket)) {
                        auto* disc = (DisconnectPacket*)recv_buf;
                        uint8_t slot = disc->peer_id;
                        if (slot < 4) {
                            m_remote_peers[slot].active.store(false);
                            LOGI("Remote Peer %u disconnected", slot);
                        }
                    }
                    break;
                }
            }
        }

        // Timeout inactive peers
        for (int i = 0; i < 4; ++i) {
            if (i == m_my_peer_id.load()) continue;
            auto& peer = m_remote_peers[i];
            if (peer.active.load()) {
                if (now - peer.last_update_ms.load() > 4000) {
                    peer.active.store(false);
                }
            }
        }

        std::this_thread::sleep_for(std::chrono::milliseconds(5));
    }

    LOGI("AOS Network thread stopped.");
}
