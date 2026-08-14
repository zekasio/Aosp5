package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvj extends zzftz implements RunnableFuture {

    @CheckForNull
    private volatile zzfus zza;

    zzfvj(zzftp zzftpVar) {
        this.zza = new zzfvh(this, zzftpVar);
    }

    static zzfvj zzf(Runnable runnable, Object obj) {
        return new zzfvj(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfus zzfusVar = this.zza;
        if (zzfusVar != null) {
            zzfusVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    protected final String zza() {
        zzfus zzfusVar = this.zza;
        if (zzfusVar == null) {
            return super.zza();
        }
        return "task=[" + zzfusVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzfus zzfusVar;
        if (zzu() && (zzfusVar = this.zza) != null) {
            zzfusVar.zzh();
        }
        this.zza = null;
    }

    zzfvj(Callable callable) {
        this.zza = new zzfvi(this, callable);
    }
}
