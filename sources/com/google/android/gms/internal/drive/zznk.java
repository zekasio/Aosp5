package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes2.dex */
final class zznk extends zznh {
    zznk() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.drive.zznh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzb(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zznk.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final String zzg(byte[] bArr, int i, int i2) throws zzkq {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bZza = zznd.zza(bArr, i);
            if (!zzng.zzd(bZza)) {
                break;
            }
            i++;
            zzng.zza(bZza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte bZza2 = zznd.zza(bArr, i);
            if (zzng.zzd(bZza2)) {
                int i7 = i5 + 1;
                zzng.zza(bZza2, cArr, i5);
                while (i6 < i3) {
                    byte bZza3 = zznd.zza(bArr, i6);
                    if (!zzng.zzd(bZza3)) {
                        break;
                    }
                    i6++;
                    zzng.zza(bZza3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (zzng.zze(bZza2)) {
                if (i6 < i3) {
                    i += 2;
                    zzng.zza(bZza2, zznd.zza(bArr, i6), cArr, i5);
                    i5++;
                } else {
                    throw zzkq.zzdn();
                }
            } else if (zzng.zzf(bZza2)) {
                if (i6 < i3 - 1) {
                    int i8 = i + 2;
                    i += 3;
                    zzng.zza(bZza2, zznd.zza(bArr, i6), zznd.zza(bArr, i8), cArr, i5);
                    i5++;
                } else {
                    throw zzkq.zzdn();
                }
            } else {
                if (i6 >= i3 - 2) {
                    throw zzkq.zzdn();
                }
                byte bZza4 = zznd.zza(bArr, i6);
                int i9 = i + 3;
                byte bZza5 = zznd.zza(bArr, i + 2);
                i += 4;
                zzng.zza(bZza2, bZza4, bZza5, zznd.zza(bArr, i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        int i3;
        long j2;
        long j3;
        char cCharAt;
        long j4 = i;
        long j5 = ((long) i2) + j4;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zznd.zza(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 >= 128 || j4 >= j5) {
                if (cCharAt3 >= 2048 || j4 > j5 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt4 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    j2 = 1;
                                    zznd.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    j3 = j5;
                                    zznd.zza(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = 3 + j4;
                                    zznd.zza(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    zznd.zza(bArr, j6, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new zznj(i4 - 1, length);
                        }
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i3)))) {
                            throw new zznj(i4, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append(str2);
                        sb2.append(cCharAt3);
                        sb2.append(str);
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    zznd.zza(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    zznd.zza(bArr, j4 + 1, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    j4 += 3;
                    zznd.zza(bArr, j7, (byte) ((cCharAt3 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j8 = j4 + j;
                    zznd.zza(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                    j4 += 2;
                    zznd.zza(bArr, j8, (byte) ((cCharAt3 & '?') | 128));
                }
                j3 = j5;
                j2 = 1;
            } else {
                zznd.zza(bArr, j4, (byte) cCharAt3);
                j3 = j5;
                str2 = str4;
                j2 = j;
                j4 += j;
                str = str3;
            }
            i4++;
            str3 = str;
            str4 = str2;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zznf.zzay(i);
        }
        if (i2 == 1) {
            return zznf.zzr(i, zznd.zza(bArr, j));
        }
        if (i2 == 2) {
            return zznf.zzc(i, zznd.zza(bArr, j), zznd.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
