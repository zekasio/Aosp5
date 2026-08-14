package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbzx implements zzfuf {
    final /* synthetic */ zzbzz zza;

    zzbzx(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
