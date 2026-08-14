package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbgw implements zzbhp {
    zzbgw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcei zzceiVar = (zzcei) obj;
        zzbdk zzbdkVarZzK = zzceiVar.zzK();
        if (zzbdkVarZzK == null || (jSONObjectZza = zzbdkVarZzK.zza()) == null) {
            zzceiVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzceiVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
