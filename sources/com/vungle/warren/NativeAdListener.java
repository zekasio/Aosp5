package com.vungle.warren;

import com.vungle.warren.error.VungleException;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdListener {
    void creativeId(String str);

    void onAdClick(String str);

    void onAdImpression(String str);

    void onAdLeftApplication(String str);

    void onAdLoadError(String str, VungleException vungleException);

    void onAdPlayError(String str, VungleException vungleException);

    void onNativeAdLoaded(NativeAd nativeAd);
}
