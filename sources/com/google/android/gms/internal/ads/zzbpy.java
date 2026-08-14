package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpy implements View.OnClickListener {
    final /* synthetic */ zzbpz zza;

    zzbpy(zzbpz zzbpzVar) {
        this.zza = zzbpzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
