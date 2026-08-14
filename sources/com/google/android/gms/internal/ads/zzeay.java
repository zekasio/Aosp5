package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeay {
    private final String zzc;
    private zzeyf zzd = null;
    private zzeyc zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeay(String str) {
        this.zzc = str;
    }

    private final void zzh(zzeyc zzeycVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = zzeycVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzeycVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgr)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcuh zzb() {
        return new zzcuh(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzeyc zzeycVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzeycVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzeycVar.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzeycVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgq)).booleanValue()) {
            String str6 = zzeycVar.zzG;
            String str7 = zzeycVar.zzH;
            str = str6;
            str2 = str7;
            str3 = zzeycVar.zzI;
            str4 = zzeycVar.zzJ;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzeycVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        this.zza.add(zzuVar);
        this.zzb.put(str5, zzuVar);
    }

    public final void zze(zzeyc zzeycVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzeycVar, j, zzeVar, false);
    }

    public final void zzf(zzeyc zzeycVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzeycVar, j, null, true);
    }

    public final void zzg(zzeyf zzeyfVar) {
        this.zzd = zzeyfVar;
    }
}
