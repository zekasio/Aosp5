package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgt extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgv zza;
    private final zzgu zzb;
    private final Handler zzc;

    public zzgt(zzgv zzgvVar, Handler handler, zzgu zzguVar) {
        this.zza = zzgvVar;
        this.zzc = handler;
        this.zzb = zzguVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
