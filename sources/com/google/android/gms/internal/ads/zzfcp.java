package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfcp implements zzfuf {
    final /* synthetic */ zzfcf zza;
    final /* synthetic */ zzfcr zzb;

    zzfcp(zzfcr zzfcrVar, zzfcf zzfcfVar) {
        this.zzb = zzfcrVar;
        this.zza = zzfcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zzb.zza.zzd.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
