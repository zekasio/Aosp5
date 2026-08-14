package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzzg {
    protected final zzza zza;
    protected final zzzf zzb;
    protected zzzc zzc;
    private final int zzd;

    protected zzzg(zzzd zzzdVar, zzzf zzzfVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzzfVar;
        this.zzd = i;
        this.zza = new zzza(zzzdVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzzv zzzvVar, long j, zzaau zzaauVar) {
        if (j == zzzvVar.zzf()) {
            return 0;
        }
        zzaauVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzzv zzzvVar, long j) throws IOException {
        long jZzf = j - zzzvVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        ((zzzk) zzzvVar).zzo((int) jZzf, false);
        return true;
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        while (true) {
            zzzc zzzcVar = this.zzc;
            zzdl.zzb(zzzcVar);
            long j = zzzcVar.zzf;
            long j2 = zzzcVar.zzg - j;
            long j3 = zzzcVar.zzh;
            if (j2 <= this.zzd) {
                zzc(false, j);
                return zzf(zzzvVar, j, zzaauVar);
            }
            if (!zzg(zzzvVar, j3)) {
                return zzf(zzzvVar, j3, zzaauVar);
            }
            zzzvVar.zzj();
            zzze zzzeVarZza = this.zzb.zza(zzzvVar, zzzcVar.zzb);
            int i = zzzeVarZza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzzvVar, j3, zzaauVar);
            }
            if (i == -2) {
                zzzc.zzh(zzzcVar, zzzeVarZza.zzc, zzzeVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zzzvVar, zzzeVarZza.zzd);
                    zzc(true, zzzeVarZza.zzd);
                    return zzf(zzzvVar, zzzeVarZza.zzd, zzaauVar);
                }
                zzzc.zzg(zzzcVar, zzzeVarZza.zzc, zzzeVarZza.zzd);
            }
        }
    }

    public final zzaax zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzzc zzzcVar = this.zzc;
        if (zzzcVar == null || zzzcVar.zza != j) {
            long jZzf = this.zza.zzf(j);
            zzza zzzaVar = this.zza;
            this.zzc = new zzzc(j, jZzf, 0L, zzzaVar.zzc, zzzaVar.zzd, zzzaVar.zze, zzzaVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
