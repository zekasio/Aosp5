package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchi implements zzder {
    private final zzchy zza;
    private zzevx zzb;
    private zzeva zzc;
    private zzdab zzd;
    private zzctz zze;
    private zzden zzf;
    private zzcoh zzg;

    /* synthetic */ zzchi(zzchy zzchyVar, zzchh zzchhVar) {
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

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ zzder zzc(zzcoh zzcohVar) {
        this.zzg = zzcohVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ zzder zzd(zzden zzdenVar) {
        this.zzf = zzdenVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ zzder zze(zzdab zzdabVar) {
        this.zzd = zzdabVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ zzder zzf(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdes zzh() {
        zzgxg.zzc(this.zzd, zzdab.class);
        zzgxg.zzc(this.zze, zzctz.class);
        zzgxg.zzc(this.zzf, zzden.class);
        zzgxg.zzc(this.zzg, zzcoh.class);
        return new zzchk(this.zza, this.zzg, this.zzf, new zzcrv(), new zzfab(), new zzctg(), new zzdpv(), this.zzd, this.zze, new zzeeo(), null, this.zzb, this.zzc, null);
    }
}
