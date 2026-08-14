package com.tapjoy.internal;

import com.vungle.warren.model.Advertisement;

/* JADX INFO: loaded from: classes2.dex */
public enum k2 {
    GENERIC("generic"),
    VIDEO(Advertisement.KEY_VIDEO);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1833a;

    k2(String str) {
        this.f1833a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1833a;
    }
}
