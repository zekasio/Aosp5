package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvb extends zzczy implements zzcus {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcvb(zzcva zzcvaVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzm(zzcvaVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcus) obj).zza(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzb() {
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcuw
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcus) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    public final void zzc(final zzded zzdedVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcut
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcus) obj).zzc(zzdedVar);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            zzbza.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzded("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjc)).intValue(), TimeUnit.MILLISECONDS);
    }
}
