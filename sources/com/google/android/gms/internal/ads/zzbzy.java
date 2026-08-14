package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbzy implements zzfuf {
    final /* synthetic */ zzbzw zza;
    final /* synthetic */ zzbzu zzb;

    zzbzy(zzbzz zzbzzVar, zzbzw zzbzwVar, zzbzu zzbzuVar) {
        this.zza = zzbzwVar;
        this.zzb = zzbzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
