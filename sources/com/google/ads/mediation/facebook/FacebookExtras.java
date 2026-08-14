package com.google.ads.mediation.facebook;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class FacebookExtras {
    public static final String NATIVE_BANNER = "native_banner";
    private static boolean _nativeBanner;

    public FacebookExtras setNativeBanner(boolean z) {
        _nativeBanner = z;
        return this;
    }

    public Bundle build() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(NATIVE_BANNER, _nativeBanner);
        return bundle;
    }
}
