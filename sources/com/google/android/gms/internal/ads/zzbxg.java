package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxg {
    static zzbxg zza;

    public static synchronized zzbxg zzd(Context context) {
        zzbxg zzbxgVar = zza;
        if (zzbxgVar != null) {
            return zzbxgVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbar.zzc(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
        zzgVarZzh.zzr(applicationContext);
        zzbwk zzbwkVar = new zzbwk(null);
        zzbwkVar.zzb(applicationContext);
        zzbwkVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
        zzbwkVar.zza(zzgVarZzh);
        zzbwkVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
        zzbxg zzbxgVarZze = zzbwkVar.zze();
        zza = zzbxgVarZze;
        zzbxgVarZze.zza().zza();
        zza.zzb().zzc();
        zzbxk zzbxkVarZzc = zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzao)).booleanValue()) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaq));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    zzbxkVarZzc.zzc((String) it.next());
                }
                zzbxkVarZzc.zzd(new zzbxi(zzbxkVarZzc, map));
            } catch (JSONException e) {
                zzbza.zzf("Failed to parse listening list", e);
            }
        }
        return zza;
    }

    abstract zzbwd zza();

    abstract zzbwh zzb();

    abstract zzbxk zzc();
}
