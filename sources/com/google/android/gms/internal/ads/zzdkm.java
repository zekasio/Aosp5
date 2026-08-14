package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdkm implements zzbdk {
    final /* synthetic */ zzdkn zza;

    zzdkm(zzdkn zzdknVar) {
        this.zza = zzdknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzc() {
        zzdkn zzdknVar = this.zza;
        if (zzdknVar.zzd != null) {
            zzdknVar.zzd.zzE("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzd(MotionEvent motionEvent) {
    }
}
