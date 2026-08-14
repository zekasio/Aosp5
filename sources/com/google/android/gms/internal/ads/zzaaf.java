package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaaf implements zzaax {
    private final zzaah zza;
    private final long zzb;

    public zzaaf(zzaah zzaahVar, long j) {
        this.zza = zzaahVar;
        this.zzb = j;
    }

    private final zzaay zza(long j, long j2) {
        return new zzaay((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzdl.zzb(this.zza.zzk);
        zzaah zzaahVar = this.zza;
        zzaag zzaagVar = zzaahVar.zzk;
        long[] jArr = zzaagVar.zza;
        long[] jArr2 = zzaagVar.zzb;
        int iZzd = zzew.zzd(jArr, zzaahVar.zzb(j), true, false);
        zzaay zzaayVarZza = zza(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzaayVarZza.zzb == j || iZzd == jArr.length - 1) {
            return new zzaav(zzaayVarZza, zzaayVarZza);
        }
        int i = iZzd + 1;
        return new zzaav(zzaayVarZza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
