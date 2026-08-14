package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevj implements zzevt {
    private final zzevt zza;
    private zzctw zzb;

    public zzevj(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zzb;
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, zzctw zzctwVar) {
        this.zzb = zzctwVar;
        if (zzevuVar.zza == null) {
            return ((zzevi) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar);
        }
        zzcrt zzcrtVarZzb = this.zzb.zzb();
        return zzcrtVarZzb.zzi(zzcrtVarZzb.zzk(zzfuj.zzh(zzevuVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }
}
