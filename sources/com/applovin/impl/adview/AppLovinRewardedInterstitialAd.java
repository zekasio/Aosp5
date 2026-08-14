package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f723a;
    private AppLovinAdDisplayListener b;
    private AppLovinAdClickListener c;
    private AppLovinAdVideoPlaybackListener d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f723a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.b = appLovinAdDisplayListener;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.c = appLovinAdClickListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f723a.show(appLovinAd, context, appLovinAdRewardListener, this.d, this.b, this.c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
