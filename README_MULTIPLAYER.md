# Anger of Stick 5 - Native 4-Player Multiplayer Injection

## Architecture Overview
This mod injects an ultra-low-latency 4-player native UDP networking architecture directly into the Cocos2d-x native game engine (`libMyGame.so`) of **Anger of Stick 5 (v1.1.94)**.

### Core Mechanics
1. **Companion Entity Proxy Hijacking:**
   - The game supports mercenary allies in entity slots `1`, `2`, and `3` (slot `0` is the local player).
   - `bzStateGame::COMAI` is hooked and suppressed for slots 1, 2, and 3 when occupied by active networked peers.
   - Incoming UDP packets overwrite companion slot coordinates (`X, Y`), animation states, flip directions, and HP in real-time during `bzStateGame::drawScene`.
2. **Dynamic In-Engine Telemetry:**
   - In `bzStateGame::drawScene`, local player coordinates and animations are broadcast to the UDP Relay Server at 30–60 Hz.
3. **Damage Synchronization:**
   - In `bzStateGame::PCDamage`, damage events are propagated across network clients.
4. **Binary Injection:**
   - `libMyGame.so` was patched with `DT_NEEDED libaos_hook.so`.
   - `libaos_hook.so` automatically initializes upon library load, installs ARM64 inline hooks, and connects to the UDP relay server.

---

## Artifact Locations
- **Signed Repackaged APK:** `/workspaces/Aosp5/dist/AOS5_Multiplayer_v1.1.94_signed.apk`
- **Native Hook Library (arm64-v8a):** `/workspaces/Aosp5/native_hook/libs/arm64-v8a/libaos_hook.so`
- **C++ Native Relay Server Binary:** `/workspaces/Aosp5/server/relay_server`
- **Node.js Relay Server Script:** `/workspaces/Aosp5/server/relay_server.js`

---

## Memory Struct Layout (`bzStateGame`)
- **Entity Base Offset:** `580296` (`0x8DAC8`) from `bzStateGame*`
- **Entity Stride:** `648` (`0x0288`) bytes per slot
- **Slot 0:** Local Player
- **Slots 1, 2, 3:** Networked Proxies (Hijacked Companion Entities)
- **Slots 4..N:** Enemies & World Entities

### Entity Field Offsets:
- `+0x00` (`float`): Pos X
- `+0x04` (`float`): Pos Y
- `+0x10` (`int32_t`): Flip X (`1` = right, `-1` = left)
- `+0x18` (`int32_t`): Move State
- `+0x24` (`int32_t`): HP
- `+0x28` (`int32_t`): Max HP
- `+0x4C` (`int32_t`): Animation ID
- `+0x60` (`int32_t`): Animation Frame
- `+0x274` (`int32_t`): AI Target Slot

---

## Operational Guide

### 1. Starting the UDP Relay Server
Run either the Node.js server or the compiled C++ native server:

**Node.js Server:**
```bash
node /workspaces/Aosp5/server/relay_server.js
# Or with custom port:
PORT=7777 HOST=0.0.0.0 node /workspaces/Aosp5/server/relay_server.js
```

**C++ Native Server:**
```bash
/workspaces/Aosp5/server/relay_server 7777
```

### 2. Installing the Modified APK onto Android Devices / Emulators
```bash
adb install -r /workspaces/Aosp5/dist/AOS5_Multiplayer_v1.1.94_signed.apk
```

### 3. Optional: Configuring Server IP and Room ID
By default, clients connect to `127.0.0.1:7777` with Room `1`.
To configure a custom relay server IP or room on the device, push `/data/local/tmp/aos_multiplayer.cfg`:

```bash
adb shell "echo -e 'host=192.168.1.100\nport=7777\nroom=101\nslot=0' > /data/local/tmp/aos_multiplayer.cfg"
```

For player 2:
```bash
adb -s <device_2> shell "echo -e 'host=192.168.1.100\nport=7777\nroom=101\nslot=1' > /data/local/tmp/aos_multiplayer.cfg"
```

### 4. Monitoring Logs in Logcat
```bash
adb logcat -s AOS_HOOK AOS_NET
```
