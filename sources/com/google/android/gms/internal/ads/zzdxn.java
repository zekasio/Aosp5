package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdxn implements zzbly {
    zzdxn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdxo zzdxoVar = (zzdxo) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziy)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdxoVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzdxoVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzdxoVar.zzd.zzb());
        jSONObject2.put("signals", zzdxoVar.zzc);
        jSONObject3.put("body", zzdxoVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzj(zzdxoVar.zzb.zzb));
        jSONObject3.put("response_code", zzdxoVar.zzb.zza);
        jSONObject3.put("latency", zzdxoVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdxoVar.zzd.zzg());
        return jSONObject;
    }
}
