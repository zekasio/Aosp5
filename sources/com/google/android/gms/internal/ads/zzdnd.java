package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnd {
    private final zzezq zza;
    private final zzdna zzb;

    zzdnd(zzezq zzezqVar, zzdna zzdnaVar) {
        this.zza = zzezqVar;
        this.zzb = zzdnaVar;
    }

    final zzbnf zza() throws RemoteException {
        zzbnf zzbnfVarZzb = this.zza.zzb();
        if (zzbnfVarZzb != null) {
            return zzbnfVarZzb;
        }
        zzbza.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbpc zzb(String str) throws RemoteException {
        zzbpc zzbpcVarZzc = zza().zzc(str);
        this.zzb.zze(str, zzbpcVarZzc);
        return zzbpcVarZzc;
    }

    public final zzezs zzc(String str, JSONObject jSONObject) throws zzezc {
        zzbni zzbniVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbniVarZzb = new zzbof(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbniVarZzb = new zzbof(new zzbpu());
            } else {
                zzbnf zzbnfVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbniVarZzb = zzbnfVarZza.zze(string) ? zzbnfVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbnfVarZza.zzd(string) ? zzbnfVarZza.zzb(string) : zzbnfVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzbza.zzh("Invalid custom event.", e);
                        zzbniVarZzb = zzbnfVarZza.zzb(str);
                    }
                } else {
                    zzbniVarZzb = zzbnfVarZza.zzb(str);
                }
            }
            zzezs zzezsVar = new zzezs(zzbniVarZzb);
            this.zzb.zzd(str, zzezsVar);
            return zzezsVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzezc(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
