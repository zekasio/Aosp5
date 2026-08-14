package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzld {
    private final zzaa zza;
    private final SparseArray zzb;

    public zzld(zzaa zzaaVar, SparseArray sparseArray) {
        this.zza = zzaaVar;
        SparseArray sparseArray2 = new SparseArray(zzaaVar.zzb());
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            int iZza = zzaaVar.zza(i);
            zzlc zzlcVar = (zzlc) sparseArray.get(iZza);
            zzlcVar.getClass();
            sparseArray2.append(iZza, zzlcVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlc zzc(int i) {
        zzlc zzlcVar = (zzlc) this.zzb.get(i);
        zzlcVar.getClass();
        return zzlcVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
