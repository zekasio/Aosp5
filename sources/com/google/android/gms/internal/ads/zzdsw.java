package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdsw extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdsz zzb;

    zzdsw(zzdsz zzdszVar, String str) {
        this.zzb = zzdszVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzl(zzdsz.zzk(loadAdError), this.zza);
    }
}
