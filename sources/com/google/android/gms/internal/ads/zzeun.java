package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeun implements zzfuf {
    final /* synthetic */ zzeiq zza;
    final /* synthetic */ zzfen zzb;
    final /* synthetic */ zzfec zzc;
    final /* synthetic */ zzcph zzd;
    final /* synthetic */ zzeuo zze;

    zzeun(zzeuo zzeuoVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzcph zzcphVar) {
        this.zze = zzeuoVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfen zzfenVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeum
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeun zzeunVar = this.zza;
                        zzeunVar.zze.zzd.zza(zzeVarZza);
                    }
                });
            }
            zzeuo zzeuoVar = this.zze;
            zzeuoVar.zzh.zzd(zzeuoVar.zzj.zzc());
            zzezr.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzi;
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
        zzcok zzcokVar = (zzcok) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcokVar.zzc() != null) {
                ViewParent parent = zzcokVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzbza.zzj("Banner view provided from " + (zzcokVar.zzl() != null ? zzcokVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcokVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                zzcyt zzcytVarZzn = zzcokVar.zzn();
                zzcytVarZzn.zza(this.zze.zzd);
                zzcytVarZzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcokVar.zzc());
            this.zza.zzb(zzcokVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                zzeuo zzeuoVar = this.zze;
                Executor executor = zzeuoVar.zzb;
                final zzeib zzeibVar = zzeuoVar.zzd;
                zzeibVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeul
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeibVar.zzn();
                    }
                });
            }
            this.zze.zzh.zzd(zzcokVar.zza());
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfep zzfepVar = this.zze.zzi;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzcokVar.zzp().zzb);
                zzfecVar.zzd(zzcokVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzcokVar.zzp().zzb);
                zzfenVar.zze(zzcokVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
