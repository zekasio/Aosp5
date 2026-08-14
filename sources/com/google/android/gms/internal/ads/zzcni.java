package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcni implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcni(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzatb zzatbVar = (zzatb) this.zza.zzb();
        zzbmo zzbmoVar = (zzbmo) this.zzb.zzb();
        zzfuu zzfuuVarZza = zzfbn.zza();
        zzgxg.zzb(zzfuuVarZza);
        return new zzcnb(zzatbVar.zzc(), zzbmoVar, zzfuuVarZza);
    }
}
