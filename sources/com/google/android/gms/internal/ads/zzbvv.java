package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbvv implements zzfuf {
    final /* synthetic */ zzfut zza;

    zzbvv(zzbvw zzbvwVar, zzfut zzfutVar) {
        this.zza = zzfutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzbvw.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbvw.zzc.remove(this.zza);
    }
}
