package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfga implements Application.ActivityLifecycleCallbacks {
    private static final zzfga zza = new zzfga();
    private boolean zzb;
    private boolean zzc;
    private zzfgf zzd;

    private zzfga() {
    }

    public static zzfga zza() {
        return zza;
    }

    private final void zze() {
        boolean z = this.zzc;
        Iterator it = zzffz.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfgl zzfglVarZzg = ((zzffo) it.next()).zzg();
            if (zzfglVarZzg.zzk()) {
                zzfge.zza().zzb(zzfglVarZzg.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (z) {
                        zzfhb.zzd().zzh();
                    } else {
                        zzfhb.zzd().zzi();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewZzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        for (zzffo zzffoVar : zzffz.zza().zzb()) {
            if (zzffoVar.zzj() && (viewZzf = zzffoVar.zzf()) != null && viewZzf.hasWindowFocus()) {
                z = false;
            }
        }
        zzf(i != 100 && z);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzfgf zzfgfVar) {
        this.zzd = zzfgfVar;
    }
}
