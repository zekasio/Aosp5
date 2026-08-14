package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzh == null) {
            return false;
        }
        zzsVar.zzh.zzd(motionEvent);
        return false;
    }
}
