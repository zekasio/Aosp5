package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzecn implements zzfuf {
    final /* synthetic */ zzeco zza;

    zzecn(zzeco zzecoVar) {
        this.zza = zzecoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zzeVarZza);
        zzezr.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcok) obj).zzj();
    }
}
