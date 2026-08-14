package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f1529a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f1529a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk);
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f1529a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f1529a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f1529a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f1529a.render(maxNativeAdView, maxAd);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f1529a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f1529a.setNativeAdListener(maxNativeAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f1529a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1529a.setRevenueListener(maxAdRevenueListener);
    }

    public void setPlacement(String str) {
        this.f1529a.logApiCall("setPlacement(placement=" + str + ")");
        this.f1529a.setPlacement(str);
    }

    public String getPlacement() {
        this.f1529a.logApiCall("getPlacement()");
        return this.f1529a.getPlacement();
    }

    public void setCustomData(String str) {
        this.f1529a.logApiCall("setCustomData(value=" + str + ")");
        this.f1529a.setCustomData(str);
    }

    public String getAdUnitId() {
        return this.f1529a.getAdUnitId();
    }

    public void destroy() {
        this.f1529a.logApiCall("destroy()");
        this.f1529a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        this.f1529a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f1529a.destroy(maxAd);
    }

    public void setExtraParameter(String str, String str2) {
        this.f1529a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1529a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f1529a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1529a.setLocalExtraParameter(str, obj);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f1529a.logApiCall("a()");
        this.f1529a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f1529a.logApiCall("b()");
        this.f1529a.handleNativeAdViewRendered(maxAd);
    }
}
