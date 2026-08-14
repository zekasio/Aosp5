package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwr implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    public zzdwr(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
        this.zzh = zzgxlVar8;
        this.zzi = zzgxlVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwq zzb() {
        zzcxh zzcxhVarZzb = ((zzcxi) this.zza).zzb();
        zzdvy zzdvyVarZzb = ((zzdvz) this.zzb).zzb();
        zzfda zzfdaVar = (zzfda) this.zzc.zzb();
        zzeyx zzeyxVarZza = ((zzcuf) this.zzd).zza();
        zzbzg zzbzgVarZza = ((zzcgu) this.zze).zza();
        zzfep zzfepVar = (zzfep) this.zzf.zzb();
        zzfen zzfenVar = (zzfen) this.zzg.zzb();
        Context contextZza = ((zzcgj) this.zzh).zza();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdwq(zzcxhVarZzb, zzdvyVarZzb, zzfdaVar, zzeyxVarZza, zzbzgVarZza, zzfepVar, zzfenVar, contextZza, zzfuuVar);
    }
}
