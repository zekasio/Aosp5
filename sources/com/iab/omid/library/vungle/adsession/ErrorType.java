package com.iab.omid.library.vungle.adsession;

import com.vungle.warren.model.Advertisement;

/* JADX INFO: loaded from: classes2.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(Advertisement.KEY_VIDEO);

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
