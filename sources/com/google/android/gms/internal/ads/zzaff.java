package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaff implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaff(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaff zza(long j, long j2, zzaan zzaanVar, zzen zzenVar) {
        int iZzk;
        zzenVar.zzG(10);
        int iZze = zzenVar.zze();
        if (iZze <= 0) {
            return null;
        }
        int i = zzaanVar.zzd;
        long jZzw = zzew.zzw(iZze, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iZzo = zzenVar.zzo();
        int iZzo2 = zzenVar.zzo();
        int iZzo3 = zzenVar.zzo();
        zzenVar.zzG(2);
        long j3 = j2 + ((long) zzaanVar.zzc);
        long[] jArr = new long[iZzo];
        long[] jArr2 = new long[iZzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzo) {
            int i3 = iZzo2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jZzw) / ((long) iZzo);
            jArr2[i2] = Math.max(j4, j5);
            if (iZzo3 == 1) {
                iZzk = zzenVar.zzk();
            } else if (iZzo3 == 2) {
                iZzk = zzenVar.zzo();
            } else if (iZzo3 == 3) {
                iZzk = zzenVar.zzm();
            } else {
                if (iZzo3 != 4) {
                    return null;
                }
                iZzk = zzenVar.zzn();
            }
            j4 += ((long) iZzk) * ((long) i3);
            i2++;
            j3 = j5;
            iZzo2 = i3;
            iZzo = iZzo;
        }
        if (j != -1 && j != j4) {
            zzee.zze("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzaff(jArr, jArr2, jZzw, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        return this.zza[zzew.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        int iZzd = zzew.zzd(this.zza, j, true, true);
        zzaay zzaayVar = new zzaay(this.zza[iZzd], this.zzb[iZzd]);
        if (zzaayVar.zzb < j) {
            long[] jArr = this.zza;
            if (iZzd != jArr.length - 1) {
                int i = iZzd + 1;
                return new zzaav(zzaayVar, new zzaay(jArr[i], this.zzb[i]));
            }
        }
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
