#include "aos_hook.h"
#include "arm64_hook.h"
#include "net_client.h"

#include <jni.h>
#include <dlfcn.h>
#include <fstream>
#include <sstream>
#include <thread>
#include <chrono>
#include <cstdio>

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

static bool g_hooks_installed = false;

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

    if (pGame && NetClient::instance().is_connected()) {
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
    if (NetClient::instance().is_connected() && entity_idx >= 1 && entity_idx <= 3) {
        auto& remote = NetClient::instance().get_remote_peer(entity_idx);
        if (remote.active.load()) {
            // Suppress bot AI execution
            return;
        }
    }

    if (orig_COMAI) {
        orig_COMAI(pGame, entity_idx);
    }
}

// Hook: bzStateGame::PCDamage(int type, int entity_idx, int amount)
static void hook_PCDamage(void* pGame, int type, int entity_idx, int amount) {
    if (NetClient::instance().is_connected() && entity_idx == 0) {
        NetClient::instance().send_damage_event(0, (uint8_t)type, (int16_t)amount);
    }

    if (orig_PCDamage) {
        orig_PCDamage(pGame, type, entity_idx, amount);
    }
}

// -------------------------------------------------------------
// Module Base Finder & Symbol Resolver
// -------------------------------------------------------------

static uintptr_t get_module_base(const char* module_name) {
    uintptr_t base = 0;
    FILE* fp = fopen("/proc/self/maps", "r");
    if (!fp) return 0;

    char line[512];
    while (fgets(line, sizeof(line), fp)) {
        if (strstr(line, module_name)) {
            uintptr_t start = 0;
            if (sscanf(line, "%lx-%*lx", &start) == 1) {
                base = start;
                break;
            }
        }
    }
    fclose(fp);
    return base;
}

static void install_hooks() {
    if (g_hooks_installed) return;

    LOGI("Searching for libMyGame symbols...");
    uintptr_t base = 0;
    for (int retry = 0; retry < 50; ++retry) {
        base = get_module_base("libMyGame.so");
        if (base) break;
        std::this_thread::sleep_for(std::chrono::milliseconds(50));
    }

    void* sym_drawScene = nullptr;
    void* sym_COMAI = nullptr;
    void* sym_PCDamage = nullptr;

    if (base) {
        LOGI("Found libMyGame.so base address at %p", (void*)base);
        sym_drawScene = (void*)(base + 0x2b5020);
        sym_COMAI = (void*)(base + 0x3219dc);
        sym_PCDamage = (void*)(base + 0x3398c8);
    } else {
        LOGI("Using dlsym RTLD_DEFAULT fallback...");
        sym_drawScene = dlsym(RTLD_DEFAULT, "_ZN11bzStateGame9drawSceneEf");
        sym_COMAI = dlsym(RTLD_DEFAULT, "_ZN11bzStateGame5COMAIEi");
        sym_PCDamage = dlsym(RTLD_DEFAULT, "_ZN11bzStateGame8PCDamageEiii");
    }

    if (sym_drawScene) {
        HookEngine::hook_arm64(sym_drawScene, (void*)hook_drawScene, (void**)&orig_drawScene);
    }
    if (sym_COMAI) {
        HookEngine::hook_arm64(sym_COMAI, (void*)hook_COMAI, (void**)&orig_COMAI);
    }
    if (sym_PCDamage) {
        HookEngine::hook_arm64(sym_PCDamage, (void*)hook_PCDamage, (void**)&orig_PCDamage);
    }

    g_hooks_installed = true;
    LOGI("AOS Multiplayer Native Hooks Installed!");
}

void init_aos_multiplayer() {
    std::thread(install_hooks).detach();
}

__attribute__((constructor))
static void aos_mod_entry() {
    init_aos_multiplayer();
}

// -------------------------------------------------------------
// JNI Exports for In-Game Lobby & Stage Flow
// -------------------------------------------------------------

extern "C" {

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSetMultiplayerConfig(
    JNIEnv* env, jclass clazz, jstring jhost, jint port, jint roomId, jint slot) {
    const char* host_str = env->GetStringUTFChars(jhost, nullptr);
    std::string host = host_str ? host_str : "147.185.221.225";
    if (host_str) env->ReleaseStringUTFChars(jhost, host_str);

    LOGI("JNI: Configured Multiplayer -> Host: %s:%d, Room: %d, Slot: %d", host.c_str(), port, roomId, slot);
    NetClient::instance().shutdown();
    NetClient::instance().init(host, port, (uint32_t)roomId, (uint8_t)slot);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeShutdownNetwork(
    JNIEnv* env, jclass clazz) {
    NetClient::instance().shutdown();
}

JNIEXPORT jboolean JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeIsConnected(
    JNIEnv* env, jclass clazz) {
    return NetClient::instance().is_connected() ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetMyPeerId(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_my_peer_id();
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendReadyToggle(
    JNIEnv* env, jclass clazz, jboolean ready) {
    NetClient::instance().send_ready_toggle(ready == JNI_TRUE);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendStageChange(
    JNIEnv* env, jclass clazz, jint newStage, jint levelId) {
    NetClient::instance().send_stage_change((uint8_t)newStage, (uint32_t)levelId);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendArmoryReady(
    JNIEnv* env, jclass clazz, jboolean ready) {
    NetClient::instance().send_armory_ready(ready == JNI_TRUE);
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyTotalPlayers(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_lobby_total_players();
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyOccupiedMask(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_lobby_occupied_mask();
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyReadyMask(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_lobby_ready_mask();
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyStage(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_lobby_stage();
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbySelectedLevel(
    JNIEnv* env, jclass clazz) {
    return (jint)NetClient::instance().get_lobby_selected_level();
}

}
