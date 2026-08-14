package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffj {
    private boolean zza;

    final void zza(Context context) {
        zzfgr.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfgf.zzb().zzc(context);
        zzfga zzfgaVarZza = zzfga.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zzfgaVarZza);
        }
        zzfgp.zzg(context);
        zzfgc.zzb().zzc(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
