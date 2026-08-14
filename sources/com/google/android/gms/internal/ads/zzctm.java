package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctm implements zzcuo, zzdbl, zzczg, zzcve, zzatf {
    private final zzcvg zza;
    private final zzeyc zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final zzfvc zze = zzfvc.zzf();
    private final AtomicBoolean zzg = new AtomicBoolean();

    zzctm(zzcvg zzcvgVar, zzeyc zzeycVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzcvgVar;
        this.zzb = zzeycVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    private final boolean zzh() {
        return this.zzb.zzZ == 2;
    }

    final /* synthetic */ void zzb() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzd(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjC)).booleanValue() && !zzh() && zzateVar.zzj && this.zzg.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzd() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjC)).booleanValue() || zzh()) {
            return;
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final synchronized void zze() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbp)).booleanValue() && zzh()) {
            if (this.zzb.zzr == 0) {
                this.zza.zza();
            } else {
                zzfuj.zzq(this.zze, new zzctl(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, this.zzb.zzr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcve
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zze(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
        int i = this.zzb.zzZ;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjC)).booleanValue()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(zzbud zzbudVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
    }
}
