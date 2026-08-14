package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaez implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaez(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzew.zzv(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaez zza(long j, zzadt zzadtVar, long j2) {
        int length = zzadtVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzadtVar.zzb + zzadtVar.zzd[i3]);
            j3 += (long) (zzadtVar.zzc + zzadtVar.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaez(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        double d;
        int iZzd = zzew.zzd(jArr, j, true, true);
        long j2 = jArr[iZzd];
        long j3 = jArr2[iZzd];
        int i = iZzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = j4 - j2;
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        double d5 = j5 - j3;
        Double.isNaN(d5);
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * d5)) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        return zzew.zzv(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        Pair pairZzd = zzd(zzew.zzz(zzew.zzr(j, 0L, this.zzc)), this.zzb, this.zza);
        zzaay zzaayVar = new zzaay(zzew.zzv(((Long) pairZzd.first).longValue()), ((Long) pairZzd.second).longValue());
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
