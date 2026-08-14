package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsa {
    private final zzdrk zza;
    private final zzdna zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdsa(zzdrk zzdrkVar, zzdna zzdnaVar) {
        this.zza = zzdrkVar;
        this.zzb = zzdnaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdmz zzdmzVarZza;
        zzdmz zzdmzVarZza2;
        zzbpq zzbpqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbjl zzbjlVar = (zzbjl) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziz)).booleanValue() || (zzdmzVarZza2 = this.zzb.zza(zzbjlVar.zza)) == null || (zzbpqVar = zzdmzVarZza2.zzc) == null) ? "" : zzbpqVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue() && (zzdmzVarZza = this.zzb.zza(zzbjlVar.zza)) != null && zzdmzVarZza.zzd;
                List list2 = this.zzd;
                String str2 = zzbjlVar.zza;
                list2.add(new zzdrz(str2, str, this.zzb.zzc(str2), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdrz) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdry(this));
    }
}
