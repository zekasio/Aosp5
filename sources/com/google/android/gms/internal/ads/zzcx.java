package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcx {
    public final int zzb;
    private final zzcp zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = zzew.zzP(0);
    private static final String zzd = zzew.zzP(1);
    private static final String zze = zzew.zzP(3);
    private static final String zzf = zzew.zzP(4);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcw
    };

    public zzcx(zzcp zzcpVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzcpVar.zzb;
        this.zzb = 1;
        this.zzg = zzcpVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcx zzcxVar = (zzcx) obj;
            if (this.zzg.equals(zzcxVar.zzg) && Arrays.equals(this.zzh, zzcxVar.zzh) && Arrays.equals(this.zzi, zzcxVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzaf zzb(int i) {
        return this.zzg.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zzi) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zzi[i];
    }
}
