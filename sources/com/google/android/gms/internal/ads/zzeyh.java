package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyh {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzeyh(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
        this.zzd = jSONObjectZzh;
        this.zza = jSONObjectZzh.optString("ad_html", null);
        this.zzb = jSONObjectZzh.optString("ad_base_url", null);
        this.zzc = jSONObjectZzh.optJSONObject("ad_json");
    }
}
