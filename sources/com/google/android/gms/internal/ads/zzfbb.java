package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfbb implements zzfuf {
    final /* synthetic */ zzfbe zza;
    final /* synthetic */ zzfbf zzb;

    zzfbb(zzfbf zzfbfVar, zzfbe zzfbeVar) {
        this.zzb = zzfbfVar;
        this.zza = zzfbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfbf zzfbfVar = this.zzb;
            if (zzfbfVar.zzf == 1) {
                zzfbfVar.zzh();
            }
        }
    }
}
