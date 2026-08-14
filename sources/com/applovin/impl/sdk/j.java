package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* JADX INFO: loaded from: classes.dex */
class j implements AppLovinUserSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1336a;

    j() {
    }

    @Override // com.applovin.sdk.AppLovinUserSegment
    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                y.i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                y.i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f1336a = str;
    }

    @Override // com.applovin.sdk.AppLovinUserSegment
    public String getName() {
        return this.f1336a;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
