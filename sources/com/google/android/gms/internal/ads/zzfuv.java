package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuv implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfsx zzb;

    zzfuv(Executor executor, zzfsx zzfsxVar) {
        this.zza = executor;
        this.zzb = zzfsxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
