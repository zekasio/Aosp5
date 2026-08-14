package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeec extends zzedz {
    private final zzcgd zza;
    private final zzctx zzb;
    private final zzegk zzc;
    private final zzdab zzd;
    private final zzeeh zze;

    public zzeec(zzcgd zzcgdVar, zzctx zzctxVar, zzegk zzegkVar, zzdab zzdabVar, zzeeh zzeehVar) {
        this.zza = zzcgdVar;
        this.zzb = zzctxVar;
        this.zzc = zzegkVar;
        this.zzd = zzdabVar;
        this.zze = zzeehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    protected final zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar) {
        zzddv zzddvVarZzf = this.zza.zzf();
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzh(zzeyxVar);
        zzctxVar.zze(bundle);
        zzctxVar.zzf(new zzctr(zzeyoVar, zzeycVar, this.zze));
        zzddvVarZzf.zze(zzctxVar.zzi());
        zzddvVarZzf.zzd(this.zzd);
        zzddvVarZzf.zzc(this.zzc);
        zzcrt zzcrtVarZza = zzddvVarZzf.zzf().zza();
        return zzcrtVarZza.zzi(zzcrtVarZza.zzj());
    }
}
