package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgts {
    zzgts() {
    }

    static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzgqy {
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!zzgtr.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (zzgtr.zzd(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (zzgtr.zzd(b3)) {
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else if (zzgtr.zzf(b2)) {
                if (i6 >= i3) {
                    throw zzgqy.zzd();
                }
                i += 2;
                zzgtr.zzc(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (zzgtr.zze(b2)) {
                if (i6 >= i3 - 1) {
                    throw zzgqy.zzd();
                }
                int i7 = i + 2;
                i += 3;
                zzgtr.zzb(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzgqy.zzd();
                }
                byte b4 = byteBuffer.get(i6);
                int i8 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                zzgtr.zza(b2, b4, b5, byteBuffer.get(i8), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    abstract int zza(int i, byte[] bArr, int i2, int i3);

    abstract String zzb(byte[] bArr, int i, int i2) throws zzgqy;

    final boolean zzc(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
