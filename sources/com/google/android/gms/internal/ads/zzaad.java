package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaad {
    public static int zza(zzen zzenVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzenVar.zzk() + 1;
            case 7:
                return zzenVar.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzzv zzzvVar, zzaah zzaahVar) throws IOException {
        zzzvVar.zzj();
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzzkVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzzkVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzen zzenVar = new zzen(i2);
        zzenVar.zzE(zzzy.zza(zzzvVar, zzenVar.zzH(), 0, i2));
        zzzvVar.zzj();
        zzaac zzaacVar = new zzaac();
        if (zzd(zzenVar, zzaahVar, z, zzaacVar)) {
            return zzaacVar.zza;
        }
        throw zzbu.zza(null, null);
    }

    public static boolean zzc(zzen zzenVar, zzaah zzaahVar, int i, zzaac zzaacVar) {
        int iZza;
        int iZzc = zzenVar.zzc();
        long jZzs = zzenVar.zzs();
        long j = jZzs >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jZzs >> 12;
        long j3 = jZzs >> 8;
        long j4 = jZzs >> 4;
        long j5 = jZzs >> 1;
        long j6 = jZzs & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzaahVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzaahVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if (!(i3 == 0 || i3 == zzaahVar.zzi) || j6 == 1 || !zzd(zzenVar, zzaahVar, z, zzaacVar) || (iZza = zza(zzenVar, (int) (j2 & 15))) == -1 || iZza > zzaahVar.zzb) {
            return false;
        }
        int i4 = zzaahVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzaahVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzenVar.zzk() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int iZzo = zzenVar.zzo();
                if (i5 == 14) {
                    iZzo *= 10;
                }
                if (iZzo != i4) {
                    return false;
                }
            }
        }
        return zzenVar.zzk() == zzew.zzh(zzenVar.zzH(), iZzc, zzenVar.zzc() + (-1), 0);
    }

    private static boolean zzd(zzen zzenVar, zzaah zzaahVar, boolean z, zzaac zzaacVar) {
        try {
            long jZzu = zzenVar.zzu();
            if (!z) {
                jZzu *= (long) zzaahVar.zzb;
            }
            zzaacVar.zza = jZzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
