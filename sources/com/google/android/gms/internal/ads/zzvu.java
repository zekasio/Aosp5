package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvu implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzwc zza;

    zzvu(zzvv zzvvVar, zzwc zzwcVar) {
        this.zza = zzwcVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzt();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzt();
    }
}
