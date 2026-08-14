package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpd implements zzgwy {
    private final zzcor zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcpd(zzcor zzcorVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzcorVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcqi zzcqiVar = (zzcqi) this.zzb.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzdbu(zzcqiVar, zzfuuVar);
    }
}
