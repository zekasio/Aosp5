package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvp extends zzbvc {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbvq zzb;

    public zzbvp(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbvq zzbvqVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg() {
        zzbvq zzbvqVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbvqVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbvqVar);
    }
}
