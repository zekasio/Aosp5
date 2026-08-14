package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzeso implements zzepn {
    public static final /* synthetic */ zzeso zza = new zzeso();

    private /* synthetic */ zzeso() {
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
