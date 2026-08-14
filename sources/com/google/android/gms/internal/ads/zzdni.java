package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdni {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdni(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        Map map;
        this.zzd = true;
        zzbyd zzbydVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        if (zzbydVarZzh == null) {
            return;
        }
        JSONObject jSONObjectZzf = zzbydVarZzh.zzf();
        if (jSONObjectZzf == null) {
            return;
        }
        this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdB)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
        this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.zza.containsKey(strOptString2)) {
                            map = (Map) this.zza.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.zza.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdB)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdA)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdnk.zza(this.zze, str, str2);
        if (strZza == null) {
            return null;
        }
        return (JSONObject) map.get(strZza);
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
