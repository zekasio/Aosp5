package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqz implements zzfuf {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ zzcra zzb;

    zzcqz(zzcra zzcraVar, zzfuf zzfufVar) {
        this.zzb = zzcraVar;
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zzb((zzcqm) obj);
    }
}
