package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzen {
    private static final zzfqp zza = zzfqp.zzo(zzfnh.zza, zzfnh.zzc, zzfnh.zzf, zzfnh.zzd, zzfnh.zze);
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzen() {
        this.zzb = zzew.zzf;
    }

    public zzen(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
    }

    public final void zzA(zzem zzemVar, int i) {
        zzB(zzemVar.zza, 0, i);
        zzemVar.zzj(0);
    }

    public final void zzB(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzb, this.zzc, bArr, i, i2);
        this.zzc += i2;
    }

    public final void zzC(int i) {
        byte[] bArr = this.zzb;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzD(bArr, i);
    }

    public final void zzD(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
        this.zzc = 0;
    }

    public final void zzE(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzb.length) {
            z = true;
        }
        zzdl.zzd(z);
        this.zzd = i;
    }

    public final void zzF(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd) {
            z = true;
        }
        zzdl.zzd(z);
        this.zzc = i;
    }

    public final void zzG(int i) {
        zzF(this.zzc + i);
    }

    public final byte[] zzH() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.zzc = i4;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i6 = i + 3;
        this.zzc = i6;
        int i7 = bArr[i4] & UByte.MAX_VALUE;
        this.zzc = i + 4;
        return (bArr[i6] & UByte.MAX_VALUE) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.zzc = i4;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzc = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.zzc = i4;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i6 = i + 3;
        this.zzc = i6;
        int i7 = bArr[i4] & UByte.MAX_VALUE;
        this.zzc = i + 4;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int zzh() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException("Top bit not zero: " + iZzg);
    }

    public final int zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.zzc = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int zzl() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.zzc = i + 2;
        int i4 = bArr[i2] & UByte.MAX_VALUE;
        this.zzc = i + 4;
        return i4 | (i3 << 8);
    }

    public final int zzm() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i + 2;
        this.zzc = i4;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzc = i + 3;
        return (bArr[i4] & UByte.MAX_VALUE) | (i3 << 16) | (i5 << 8);
    }

    public final int zzn() {
        int iZze = zze();
        if (iZze >= 0) {
            return iZze;
        }
        throw new IllegalStateException("Top bit not zero: " + iZze);
    }

    public final int zzo() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.zzc = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | (i3 << 8);
    }

    public final long zzp() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzc = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzc = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.zzc = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.zzc = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.zzc = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.zzc = i8;
        long j7 = bArr[i7];
        this.zzc = i + 8;
        long j8 = j6 & 255;
        return ((((long) bArr[i8]) & 255) << 56) | ((j7 & 255) << 48) | ((j2 & 255) << 8) | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | (j8 << 40);
    }

    public final long zzq() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzc = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzc = i4;
        long j3 = bArr[i3];
        this.zzc = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzr() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzc = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzc = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.zzc = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.zzc = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.zzc = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.zzc = i8;
        long j7 = bArr[i7];
        this.zzc = i + 8;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzs() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.zzc = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.zzc = i4;
        long j3 = bArr[i3];
        this.zzc = i + 4;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzt() {
        long jZzr = zzr();
        if (jZzr >= 0) {
            return jZzr;
        }
        throw new IllegalStateException("Top bit not zero: " + jZzr);
    }

    public final long zzu() {
        int i;
        int i2;
        long j = this.zzb[this.zzc];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.zzb[this.zzc + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.zzc += i;
        return j;
    }

    public final String zzv(char c) {
        int i = this.zzd;
        int i2 = this.zzc;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzd && this.zzb[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zzb;
        int i3 = this.zzc;
        String strZzJ = zzew.zzJ(bArr, i3, i2 - i3);
        this.zzc = i2;
        if (i2 < this.zzd) {
            this.zzc = i2 + 1;
        }
        return strZzJ;
    }

    public final String zzw(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zzc;
        int i3 = (i2 + i) - 1;
        String strZzJ = zzew.zzJ(this.zzb, i2, (i3 >= this.zzd || this.zzb[i3] != 0) ? i : i - 1);
        this.zzc += i;
        return strZzJ;
    }

    public final String zzx(int i, Charset charset) {
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        String str = new String(bArr, i2, i, charset);
        this.zzc = i2 + i;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.zzc = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | (i3 << 8));
    }

    public final void zzz(int i) {
        byte[] bArr = this.zzb;
        if (i > bArr.length) {
            this.zzb = Arrays.copyOf(bArr, i);
        }
    }

    public zzen(int i) {
        this.zzb = new byte[i];
        this.zzd = i;
    }

    public zzen(byte[] bArr) {
        this.zzb = bArr;
        this.zzd = bArr.length;
    }
}
