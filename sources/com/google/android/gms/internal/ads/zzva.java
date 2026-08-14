package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzva implements zzwe {
    protected final zzcp zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzaf[] zzd;
    private int zze;

    public zzva(zzcp zzcpVar, int[] iArr, int i) {
        int length = iArr.length;
        zzdl.zzf(length > 0);
        zzcpVar.getClass();
        this.zza = zzcpVar;
        this.zzb = length;
        this.zzd = new zzaf[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzcpVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzaf) obj2).zzi - ((zzaf) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzcpVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzva zzvaVar = (zzva) obj;
            if (this.zza == zzvaVar.zza && Arrays.equals(this.zzc, zzvaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzaf zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzcp zze() {
        return this.zza;
    }
}
