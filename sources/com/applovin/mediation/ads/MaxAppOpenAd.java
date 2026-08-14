package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f1516a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context));
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        this.f1516a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.coreSdk);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f1516a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f1516a.setListener(maxAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f1516a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1516a.setRevenueListener(maxAdRevenueListener);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f1516a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1516a.setRequestListener(maxAdRequestListener);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f1516a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1516a.setAdReviewListener(maxAdReviewListener);
    }

    public void loadAd() {
        this.f1516a.logApiCall("loadAd()");
        this.f1516a.loadAd(null);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    public void showAd(String str, String str2) {
        this.f1516a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxAppOpenAd");
        this.f1516a.showAd(str, str2, null);
    }

    public String getAdUnitId() {
        return this.f1516a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f1516a.isReady();
        this.f1516a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f1516a.getAdUnitId());
        return zIsReady;
    }

    public void destroy() {
        this.f1516a.logApiCall("destroy()");
        this.f1516a.destroy();
    }

    public void setExtraParameter(String str, String str2) {
        this.f1516a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1516a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f1516a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1516a.setLocalExtraParameter(str, obj);
    }

    public String toString() {
        return "" + this.f1516a;
    }
}
