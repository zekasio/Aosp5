package com.vungle.warren.session;

/* JADX INFO: loaded from: classes3.dex */
public enum SessionAttribute {
    PLACEMENT_ID,
    TIMESTAMP,
    SUCCESS,
    EVENT_ID,
    ORIENTATION,
    VIDEO_CACHED,
    USED,
    URL,
    MUTED,
    ENABLED,
    REASON;

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }
}
