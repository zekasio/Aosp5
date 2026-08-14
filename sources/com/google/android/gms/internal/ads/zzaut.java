package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaut extends zzava {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzaut(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzd(zzauy zzauyVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzauu(zzauyVar, this.zzb));
        }
    }
}
