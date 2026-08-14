package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgth {
    private static final zzgth zza = new zzgth(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgth() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgth(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgth zzc() {
        return zza;
    }

    static zzgth zze(zzgth zzgthVar, zzgth zzgthVar2) {
        int i = zzgthVar.zzb + zzgthVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgthVar.zzc, i);
        System.arraycopy(zzgthVar2.zzc, 0, iArrCopyOf, zzgthVar.zzb, zzgthVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgthVar.zzd, i);
        System.arraycopy(zzgthVar2.zzd, 0, objArrCopyOf, zzgthVar.zzb, zzgthVar2.zzb);
        return new zzgth(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgth zzf() {
        return new zzgth(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgth)) {
            return false;
        }
        zzgth zzgthVar = (zzgth) obj;
        int i = this.zzb;
        if (i == zzgthVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgthVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgthVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final int zza() {
        int iZzF;
        int iZzE;
        int iZzE2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzE2 = zzgpt.zzE(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zzgpe zzgpeVar = (zzgpe) this.zzd[i3];
                    int i7 = zzgpt.zzf;
                    int iZzd = zzgpeVar.zzd();
                    iZzE2 = zzgpt.zzE(i5 << 3) + zzgpt.zzE(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzD = zzgpt.zzD(i5);
                    iZzF = ((zzgth) this.zzd[i3]).zza();
                    iZzE = iZzD + iZzD;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzgqy.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzE2 = zzgpt.zzE(i5 << 3) + 4;
                }
                i2 += iZzE2;
            } else {
                int i8 = i5 << 3;
                iZzF = zzgpt.zzF(((Long) this.zzd[i3]).longValue());
                iZzE = zzgpt.zzE(i8);
            }
            iZzE2 = iZzE + iZzF;
            i2 += iZzE2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzE = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzgpe zzgpeVar = (zzgpe) this.zzd[i2];
            int i4 = zzgpt.zzf;
            int iZzd = zzgpeVar.zzd();
            int iZzE2 = zzgpt.zzE(iZzd) + iZzd;
            int iZzE3 = zzgpt.zzE(16);
            int iZzE4 = zzgpt.zzE(i3);
            int iZzE5 = zzgpt.zzE(8);
            iZzE += iZzE5 + iZzE5 + iZzE3 + iZzE4 + zzgpt.zzE(24) + iZzE2;
        }
        this.zze = iZzE;
        return iZzE;
    }

    final zzgth zzd(zzgth zzgthVar) {
        if (zzgthVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgthVar.zzb;
        zzl(i);
        System.arraycopy(zzgthVar.zzc, 0, this.zzc, this.zzb, zzgthVar.zzb);
        System.arraycopy(zzgthVar.zzd, 0, this.zzd, this.zzb, zzgthVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        this.zzf = false;
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgry.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgpu zzgpuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgpuVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgpuVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgpuVar.zzd(i4, (zzgpe) obj);
                } else if (i3 == 3) {
                    zzgpuVar.zzE(i4);
                    ((zzgth) obj).zzk(zzgpuVar);
                    zzgpuVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzgqy.zza());
                    }
                    zzgpuVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
