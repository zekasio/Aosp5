package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final byte[] zzf;
    private int zzk;
    public static final zzq zza = new zzq(1, 2, 3, null);
    private static final String zzg = zzew.zzP(0);
    private static final String zzh = zzew.zzP(1);
    private static final String zzi = zzew.zzP(2);
    private static final String zzj = zzew.zzP(3);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
    };

    @Deprecated
    public zzq(int i, int i2, int i3, byte[] bArr) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = bArr;
    }

    @Pure
    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (this.zzc == zzqVar.zzc && this.zzd == zzqVar.zzd && this.zze == zzqVar.zze && Arrays.equals(this.zzf, zzqVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzk;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((this.zzc + 527) * 31) + this.zzd) * 31) + this.zze) * 31) + Arrays.hashCode(this.zzf);
        this.zzk = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.zzc;
        String str = i != -1 ? i != 6 ? i != 1 ? i != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
        int i2 = this.zzd;
        String str2 = i2 != -1 ? i2 != 1 ? i2 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
        int i3 = this.zze;
        return "ColorInfo(" + str + ", " + str2 + ", " + (i3 != -1 ? i3 != 1 ? i3 != 3 ? i3 != 6 ? i3 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "Linear" : "Unset color transfer") + ", " + (this.zzf != null) + ")";
    }
}
