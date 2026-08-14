package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeix implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzdes zzd;
    final /* synthetic */ zzeiy zze;

    zzeix(zzeiy zzeiyVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzdes zzdesVar) {
        this.zze = zzeiyVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzdesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zzeVarZza);
        this.zze.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // java.lang.Runnable
            public final void run() {
                zzeix zzeixVar = this.zza;
                zzeixVar.zze.zzd.zza().zza(zzeVarZza);
            }
        });
        zzezr.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
            zzfep zzfepVar = this.zze.zze;
            zzfec zzfecVar = this.zzc;
            zzfecVar.zza(zzeVarZza);
            zzfecVar.zzg(th);
            zzfecVar.zzf(false);
            zzfepVar.zzb(zzfecVar.zzl());
            return;
        }
        zzfenVar.zzc(zzeVarZza);
        zzfec zzfecVar2 = this.zzc;
        zzfecVar2.zzg(th);
        zzfecVar2.zzf(false);
        zzfenVar.zza(zzfecVar2);
        zzfenVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfen zzfenVar;
        zzcqm zzcqmVar = (zzcqm) obj;
        synchronized (this.zze) {
            zzcqmVar.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcqmVar);
            this.zze.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzn();
                }
            });
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zze;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzcqmVar.zzp().zzb);
                zzfecVar.zzd(zzcqmVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzcqmVar.zzp().zzb);
                zzfenVar.zze(zzcqmVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
