package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvd implements Runnable {

    @CheckForNull
    zzfvg zza;

    zzfvd(zzfvg zzfvgVar) {
        this.zza = zzfvgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfut zzfutVar;
        zzfvg zzfvgVar = this.zza;
        if (zzfvgVar == null || (zzfutVar = zzfvgVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (zzfutVar.isDone()) {
            zzfvgVar.zzt(zzfutVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzfvgVar.zzb;
            zzfvgVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzfvgVar.zze(new zzfvf(str, null));
                    throw th;
                }
            }
            zzfvgVar.zze(new zzfvf(str + ": " + zzfutVar.toString(), null));
        } finally {
            zzfutVar.cancel(true);
        }
    }
}
