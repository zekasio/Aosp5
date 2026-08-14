package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbzn {
    public static final zzfuu zza;
    public static final zzfuu zzb;
    public static final zzfuu zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfuu zze;
    public static final zzfuu zzf;

    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceZzc;
        ExecutorService executorServiceZzb;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfkq.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzj("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzj("Default"));
        }
        zzbzl zzbzlVar = null;
        zza = new zzbzm(threadPoolExecutor, zzbzlVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfkq.zza().zzc(5, new zzbzj("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzj("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor2;
        }
        zzb = new zzbzm(executorServiceZzc, zzbzlVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzb = zzfkq.zza().zzb(new zzbzj("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzj("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzb = threadPoolExecutor3;
        }
        zzc = new zzbzm(executorServiceZzb, zzbzlVar);
        zzd = new zzbzi(3, new zzbzj("Schedule"));
        zze = new zzbzm(new zzbzk(), zzbzlVar);
        zzf = new zzbzm(zzfva.zzb(), zzbzlVar);
    }
}
