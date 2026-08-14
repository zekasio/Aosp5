package com.applovin.mediation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import cz.msebera.android.httpclient.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1513a;
    private final String b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");
    public static final MaxAdFormat CROSS_PROMO = new MaxAdFormat("XPROMO", "Cross Promo");

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("xpromo")) {
            return CROSS_PROMO;
        }
        if (str.equalsIgnoreCase(TapjoyConstants.TJC_PLUGIN_NATIVE)) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase(FirebaseAnalytics.Event.APP_OPEN)) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        if (str.equalsIgnoreCase("rewarded_inter") || str.equalsIgnoreCase("rewarded_interstitial")) {
            return REWARDED_INTERSTITIAL;
        }
        y.i("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    private MaxAdFormat(String str, String str2) {
        this.f1513a = str;
        this.b = str2;
    }

    public String getLabel() {
        return this.f1513a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(HttpStatus.SC_MULTIPLE_CHOICES, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        if (this == CROSS_PROMO) {
            return new AppLovinSdkUtils.Size(-1, -1);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Activity activity) {
        return getAdaptiveSize(-1, activity);
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i, Context context) {
        if (this == BANNER || this == LEADER) {
            return c.a(i, this, context);
        }
        return getSize();
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED || this == REWARDED_INTERSTITIAL;
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER || this == CROSS_PROMO;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f1513a + "'}";
    }

    @Deprecated
    public String getDisplayName() {
        return this.b;
    }
}
