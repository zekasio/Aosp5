package com.vungle.warren.session;

/* JADX INFO: loaded from: classes3.dex */
public enum SessionEvent {
    INIT,
    INIT_END,
    PLAY_AD,
    APP_FOREGROUND,
    APP_BACKGROUND,
    AD_EXPIRED,
    LOAD_AD,
    LOAD_AD_END,
    AD_AVAILABLE,
    ANDROID_ID,
    ADS_CACHED,
    ORIENTATION,
    MUTE,
    REWARDED,
    OM_SDK,
    DID_CLOSE,
    DISMISS_AD,
    TPAT;

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase();
    }
}
