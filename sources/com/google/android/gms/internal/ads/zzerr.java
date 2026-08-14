package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzerr implements zzepn {
    private final JSONObject zza;

    zzerr(Context context) {
        this.zza = zzbtx.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
