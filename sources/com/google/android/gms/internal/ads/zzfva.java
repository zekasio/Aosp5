package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfva {
    public static zzfuu zza(ExecutorService executorService) {
        if (executorService instanceof zzfuu) {
            return (zzfuu) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfuz((ScheduledExecutorService) executorService) : new zzfuw(executorService);
    }

    public static Executor zzb() {
        return zzftx.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfsx zzfsxVar) {
        executor.getClass();
        return executor == zzftx.INSTANCE ? executor : new zzfuv(executor, zzfsxVar);
    }
}
