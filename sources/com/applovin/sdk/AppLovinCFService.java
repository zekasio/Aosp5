package com.applovin.sdk;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public interface AppLovinCFService {

    public enum CFType {
        UNKNOWN,
        STANDARD,
        DETAILED
    }

    public interface OnCFCompletionCallback {
        void onFlowCompleted(AppLovinCFError appLovinCFError);
    }

    CFType getCFType();

    void scf(Activity activity, OnCFCompletionCallback onCFCompletionCallback);
}
