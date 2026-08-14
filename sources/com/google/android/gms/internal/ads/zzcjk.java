package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjk implements zzddv {
    private final zzchy zza;
    private zzevx zzb;
    private zzeva zzc;
    private zzdab zzd;
    private zzctz zze;
    private zzegk zzf;

    /* synthetic */ zzcjk(zzchy zzchyVar, zzcjj zzcjjVar) {
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

    @Override // com.google.android.gms.internal.ads.zzddv
    public final /* synthetic */ zzddv zzc(zzegk zzegkVar) {
        this.zzf = zzegkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final /* synthetic */ zzddv zzd(zzdab zzdabVar) {
        this.zzd = zzdabVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final /* synthetic */ zzddv zze(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzddw zzh() {
        zzgxg.zzc(this.zzd, zzdab.class);
        zzgxg.zzc(this.zze, zzctz.class);
        zzgxg.zzc(this.zzf, zzegk.class);
        return new zzcjm(this.zza, new zzcrv(), new zzfab(), new zzctg(), new zzdpv(), this.zzd, this.zze, new zzeeo(), this.zzf, null, this.zzb, this.zzc, null);
    }
}
