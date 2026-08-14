package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxo extends zzqv {
    public zzxo(Throwable th, zzqx zzqxVar, Surface surface) {
        super(th, zzqxVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
