package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcic implements zzcnx {
    private final zzchy zza;
    private zzevx zzb;
    private zzeva zzc;
    private zzdab zzd;
    private zzctz zze;

    /* synthetic */ zzcic(zzchy zzchyVar, zzcib zzcibVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zza(zzeva zzevaVar) {
        this.zzc = zzevaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* synthetic */ zzctv zzb(zzevx zzevxVar) {
        this.zzb = zzevxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* synthetic */ zzcnx zzc(zzdab zzdabVar) {
        this.zzd = zzdabVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* synthetic */ zzcnx zzd(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final /* bridge */ /* synthetic */ Object zzh() {
        zzgxg.zzc(this.zzd, zzdab.class);
        zzgxg.zzc(this.zze, zzctz.class);
        return new zzcie(this.zza, new zzcrv(), new zzfab(), new zzctg(), new zzdpv(), this.zzd, this.zze, new zzeeo(), null, this.zzb, this.zzc, null);
    }
}
