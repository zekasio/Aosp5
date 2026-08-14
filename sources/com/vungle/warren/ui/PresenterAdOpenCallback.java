package com.vungle.warren.ui;

/* JADX INFO: loaded from: classes3.dex */
public interface PresenterAdOpenCallback {

    public enum AdOpenType {
        DEFAULT,
        DEEP_LINK
    }

    void onAdOpenType(AdOpenType adOpenType);
}
