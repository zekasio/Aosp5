package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgf {
    private zzbdu zza;

    public zzdgf(zzdfr zzdfrVar) {
        this.zza = zzdfrVar;
    }

    public final synchronized zzbdu zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbdu zzbduVar) {
        this.zza = zzbduVar;
    }
}
