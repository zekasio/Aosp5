package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdg {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdg(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / HttpStatus.SC_BAD_REQUEST;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzb;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            int i10 = iAbs * i7;
            int i11 = i5 * i2;
            if (i10 < i11) {
                i5 = iAbs;
            }
            if (i10 < i11) {
                i7 = i2;
            }
            int i12 = iAbs * i6;
            int i13 = i8 * i2;
            if (i12 > i13) {
                i8 = iAbs;
            }
            if (i12 > i13) {
                i6 = i2;
            }
            i2++;
        }
        this.zzu = i5 / i7;
        this.zzv = i8 / i6;
        return i7;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = sArrZzl;
        int i3 = this.zzb;
        System.arraycopy(sArr, i * i3, sArrZzl, this.zzm * i3, i3 * i2);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3 = this.zzh / i2;
        int i4 = this.zzb;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzi[i7] = (short) (i8 / i5);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i = this.zzm - iMin;
        this.zzm = i;
        short[] sArr = this.zzl;
        int i2 = this.zzb;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i3 = this.zzm + ((int) ((((i2 / (f / f2)) + this.zzo) / (this.zze * f2)) + 0.5f));
        short[] sArr = this.zzj;
        int i4 = this.zzh;
        this.zzj = zzl(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.zzh;
            i = i6 + i6;
            int i7 = this.zzb;
            if (i5 >= i * i7) {
                break;
            }
            this.zzj[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i3) {
            this.zzm = i3;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    private final void zzk() {
        int iZzg;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        float f3 = f / f2;
        float f4 = this.zze * f2;
        double d = f3;
        float f5 = 1.0f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.zzk;
            if (i10 >= this.zzh) {
                int i11 = 0;
                while (true) {
                    int i12 = this.zzr;
                    if (i12 > 0) {
                        int iMin = Math.min(this.zzh, i12);
                        zzh(this.zzj, i11, iMin);
                        this.zzr -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i13 = this.zza;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.zzb == i9 && i14 == i9) {
                            iZzg = zzg(sArr, i11, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i11, i14);
                            int iZzg2 = zzg(this.zzi, 0, this.zzf / i14, this.zzg / i14);
                            if (i14 != i9) {
                                int i15 = iZzg2 * i14;
                                int i16 = i14 * 4;
                                int i17 = this.zzf;
                                int i18 = i15 - i16;
                                if (i18 >= i17) {
                                    i17 = i18;
                                }
                                int i19 = i15 + i16;
                                int i20 = this.zzg;
                                if (i19 > i20) {
                                    i19 = i20;
                                }
                                if (this.zzb == i9) {
                                    iZzg = zzg(sArr, i11, i17, i19);
                                } else {
                                    zzi(sArr, i11, i9);
                                    iZzg = zzg(this.zzi, 0, i17, i19);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i21 = this.zzu;
                        int i22 = (i21 == 0 || (i3 = this.zzs) == 0 || this.zzv > i21 * 3 || i21 + i21 <= this.zzt * 3) ? iZzg : i3;
                        this.zzt = i21;
                        this.zzs = iZzg;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f3 >= 2.0f) {
                                i2 = (int) (i22 / ((-1.0f) + f3));
                            } else {
                                this.zzr = (int) ((i22 * (2.0f - f3)) / ((-1.0f) + f3));
                                i2 = i22;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
                            this.zzl = sArrZzl;
                            int i23 = i2;
                            zzj(i2, this.zzb, sArrZzl, this.zzm, sArr2, i11, sArr2, i11 + i22);
                            this.zzm += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.zzj;
                            if (f3 < 0.5f) {
                                i = (int) ((i24 * f3) / (f5 - f3));
                            } else {
                                this.zzr = (int) ((i24 * ((f3 + f3) - 1.0f)) / (f5 - f3));
                                i = i24;
                            }
                            int i25 = i24 + i;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i25);
                            this.zzl = sArrZzl2;
                            int i26 = this.zzb;
                            System.arraycopy(sArr3, i11 * i26, sArrZzl2, this.zzm * i26, i26 * i24);
                            zzj(i, this.zzb, this.zzl, this.zzm + i24, sArr3, i11 + i24, sArr3, i11);
                            this.zzm += i25;
                            i11 += i;
                        }
                    }
                    if (this.zzh + i11 > i10) {
                        break;
                    }
                    f5 = 1.0f;
                    i9 = 1;
                }
                int i27 = this.zzk - i11;
                short[] sArr4 = this.zzj;
                int i28 = this.zzb;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.zzk = i27;
                f5 = 1.0f;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        if (f4 == f5 || this.zzm == i8) {
            return;
        }
        int i29 = this.zza;
        int i30 = (int) (i29 / f4);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.zzm - i8;
        short[] sArrZzl3 = zzl(this.zzn, this.zzo, i31);
        this.zzn = sArrZzl3;
        short[] sArr5 = this.zzl;
        int i32 = this.zzb;
        System.arraycopy(sArr5, i8 * i32, sArrZzl3, this.zzo * i32, i32 * i31);
        this.zzm = i8;
        this.zzo += i31;
        int i33 = 0;
        while (true) {
            i4 = this.zzo;
            i5 = i4 - 1;
            if (i33 >= i5) {
                break;
            }
            while (true) {
                i6 = this.zzp + 1;
                int i34 = i6 * i30;
                i7 = this.zzq;
                if (i34 <= i7 * i29) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.zzb;
                    if (i35 < i36) {
                        short[] sArr6 = this.zzl;
                        int i37 = this.zzm * i36;
                        short[] sArr7 = this.zzn;
                        int i38 = (i33 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.zzq * i29;
                        int i40 = this.zzp;
                        int i41 = i40 * i30;
                        int i42 = (i40 + 1) * i30;
                        int i43 = i42 - i39;
                        int i44 = i42 - i41;
                        sArr6[i37 + i35] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i35++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i6;
            if (i6 == i29) {
                this.zzp = 0;
                zzdl.zzf(i7 == i30);
                this.zzq = 0;
            }
            i33++;
        }
        if (i5 != 0) {
            short[] sArr8 = this.zzn;
            int i45 = this.zzb;
            System.arraycopy(sArr8, i5 * i45, sArr8, 0, (i4 - i5) * i45);
            this.zzo -= i5;
        }
    }
}
