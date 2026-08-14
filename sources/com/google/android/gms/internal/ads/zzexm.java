package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexm implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzexo zzd;
    final /* synthetic */ zzexp zze;

    zzexm(zzexp zzexpVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzexo zzexoVar) {
        this.zze = zzexpVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar;
        zzdlz zzdlzVar = (zzdlz) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdlzVar == null ? zzezx.zzb(th, null) : zzdlzVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdlzVar != null) {
                zzdlzVar.zza().zza(zzeVarZzb);
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexm zzexmVar = this.zza;
                        zzexmVar.zze.zzd.zza(zzeVarZzb);
                    }
                });
            } else {
                this.zze.zzd.zza(zzeVarZzb);
                this.zze.zzk(this.zzd).zzh().zzb().zzc().zzd();
            }
            zzezr.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzg;
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
        zzdlu zzdluVar = (zzdlu) obj;
        synchronized (this.zze) {
            zzdluVar.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdluVar);
            zzexp zzexpVar = this.zze;
            Executor executor = zzexpVar.zzb;
            final zzexf zzexfVar = zzexpVar.zzd;
            zzexfVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // java.lang.Runnable
                public final void run() {
                    zzexfVar.zzn();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzg;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzdluVar.zzp().zzb);
                zzfecVar.zzd(zzdluVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzdluVar.zzp().zzb);
                zzfenVar.zze(zzdluVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
