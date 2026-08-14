#include "aos_hook.h"
#include "arm64_hook.h"
#include "net_client.h"

#include <dlfcn.h>
#include <fstream>
#include <sstream>
#include <thread>
#include <chrono>

// Global game controller pointer
static void* g_pGame = nullptr;

// Original function pointers
typedef void (*drawScene_t)(void* pGame, float dt);
typedef void (*update_t)(void* pGame, float dt);
typedef void (*COMAI_t)(void* pGame, int entity_idx);
typedef void (*PCDamage_t)(void* pGame, int type, int entity_idx, int amount);

static drawScene_t orig_drawScene = nullptr;
static update_t orig_update = nullptr;
static COMAI_t orig_COMAI = nullptr;
static PCDamage_t orig_PCDamage = nullptr;

// Helper to access entity struct
static inline char* get_entity_ptr(void* pGame, int slot) {
    if (!pGame) return nullptr;
    return (char*)pGame + AOS_ENTITY_BASE_OFFSET + (slot * AOS_ENTITY_STRIDE);
}

// -------------------------------------------------------------
// Hook Implementations
// -------------------------------------------------------------

// Hook: bzStateGame::drawScene(float dt)
static void hook_drawScene(void* pGame, float dt) {
    g_pGame = pGame;

    if (pGame) {
        // 1. Telemetry Capture for Local Player (Slot 0)
        char* pLocal = get_entity_ptr(pGame, 0);
        if (pLocal) {
            float local_x = *(float*)(pLocal + AOS_OFFSET_POS_X);
            float local_y = *(float*)(pLocal + AOS_OFFSET_POS_Y);
            int32_t local_flip = *(int32_t*)(pLocal + AOS_OFFSET_FLIP_X);
            int32_t local_hp = *(int32_t*)(pLocal + AOS_OFFSET_HP);
            int32_t local_anim = *(int32_t*)(pLocal + AOS_OFFSET_ANIM_ID);

            NetClient::instance().send_player_state(
                local_x, local_y,
                (uint8_t)(local_anim & 0xFF),
                (uint8_t)(local_flip < 0 ? 1 : 0),
                (int16_t)local_hp,
                0
            );
        }

        // 2. Inject Remote Peers into Companion Slots (Slots 1, 2, 3)
        for (int slot = 1; slot < 4; ++slot) {
            auto& remote = NetClient::instance().get_remote_peer(slot);
            if (remote.active.load()) {
                char* pCompanion = get_entity_ptr(pGame, slot);
                if (pCompanion) {
                    // Activate slot if needed
                    int32_t current_max_hp = *(int32_t*)(pCompanion + AOS_OFFSET_MAX_HP);
                    if (current_max_hp <= 0) {
                        *(int32_t*)(pCompanion + AOS_OFFSET_MAX_HP) = 100;
                    }

                    // Smooth position injection
                    *(float*)(pCompanion + AOS_OFFSET_POS_X) = remote.x.load();
                    *(float*)(pCompanion + AOS_OFFSET_POS_Y) = remote.y.load();
                    *(int32_t*)(pCompanion + AOS_OFFSET_FLIP_X) = (remote.flip_x.load() == 1) ? -1 : 1;
                    *(int32_t*)(pCompanion + AOS_OFFSET_HP) = remote.hp.load();
                    *(int32_t*)(pCompanion + AOS_OFFSET_ANIM_ID) = remote.anim_id.load();
                }
            }
        }
    }

    // Call original drawScene
    if (orig_drawScene) {
        orig_drawScene(pGame, dt);
    }
}

// Hook: bzStateGame::COMAI(int entity_idx)
static void hook_COMAI(void* pGame, int entity_idx) {
    // If this slot belongs to an active networked player proxy (slot 1..3), suppress AI
    if (entity_idx >= 1 && entity_idx <= 3) {
        auto& remote = NetClient::instance().get_remote_peer(entity_idx);
        if (remote.active.load()) {
            // Suppress bot AI execution
            return;
        }
    }

    // Otherwise execute normal AI logic for enemies/bots
    if (orig_COMAI) {
        orig_COMAI(pGame, entity_idx);
    }
}

