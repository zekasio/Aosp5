package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzab extends InterstitialAdLoadCallback {
    zzab(zzac zzacVar) {
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        com.google.android.gms.ads.internal.util.zze.zza("Failed to load ad with error code: " + loadAdError.getCode());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        com.google.android.gms.ads.internal.util.zze.zza("Ad is loaded.");
    }
}
