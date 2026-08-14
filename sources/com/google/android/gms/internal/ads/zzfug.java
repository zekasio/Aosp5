package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfug implements Runnable {
    final Future zza;
    final zzfuf zzb;

    zzfug(Future future, zzfuf zzfufVar) {
        this.zza = future;
        this.zzb = zzfufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzfvm) && (thZza = zzfvn.zza((zzfvm) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzfuj.zzo(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzfnn zzfnnVarZza = zzfno.zza(this);
        zzfnnVarZza.zza(this.zzb);
        return zzfnnVarZza.toString();
    }
}
