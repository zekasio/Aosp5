package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgoh {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i = bArrCopyOf[31] & 127;
        bArrCopyOf[31] = (byte) i;
        bArrCopyOf[31] = (byte) (i | 64);
        int i2 = zzgmx.zzb;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i3 = 0; i3 < 7; i3++) {
            if (MessageDigest.isEqual(zzgmx.zza[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zzgnx.zza(zzgmx.zza[i3])));
            }
        }
        long[] jArrZzk = zzgnw.zzk(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        System.arraycopy(jArrZzk, 0, jArr2, 0, 10);
        int i4 = 0;
        for (int i5 = 32; i4 < i5; i5 = 32) {
            int i6 = bArrCopyOf[31 - i4] & UByte.MAX_VALUE;
            int i7 = 0;
            while (i7 < 8) {
                int i8 = (i6 >> (7 - i7)) & 1;
                zzgmx.zza(jArr4, jArr2, i8);
                zzgmx.zza(jArr5, jArr3, i8);
                byte[] bArr3 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i9 = i6;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i10 = i4;
                long[] jArr13 = new long[19];
                int i11 = i7;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                zzgnw.zzi(jArr4, jArr4, jArr5);
                zzgnw.zzh(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                zzgnw.zzi(jArr2, jArr2, jArr3);
                zzgnw.zzh(jArr3, jArrCopyOf2, jArr3);
                zzgnw.zzb(jArr14, jArr2, jArr5);
                zzgnw.zzb(jArr15, jArr4, jArr3);
                zzgnw.zze(jArr14);
                zzgnw.zzd(jArr14);
                zzgnw.zze(jArr15);
                zzgnw.zzd(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                zzgnw.zzi(jArr14, jArr14, jArr15);
                zzgnw.zzh(jArr15, jArrCopyOf2, jArr15);
                zzgnw.zzg(jArr18, jArr14);
                zzgnw.zzg(jArr17, jArr15);
                zzgnw.zzb(jArr15, jArr17, jArrZzk);
                zzgnw.zze(jArr15);
                zzgnw.zzd(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                zzgnw.zzg(jArr12, jArr4);
                zzgnw.zzg(jArr13, jArr5);
                zzgnw.zzb(jArr8, jArr12, jArr13);
                zzgnw.zze(jArr8);
                zzgnw.zzd(jArr8);
                zzgnw.zzh(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                zzgnw.zzf(jArr10, jArr13, 121665L);
                zzgnw.zzd(jArr10);
                zzgnw.zzi(jArr10, jArr10, jArr12);
                zzgnw.zzb(jArr16, jArr13, jArr10);
                zzgnw.zze(jArr16);
                zzgnw.zzd(jArr16);
                zzgmx.zza(jArr8, jArr6, i8);
                zzgmx.zza(jArr16, jArr7, i8);
                i7 = i11 + 1;
                jArr9 = jArr5;
                jArr2 = jArr6;
                i6 = i9;
                jArr = jArr11;
                i4 = i10;
                jArr6 = jArr19;
                jArr5 = jArr16;
                bArrCopyOf = bArr3;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr21;
            }
            i4++;
            bArrCopyOf = bArrCopyOf;
        }
        long[] jArr22 = jArr;
        long[] jArr23 = new long[10];
        long[] jArr24 = new long[10];
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[10];
        zzgnw.zzg(jArr24, jArr5);
        zzgnw.zzg(jArr34, jArr24);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zza(jArr25, jArr32, jArr5);
        zzgnw.zza(jArr26, jArr25, jArr24);
        zzgnw.zzg(jArr32, jArr26);
        zzgnw.zza(jArr27, jArr32, jArr25);
        zzgnw.zzg(jArr32, jArr27);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zza(jArr28, jArr32, jArr27);
        zzgnw.zzg(jArr32, jArr28);
        zzgnw.zzg(jArr34, jArr32);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            zzgnw.zzg(jArr32, jArr34);
            zzgnw.zzg(jArr34, jArr32);
        }
        zzgnw.zza(jArr29, jArr34, jArr28);
        zzgnw.zzg(jArr32, jArr29);
        zzgnw.zzg(jArr34, jArr32);
        for (int i13 = 2; i13 < 20; i13 += 2) {
            zzgnw.zzg(jArr32, jArr34);
            zzgnw.zzg(jArr34, jArr32);
        }
        zzgnw.zza(jArr32, jArr34, jArr29);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zzg(jArr32, jArr34);
        for (int i14 = 2; i14 < 10; i14 += 2) {
            zzgnw.zzg(jArr34, jArr32);
            zzgnw.zzg(jArr32, jArr34);
        }
        zzgnw.zza(jArr30, jArr32, jArr28);
        zzgnw.zzg(jArr32, jArr30);
        zzgnw.zzg(jArr34, jArr32);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            zzgnw.zzg(jArr32, jArr34);
            zzgnw.zzg(jArr34, jArr32);
        }
        zzgnw.zza(jArr31, jArr34, jArr30);
        zzgnw.zzg(jArr34, jArr31);
        zzgnw.zzg(jArr32, jArr34);
        for (int i16 = 2; i16 < 100; i16 += 2) {
            zzgnw.zzg(jArr34, jArr32);
            zzgnw.zzg(jArr32, jArr34);
        }
        zzgnw.zza(jArr34, jArr32, jArr31);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zzg(jArr34, jArr32);
        for (int i17 = 2; i17 < 50; i17 += 2) {
            zzgnw.zzg(jArr32, jArr34);
            zzgnw.zzg(jArr34, jArr32);
        }
        zzgnw.zza(jArr32, jArr34, jArr30);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zzg(jArr32, jArr34);
        zzgnw.zzg(jArr34, jArr32);
        zzgnw.zza(jArr23, jArr34, jArr26);
        zzgnw.zza(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        zzgnw.zza(jArr35, jArrZzk, jArr22);
        zzgnw.zzi(jArr36, jArrZzk, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        zzgnw.zzi(jArr38, jArr36, jArr40);
        zzgnw.zza(jArr38, jArr38, jArr3);
        zzgnw.zzi(jArr38, jArr38, jArr33);
        zzgnw.zza(jArr38, jArr38, jArr35);
        zzgnw.zza(jArr38, jArr38, jArr33);
        zzgnw.zzf(jArr37, jArr38, 4L);
        zzgnw.zzd(jArr37);
        zzgnw.zza(jArr38, jArr35, jArr3);
        zzgnw.zzh(jArr38, jArr38, jArr3);
        zzgnw.zza(jArr39, jArr36, jArr33);
        zzgnw.zzi(jArr38, jArr38, jArr39);
        zzgnw.zzg(jArr38, jArr38);
        if (MessageDigest.isEqual(zzgnw.zzj(jArr37), zzgnw.zzj(jArr38))) {
            return zzgnw.zzj(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgnx.zza(bArr2)));
    }

    public static byte[] zzb() {
        byte[] bArrZza = zzgoe.zza(32);
        bArrZza[0] = (byte) (bArrZza[0] | 7);
        int i = bArrZza[31] & 63;
        bArrZza[31] = (byte) i;
        bArrZza[31] = (byte) (i | 128);
        return bArrZza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }
}
