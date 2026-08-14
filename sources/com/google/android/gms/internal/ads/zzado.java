package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzado {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzadl
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzbq zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzadm r13, com.google.android.gms.internal.ads.zzacp r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zza(byte[], int, com.google.android.gms.internal.ads.zzadm, com.google.android.gms.internal.ads.zzacp):com.google.android.gms.internal.ads.zzbq");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int iZzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            if ((iZzd - i) % 2 == 0 && bArr[iZzd + 1] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, iZzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzen zzenVar, int i) {
        byte[] bArrZzH = zzenVar.zzH();
        int iZzc = zzenVar.zzc();
        int i2 = iZzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzc + i) {
                return i;
            }
            if ((bArrZzH[i2] & UByte.MAX_VALUE) == 255 && bArrZzH[i3] == 0) {
                System.arraycopy(bArrZzH, i2 + 2, bArrZzH, i3, (i - (i2 - iZzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0287 A[Catch: all -> 0x0521, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a9 A[Catch: all -> 0x0521, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04fc A[Catch: all -> 0x0521, TRY_LEAVE, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzadp zzf(int r35, com.google.android.gms.internal.ads.zzen r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzadm r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zzf(int, com.google.android.gms.internal.ads.zzen, boolean, int, com.google.android.gms.internal.ads.zzadm):com.google.android.gms.internal.ads.zzadp");
    }

    private static zzfqk zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfqk.zzp("");
        }
        zzfqh zzfqhVarZzi = zzfqk.zzi();
        int iZzc = zzc(bArr, i2, i);
        while (i2 < iZzc) {
            zzfqhVarZzi.zzf(new String(bArr, i2, iZzc - i2, zzj(i)));
            i2 = zzb(i) + iZzc;
            iZzc = zzc(bArr, i2, i);
        }
        zzfqk zzfqkVarZzi = zzfqhVarZzi.zzi();
        return zzfqkVarZzi.isEmpty() ? zzfqk.zzp("") : zzfqkVarZzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static boolean zzk(zzen zzenVar, int i, int i2, boolean z) {
        int iZzm;
        long jZzm;
        int iZzo;
        int i3;
        int iZzc = zzenVar.zzc();
        while (true) {
            try {
                if (zzenVar.zza() < i2) {
                    return true;
                }
                if (i >= 3) {
                    iZzm = zzenVar.zze();
                    jZzm = zzenVar.zzs();
                    iZzo = zzenVar.zzo();
                } else {
                    iZzm = zzenVar.zzm();
                    jZzm = zzenVar.zzm();
                    iZzo = 0;
                }
                if (iZzm == 0 && jZzm == 0 && iZzo == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZzm) != 0) {
                        return false;
                    }
                    jZzm = ((jZzm >> 24) << 21) | (((jZzm >> 16) & 255) << 14) | (jZzm & 255) | (((jZzm >> 8) & 255) << 7);
                }
                if (i == 4) {
                    i = iZzo & 1;
                    i3 = (iZzo & 64) == 0 ? 0 : 1;
                } else {
                    if (i == 3) {
                        i3 = (iZzo & 32) != 0 ? 1 : 0;
                        if ((iZzo & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    i = 0;
                }
                if (i != 0) {
                    i3 += 4;
                }
                if (jZzm < i3) {
                    return false;
                }
                if (zzenVar.zza() < jZzm) {
                    return false;
                }
                zzenVar.zzG((int) jZzm);
            } finally {
                zzenVar.zzF(iZzc);
            }
        }
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzew.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfnh.zzb : zzfnh.zzc : zzfnh.zzd : zzfnh.zzf;
    }
}
