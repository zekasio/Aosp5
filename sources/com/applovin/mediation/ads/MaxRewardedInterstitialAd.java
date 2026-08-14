package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f1519a = new WeakReference<>(null);
    private final MaxFullscreenAdImpl b;

    public MaxRewardedInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        f1519a = new WeakReference<>(activity);
        this.b = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.coreSdk);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.b.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.b.setListener(maxRewardedAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.b.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.b.setRevenueListener(maxAdRevenueListener);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.b.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.b.setRequestListener(maxAdRequestListener);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.b.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.b.setAdReviewListener(maxAdReviewListener);
    }

    public void loadAd() {
        this.b.logApiCall("loadAd()");
        this.b.loadAd(getActivity());
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, String str2) {
        this.b.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        this.b.showAd(str, str2, getActivity());
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(null, viewGroup, lifecycle);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, null, viewGroup, lifecycle);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.b.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.b.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public boolean isReady() {
        boolean zIsReady = this.b.isReady();
        this.b.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.b.getAdUnitId());
        return zIsReady;
    }

    public void destroy() {
        this.b.logApiCall("destroy()");
        this.b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.b.logApiCall("getActivity()");
        return f1519a.get();
    }

    public void setExtraParameter(String str, String str2) {
        this.b.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.b.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.b.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.b.setLocalExtraParameter(str, obj);
    }

    public String toString() {
        return "" + this.b;
    }
}
