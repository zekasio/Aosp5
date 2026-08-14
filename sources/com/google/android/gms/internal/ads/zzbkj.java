package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzbkj {
    public static void zza(zzbkk zzbkkVar, String str, Map map) {
        try {
            zzbkkVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbkk zzbkkVar, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        zzbza.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbkkVar.zza(sb.toString());
    }

    public static void zzc(zzbkk zzbkkVar, String str, String str2) {
        zzbkkVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbkk zzbkkVar, String str, JSONObject jSONObject) {
        zzbkkVar.zzb(str, jSONObject.toString());
    }
}
