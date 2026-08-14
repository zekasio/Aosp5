package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinCFError;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinCFErrorImpl implements AppLovinCFError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1177a;
    private String b;

    public AppLovinCFErrorImpl(int i, String str) {
        this.f1177a = i;
        this.b = str;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public int getCode() {
        return this.f1177a;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "AppLovinConsentFlowErrorImpl{code=" + this.f1177a + ", message='" + this.b + "'}";
    }
}
