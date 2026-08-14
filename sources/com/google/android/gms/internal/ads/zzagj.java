package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagj {
    public final zzagg zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzagj(zzagg zzaggVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdl.zzd(length == length2);
        int length3 = jArr.length;
        zzdl.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdl.zzd(length4 == length2);
        this.zza = zzaggVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | DriveFile.MODE_WRITE_ONLY;
        }
    }

    public final int zza(long j) {
        for (int iZzd = zzew.zzd(this.zzf, j, true, false); iZzd >= 0; iZzd--) {
            if ((this.zzg[iZzd] & 1) != 0) {
                return iZzd;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int iZzb = zzew.zzb(this.zzf, j, true, false); iZzb < this.zzf.length; iZzb++) {
            if ((this.zzg[iZzb] & 1) != 0) {
                return iZzb;
            }
        }
        return -1;
    }
}
