package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdql {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdql(String str, zzdqk zzdqkVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdql zzdqlVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdqlVar.zza);
            jSONObject.put("eventCategory", zzdqlVar.zzb);
            jSONObject.putOpt("event", zzdqlVar.zzc);
            jSONObject.putOpt("errorCode", zzdqlVar.zzd);
            jSONObject.putOpt("rewardType", zzdqlVar.zze);
            jSONObject.putOpt("rewardAmount", zzdqlVar.zzf);
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
