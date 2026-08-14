package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhj implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    public zzdhj(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9) {
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
    public final zzdhi zzb() {
        com.google.android.gms.ads.internal.util.zzg zzgVarZzb = ((zzcgh) this.zza).zzb();
        zzeyx zzeyxVarZza = ((zzcuf) this.zzb).zza();
        zzdgn zzdgnVar = (zzdgn) this.zzc.zzb();
        zzdgi zzdgiVarZza = ((zzdhb) this.zzd).zza();
        zzdhu zzdhuVar = (zzdhu) this.zze.zzb();
        zzdic zzdicVar = (zzdic) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdhi(zzgVarZzb, zzeyxVarZza, zzdgnVar, zzdgiVarZza, zzdhuVar, zzdicVar, executor, zzfuuVar, (zzdgf) this.zzi.zzb());
    }
}
