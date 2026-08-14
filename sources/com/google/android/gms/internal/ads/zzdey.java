package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdey implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzdey(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgd zzcgdVar = (zzcgd) this.zza.zzb();
        zzctx zzctxVarZza = ((zzcug) this.zzb).zza();
        zzdab zzdabVarZza = ((zzdau) this.zzc).zza();
        zzden zzdenVarZza = ((zzdep) this.zzd).zza();
        zzcxd zzcxdVarZzb = ((zzcoj) this.zze).zzb();
        zzcpg zzcpgVarZzd = zzcgdVar.zzd();
        zzcpgVarZzd.zzi(zzctxVarZza.zzi());
        zzcpgVarZzd.zzf(zzdabVarZza);
        zzcpgVarZzd.zzd(zzdenVarZza);
        zzcpgVarZzd.zze(new zzegk(null));
        zzcpgVarZzd.zzg(new zzcqe(zzcxdVarZzb, null));
        zzcpgVarZzd.zzc(new zzcoh(null));
        zzcqp zzcqpVarZzc = zzcpgVarZzd.zzj().zzc();
        zzgxg.zzb(zzcqpVarZzc);
        return zzcqpVarZzc;
    }
}