// Hook: bzStateGame::PCDamage(int type, int entity_idx, int amount)
static void hook_PCDamage(void* pGame, int type, int entity_idx, int amount) {
    if (entity_idx == 0) {
        // Local player damaged -> broadcast to room
        NetClient::instance().send_damage_event(0, (uint8_t)type, (int16_t)amount);
    }

    if (orig_PCDamage) {
        orig_PCDamage(pGame, type, entity_idx, amount);
    }
}

// -------------------------------------------------------------
// Initialization & Configuration Loader
// -------------------------------------------------------------

static void load_config(std::string& host, int& port, uint32_t& room_id, uint8_t& preferred_slot) {
    host = "127.0.0.1";
    port = 7777;
    room_id = 1;
    preferred_slot = 0xFF;

    std::ifstream cfg("/data/local/tmp/aos_multiplayer.cfg");
    if (cfg.is_open()) {
        std::string line;
        while (std::getline(cfg, line)) {
            std::istringstream iss(line);
            std::string key, val;
            if (std::getline(iss, key, '=') && std::getline(iss, val)) {
                if (key == "host" || key == "HOST" || key == "server") host = val;
                else if (key == "port" || key == "PORT") port = std::stoi(val);
                else if (key == "room" || key == "ROOM_ID") room_id = std::stoul(val);
                else if (key == "slot" || key == "SLOT") preferred_slot = std::stoi(val);
            }
        }
        cfg.close();
        LOGI("Loaded config from /data/local/tmp/aos_multiplayer.cfg -> Host: %s:%d, Room: %u, Slot: %u",
             host.c_str(), port, room_id, (unsigned)preferred_slot);
    } else {
        LOGI("No config file found at /data/local/tmp/aos_multiplayer.cfg, using defaults %s:%d, Room: %u",
             host.c_str(), port, room_id);
    }
}

static void init_hooks_thread() {
    LOGI("AOS Multiplayer Injection Starting...");

    void* handle = nullptr;
    for (int retry = 0; retry < 50; ++retry) {
        handle = dlopen("libMyGame.so", RTLD_NOW | RTLD_GLOBAL);
        if (handle) break;
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
    }

    if (!handle) {
        LOGE("Failed to open libMyGame.so");
        return;
    }

    LOGI("libMyGame.so handle resolved: %p", handle);

    // Resolve target symbols
    void* sym_drawScene = dlsym(handle, "_ZN11bzStateGame9drawSceneEf");
    void* sym_COMAI = dlsym(handle, "_ZN11bzStateGame5COMAIEi");
    void* sym_PCDamage = dlsym(handle, "_ZN11bzStateGame8PCDamageEiii");

    if (sym_drawScene) {
        HookEngine::hook_arm64(sym_drawScene, (void*)hook_drawScene, (void**)&orig_drawScene);
    } else {
        LOGE("Could not resolve _ZN11bzStateGame9drawSceneEf");
    }

    if (sym_COMAI) {
        HookEngine::hook_arm64(sym_COMAI, (void*)hook_COMAI, (void**)&orig_COMAI);
    } else {
        LOGE("Could not resolve _ZN11bzStateGame5COMAIEi");
    }

    if (sym_PCDamage) {
        HookEngine::hook_arm64(sym_PCDamage, (void*)hook_PCDamage, (void**)&orig_PCDamage);
    } else {
        LOGE("Could not resolve _ZN11bzStateGame8PCDamageEiii");
    }

    // Initialize Network Client
    std::string host;
    int port;
    uint32_t room_id;
    uint8_t preferred_slot;
    load_config(host, port, room_id, preferred_slot);

    NetClient::instance().init(host, port, room_id, preferred_slot);
    LOGI("AOS Multiplayer Hooks & Network Thread Successfully Installed!");
}

void init_aos_multiplayer() {
    std::thread(init_hooks_thread).detach();
}

// ELF constructor executed automatically upon shared library loading
__attribute__((constructor))
static void aos_mod_entry() {
    init_aos_multiplayer();
}
