package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzblj implements zzbzw {
    final /* synthetic */ zzbll zza;

    zzblj(zzbll zzbllVar) {
        this.zza = zzbllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
