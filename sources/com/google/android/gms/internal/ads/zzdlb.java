package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlb {
    private final zzcum zza;
    private final zzcvv zzb;
    private final zzcwi zzc;
    private final zzcwu zzd;
    private final zzczi zze;
    private final zzeyc zzf;
    private final zzeyf zzg;

    public zzdlb(zzcum zzcumVar, zzcvv zzcvvVar, zzcwi zzcwiVar, zzcwu zzcwuVar, zzczi zzcziVar, zzeyc zzeycVar, zzeyf zzeyfVar) {
        this.zza = zzcumVar;
        this.zzb = zzcvvVar;
        this.zzc = zzcwiVar;
        this.zzd = zzcwuVar;
        this.zze = zzcziVar;
        this.zzf = zzeycVar;
        this.zzg = zzeyfVar;
    }

    public final void zza(zzdlf zzdlfVar) {
        zzdks zzdksVar = zzdlfVar.zza;
        zzcum zzcumVar = this.zza;
        zzcwi zzcwiVar = this.zzc;
        zzcwu zzcwuVar = this.zzd;
        zzczi zzcziVar = this.zze;
        final zzcvv zzcvvVar = this.zzb;
        zzcvvVar.getClass();
        zzdksVar.zzh(zzcumVar, zzcwiVar, zzcwuVar, zzcziVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdla
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcvvVar.zzb();
            }
        });
        zzdlfVar.zze(this.zzf, this.zzg);
    }
}
