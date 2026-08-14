package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaqx zzb;

    zzaqv(zzaqx zzaqxVar, int i, boolean z) {
        this.zzb = zzaqxVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzans zzansVarZza;
        zzaqx zzaqxVar = this.zzb;
        if (this.zza > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaqxVar.zza.getPackageManager().getPackageInfo(zzaqxVar.zza.getPackageName(), 0);
            Context context = zzaqxVar.zza;
            zzansVarZza = zzfhx.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzansVarZza = null;
        }
        this.zzb.zzm = zzansVarZza;
        if (this.zza < 4) {
            if (zzansVarZza != null && zzansVarZza.zzaj() && !zzansVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzansVarZza.zzak() && zzansVarZza.zzf().zze() && zzansVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
