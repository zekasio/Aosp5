package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzze {
    public static final zzze zza = new zzze(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzze(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzze zzd(long j, long j2) {
        return new zzze(-1, j, j2);
    }

    public static zzze zze(long j) {
        return new zzze(0, -9223372036854775807L, j);
    }

    public static zzze zzf(long j, long j2) {
        return new zzze(-2, j, j2);
    }
}
