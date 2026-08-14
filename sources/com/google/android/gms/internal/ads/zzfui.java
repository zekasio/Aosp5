package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfui {
    private final boolean zza;
    private final zzfqk zzb;

    /* synthetic */ zzfui(boolean z, zzfqk zzfqkVar, zzfuh zzfuhVar) {
        this.zza = z;
        this.zzb = zzfqkVar;
    }

    public final zzfut zza(Callable callable, Executor executor) {
        return new zzftw(this.zzb, this.zza, executor, callable);
    }
}
