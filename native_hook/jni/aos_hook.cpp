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
#include <atomic>

// Global game controller pointer
static void* g_pGame = nullptr;
static std::atomic<bool> g_level_cleared{false};
static std::atomic<bool> g_save_triggered{false};
static std::atomic<int> g_game_state{0};

// Original function pointers
typedef void (*drawScene_t)(void* pGame, float dt);
typedef void (*update_t)(void* pGame, float dt);
typedef void (*COMAI_t)(void* pGame, int entity_idx);
typedef void (*PCDamage_t)(void* pGame, int type, int entity_idx, int amount);
typedef void (*ComCreate_t)(void* pGame, int a, int b, int c, int d);
typedef void (*PopupWin_t)(void* pGame);
typedef void (*STGSsave_t)(void* pGame);
typedef void (*setState_t)(void* pGame, int state);

static drawScene_t orig_drawScene = nullptr;
static update_t orig_update = nullptr;
static COMAI_t orig_COMAI = nullptr;
static PCDamage_t orig_PCDamage = nullptr;
static ComCreate_t orig_ComCreate = nullptr;
static PopupWin_t orig_PopupWin = nullptr;
static STGSsave_t orig_STGSsave = nullptr;
static setState_t orig_setState = nullptr;

static bool g_hooks_installed = false;

// Helper to access entity struct
static inline char* get_entity_ptr(void* pGame, int slot) {
    if (!pGame) return nullptr;
    return (char*)pGame + AOS_ENTITY_BASE_OFFSET + (slot * AOS_ENTITY_STRIDE);
}

// Hook: bzStateGame::drawScene(float dt)
static void hook_drawScene(void* pGame, float dt) {
    g_pGame = pGame;

    if (pGame && NetClient::instance().is_connected()) {
        // Telemetry Capture for Local Player
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
                (int16_t)local_hp, 0
            );
        }

        // Inject Remote Peers into Companion Slots
        for (int slot = 1; slot < 4; ++slot) {
            auto& remote = NetClient::instance().get_remote_peer(slot);
            if (remote.active.load()) {
                char* pCompanion = get_entity_ptr(pGame, slot);
                if (pCompanion) {
                    int32_t current_max_hp = *(int32_t*)(pCompanion + AOS_OFFSET_MAX_HP);
                    if (current_max_hp <= 0) {
                        *(int32_t*)(pCompanion + AOS_OFFSET_MAX_HP) = 100;
                    }
                    *(float*)(pCompanion + AOS_OFFSET_POS_X) = remote.x.load();
                    *(float*)(pCompanion + AOS_OFFSET_POS_Y) = remote.y.load();
                    *(int32_t*)(pCompanion + AOS_OFFSET_FLIP_X) = (remote.flip_x.load() == 1) ? -1 : 1;
                    *(int32_t*)(pCompanion + AOS_OFFSET_HP) = remote.hp.load();
                    *(int32_t*)(pCompanion + AOS_OFFSET_ANIM_ID) = remote.anim_id.load();
                }
            }
        }
    }

    if (orig_drawScene) orig_drawScene(pGame, dt);
}

// Hook: bzStateGame::COMAI(int) — suppress AI for human proxy slots
static void hook_COMAI(void* pGame, int entity_idx) {
    if (NetClient::instance().is_connected() && entity_idx >= 1 && entity_idx <= 3) {
        auto& remote = NetClient::instance().get_remote_peer(entity_idx);
        if (remote.active.load()) return; // Suppress bot AI for human peers
    }
    if (orig_COMAI) orig_COMAI(pGame, entity_idx);
}

// Hook: bzStateGame::ComCreate — reserve mercenary slots for real players
static void hook_ComCreate(void* pGame, int a, int b, int c, int d) {
    if (NetClient::instance().is_connected()) {
        LOGI("Mercenary slot reserved for multiplayer peer.");
        return;
    }
    if (orig_ComCreate) orig_ComCreate(pGame, a, b, c, d);
}

// Hook: bzStateGame::PCDamage — broadcast damage events
static void hook_PCDamage(void* pGame, int type, int entity_idx, int amount) {
    if (NetClient::instance().is_connected() && entity_idx == 0) {
        NetClient::instance().send_damage_event(0, (uint8_t)type, (int16_t)amount);
    }
    if (orig_PCDamage) orig_PCDamage(pGame, type, entity_idx, amount);
}

// *** NEW HOOK: bzStateGame::PopupWin() — level victory detected! ***
static void hook_PopupWin(void* pGame) {
    LOGI(">>> LEVEL CLEARED! PopupWin() called <<<");
    g_level_cleared.store(true);

    // If host and online, auto-transition clients to waiting screen
    if (NetClient::instance().is_connected() && NetClient::instance().get_my_peer_id() == 0) {
        LOGI("Host: sending STAGE_LEVEL_SELECT to clients (they see waiting screen)");
        NetClient::instance().send_stage_change(STAGE_LEVEL_SELECT, 0);
    }

    if (orig_PopupWin) orig_PopupWin(pGame);
}

// *** NEW HOOK: bzStateGame::STGSsave() — game progress saved ***
static void hook_STGSsave(void* pGame) {
    if (orig_STGSsave) orig_STGSsave(pGame); // Save first
    LOGI(">>> Game progress saved (STGSsave) <<<");
    g_save_triggered.store(true);
}

// *** NEW HOOK: bzStateGame::setState(int) — game state machine ***
static void hook_setState(void* pGame, int state) {
    int prev = g_game_state.load();
    g_game_state.store(state);
    LOGI("Game setState: %d -> %d", prev, state);

    if (orig_setState) orig_setState(pGame, state);
}

