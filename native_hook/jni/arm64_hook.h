#ifndef AOS_ARM64_HOOK_H
#define AOS_ARM64_HOOK_H

#include <cstdint>
#include <cstring>
#include <unistd.h>
#include <sys/mman.h>
#include <android/log.h>

#define HOOK_LOG_TAG "AOS_HOOK"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, HOOK_LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, HOOK_LOG_TAG, __VA_ARGS__)

namespace HookEngine {

inline bool set_memory_prot(void* addr, size_t size, int prot) {
    uintptr_t page_size = sysconf(_SC_PAGESIZE);
    uintptr_t page_start = (uintptr_t)addr & ~(page_size - 1);
    uintptr_t end = (uintptr_t)addr + size;
    size_t total_size = ((end + page_size - 1) & ~(page_size - 1)) - page_start;
    return mprotect((void*)page_start, total_size, prot) == 0;
}

inline void emit_arm64_jump(uint32_t* dest, uintptr_t target) {
    // LDR X16, #8 (loads 64-bit target from PC+8)
    // BR  X16
    dest[0] = 0x58000050;
    dest[1] = 0xD61F0200;
    dest[2] = (uint32_t)(target & 0xFFFFFFFF);
    dest[3] = (uint32_t)((target >> 32) & 0xFFFFFFFF);
}

inline bool hook_arm64(void* target, void* hook, void** orig_trampoline) {
    if (!target || !hook) return false;

    // Allocate trampoline buffer (RW first for Android W^X compatibility)
    void* trampoline = mmap(nullptr, 64, PROT_READ | PROT_WRITE,
                            MAP_ANONYMOUS | MAP_PRIVATE, -1, 0);
    if (trampoline == MAP_FAILED) {
        LOGE("Failed to mmap trampoline buffer");
        return false;
    }

    // Copy original 16 bytes (4 instructions)
    memcpy(trampoline, target, 16);

    // Append jump back to target + 16
    uintptr_t target_ret = (uintptr_t)target + 16;
    emit_arm64_jump((uint32_t*)((uintptr_t)trampoline + 16), target_ret);

    // Switch trampoline to RX
    mprotect(trampoline, 64, PROT_READ | PROT_EXEC);
    __builtin___clear_cache((char*)trampoline, (char*)trampoline + 32);

    if (orig_trampoline) {
        *orig_trampoline = trampoline;
    }

    // Make target writable
    if (!set_memory_prot(target, 16, PROT_READ | PROT_WRITE | PROT_EXEC)) {
        LOGE("Failed to set memory permissions for target at %p", target);
        munmap(trampoline, 64);
        return false;
    }

    // Write hook jump
    emit_arm64_jump((uint32_t*)target, (uintptr_t)hook);

    // Restore target protection to RX
    set_memory_prot(target, 16, PROT_READ | PROT_EXEC);
    __builtin___clear_cache((char*)target, (char*)target + 16);

    LOGI("Successfully hooked target %p -> hook %p (trampoline: %p)", target, hook, trampoline);
    return true;
}

} // namespace HookEngine

#endif // AOS_ARM64_HOOK_H
