package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchd implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzchd(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbty zzb() {
        Context contextZza = ((zzcgj) this.zza).zza();
        zzfep zzfepVar = (zzfep) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzbzg.zza(), zzfepVar).zza("google.afma.request.getAdDictionary", zzbmc.zza, zzbmc.zza);
        zzbmf zzbmfVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzbzg.zza(), zzfepVar);
        zzblz zzblzVar = zzbmc.zza;
        return new zzbtx(contextZza, zzbmfVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzblzVar, zzblzVar));
    }
}
