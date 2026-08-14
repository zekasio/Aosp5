package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwl {
    public final int zza;
    public final zzkp[] zzb;
    public final zzwe[] zzc;
    public final zzcy zzd;
    public final Object zze;

    public zzwl(zzkp[] zzkpVarArr, zzwe[] zzweVarArr, zzcy zzcyVar, Object obj) {
        this.zzb = zzkpVarArr;
        this.zzc = (zzwe[]) zzweVarArr.clone();
        this.zzd = zzcyVar;
        this.zze = obj;
        this.zza = zzkpVarArr.length;
    }

    public final boolean zza(zzwl zzwlVar, int i) {
        return zzwlVar != null && zzew.zzU(this.zzb[i], zzwlVar.zzb[i]) && zzew.zzU(this.zzc[i], zzwlVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
