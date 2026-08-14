package com.tapjoy.internal;

import com.vungle.warren.model.Advertisement;

/* JADX INFO: loaded from: classes2.dex */
public enum j2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(Advertisement.KEY_VIDEO),
    AUDIO("audio");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1825a;

    j2(String str) {
        this.f1825a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1825a;
    }
}
