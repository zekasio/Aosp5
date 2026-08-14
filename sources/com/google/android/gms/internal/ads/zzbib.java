package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbib implements zzbic {
    final /* synthetic */ zzbzs zza;

    zzbib(zzbid zzbidVar, zzbzs zzbzsVar) {
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(String str) {
        this.zza.zze(new zzblu(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
