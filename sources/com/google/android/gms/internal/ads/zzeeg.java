package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeeg implements zzfuf {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzeyc zzc;
    final /* synthetic */ zzeyf zzd;
    final /* synthetic */ zzffb zze;
    final /* synthetic */ zzeyo zzf;
    final /* synthetic */ zzeeh zzg;

    zzeeg(zzeeh zzeehVar, long j, String str, zzeyc zzeycVar, zzeyf zzeyfVar, zzffb zzffbVar, zzeyo zzeyoVar) {
        this.zzg = zzeehVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzeycVar;
        this.zzd = zzeyfVar;
        this.zze = zzffbVar;
        this.zzf = zzeyoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    @Override // com.google.android.gms.internal.ads.zzfuf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzeeh.zzg(this.zzg, this.zzb, 0, jElapsedRealtime, this.zzc.zzag, null);
        zzeeh zzeehVar = this.zzg;
        if (zzeehVar.zze) {
            zzeehVar.zzb.zza(this.zzd, this.zzc, 0, null, jElapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, null);
    }
}
