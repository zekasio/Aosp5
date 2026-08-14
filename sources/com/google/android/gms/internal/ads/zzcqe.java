package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqe {
    private final zzcxd zza;
    private final zzczk zzb;

    public zzcqe(zzcxd zzcxdVar, zzczk zzczkVar) {
        this.zza = zzcxdVar;
        this.zzb = zzczkVar;
    }

    public final zzcxd zza() {
        return this.zza;
    }

    final zzczk zzb() {
        return this.zzb;
    }

    final zzdbu zzc() {
        zzczk zzczkVar = this.zzb;
        return zzczkVar != null ? new zzdbu(zzczkVar, zzbzn.zzf) : new zzdbu(new zzcqd(this), zzbzn.zzf);
    }
}
