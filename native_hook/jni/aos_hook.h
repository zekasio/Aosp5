#ifndef AOS_HOOK_H
#define AOS_HOOK_H

#include <cstdint>

// bzStateGame memory structure offsets
#define AOS_ENTITY_BASE_OFFSET  580296 // 0x8DAC8
#define AOS_ENTITY_STRIDE       648    // 0x0288

#define AOS_OFFSET_POS_X        0
#define AOS_OFFSET_POS_Y        4
#define AOS_OFFSET_FLIP_X       16
#define AOS_OFFSET_STATE        24
#define AOS_OFFSET_HP           36
#define AOS_OFFSET_MAX_HP       40
#define AOS_OFFSET_ANIM_ID      76
#define AOS_OFFSET_ANIM_FRAME   96
#define AOS_OFFSET_TARGET_SLOT  628

struct EntityProxy {
    float x;
    float y;
    int32_t flip_x;
    int32_t state;
    int32_t hp;
    int32_t max_hp;
    int32_t anim_id;
};

void init_aos_multiplayer();

#endif // AOS_HOOK_H
