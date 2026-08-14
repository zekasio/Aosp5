package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegx {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Executor zzd;
    private JSONObject zze;

    zzegx(Executor executor) {
        this.zzd = executor;
    }

    private final synchronized List zzg(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle bundleZzl = zzl(jSONObject.optJSONObject(TJAdUnitConstants.String.DATA));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList2.add(strOptString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            zzf(str2);
            if (((zzegz) this.zza.get(str2)) != null) {
                arrayList.add(new zzegz(str2, str, bundleZzl));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        zzj();
        zzk();
    }

    private final synchronized void zzi(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.zzc.put(str, map);
        List arrayList = (List) map.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        map.put(str2, arrayList);
    }

    private final synchronized void zzj() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzf();
        if (jSONObjectZzf != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzji)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String strOptString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                arrayList.addAll(zzg(jSONArrayOptJSONArray.getJSONObject(i2), strOptString));
                            }
                        }
                        zzi(strOptString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized void zzk() {
        if (!((Boolean) zzbcq.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbC)).booleanValue()) {
                JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzf();
                if (jSONObjectZzf == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleZzl = zzl(jSONObject.optJSONObject(TJAdUnitConstants.String.DATA));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzehb(strOptString, zOptBoolean2, zOptBoolean, bundleZzl));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzl(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                return zzfqn.zzd();
            }
            List<zzegz> list = (List) map.get(str2);
            if (list == null) {
                String strZza = zzdnk.zza(this.zze, str2, str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzji)).booleanValue()) {
                    strZza = strZza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(strZza);
            }
            if (list == null) {
                return zzfqn.zzd();
            }
            HashMap map2 = new HashMap();
            for (zzegz zzegzVar : list) {
                String str3 = zzegzVar.zza;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(zzegzVar.zzc);
            }
            return zzfqn.zzc(map2);
        }
        return zzfqn.zzd();
    }

    public final synchronized Map zzb() {
        return zzfqn.zzc(this.zzb);
    }

    public final void zzd() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzd.execute(new zzegw(this));
    }

    final /* synthetic */ void zze() {
        this.zzd.execute(new zzegw(this));
    }

    public final synchronized void zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.zza.containsKey(str)) {
            return;
        }
        this.zza.put(str, new zzegz(str, "", new Bundle()));
    }
}
