package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbgx implements zzbhp {
    zzbgx() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcei zzceiVar = (zzcei) obj;
        zzbdk zzbdkVarZzK = zzceiVar.zzK();
        if (zzbdkVarZzK == null || (jSONObjectZzb = zzbdkVarZzK.zzb()) == null) {
            zzceiVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzceiVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
