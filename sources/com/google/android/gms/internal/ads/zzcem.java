package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcem implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbwb zza;
    final /* synthetic */ zzcep zzb;

    zzcem(zzcep zzcepVar, zzbwb zzbwbVar) {
        this.zzb = zzcepVar;
        this.zza = zzbwbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
