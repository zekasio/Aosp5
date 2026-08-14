package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfel implements zzfuf {
    final /* synthetic */ zzfen zza;
    final /* synthetic */ zzfec zzb;

    zzfel(zzfen zzfenVar, zzfec zzfecVar) {
        this.zza = zzfenVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar = this.zza;
        zzfec zzfecVar = this.zzb;
        zzfecVar.zzg(th);
        zzfecVar.zzf(false);
        zzfenVar.zza(zzfecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
    }
}
