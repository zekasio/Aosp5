package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzair {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    zzair(int i) {
    }

    private final int zze(zzzv zzzvVar) {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
        this.zzc = true;
        zzzvVar.zzj();
        return 0;
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzzvVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzzvVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (zzzvVar.zzf() != j2) {
                zzaauVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(iMin);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, iMin, false);
            zzen zzenVar = this.zzb;
            int iZzc = zzenVar.zzc();
            int iZzd = zzenVar.zzd();
            int i2 = iZzd - 188;
            while (true) {
                if (i2 < iZzc) {
                    break;
                }
                byte[] bArrZzH = zzenVar.zzH();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < iZzc || i5 >= iZzd || bArrZzH[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long jZzb = zzajb.zzb(zzenVar, i2, i);
                            if (jZzb != -9223372036854775807L) {
                                j = jZzb;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zzzvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzzvVar);
                return 0;
            }
            long jZzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = jZzb2;
            if (jZzb2 < 0) {
                zzee.zze("TsDurationReader", "Invalid duration: " + jZzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzzvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, zzzvVar.zzd());
        if (zzzvVar.zzf() != 0) {
            zzaauVar.zza = 0L;
            return 1;
        }
        this.zzb.zzC(iMin2);
        zzzvVar.zzj();
        ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, iMin2, false);
        zzen zzenVar2 = this.zzb;
        int iZzc2 = zzenVar2.zzc();
        int iZzd2 = zzenVar2.zzd();
        while (true) {
            if (iZzc2 >= iZzd2) {
                break;
            }
            if (zzenVar2.zzH()[iZzc2] == 71) {
                long jZzb3 = zzajb.zzb(zzenVar2, iZzc2, i);
                if (jZzb3 != -9223372036854775807L) {
                    j = jZzb3;
                    break;
                }
            }
            iZzc2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
