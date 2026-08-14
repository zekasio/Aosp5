package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlk {
    private final zzcum zza;
    private final zzcvv zzb;
    private final zzcwi zzc;
    private final zzcwu zzd;
    private final zzczi zze;
    private final zzdca zzf;

    zzdlk(zzcum zzcumVar, zzcvv zzcvvVar, zzcwi zzcwiVar, zzcwu zzcwuVar, zzczi zzcziVar, zzdca zzdcaVar) {
        this.zza = zzcumVar;
        this.zzb = zzcvvVar;
        this.zzc = zzcwiVar;
        this.zzd = zzcwuVar;
        this.zze = zzcziVar;
        this.zzf = zzdcaVar;
    }

    public final void zza(zzdll zzdllVar) {
        zzdli zzdliVar = zzdllVar.zza;
        zzcum zzcumVar = this.zza;
        zzcwi zzcwiVar = this.zzc;
        zzcwu zzcwuVar = this.zzd;
        zzczi zzcziVar = this.zze;
        final zzcvv zzcvvVar = this.zzb;
        zzcvvVar.getClass();
        zzdliVar.zzi(zzcumVar, zzcwiVar, zzcwuVar, zzcziVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcvvVar.zzb();
            }
        }, this.zzf);
    }
}
