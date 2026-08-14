package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtt extends zzgts {
    zzgtt() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzgts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtt.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    final String zzb(byte[] bArr, int i, int i2) throws zzgqy {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zzgtr.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (zzgtr.zzd(b2)) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (zzgtr.zzd(b3)) {
                        i++;
                        cArr[i4] = (char) b3;
                        i4++;
                    }
                }
            } else if (zzgtr.zzf(b2)) {
                if (i5 >= i3) {
                    throw zzgqy.zzd();
                }
                i += 2;
                zzgtr.zzc(b2, bArr[i5], cArr, i4);
                i4++;
            } else if (zzgtr.zze(b2)) {
                if (i5 >= i3 - 1) {
                    throw zzgqy.zzd();
                }
                int i6 = i + 2;
                i += 3;
                zzgtr.zzb(b2, bArr[i5], bArr[i6], cArr, i4);
                i4++;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzgqy.zzd();
                }
                byte b4 = bArr[i5];
                int i7 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                zzgtr.zza(b2, b4, b5, bArr[i7], cArr, i4);
                i4 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }
}
