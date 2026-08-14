package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.adview.p;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        return new p(appLovinSdk, context);
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
