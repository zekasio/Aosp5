package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwf implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdwf(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwe zzb() {
        zzfuu zzfuuVar = zzbzn.zzb;
        zzgxg.zzb(zzfuuVar);
        zzfuu zzfuuVar2 = zzbzn.zza;
        zzgxg.zzb(zzfuuVar2);
        return new zzdwe(zzfuuVar, zzfuuVar2, ((zzdwx) this.zzc).zzb());
    }
}
