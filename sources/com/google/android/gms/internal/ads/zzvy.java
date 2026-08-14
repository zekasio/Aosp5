package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzvy {
    public final int zza;
    public final zzcp zzb;
    public final int zzc;
    public final zzaf zzd;

    public zzvy(int i, zzcp zzcpVar, int i2) {
        this.zza = i;
        this.zzb = zzcpVar;
        this.zzc = i2;
        this.zzd = zzcpVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzvy zzvyVar);
}
