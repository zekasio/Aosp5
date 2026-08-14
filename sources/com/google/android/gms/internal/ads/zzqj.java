package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqj extends Handler {
    final /* synthetic */ zzql zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzqj(zzql zzqlVar, Looper looper) {
        super(looper);
        this.zza = zzqlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzql.zza(this.zza, message);
    }
}
