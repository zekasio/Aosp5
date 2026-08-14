package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedh implements zzeav {
    private final zzdnd zza;

    public zzedh(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        return new zzeaw(this.zza.zzc(str, jSONObject), new zzecq(), str);
    }
}
