package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzclq {
    private final Map zza;
    private final Map zzb;

    zzclq(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzeyo zzeyoVar) throws Exception {
        for (zzeym zzeymVar : zzeyoVar.zzb.zzc) {
            if (this.zza.containsKey(zzeymVar.zza)) {
                ((zzclt) this.zza.get(zzeymVar.zza)).zza(zzeymVar.zzb);
            } else if (this.zzb.containsKey(zzeymVar.zza)) {
                zzcls zzclsVar = (zzcls) this.zzb.get(zzeymVar.zza);
                JSONObject jSONObject = zzeymVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzclsVar.zza(map);
            }
        }
    }
}
