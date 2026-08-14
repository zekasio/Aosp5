package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, MaxRewardedAd> f1518a = CollectionUtils.map();
    private static final Object b = new Object();
    private static WeakReference<Activity> c = new WeakReference<>(null);
    private final MaxFullscreenAdImpl d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.d.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.d.setListener(maxRewardedAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.d.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.d.setRevenueListener(maxAdRevenueListener);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.d.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.d.setRequestListener(maxAdRequestListener);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.d.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.d.setAdReviewListener(maxAdReviewListener);
    }

    public void loadAd() {
        this.d.logApiCall("loadAd()");
        this.d.loadAd(getActivity());
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, String str2) {
        this.d.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxRewardedAd");
        this.d.showAd(str, str2, getActivity());
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(null, viewGroup, lifecycle);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, null, viewGroup, lifecycle);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.d.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.d.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public String getAdUnitId() {
        return this.d.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.d.isReady();
        this.d.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.d.getAdUnitId());
        return zIsReady;
    }

    public void destroy() {
        this.d.logApiCall("destroy()");
        synchronized (b) {
            f1518a.remove(this.d.getAdUnitId());
        }
        this.d.destroy();
    }

    public static void updateActivity(Activity activity) {
        a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            c = new WeakReference<>(activity);
        }
    }

    public void setExtraParameter(String str, String str2) {
        this.d.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.d.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.d.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.d.setLocalExtraParameter(str, obj);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
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
        updateActivity(activity);
        synchronized (b) {
            Map<String, MaxRewardedAd> map = f1518a;
            MaxRewardedAd maxRewardedAd = map.get(str);
            if (maxRewardedAd != null) {
                return maxRewardedAd;
            }
            MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
            map.put(str, maxRewardedAd2);
            return maxRewardedAd2;
        }
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.d.logApiCall("getActivity()");
        return c.get();
    }

    public String toString() {
        return "" + this.d;
    }
}
