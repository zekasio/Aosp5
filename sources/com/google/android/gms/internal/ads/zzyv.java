package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & UByte.MAX_VALUE) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static zzaf zzc(zzen zzenVar, String str, String str2, zzx zzxVar) {
        zzem zzemVar = new zzem();
        zzemVar.zzh(zzenVar);
        int i = zzc[zzemVar.zzd(2)];
        zzemVar.zzl(8);
        int i2 = zze[zzemVar.zzd(3)];
        if (zzemVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzemVar.zzd(5)] * 1000;
        zzemVar.zze();
        zzenVar.zzF(zzemVar.zzb());
        zzad zzadVar = new zzad();
        zzadVar.zzH(str);
        zzadVar.zzS("audio/ac3");
        zzadVar.zzw(i2);
        zzadVar.zzT(i);
        zzadVar.zzB(zzxVar);
        zzadVar.zzK(str2);
        zzadVar.zzv(i3);
        zzadVar.zzO(i3);
        return zzadVar.zzY();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaf zzd(com.google.android.gms.internal.ads.zzen r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzx r10) {
        /*
            com.google.android.gms.internal.ads.zzem r0 = new com.google.android.gms.internal.ads.zzem
            r0.<init>()
            r0.zzh(r7)
            r1 = 13
            int r1 = r0.zzd(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzl(r2)
            r3 = 2
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzyv.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzl(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzyv.zze
            int r5 = r0.zzd(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzd(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzl(r2)
            r2 = 4
            int r2 = r0.zzd(r2)
            r0.zzl(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzm(r2)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzl(r5)
        L4f:
            int r2 = r0.zza()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzl(r6)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zze()
            int r0 = r0.zzb()
            r7.zzF(r0)
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            r7.zzH(r8)
            r7.zzS(r2)
            r7.zzw(r4)
            r7.zzT(r3)
            r7.zzB(r10)
            r7.zzK(r9)
            r7.zzO(r1)
            com.google.android.gms.internal.ads.zzaf r7 = r7.zzY()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyv.zzd(com.google.android.gms.internal.ads.zzen, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzx):com.google.android.gms.internal.ads.zzaf");
    }

    public static zzyu zze(zzem zzemVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzc = zzemVar.zzc();
        zzemVar.zzl(40);
        int iZzd = zzemVar.zzd(5);
        zzemVar.zzj(iZzc);
        int i12 = -1;
        if (iZzd > 10) {
            zzemVar.zzl(16);
            int iZzd2 = zzemVar.zzd(2);
            if (iZzd2 == 0) {
                i12 = 0;
            } else if (iZzd2 == 1) {
                i12 = 1;
            } else if (iZzd2 == 2) {
                i12 = 2;
            }
            zzemVar.zzl(3);
            int iZzd3 = zzemVar.zzd(11) + 1;
            int iZzd4 = zzemVar.zzd(2);
            if (iZzd4 == 3) {
                i8 = zzd[zzemVar.zzd(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int iZzd5 = zzemVar.zzd(2);
                int i13 = zzb[iZzd5];
                i7 = iZzd5;
                i8 = zzc[iZzd4];
                i9 = i13;
            }
            int i14 = iZzd3 + iZzd3;
            int i15 = (i14 * i8) / (i9 * 32);
            int iZzd6 = zzemVar.zzd(3);
            boolean zZzn = zzemVar.zzn();
            int i16 = zze[iZzd6] + (zZzn ? 1 : 0);
            zzemVar.zzl(10);
            if (zzemVar.zzn()) {
                zzemVar.zzl(8);
            }
            if (iZzd6 == 0) {
                zzemVar.zzl(5);
                if (zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                i10 = 0;
                iZzd6 = 0;
            } else {
                i10 = iZzd6;
            }
            if (i12 == 1) {
                if (zzemVar.zzn()) {
                    zzemVar.zzl(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzemVar.zzn()) {
                if (i10 > 2) {
                    zzemVar.zzl(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzemVar.zzl(6);
                }
                if ((i10 & 4) != 0) {
                    zzemVar.zzl(6);
                }
                if (zZzn && zzemVar.zzn()) {
                    zzemVar.zzl(5);
                }
                if (i11 == 0) {
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    if (i10 == 0 && zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(6);
                    }
                    int iZzd7 = zzemVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzemVar.zzl(5);
                    } else if (iZzd7 == 2) {
                        zzemVar.zzl(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzemVar.zzd(5);
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(5);
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(4);
                            }
                            if (zzemVar.zzn()) {
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(4);
                                }
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(4);
                                }
                            }
                        }
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(5);
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(7);
                                if (zzemVar.zzn()) {
                                    zzemVar.zzl(8);
                                }
                            }
                        }
                        zzemVar.zzl((iZzd8 + 2) * 8);
                        zzemVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(14);
                        }
                        if (iZzd6 == 0 && zzemVar.zzn()) {
                            zzemVar.zzl(14);
                        }
                    }
                    if (!zzemVar.zzn()) {
                        i11 = 0;
                    } else if (i7 == 0) {
                        zzemVar.zzl(5);
                        i11 = 0;
                        i7 = 0;
                    } else {
                        for (int i17 = 0; i17 < i9; i17++) {
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(5);
                            }
                        }
                        i11 = 0;
                    }
                }
            }
            if (zzemVar.zzn()) {
                zzemVar.zzl(5);
                if (i10 == 2) {
                    zzemVar.zzl(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzemVar.zzl(2);
                }
                if (zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                if (i10 == 0 && zzemVar.zzn()) {
                    zzemVar.zzl(8);
                }
                if (iZzd4 < 3) {
                    zzemVar.zzk();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzemVar.zzk();
            }
            if (i11 == 2 && (i7 == 3 || zzemVar.zzn())) {
                zzemVar.zzl(6);
            }
            str = (zzemVar.zzn() && zzemVar.zzd(6) == 1 && zzemVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i14;
            i3 = i8;
            i6 = i9 * 256;
            i = i15;
            i4 = i16;
        } else {
            zzemVar.zzl(32);
            int iZzd9 = zzemVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = zzemVar.zzd(6);
            int i18 = zzf[iZzd10 / 2] * 1000;
            int iZzf = zzf(iZzd9, iZzd10);
            zzemVar.zzl(8);
            int iZzd11 = zzemVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzemVar.zzl(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzemVar.zzl(2);
            }
            if (iZzd11 == 2) {
                zzemVar.zzl(2);
            }
            str = str2;
            i = i18;
            i2 = iZzf;
            i3 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i4 = zze[iZzd11] + (zzemVar.zzn() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzyu(str, i5, i4, i3, i2, i6, i, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
