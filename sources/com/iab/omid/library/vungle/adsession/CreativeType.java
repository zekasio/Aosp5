package com.iab.omid.library.vungle.adsession;

import com.vungle.warren.model.Advertisement;

/* JADX INFO: loaded from: classes2.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(Advertisement.KEY_VIDEO),
    AUDIO("audio");

    private final String creativeType;

    CreativeType(String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.creativeType;
    }
}
