package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflx {
    private static final zzfmk zzb = new zzfmk("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfmv zza;
    private final String zzd;

    zzflx(Context context) {
        if (zzfmy.zza(context)) {
            this.zza = new zzfmv(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfls.zza, null, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzflo zzfloVar, zzfmc zzfmcVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzflu(this, taskCompletionSource, zzfloVar, zzfmcVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzflz zzflzVar, zzfmc zzfmcVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzflzVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzflt(this, taskCompletionSource, zzflzVar, zzfmcVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfma zzfmaVarZzc = zzfmb.zzc();
            zzfmaVarZzc.zzb(8160);
            zzfmcVar.zza(zzfmaVarZzc.zzc());
        }
    }

    final void zzf(zzfme zzfmeVar, zzfmc zzfmcVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzflv(this, taskCompletionSource, zzfmeVar, i, zzfmcVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
