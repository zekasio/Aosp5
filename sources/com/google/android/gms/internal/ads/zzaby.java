package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaby extends zzzg {
    public zzaby(final zzaah zzaahVar, int i, long j, long j2) {
        long j3;
        zzzd zzzdVar = new zzzd() { // from class: com.google.android.gms.internal.ads.zzabv
            @Override // com.google.android.gms.internal.ads.zzzd
            public final long zza(long j4) {
                return zzaahVar.zzb(j4);
            }
        };
        zzabx zzabxVar = new zzabx(zzaahVar, i, null);
        long jZza = zzaahVar.zza();
        long j4 = zzaahVar.zzj;
        int i2 = zzaahVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzaahVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzaahVar.zza;
            long j5 = 4096;
            if (i3 == zzaahVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * ((long) zzaahVar.zzg)) * ((long) zzaahVar.zzh)) / 8) + 64;
        }
        super(zzzdVar, zzabxVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzaahVar.zzc));
    }
}
