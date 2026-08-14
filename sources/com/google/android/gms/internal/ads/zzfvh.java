package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvh extends zzfus {
    final /* synthetic */ zzfvj zza;
    private final zzftp zzb;

    zzfvh(zzfvj zzfvjVar, zzftp zzftpVar) {
        this.zza = zzfvjVar;
        zzftpVar.getClass();
        this.zzb = zzftpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfut zzfutVarZza = this.zzb.zza();
        zzfnu.zzd(zzfutVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zzfutVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfut) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    final boolean zzg() {
        return this.zza.isDone();
    }
}
