package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccv implements zzbhp {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzbza.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccu zzccxVar;
        zzccm zzccmVarZza;
        zzcbj zzcbjVar = (zzcbj) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbza.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccn zzccnVarZzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzccnVarZzy.zzd(zzcbjVar)) {
                return;
            }
            zzbza.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbi zzcbiVar = new zzcbi((String) map.get("flags"));
        boolean z = zzcbiVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbza.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzccnVarZzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzccmVarZza = null;
                        break;
                    }
                    zzccm zzccmVar = (zzccm) it.next();
                    if (zzccmVar.zza == zzcbjVar && str.equals(zzccmVar.zze())) {
                        zzccmVarZza = zzccmVar;
                        break;
                    }
                }
            } else {
                zzccmVarZza = zzccnVarZzy.zza(zzcbjVar);
            }
            if (zzccmVarZza != null) {
                zzbza.zzj("Precache task is already running.");
                return;
            }
            if (zzcbjVar.zzj() == null) {
                zzbza.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcbjVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcbjVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcbjVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzccg zzccgVar = zzcbjVar.zzj().zzb;
            if (iIntValue > 0) {
                int iZzu = zzcba.zzu();
                zzccxVar = iZzu < zzcbiVar.zzh ? new zzcdd(zzcbjVar, zzcbiVar) : iZzu < zzcbiVar.zzb ? new zzcda(zzcbjVar, zzcbiVar) : new zzccy(zzcbjVar);
            } else {
                zzccxVar = new zzccx(zzcbjVar);
            }
            new zzccm(zzcbjVar, zzccxVar, str, strArr).zzb();
        } else {
            zzccm zzccmVarZza2 = zzccnVarZzy.zza(zzcbjVar);
            if (zzccmVarZza2 == null) {
                zzbza.zzj("Precache must specify a source.");
                return;
            }
            zzccxVar = zzccmVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzccxVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzccxVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzccxVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzccxVar.zzq(numZzb8.intValue());
        }
    }
}
