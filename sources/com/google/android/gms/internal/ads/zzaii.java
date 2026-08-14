package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaii {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    zzaii() {
    }

    public static long zzc(zzen zzenVar) {
        int iZzc = zzenVar.zzc();
        if (zzenVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzenVar.zzB(bArr, 0, 9);
        zzenVar.zzF(iZzc);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzzv zzzvVar) {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
        this.zzc = true;
        zzzvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzzvVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
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
            int iZzd = zzenVar.zzd() - 4;
            while (true) {
                if (iZzd < iZzc) {
                    break;
                }
                if (zzg(zzenVar.zzH(), iZzd) == 442) {
                    zzenVar.zzF(iZzd + 4);
                    long jZzc = zzc(zzenVar);
                    if (jZzc != -9223372036854775807L) {
                        j = jZzc;
                        break;
                    }
                }
                iZzd--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzzvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzzvVar);
                return 0;
            }
            long jZzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = jZzb;
            if (jZzb < 0) {
                zzee.zze("PsDurationReader", "Invalid duration: " + jZzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzzvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzzvVar.zzd());
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
            if (iZzc2 >= iZzd2 - 3) {
                break;
            }
            if (zzg(zzenVar2.zzH(), iZzc2) == 442) {
                zzenVar2.zzF(iZzc2 + 4);
                long jZzc2 = zzc(zzenVar2);
                if (jZzc2 != -9223372036854775807L) {
                    j = jZzc2;
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

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
