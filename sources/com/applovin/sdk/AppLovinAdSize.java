package com.applovin.sdk;

import androidx.recyclerview.widget.ItemTouchHelper;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1546a;
    private final int b;
    private final int c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(HttpStatus.SC_MULTIPLE_CHOICES, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.f1546a = str;
    }

    public int getWidth() {
        return this.b;
    }

    public int getHeight() {
        return this.c;
    }

    public String getLabel() {
        return this.f1546a.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return getLabel();
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }
}
