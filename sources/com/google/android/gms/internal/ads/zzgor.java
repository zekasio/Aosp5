package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgor {
    static int zza(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int iZzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 < 0) {
            throw zzgqy.zzf();
        }
        if (i2 > bArr.length - iZzj) {
            throw zzgqy.zzj();
        }
        if (i2 == 0) {
            zzgoqVar.zzc = zzgpe.zzb;
            return iZzj;
        }
        zzgoqVar.zzc = zzgpe.zzw(bArr, iZzj, i2);
        return iZzj + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzgsp zzgspVar, byte[] bArr, int i, int i2, int i3, zzgoq zzgoqVar) throws IOException {
        Object objZze = zzgspVar.zze();
        int iZzn = zzn(objZze, zzgspVar, bArr, i, i2, i3, zzgoqVar);
        zzgspVar.zzf(objZze);
        zzgoqVar.zzc = objZze;
        return iZzn;
    }

    static int zzd(zzgsp zzgspVar, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        Object objZze = zzgspVar.zze();
        int iZzo = zzo(objZze, zzgspVar, bArr, i, i2, zzgoqVar);
        zzgspVar.zzf(objZze);
        zzgoqVar.zzc = objZze;
        return iZzo;
    }

    static int zze(zzgsp zzgspVar, int i, byte[] bArr, int i2, int i3, zzgqv zzgqvVar, zzgoq zzgoqVar) throws IOException {
        int iZzd = zzd(zzgspVar, bArr, i2, i3, zzgoqVar);
        zzgqvVar.add(zzgoqVar.zzc);
        while (iZzd < i3) {
            int iZzj = zzj(bArr, iZzd, zzgoqVar);
            if (i != zzgoqVar.zza) {
                break;
            }
            iZzd = zzd(zzgspVar, bArr, iZzj, i3, zzgoqVar);
            zzgqvVar.add(zzgoqVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzgqv zzgqvVar, zzgoq zzgoqVar) throws IOException {
        zzgqn zzgqnVar = (zzgqn) zzgqvVar;
        int iZzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza + iZzj;
        while (iZzj < i2) {
            iZzj = zzj(bArr, iZzj, zzgoqVar);
            zzgqnVar.zzh(zzgoqVar.zza);
        }
        if (iZzj == i2) {
            return iZzj;
        }
        throw zzgqy.zzj();
    }

    static int zzg(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int iZzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 < 0) {
            throw zzgqy.zzf();
        }
        if (i2 == 0) {
            zzgoqVar.zzc = "";
            return iZzj;
        }
        zzgoqVar.zzc = new String(bArr, iZzj, i2, zzgqw.zzb);
        return iZzj + i2;
    }

    static int zzh(byte[] bArr, int i, zzgoq zzgoqVar) throws zzgqy {
        int iZzj = zzj(bArr, i, zzgoqVar);
        int i2 = zzgoqVar.zza;
        if (i2 < 0) {
            throw zzgqy.zzf();
        }
        if (i2 == 0) {
            zzgoqVar.zzc = "";
            return iZzj;
        }
        zzgoqVar.zzc = zzgtv.zzh(bArr, iZzj, i2);
        return iZzj + i2;
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzgth zzgthVar, zzgoq zzgoqVar) throws zzgqy {
        if ((i >>> 3) == 0) {
            throw zzgqy.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzm = zzm(bArr, i2, zzgoqVar);
            zzgthVar.zzj(i, Long.valueOf(zzgoqVar.zzb));
            return iZzm;
        }
        if (i4 == 1) {
            zzgthVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzj = zzj(bArr, i2, zzgoqVar);
            int i5 = zzgoqVar.zza;
            if (i5 < 0) {
                throw zzgqy.zzf();
            }
            if (i5 > bArr.length - iZzj) {
                throw zzgqy.zzj();
            }
            if (i5 == 0) {
                zzgthVar.zzj(i, zzgpe.zzb);
            } else {
                zzgthVar.zzj(i, zzgpe.zzw(bArr, iZzj, i5));
            }
            return iZzj + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzgqy.zzc();
            }
            zzgthVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgth zzgthVarZzf = zzgth.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzj2 = zzj(bArr, i2, zzgoqVar);
            int i8 = zzgoqVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzj2;
                break;
            }
            int iZzi = zzi(i7, bArr, iZzj2, i3, zzgthVarZzf, zzgoqVar);
            i7 = i8;
            i2 = iZzi;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgqy.zzg();
        }
        zzgthVar.zzj(i, zzgthVarZzf);
        return i2;
    }

    static int zzj(byte[] bArr, int i, zzgoq zzgoqVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzgoqVar);
        }
        zzgoqVar.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzgoq zzgoqVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzgoqVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgoqVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgoqVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgoqVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgoqVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzgqv zzgqvVar, zzgoq zzgoqVar) {
        zzgqn zzgqnVar = (zzgqn) zzgqvVar;
        int iZzj = zzj(bArr, i2, zzgoqVar);
        zzgqnVar.zzh(zzgoqVar.zza);
        while (iZzj < i3) {
            int iZzj2 = zzj(bArr, iZzj, zzgoqVar);
            if (i != zzgoqVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzgoqVar);
            zzgqnVar.zzh(zzgoqVar.zza);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i, zzgoq zzgoqVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgoqVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zzgoqVar.zzb = j2;
        return i3;
    }

    static int zzn(Object obj, zzgsp zzgspVar, byte[] bArr, int i, int i2, int i3, zzgoq zzgoqVar) throws IOException {
        int iZzc = ((zzgrz) zzgspVar).zzc(obj, bArr, i, i2, i3, zzgoqVar);
        zzgoqVar.zzc = obj;
        return iZzc;
    }

    static int zzo(Object obj, zzgsp zzgspVar, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        int iZzk = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzk = zzk(i3, bArr, iZzk, zzgoqVar);
            i3 = zzgoqVar.zza;
        }
        int i4 = iZzk;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzgqy.zzj();
        }
        int i5 = i3 + i4;
        zzgspVar.zzi(obj, bArr, i4, i5, zzgoqVar);
        zzgoqVar.zzc = obj;
        return i5;
    }

    static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
