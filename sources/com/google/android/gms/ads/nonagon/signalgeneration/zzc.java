package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    private final zzdpn zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zzb(zzbar.zzgA)).intValue();
    private final long zzb = ((Long) zzba.zzc().zzb(zzbar.zzgB)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zzb(zzbar.zzgG)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zzb(zzbar.zzgE)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdpn zzdpnVar) {
        this.zzh = zzdpnVar;
    }

    private final synchronized void zzg(final zzdpd zzdpdVar) {
        if (this.zzc) {
            final ArrayDeque arrayDequeClone = this.zzg.clone();
            this.zzg.clear();
            final ArrayDeque arrayDequeClone2 = this.zzf.clone();
            this.zzf.clear();
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzdpdVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzh(zzdpd zzdpdVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdpdVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzdpd zzdpdVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdpdVar.zza().put("rid", str);
        if (pair == null) {
            zzdpdVar.zza().put("mhit", TJAdUnitConstants.String.FALSE);
            return null;
        }
        String str2 = (String) pair.second;
        this.zze.remove(str);
        zzdpdVar.zza().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, zzdpd zzdpdVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdpdVar);
    }

    final /* synthetic */ void zze(zzdpd zzdpdVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdpdVar, arrayDeque, TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO);
        zzh(zzdpdVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
