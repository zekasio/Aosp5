package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzftf extends zzftz implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    zzfut zza;

    @CheckForNull
    Object zzb;

    zzftf(zzfut zzfutVar, Object obj) {
        zzfutVar.getClass();
        this.zza = zzfutVar;
        obj.getClass();
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfut zzfutVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfutVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfutVar.isCancelled()) {
            zzt(zzfutVar);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzfuj.zzo(zzfutVar));
                this.zzb = null;
                zzg(objZzf);
            } catch (Throwable th) {
                try {
                    zzfvb.zza(th);
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    protected final String zza() {
        String str;
        zzfut zzfutVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        if (zzfutVar != null) {
            str = "inputFuture=[" + zzfutVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    abstract void zzg(Object obj);
}
