package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzewe implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzddw zzd;
    final /* synthetic */ zzewf zze;

    zzewe(zzewf zzewfVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzddw zzddwVar) {
        this.zze = zzewfVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzddwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzewe zzeweVar = this.zza;
                        zzeweVar.zze.zzd.zza(zzeVarZza);
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzewe zzeweVar = this.zza;
                        zzeweVar.zze.zze.zza(zzeVarZza);
                    }
                });
            }
            zzezr.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzg;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zza(zzeVarZza);
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzc(zzeVarZza);
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
        zzdcv zzdcvVar = (zzdcv) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                zzcyt zzcytVarZzn = zzdcvVar.zzn();
                zzcytVarZzn.zza(this.zze.zzd);
                zzcytVarZzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdcvVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhA)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzn();
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzn();
                    }
                });
            }
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzg;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzdcvVar.zzp().zzb);
                zzfecVar.zzd(zzdcvVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzdcvVar.zzp().zzb);
                zzfenVar.zze(zzdcvVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
