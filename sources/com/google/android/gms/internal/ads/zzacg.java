package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzacg {
    protected final zzabb zza;

    protected zzacg(zzabb zzabbVar) {
        this.zza = zzabbVar;
    }

    protected abstract boolean zza(zzen zzenVar) throws zzbu;

    protected abstract boolean zzb(zzen zzenVar, long j) throws zzbu;

    public final boolean zzf(zzen zzenVar, long j) throws zzbu {
        return zza(zzenVar) && zzb(zzenVar, j);
    }
}
