package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddn implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzddn(zzdcz zzdczVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdej zzdejVar = (zzdej) this.zzb.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdbu(zzdejVar, zzfuuVar);
    }
}
