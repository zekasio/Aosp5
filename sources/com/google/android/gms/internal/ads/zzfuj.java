package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuj extends zzful {
    public static zzfui zza(Iterable iterable) {
        return new zzfui(false, zzfqk.zzl(iterable), null);
    }

    public static zzfui zzb(Iterable iterable) {
        return new zzfui(true, zzfqk.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfui zzc(zzfut... zzfutVarArr) {
        return new zzfui(true, zzfqk.zzn(zzfutVarArr), null);
    }

    public static zzfut zzd(Iterable iterable) {
        return new zzftr(zzfqk.zzl(iterable), true);
    }

    public static zzfut zze(zzfut zzfutVar, Class cls, zzfnj zzfnjVar, Executor executor) {
        zzfsu zzfsuVar = new zzfsu(zzfutVar, cls, zzfnjVar);
        zzfutVar.zzc(zzfsuVar, zzfva.zzc(executor, zzfsuVar));
        return zzfsuVar;
    }

    public static zzfut zzf(zzfut zzfutVar, Class cls, zzftq zzftqVar, Executor executor) {
        zzfst zzfstVar = new zzfst(zzfutVar, cls, zzftqVar);
        zzfutVar.zzc(zzfstVar, zzfva.zzc(executor, zzfstVar));
        return zzfstVar;
    }

    public static zzfut zzh(Object obj) {
        return obj == null ? zzfun.zza : new zzfun(obj);
    }

    public static zzfut zzi() {
        return zzfun.zza;
    }

    public static zzfut zzj(Callable callable, Executor executor) {
        zzfvj zzfvjVar = new zzfvj(callable);
        executor.execute(zzfvjVar);
        return zzfvjVar;
    }

    public static zzfut zzk(zzftp zzftpVar, Executor executor) {
        zzfvj zzfvjVar = new zzfvj(zzftpVar);
        executor.execute(zzfvjVar);
        return zzfvjVar;
    }

    public static zzfut zzl(zzfut zzfutVar, zzfnj zzfnjVar, Executor executor) {
        int i = zzftf.zzc;
        zzfnjVar.getClass();
        zzfte zzfteVar = new zzfte(zzfutVar, zzfnjVar);
        zzfutVar.zzc(zzfteVar, zzfva.zzc(executor, zzfteVar));
        return zzfteVar;
    }

    public static zzfut zzm(zzfut zzfutVar, zzftq zzftqVar, Executor executor) {
        int i = zzftf.zzc;
        executor.getClass();
        zzftd zzftdVar = new zzftd(zzfutVar, zzftqVar);
        zzfutVar.zzc(zzftdVar, zzfva.zzc(executor, zzftdVar));
        return zzftdVar;
    }

    public static zzfut zzn(zzfut zzfutVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfutVar.isDone() ? zzfutVar : zzfvg.zzg(zzfutVar, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzo(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfvl.zza(future);
        }
        throw new IllegalStateException(zzfoj.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzp(Future future) {
        try {
            return zzfvl.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfty((Error) cause);
            }
            throw new zzfvk(cause);
        }
    }

    public static zzfut zzg(Throwable th) {
        th.getClass();
        return new zzfum(th);
    }

    public static void zzq(zzfut zzfutVar, zzfuf zzfufVar, Executor executor) {
        zzfufVar.getClass();
        zzfutVar.zzc(new zzfug(zzfutVar, zzfufVar), executor);
    }
}
