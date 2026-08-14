package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaip implements zzzf {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaip(int i, zzeu zzeuVar, int i2) {
        this.zzc = i;
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzze zza(zzzv zzzvVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long j2;
        long jZzf = zzzvVar.zzf();
        int iMin = (int) Math.min(112800L, zzzvVar.zzd() - jZzf);
        this.zzb.zzC(iMin);
        ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, iMin, false);
        zzen zzenVar = this.zzb;
        int iZzd = zzenVar.zzd();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzenVar.zza() >= 188 && (iZza2 = (iZza = zzajb.zza(zzenVar.zzH(), zzenVar.zzc(), iZzd)) + 188) <= iZzd) {
            long jZzb = zzajb.zzb(zzenVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j) {
                    if (j4 == -9223372036854775807L) {
                        return zzze.zzd(jZzb2, jZzf);
                    }
                    j2 = jZzf + j5;
                } else if (100000 + jZzb2 > j) {
                    j2 = jZzf + ((long) iZza);
                } else {
                    j5 = iZza;
                    j4 = jZzb2;
                }
                return zzze.zze(j2);
            }
            zzenVar.zzF(iZza2);
            j3 = iZza2;
        }
        return j4 != -9223372036854775807L ? zzze.zzf(j4, jZzf + j3) : zzze.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb() {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
    }
}
