-- ============================================================
-- AOS5 Multiplayer - Supabase Schema
-- Run this in the Supabase SQL Editor (https://supabase.com/dashboard → SQL Editor)
-- ============================================================

-- 1. Lobbies table
CREATE TABLE lobbies (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    room_code INT NOT NULL DEFAULT (floor(random() * 9000 + 1000)::int),
    host_name TEXT NOT NULL DEFAULT 'Host',
    players_count INT NOT NULL DEFAULT 1,
    max_players INT NOT NULL DEFAULT 4,
    status TEXT NOT NULL DEFAULT 'waiting',
    created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

-- 2. Lobby Players table
CREATE TABLE lobby_players (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    lobby_id UUID NOT NULL REFERENCES lobbies(id) ON DELETE CASCADE,
    slot INT NOT NULL DEFAULT 0,
    player_name TEXT NOT NULL DEFAULT 'Player',
    is_ready BOOLEAN NOT NULL DEFAULT false,
    device_id TEXT,
    joined_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

-- 3. Chat Messages table
CREATE TABLE chat_messages (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    lobby_id UUID NOT NULL REFERENCES lobbies(id) ON DELETE CASCADE,
    sender_name TEXT NOT NULL DEFAULT 'Player',
    message TEXT NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

-- 4. Enable Row Level Security
ALTER TABLE lobbies ENABLE ROW LEVEL SECURITY;
ALTER TABLE lobby_players ENABLE ROW LEVEL SECURITY;
ALTER TABLE chat_messages ENABLE ROW LEVEL SECURITY;

-- 5. Allow full access for anon role (game clients)
CREATE POLICY "anon_all_lobbies" ON lobbies FOR ALL TO anon USING (true) WITH CHECK (true);
CREATE POLICY "anon_all_lobby_players" ON lobby_players FOR ALL TO anon USING (true) WITH CHECK (true);
CREATE POLICY "anon_all_chat_messages" ON chat_messages FOR ALL TO anon USING (true) WITH CHECK (true);

-- 6. Indexes for performance
CREATE INDEX idx_lobbies_status ON lobbies(status);
CREATE INDEX idx_lobbies_updated ON lobbies(updated_at);
CREATE INDEX idx_lobby_players_lobby ON lobby_players(lobby_id);
CREATE INDEX idx_chat_lobby ON chat_messages(lobby_id);
CREATE INDEX idx_chat_created ON chat_messages(created_at);
