package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagn implements zzagt {
    private final zzaah zza;
    private final zzaag zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzagn(zzaah zzaahVar, zzaag zzaagVar) {
        this.zza = zzaahVar;
        this.zzb = zzaagVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final long zzd(zzzv zzzvVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final zzaax zze() {
        zzdl.zzf(this.zzc != -1);
        return new zzaaf(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzagt
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzew.zzd(jArr, j, true, true)];
    }
}
