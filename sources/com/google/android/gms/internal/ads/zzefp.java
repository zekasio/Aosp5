package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefp implements zzeav {
    private final zzegt zza;

    public zzefp(zzegt zzegtVar) {
        this.zza = zzegtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzbpc zzbpcVarZza = this.zza.zza(str);
        if (zzbpcVarZza == null) {
            return null;
        }
        return new zzeaw(zzbpcVarZza, new zzecq(), str);
    }
}
