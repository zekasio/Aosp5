package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzagy {
    private zzabb zzb;
    private zzzx zzc;
    private zzagt zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzagr zza = new zzagr();
    private zzagv zzj = new zzagv();

    protected abstract long zza(zzen zzenVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzagv();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws IOException;

    final int zze(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzb);
        int i = zzew.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzzvVar)) {
                long jZzf = zzzvVar.zzf();
                long j = this.zzf;
                this.zzk = jZzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzafVar);
                        this.zzm = true;
                    }
                    zzagt zzagtVar = this.zzj.zzb;
                    if (zzagtVar != null) {
                        this.zzd = zzagtVar;
                    } else if (zzzvVar.zzd() == -1) {
                        this.zzd = new zzagx(null);
                    } else {
                        zzags zzagsVarZzb = this.zza.zzb();
                        this.zzd = new zzagm(this, this.zzf, zzzvVar.zzd(), zzagsVarZzb.zzd + zzagsVarZzb.zze, zzagsVarZzb.zzb, (zzagsVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzzvVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzzk) zzzvVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzzvVar);
        if (jZzd >= 0) {
            zzaauVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzaax zzaaxVarZze = this.zzd.zze();
            zzdl.zzb(zzaaxVarZze);
            this.zzc.zzN(zzaaxVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzzvVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzen zzenVarZza = this.zza.zza();
        long jZza = zza(zzenVarZza);
        if (jZza >= 0) {
            long j2 = this.zzg;
            if (j2 + jZza >= this.zze) {
                long jZzf2 = zzf(j2);
                zzaaz.zzb(this.zzb, zzenVarZza, zzenVarZza.zzd());
                this.zzb.zzs(jZzf2, 1, zzenVarZza.zzd(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    protected final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    final void zzh(zzzx zzzxVar, zzabb zzabbVar) {
        this.zzc = zzzxVar;
        this.zzb = zzabbVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzagt zzagtVar = this.zzd;
            int i = zzew.zza;
            zzagtVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