// Module base finder
static uintptr_t get_module_base(const char* module_name) {
    uintptr_t base = 0;
    FILE* fp = fopen("/proc/self/maps", "r");
    if (!fp) return 0;
    char line[512];
    while (fgets(line, sizeof(line), fp)) {
        if (strstr(line, module_name)) {
            if (sscanf(line, "%lx-%*lx", &base) == 1) break;
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

    if (!base) {
        LOGE("Failed to find libMyGame.so base!");
        return;
    }

    LOGI("Found libMyGame.so at %p", (void*)base);

    // Core gameplay hooks
    void* sym_drawScene = (void*)(base + 0x2b5020);
    void* sym_COMAI     = (void*)(base + 0x3219dc);
    void* sym_PCDamage  = (void*)(base + 0x3398c8);
    void* sym_ComCreate = (void*)(base + 0x329718);

    // Level completion hooks
    void* sym_PopupWin  = (void*)(base + 0x32a6f4);
    void* sym_STGSsave  = (void*)(base + 0x2aa8b8);
    void* sym_setState  = (void*)(base + 0x2a39c0);

    if (sym_drawScene)  HookEngine::hook_arm64(sym_drawScene, (void*)hook_drawScene, (void**)&orig_drawScene);
    if (sym_COMAI)      HookEngine::hook_arm64(sym_COMAI, (void*)hook_COMAI, (void**)&orig_COMAI);
    if (sym_PCDamage)   HookEngine::hook_arm64(sym_PCDamage, (void*)hook_PCDamage, (void**)&orig_PCDamage);
    if (sym_ComCreate)  HookEngine::hook_arm64(sym_ComCreate, (void*)hook_ComCreate, (void**)&orig_ComCreate);
    if (sym_PopupWin)   HookEngine::hook_arm64(sym_PopupWin, (void*)hook_PopupWin, (void**)&orig_PopupWin);
    if (sym_STGSsave)   HookEngine::hook_arm64(sym_STGSsave, (void*)hook_STGSsave, (void**)&orig_STGSsave);
    if (sym_setState)   HookEngine::hook_arm64(sym_setState, (void*)hook_setState, (void**)&orig_setState);

    g_hooks_installed = true;
    LOGI("All hooks installed! (drawScene, COMAI, PCDamage, ComCreate, PopupWin, STGSsave, setState)");
}

void init_aos_multiplayer() {
    std::thread(install_hooks).detach();
}

__attribute__((constructor))
static void aos_mod_entry() {
    init_aos_multiplayer();
}

// ====================== JNI EXPORTS ======================
extern "C" {

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSetMultiplayerConfig(
    JNIEnv* env, jclass, jstring jhost, jint port, jint roomId, jint slot, jstring jname) {
    const char* h = env->GetStringUTFChars(jhost, nullptr);
    const char* n = env->GetStringUTFChars(jname, nullptr);
    std::string host = h ? h : "147.185.221.225";
    std::string name = n ? n : "Player";
    if (h) env->ReleaseStringUTFChars(jhost, h);
    if (n) env->ReleaseStringUTFChars(jname, n);

    NetClient::instance().shutdown();
    NetClient::instance().init(host, port, (uint32_t)roomId, (uint8_t)slot, name);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeShutdownNetwork(JNIEnv*, jclass) {
    NetClient::instance().shutdown();
}

JNIEXPORT jboolean JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeIsConnected(JNIEnv*, jclass) {
    return NetClient::instance().is_connected() ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetMyPeerId(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_my_peer_id();
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendReadyToggle(JNIEnv*, jclass, jboolean ready) {
    NetClient::instance().send_ready_toggle(ready == JNI_TRUE);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendStageChange(JNIEnv*, jclass, jint stage, jint levelId) {
    NetClient::instance().send_stage_change((uint8_t)stage, (uint32_t)levelId);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendArmoryReady(JNIEnv*, jclass, jboolean ready) {
    NetClient::instance().send_armory_ready(ready == JNI_TRUE);
}

JNIEXPORT void JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeSendChatMessage(JNIEnv* env, jclass, jstring jn, jstring jt) {
    const char* ns = env->GetStringUTFChars(jn, nullptr);
    const char* ts = env->GetStringUTFChars(jt, nullptr);
    NetClient::instance().send_chat_message(ns ? ns : "", ts ? ts : "");
    if (ns) env->ReleaseStringUTFChars(jn, ns);
    if (ts) env->ReleaseStringUTFChars(jt, ts);
}

JNIEXPORT jstring JNICALL Java_org_cocos2dx_cpp_AppActivity_nativePollChatMessage(JNIEnv* env, jclass) {
    ChatMessagePacket msg{};
    if (NetClient::instance().poll_chat_message(msg)) {
        std::string fmt = "[" + std::string(msg.sender_name) + "]: " + std::string(msg.text);
        return env->NewStringUTF(fmt.c_str());
    }
    return nullptr;
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyTotalPlayers(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_lobby_total_players();
}
JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyOccupiedMask(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_lobby_occupied_mask();
}
JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyReadyMask(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_lobby_ready_mask();
}
JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbyStage(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_lobby_stage();
}
JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetLobbySelectedLevel(JNIEnv*, jclass) {
    return (jint)NetClient::instance().get_lobby_selected_level();
}

// *** NEW: Level completion & progress sync ***
JNIEXPORT jboolean JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeCheckLevelCleared(JNIEnv*, jclass) {
    bool val = g_level_cleared.exchange(false);
    return val ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jboolean JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeCheckSaveTriggered(JNIEnv*, jclass) {
    bool val = g_save_triggered.exchange(false);
    return val ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jint JNICALL Java_org_cocos2dx_cpp_AppActivity_nativeGetGameInternalState(JNIEnv*, jclass) {
    return (jint)g_game_state.load();
}

}
