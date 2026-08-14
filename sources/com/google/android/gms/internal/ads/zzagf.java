package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzzv zzzvVar) throws IOException {
        return zzc(zzzvVar, true, false);
    }

    public static boolean zzb(zzzv zzzvVar, boolean z) throws IOException {
        return zzc(zzzvVar, false, false);
    }

    private static boolean zzc(zzzv zzzvVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long jZzr;
        int i;
        long jZzd = zzzvVar.zzd();
        long j = 4096;
        long j2 = -1;
        if (jZzd != -1 && jZzd <= 4096) {
            j = jZzd;
        }
        zzen zzenVar = new zzen(64);
        int i2 = (int) j;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            zzenVar.zzC(8);
            if (!zzzvVar.zzm(zzenVar.zzH(), 0, 8, true)) {
                break;
            }
            long jZzs = zzenVar.zzs();
            int iZze = zzenVar.zze();
            if (jZzs == 1) {
                zzzvVar.zzh(zzenVar.zzH(), 8, 8);
                i = 16;
                zzenVar.zzE(16);
                jZzr = zzenVar.zzr();
            } else {
                if (jZzs == 0) {
                    long jZzd2 = zzzvVar.zzd();
                    if (jZzd2 != j2) {
                        jZzs = 8 + (jZzd2 - zzzvVar.zze());
                    }
                }
                jZzr = jZzs;
                i = 8;
            }
            long j3 = i;
            if (jZzr < j3) {
                return false;
            }
            i3 += i;
            if (iZze == 1836019574) {
                i2 += (int) jZzr;
                if (jZzd != -1 && i2 > jZzd) {
                    i2 = (int) jZzd;
                }
                j2 = -1;
            } else {
                if (iZze == 1836019558 || iZze == 1836475768) {
                    z3 = true;
                    break;
                }
                long j4 = jZzd;
                if ((((long) i3) + jZzr) - j3 >= i2) {
                    break;
                }
                int i4 = (int) (jZzr - j3);
                i3 += i4;
                if (iZze == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    zzenVar.zzC(i4);
                    zzzvVar.zzh(zzenVar.zzH(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int iZze2 = zzenVar.zze();
                            if ((iZze2 >>> 8) != 3368816) {
                                if (iZze2 == 1751476579) {
                                    iZze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != iZze2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        zzenVar.zzG(4);
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    zzzvVar.zzg(i4);
                }
                j2 = -1;
                jZzd = j4;
            }
        }
        z3 = false;
        return z4 && z == z3;
    }
}
