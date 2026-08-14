package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwp {
    private final Handler zza;
    private final zzwr zzb;
    private boolean zzc;

    public zzwp(Handler handler, zzwr zzwrVar) {
        this.zza = handler;
        this.zzb = zzwrVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
