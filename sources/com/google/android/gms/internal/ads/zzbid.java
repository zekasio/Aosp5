package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbid implements zzbhp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbic zzbicVar = (zzbic) this.zzb.remove(str);
            if (zzbicVar == null) {
                zzbza.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbicVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbicVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbicVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbicVar.zza(e.getMessage());
            }
        }
    }

    public final zzfut zzb(zzbkv zzbkvVar, String str, JSONObject jSONObject) {
        zzbzs zzbzsVar = new zzbzs();
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbib(this, zzbzsVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbkvVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzbzsVar.zze(e);
        }
        return zzbzsVar;
    }

    public final void zzc(String str, zzbic zzbicVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbicVar);
        }
    }
}
