package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzcpq implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcpq(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcps.zzi(this.zza);
    }
}
