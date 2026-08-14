package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevi implements zzevt {
    private zzctw zza;

    @Override // com.google.android.gms.internal.ads.zzevt
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, zzctw zzctwVar) {
        zzcrt zzcrtVarZzb;
        if (zzctwVar != null) {
            this.zza = zzctwVar;
        } else {
            this.zza = (zzctw) zzevsVar.zza(zzevuVar.zzb).zzh();
        }
        zzcrtVarZzb = this.zza.zzb();
        return zzcrtVarZzb.zzi(zzcrtVarZzb.zzj());
    }
}
