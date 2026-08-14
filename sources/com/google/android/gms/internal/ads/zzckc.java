package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckc implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzchy zza;
    private zzctz zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzag zzc;

    /* synthetic */ zzckc(zzchy zzchyVar, zzckb zzckbVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzctz zzctzVar) {
        this.zzb = zzctzVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzag zzagVar) {
        this.zzc = zzagVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgxg.zzc(this.zzb, zzctz.class);
        zzgxg.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzag.class);
        return new zzcke(this.zza, this.zzc, new zzcrv(), new zzdpv(), this.zzb, null, null, null);
    }
}
