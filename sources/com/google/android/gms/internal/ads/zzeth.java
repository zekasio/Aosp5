package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeth implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzetj zzd;
    final /* synthetic */ zzetk zze;

    zzeth(zzetk zzetkVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzetj zzetjVar) {
        this.zze = zzetkVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzetjVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcnu, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar;
        zzcnu zzcnuVar = (zzcnu) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcnuVar == null ? zzezx.zzb(th, null) : zzcnuVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnuVar != null) {
                zzcnuVar.zzc().zza(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                    this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeth zzethVar = this.zza;
                            zzethVar.zze.zzd.zza(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zza(zzeVarZzb);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzd();
            }
            zzezr.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzh;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zza(zzeVarZzb);
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzc(zzeVarZzb);
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzg(th);
                zzfecVar2.zzf(false);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfen zzfenVar;
        zzcqm zzcqmVar = (zzcqm) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                zzcqmVar.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcqmVar);
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzh;
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
