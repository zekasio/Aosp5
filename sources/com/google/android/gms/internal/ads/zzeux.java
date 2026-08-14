package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeux implements zzfbd {
    private final zzevt zza;

    public zzeux(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbd
    public final zzfut zza(zzfbe zzfbeVar) {
        zzeuy zzeuyVar = (zzeuy) zzfbeVar;
        return ((zzeuu) this.zza).zzb(zzeuyVar.zzb, zzeuyVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfbd
    public final void zzb(zzfas zzfasVar) {
        zzfasVar.zza = ((zzeuu) this.zza).zza();
    }
}
