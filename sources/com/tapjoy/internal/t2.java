package com.tapjoy.internal;

import com.vungle.warren.model.Advertisement;

/* JADX INFO: loaded from: classes2.dex */
public enum t2 {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1911a;

    t2(String str) {
        this.f1911a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1911a;
    }
}
