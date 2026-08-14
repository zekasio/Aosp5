package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuz extends zzfuw implements ScheduledExecutorService, zzfuu {
    final ScheduledExecutorService zza;

    zzfuz(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfvj zzfvjVarZzf = zzfvj.zzf(runnable, null);
        return new zzfux(zzfvjVarZzf, this.zza.schedule(zzfvjVarZzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfuy zzfuyVar = new zzfuy(runnable);
        return new zzfux(zzfuyVar, this.zza.scheduleAtFixedRate(zzfuyVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfuy zzfuyVar = new zzfuy(runnable);
        return new zzfux(zzfuyVar, this.zza.scheduleWithFixedDelay(zzfuyVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfvj zzfvjVar = new zzfvj(callable);
        return new zzfux(zzfvjVar, this.zza.schedule(zzfvjVar, j, timeUnit));
    }
}
