# Anger of Stick 5 - Native 4-Player Multiplayer Suite

## 🎮 Complete Game Flow & Feature Overview

### 1. App Launch: Mode Selection
When you open Anger of Stick 5, an initial startup prompt allows you to choose:
- **🎮 Offline Mode (Single Player):** Launches the unmodified, classic single-player story/zombie game instantly.
- **🌐 Online Multiplayer (4-Player Co-Op):** Opens the online lobby room browser.

---

### 2. Online Lobby & Ready Flow (Up to 4 Players)
- **Room Hosting:** Tap **👑 Player 1 (Host)** to create a room with a Room Code (e.g. `101`).
- **Joining:** Your friends select **⚔️ Player 2**, **Player 3**, or **Player 4**, enter the same Room Code, and connect.
- **Player Ready Toggle:**
  - Clients tap **⚡ READY UP** (button turns green).
  - The live counter updates in real time (e.g. `2/4 Ready`, `3/4 Ready`, `4/4 Ready`).
- **Host Launch:**
  - Once players are ready, the Host taps **🚀 START MATCH**.

---

### 3. Level Selection & Armory (Gun Upgrades) Section
- **Level Select:**
  - The Host selects the level or zombie mode.
  - Clients see a synchronized transition screen: `"⏳ Waiting for Host to select level..."`.
- **Armory & Gun Upgrades Section:**
  - All players enter the armory to purchase and equip weapons and upgrades.
  - A persistent widget in the **bottom-left corner** displays:
    - Ready count (e.g. `Ready: 2/4`, `Ready: 3/4`)
    - Client **"⚡ READY"** button
    - Host **"🚀 GO!"** button
  - When players are ready, the Host presses **"GO!"** and all 4 players spawn directly into the game level simultaneously!

---

### 4. Playing Online Over the Internet (500 km Distance)
Because you and your friends are in different locations (WAN / Internet):
1. **Host the Relay Server Online:**
   Run the lightweight relay server on any VPS or cloud container (Fly.io / Render / Railway / Replit) or use a free UDP tunnel:
   ```bash
   # On your server / PC:
   node /workspaces/Aosp5/server/relay_server.js
   ```
2. **In the Game Lobby:**
   Enter your public server IP or tunnel address (e.g. `my-relay.fly.dev` or `203.0.113.10:7777`).
   Both you and your friends connect to that address and enter the same Room Code!

---

### 📦 Artifacts
- **Signed APK:** [dist/AOS5_Multiplayer_v1.1.94_signed.apk](file:///workspaces/Aosp5/dist/AOS5_Multiplayer_v1.1.94_signed.apk) (56 MB)
- **Relay Server (Node.js):** [server/relay_server.js](file:///workspaces/Aosp5/server/relay_server.js)
- **Native Hook (arm64-v8a):** [native_hook/libs/arm64-v8a/libaos_hook.so](file:///workspaces/Aosp5/native_hook/libs/arm64-v8a/libaos_hook.so)
