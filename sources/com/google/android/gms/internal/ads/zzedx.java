package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedx extends zzedz {
    private final zzcgd zza;
    private final zzden zzb;
    private final zzctx zzc;
    private final zzdab zzd;
    private final zzeeh zze;

    public zzedx(zzcgd zzcgdVar, zzden zzdenVar, zzctx zzctxVar, zzdab zzdabVar, zzeeh zzeehVar) {
        this.zza = zzcgdVar;
        this.zzb = zzdenVar;
        this.zzc = zzctxVar;
        this.zzd = zzdabVar;
        this.zze = zzeehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    protected final zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar) {
        zzder zzderVarZzg = this.zza.zzg();
        zzctx zzctxVar = this.zzc;
        zzctxVar.zzh(zzeyxVar);
        zzctxVar.zze(bundle);
        zzctxVar.zzf(new zzctr(zzeyoVar, zzeycVar, this.zze));
        zzderVarZzg.zzf(zzctxVar.zzi());
        zzderVarZzg.zze(this.zzd);
        zzderVarZzg.zzd(this.zzb);
        zzderVarZzg.zzc(new zzcoh(null));
        zzcrt zzcrtVarZza = zzderVarZzg.zzg().zza();
        return zzcrtVarZza.zzi(zzcrtVarZza.zzj());
    }
}
