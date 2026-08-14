package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcp {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzaf[] zzg;
    private int zzh;
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzco
    };

    public zzcp(String str, zzaf... zzafVarArr) {
        this.zzc = str;
        this.zzg = zzafVarArr;
        int iZzb = zzbt.zzb(zzafVarArr[0].zzm);
        this.zzd = iZzb == -1 ? zzbt.zzb(zzafVarArr[0].zzl) : iZzb;
        zzd(zzafVarArr[0].zzd);
        int i = zzafVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzc.equals(zzcpVar.zzc) && Arrays.equals(this.zzg, zzcpVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final int zza(zzaf zzafVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzafVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzaf zzb(int i) {
        return this.zzg[i];
    }

    public final zzcp zzc(String str) {
        return new zzcp(str, this.zzg);
    }
}
