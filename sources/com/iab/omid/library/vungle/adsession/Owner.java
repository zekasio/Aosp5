package com.iab.omid.library.vungle.adsession;

import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum Owner {
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
