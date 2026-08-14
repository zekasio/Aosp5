package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyo {
    private final Handler zza;
    private final zzyp zzb;

    public zzyo(Handler handler, zzyp zzypVar) {
        this.zza = zzypVar == null ? null : handler;
        this.zzb = zzypVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhb zzhbVar) {
        zzhbVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzhbVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzye
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzhb zzhbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzhbVar);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, final zzhc zzhcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzafVar, zzhcVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzo(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzp(str);
    }

    final /* synthetic */ void zzi(zzhb zzhbVar) {
        zzhbVar.zza();
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzq(zzhbVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        zzyp zzypVar = this.zzb;
        int i2 = zzew.zza;
        zzypVar.zzk(i, j);
    }

    final /* synthetic */ void zzk(zzhb zzhbVar) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzr(zzhbVar);
    }

    final /* synthetic */ void zzl(zzaf zzafVar, zzhc zzhcVar) {
        int i = zzew.zza;
        this.zzb.zzt(zzafVar, zzhcVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzl(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        zzyp zzypVar = this.zzb;
        int i2 = zzew.zza;
        zzypVar.zzs(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzn(exc);
    }

    final /* synthetic */ void zzp(zzda zzdaVar) {
        zzyp zzypVar = this.zzb;
        int i = zzew.zza;
        zzypVar.zzu(zzdaVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzda zzdaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzym
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzdaVar);
                }
            });
        }
    }
}
