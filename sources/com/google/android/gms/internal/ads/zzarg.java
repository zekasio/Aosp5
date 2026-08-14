package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarg implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzarh zza;

    zzarg(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzarh zzarhVar = this.zza;
            if (zzarhVar.zzc > 0 && jCurrentTimeMillis >= zzarhVar.zzc) {
                zzarhVar.zzd = jCurrentTimeMillis - zzarhVar.zzc;
            }
            this.zza.zze = false;
        }
    }
}
