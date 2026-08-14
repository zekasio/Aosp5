package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabr {
    protected final zzabb zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzabr(int i, int i2, long j, int i3, zzabb zzabbVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzabbVar;
        this.zzb = zzi(i, i2 == 2 ? 1667497984 : 1651965952);
        this.zzc = i2 == 2 ? zzi(i, 1650720768) : -1;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzj(int i) {
        return (this.zzd * ((long) i)) / ((long) this.zze);
    }

    private final zzaay zzk(int i) {
        return new zzaay(((long) this.zzl[i]) * zzj(1), this.zzk[i]);
    }

    public final zzaav zza(long j) {
        int iZzj = (int) (j / zzj(1));
        int iZzc = zzew.zzc(this.zzl, iZzj, true, true);
        if (this.zzl[iZzc] == iZzj) {
            zzaay zzaayVarZzk = zzk(iZzc);
            return new zzaav(zzaayVarZzk, zzaayVarZzk);
        }
        zzaay zzaayVarZzk2 = zzk(iZzc);
        int i = iZzc + 1;
        return i < this.zzk.length ? new zzaav(zzaayVarZzk2, zzk(i)) : new zzaav(zzaayVarZzk2, zzaayVarZzk2);
    }

    public final void zzb(long j) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i = this.zzj;
        jArr2[i] = j;
        this.zzl[i] = this.zzi;
        this.zzj = i + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zzf(long j) {
        if (this.zzj == 0) {
            this.zzh = 0;
        } else {
            this.zzh = this.zzl[zzew.zzd(this.zzk, j, true, true)];
        }
    }

    public final boolean zzg(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzh(zzzv zzzvVar) throws IOException {
        int i = this.zzg;
        int iZze = i - this.zza.zze(zzzvVar, i, false);
        this.zzg = iZze;
        boolean z = iZze == 0;
        if (z) {
            if (this.zzf > 0) {
                this.zza.zzs(zzj(this.zzh), Arrays.binarySearch(this.zzl, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z;
    }
}
