package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfuy extends zzfsx.zzi implements Runnable {
    private final Runnable zza;

    public zzfuy(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }
}
