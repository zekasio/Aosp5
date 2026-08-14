package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafr {
    private static final byte[] zza = zzew.zzab("OpusHead");

    public static Pair zza(zzafi zzafiVar) {
        zzen zzenVar = zzafiVar.zza;
        zzenVar.zzF(8);
        zzbq zzbqVar = null;
        zzbq zzbqVar2 = null;
        while (zzenVar.zza() >= 8) {
            int iZzc = zzenVar.zzc();
            int iZze = zzenVar.zze();
            int iZze2 = zzenVar.zze();
            if (iZze2 == 1835365473) {
                zzenVar.zzF(iZzc);
                int i = iZzc + iZze;
                zzenVar.zzG(8);
                zzd(zzenVar);
                while (true) {
                    if (zzenVar.zzc() >= i) {
                        break;
                    }
                    int iZzc2 = zzenVar.zzc();
                    int iZze3 = zzenVar.zze();
                    if (zzenVar.zze() == 1768715124) {
                        zzenVar.zzF(iZzc2);
                        int i2 = iZzc2 + iZze3;
                        zzenVar.zzG(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzenVar.zzc() < i2) {
                            zzbp zzbpVarZza = zzafy.zza(zzenVar);
                            if (zzbpVarZza != null) {
                                arrayList.add(zzbpVarZza);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        zzbqVar = new zzbq(arrayList);
                    } else {
                        zzenVar.zzF(iZzc2 + iZze3);
                    }
                }
                zzbqVar = null;
            } else if (iZze2 == 1936553057) {
                zzenVar.zzF(iZzc);
                int i3 = iZzc + iZze;
                zzenVar.zzG(12);
                while (true) {
                    if (zzenVar.zzc() >= i3) {
                        break;
                    }
                    int iZzc3 = zzenVar.zzc();
                    int iZze4 = zzenVar.zze();
                    if (zzenVar.zze() != 1935766900) {
                        zzenVar.zzF(iZzc3 + iZze4);
                    } else {
                        if (iZze4 < 14) {
                            break;
                        }
                        zzenVar.zzG(5);
                        int iZzk = zzenVar.zzk();
                        float f = 120.0f;
                        if (iZzk != 12) {
                            if (iZzk != 13) {
                                break;
                            }
                        } else if (iZzk == 12) {
                            f = 240.0f;
                        }
                        zzenVar.zzG(1);
                        zzbqVar2 = new zzbq(-9223372036854775807L, new zzaei(f, zzenVar.zzk()));
                    }
                }
                zzbqVar2 = null;
            }
            zzenVar.zzF(iZzc + iZze);
        }
        return Pair.create(zzbqVar, zzbqVar2);
    }

    public static zzbq zzb(zzafh zzafhVar) {
        zzaec zzaecVar;
        zzafi zzafiVarZzb = zzafhVar.zzb(1751411826);
        zzafi zzafiVarZzb2 = zzafhVar.zzb(1801812339);
        zzafi zzafiVarZzb3 = zzafhVar.zzb(1768715124);
        if (zzafiVarZzb == null || zzafiVarZzb2 == null || zzafiVarZzb3 == null || zzg(zzafiVarZzb.zza) != 1835299937) {
            return null;
        }
        zzen zzenVar = zzafiVarZzb2.zza;
        zzenVar.zzF(12);
        int iZze = zzenVar.zze();
        String[] strArr = new String[iZze];
        for (int i = 0; i < iZze; i++) {
            int iZze2 = zzenVar.zze();
            zzenVar.zzG(4);
            strArr[i] = zzenVar.zzx(iZze2 - 8, zzfnh.zzc);
        }
        zzen zzenVar2 = zzafiVarZzb3.zza;
        zzenVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzenVar2.zza() > 8) {
            int iZzc = zzenVar2.zzc();
            int iZze3 = zzenVar2.zze();
            int iZze4 = zzenVar2.zze() - 1;
            if (iZze4 < 0 || iZze4 >= iZze) {
                zzee.zze("AtomParsers", "Skipped metadata with unknown key index: " + iZze4);
            } else {
                String str = strArr[iZze4];
                int i2 = iZzc + iZze3;
                int i3 = zzafy.zzb;
                while (true) {
                    int iZzc2 = zzenVar2.zzc();
                    if (iZzc2 >= i2) {
                        zzaecVar = null;
                        break;
                    }
                    int iZze5 = zzenVar2.zze();
                    if (zzenVar2.zze() == 1684108385) {
                        int iZze6 = zzenVar2.zze();
                        int iZze7 = zzenVar2.zze();
                        int i4 = iZze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzenVar2.zzB(bArr, 0, i4);
                        zzaecVar = new zzaec(str, bArr, iZze7, iZze6);
                        break;
                    }
                    zzenVar2.zzF(iZzc2 + iZze5);
                }
                if (zzaecVar != null) {
                    arrayList.add(zzaecVar);
                }
            }
            zzenVar2.zzF(iZzc + iZze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:372:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x09ec A[PHI: r8
      0x09ec: PHI (r8v74 int) = (r8v73 int), (r8v73 int), (r8v106 int), (r8v73 int) binds: [B:421:0x0948, B:428:0x0962, B:445:0x09eb, B:427:0x0960] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0ade A[ADDED_TO_REGION, LOOP:13: B:487:0x0ade->B:491:0x0ae8, LOOP_START, PHI: r23
      0x0ade: PHI (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:486:0x0adc, B:491:0x0ae8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0e45 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0d41 A[EDGE_INSN: B:627:0x0d41->B:572:0x0d41 BREAK  A[LOOP:6: B:555:0x0cd2->B:571:0x0d35], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0ad5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzafh r56, com.google.android.gms.internal.ads.zzaaj r57, long r58, com.google.android.gms.internal.ads.zzx r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfnj r63) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 3663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzc(com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzaaj, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.google.android.gms.internal.ads.zzfnj):java.util.List");
    }

    public static void zzd(zzen zzenVar) {
        int iZzc = zzenVar.zzc();
        zzenVar.zzG(4);
        if (zzenVar.zze() != 1751411826) {
            iZzc += 4;
        }
        zzenVar.zzF(iZzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzen zzenVar) {
        int iZzk = zzenVar.zzk();
        int i = iZzk & 127;
        while ((iZzk & 128) == 128) {
            iZzk = zzenVar.zzk();
            i = (i << 7) | (iZzk & 127);
        }
        return i;
    }

    private static int zzg(zzen zzenVar) {
        zzenVar.zzF(16);
        return zzenVar.zze();
    }

    private static Pair zzh(zzafh zzafhVar) {
        zzafi zzafiVarZzb = zzafhVar.zzb(1701606260);
        if (zzafiVarZzb == null) {
            return null;
        }
        zzen zzenVar = zzafiVarZzb.zza;
        zzenVar.zzF(8);
        int iZze = zzafj.zze(zzenVar.zze());
        int iZzn = zzenVar.zzn();
        long[] jArr = new long[iZzn];
        long[] jArr2 = new long[iZzn];
        for (int i = 0; i < iZzn; i++) {
            jArr[i] = iZze == 1 ? zzenVar.zzt() : zzenVar.zzs();
            jArr2[i] = iZze == 1 ? zzenVar.zzr() : zzenVar.zze();
            if (zzenVar.zzy() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzenVar.zzG(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzen zzenVar) {
        zzenVar.zzF(8);
        int iZze = zzafj.zze(zzenVar.zze());
        zzenVar.zzG(iZze == 0 ? 8 : 16);
        long jZzs = zzenVar.zzs();
        zzenVar.zzG(iZze == 0 ? 4 : 8);
        int iZzo = zzenVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iZzo >> 10) & 31) + 96));
        sb.append((char) (((iZzo >> 5) & 31) + 96));
        sb.append((char) ((iZzo & 31) + 96));
        return Pair.create(Long.valueOf(jZzs), sb.toString());
    }

    private static Pair zzj(zzen zzenVar, int i, int i2) throws zzbu {
        Integer num;
        zzagh zzaghVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzc = zzenVar.zzc();
        while (iZzc - i < i2) {
            zzenVar.zzF(iZzc);
            int iZze = zzenVar.zze();
            zzzy.zzb(iZze > 0, "childAtomSize must be positive");
            if (zzenVar.zze() == 1936289382) {
                int i5 = iZzc + 8;
                int i6 = -1;
                int i7 = 0;
                String strZzx = null;
                Integer numValueOf = null;
                while (i5 - iZzc < iZze) {
                    zzenVar.zzF(i5);
                    int iZze2 = zzenVar.zze();
                    int iZze3 = zzenVar.zze();
                    if (iZze3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzenVar.zze());
                    } else if (iZze3 == 1935894637) {
                        zzenVar.zzG(4);
                        strZzx = zzenVar.zzx(4, zzfnh.zzc);
                    } else if (iZze3 == 1935894633) {
                        i6 = i5;
                        i7 = iZze2;
                    }
                    i5 += iZze2;
                }
                if ("cenc".equals(strZzx) || "cbc1".equals(strZzx) || "cens".equals(strZzx) || "cbcs".equals(strZzx)) {
                    zzzy.zzb(numValueOf != null, "frma atom is mandatory");
                    zzzy.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = numValueOf;
                            zzaghVar = null;
                            break;
                        }
                        zzenVar.zzF(i8);
                        int iZze4 = zzenVar.zze();
                        if (zzenVar.zze() == 1952804451) {
                            int iZze5 = zzafj.zze(zzenVar.zze());
                            zzenVar.zzG(1);
                            if (iZze5 == 0) {
                                zzenVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzk = zzenVar.zzk();
                                int i9 = iZzk & 240;
                                i3 = iZzk & 15;
                                i4 = i9 >> 4;
                            }
                            boolean z = zzenVar.zzk() == 1;
                            int iZzk2 = zzenVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzenVar.zzB(bArr2, 0, 16);
                            if (z && iZzk2 == 0) {
                                int iZzk3 = zzenVar.zzk();
                                byte[] bArr3 = new byte[iZzk3];
                                zzenVar.zzB(bArr3, 0, iZzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            zzaghVar = new zzagh(z, strZzx, iZzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += iZze4;
                        }
                    }
                    zzzy.zzb(zzaghVar != null, "tenc atom is mandatory");
                    int i10 = zzew.zza;
                    pairCreate = Pair.create(num, zzaghVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzc += iZze;
        }
        return null;
    }

    private static zzafl zzk(zzen zzenVar, int i) {
        zzenVar.zzF(i + 12);
        zzenVar.zzG(1);
        zzf(zzenVar);
        zzenVar.zzG(2);
        int iZzk = zzenVar.zzk();
        if ((iZzk & 128) != 0) {
            zzenVar.zzG(2);
        }
        if ((iZzk & 64) != 0) {
            zzenVar.zzG(zzenVar.zzk());
        }
        if ((iZzk & 32) != 0) {
            zzenVar.zzG(2);
        }
        zzenVar.zzG(1);
        zzf(zzenVar);
        String strZzd = zzbt.zzd(zzenVar.zzk());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzafl(strZzd, null, -1L, -1L);
        }
        zzenVar.zzG(4);
        long jZzs = zzenVar.zzs();
        long jZzs2 = zzenVar.zzs();
        zzenVar.zzG(1);
        int iZzf = zzf(zzenVar);
        byte[] bArr = new byte[iZzf];
        zzenVar.zzB(bArr, 0, iZzf);
        return new zzafl(strZzd, bArr, jZzs2 <= 0 ? -1L : jZzs2, jZzs > 0 ? jZzs : -1L);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzm(com.google.android.gms.internal.ads.zzen r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, com.google.android.gms.internal.ads.zzx r30, com.google.android.gms.internal.ads.zzafn r31, int r32) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzm(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.google.android.gms.internal.ads.zzafn, int):void");
    }

    private static void zzn(zzen zzenVar, int i, int i2, int i3, zzafn zzafnVar) {
        zzenVar.zzF(i2 + 16);
        zzenVar.zzv((char) 0);
        String strZzv = zzenVar.zzv((char) 0);
        if (strZzv != null) {
            zzad zzadVar = new zzad();
            zzadVar.zzG(i3);
            zzadVar.zzS(strZzv);
            zzafnVar.zzb = zzadVar.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[zzew.zzf(4, 0, i)] && jArr[zzew.zzf(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
