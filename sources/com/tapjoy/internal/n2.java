package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum n2 {
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1860a;

    n2(String str) {
        this.f1860a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1860a;
    }
}
