package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcim implements zzcpg {
    private final zzchy zza;
    private zzevx zzb;
    private zzeva zzc;
    private zzdab zzd;
    private zzctz zze;
    private zzegk zzf;
    private zzcqe zzg;
    private zzcoh zzh;
    private zzden zzi;

    /* synthetic */ zzcim(zzchy zzchyVar, zzcil zzcilVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zzc(zzcoh zzcohVar) {
        this.zzh = zzcohVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zzd(zzden zzdenVar) {
        this.zzi = zzdenVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zze(zzegk zzegkVar) {
        this.zzf = zzegkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zzf(zzdab zzdabVar) {
        this.zzd = zzdabVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zzg(zzcqe zzcqeVar) {
        this.zzg = zzcqeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpg
    public final /* synthetic */ zzcpg zzi(zzctz zzctzVar) {
        this.zze = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcph zzh() {
        zzgxg.zzc(this.zzd, zzdab.class);
        zzgxg.zzc(this.zze, zzctz.class);
        zzgxg.zzc(this.zzf, zzegk.class);
        zzgxg.zzc(this.zzg, zzcqe.class);
        zzgxg.zzc(this.zzh, zzcoh.class);
        zzgxg.zzc(this.zzi, zzden.class);
        return new zzcio(this.zza, this.zzh, this.zzi, new zzcrv(), new zzfab(), new zzctg(), new zzdpv(), this.zzd, this.zze, new zzeeo(), this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}
