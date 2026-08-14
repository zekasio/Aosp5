package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkx extends BroadcastReceiver {
    final /* synthetic */ zzky zza;

    /* synthetic */ zzkx(zzky zzkyVar, zzkw zzkwVar) {
        this.zza = zzkyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzky zzkyVar = this.zza;
        zzkyVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                zzkyVar.zzh();
            }
        });
    }
}
