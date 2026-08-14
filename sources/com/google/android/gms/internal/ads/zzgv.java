package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgv {
    private final Context zza;
    private final zzgt zzb;

    public zzgv(Context context, Handler handler, zzgu zzguVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzgt(this, handler, zzguVar);
    }
}
