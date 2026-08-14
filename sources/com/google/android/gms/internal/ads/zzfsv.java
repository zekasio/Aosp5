package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfsv extends zzftz implements Runnable {

    @CheckForNull
    zzfut zza;

    @CheckForNull
    Class zzb;

    @CheckForNull
    Object zzc;

    zzfsv(zzfut zzfutVar, Class cls, Object obj) {
        zzfutVar.getClass();
        this.zza = zzfutVar;
        this.zzb = cls;
        obj.getClass();
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        zzfut zzfutVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((zzfutVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            e = zzfutVar instanceof zzfvm ? ((zzfvm) zzfutVar).zzm() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(zzfutVar.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
            }
            e = cause;
        }
        Object objZzo = e == null ? zzfuj.zzo(zzfutVar) : null;
        if (e == null) {
            zzd(objZzo);
            return;
        }
        if (!cls.isInstance(e)) {
            zzt(zzfutVar);
            return;
        }
        try {
            Object objZzf = zzf(obj, e);
            this.zzb = null;
            this.zzc = null;
            zzg(objZzf);
        } catch (Throwable th) {
            try {
                zzfvb.zza(th);
                zze(th);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    protected final String zza() {
        String str;
        zzfut zzfutVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        if (zzfutVar != null) {
            str = "inputFuture=[" + zzfutVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zzf(Object obj, Throwable th) throws Exception;

    abstract void zzg(Object obj);
}
