package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajb {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzen zzenVar, int i, int i2) {
        zzenVar.zzF(i);
        if (zzenVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int iZze = zzenVar.zze();
        if ((8388608 & iZze) != 0 || ((iZze >> 8) & 8191) != i2 || (iZze & 32) == 0 || zzenVar.zzk() < 7 || zzenVar.zza() < 7 || (zzenVar.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzenVar.zzB(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
    }
}
