package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaan {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zzaao.zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        this.zzb = zzaao.zza[3 - i3];
        int i6 = zzaao.zzb[i5];
        this.zzd = i6;
        if (i2 == 2) {
            i6 /= 2;
            this.zzd = i6;
        } else if (i2 == 0) {
            i6 /= 4;
            this.zzd = i6;
        }
        int i7 = (i >>> 9) & 1;
        this.zzg = zzaao.zzl(i2, i3);
        if (i3 == 3) {
            int i8 = i2 == 3 ? zzaao.zzc[i4 - 1] : zzaao.zzd[i4 - 1];
            this.zzf = i8;
            this.zzc = (((i8 * 12) / i6) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i9 = i3 == 2 ? zzaao.zze[i4 - 1] : zzaao.zzf[i4 - 1];
                this.zzf = i9;
                this.zzc = ((i9 * 144) / i6) + i7;
            } else {
                int i10 = zzaao.zzg[i4 - 1];
                this.zzf = i10;
                this.zzc = (((i3 == 1 ? 72 : 144) * i10) / i6) + i7;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
