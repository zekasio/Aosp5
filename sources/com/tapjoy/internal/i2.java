package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum i2 {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    JAVASCRIPT("javascript");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1817a;

    i2(String str) {
        this.f1817a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1817a;
    }
}
