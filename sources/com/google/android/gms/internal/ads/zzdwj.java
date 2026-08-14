package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwj {
    private final zzfuu zza;
    private final zzdwe zzb;
    private final zzfda zzc;

    zzdwj(zzfuu zzfuuVar, zzdwe zzdweVar, zzfda zzfdaVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdweVar;
        this.zzc = zzfdaVar;
    }

    public final zzfut zza(final zzbtn zzbtnVar) {
        zzfcr zzfcrVarZzb = this.zzc.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzl(zzfuj.zzh(null), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdwg
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzbtn zzbtnVar2 = zzbtnVar;
                return new zzbsr(zzbtnVar2.zzc, zzbtnVar2.zzd, zzbtnVar2.zzf, zzfoj.zzc(zzbtnVar2.zza.getString("ms")), -1, zzbtnVar2.zzh, zzbtnVar2.zze, zzbtnVar2.zzk, zzbtnVar2.zzl);
            }
        }, this.zza));
        final zzdwe zzdweVar = this.zzb;
        return zzfuj.zzl(zzfcrVarZzb.zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdweVar.zzb((zzbsr) obj);
            }
        }).zza(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbtnVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(bundle);
                    try {
                        com.google.android.gms.ads.internal.client.zzay.zzb().zzl(jSONObject, jSONObjectZzi);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzi;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
