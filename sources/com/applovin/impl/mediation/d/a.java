package com.applovin.impl.mediation.d;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.InterfaceC0058a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.InterfaceC0058a f1012a;

    @Override // com.applovin.impl.mediation.f.b
    public void a(MaxAd maxAd) {
    }

    public a(a.InterfaceC0058a interfaceC0058a) {
        this.f1012a = interfaceC0058a;
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        k.g(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        k.h(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        k.e(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        k.f(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        k.a(this.f1012a, maxAd, maxReward);
    }

    public void onAdLoaded(MaxAd maxAd) {
        k.a((MaxAdListener) this.f1012a, maxAd);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        k.a(this.f1012a, str, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        k.b(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        k.c(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        k.d(this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        k.a((MaxAdRevenueListener) this.f1012a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        k.a(this.f1012a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdRequestListener
    public void onAdRequestStarted(String str) {
        k.a(this.f1012a, str);
    }
}
