package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbmq implements zzbic {
    final /* synthetic */ zzbmr zza;
    private final zzbzs zzb;

    public zzbmq(zzbmr zzbmrVar, zzbzs zzbzsVar) {
        this.zza = zzbmrVar;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzblu());
            } else {
                this.zzb.zze(new zzblu(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
