package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjo {
    private final Executor zza;
    private final zzdjj zzb;

    public zzdjo(Executor executor, zzdjj zzdjjVar) {
        this.zza = executor;
        this.zzb = zzdjjVar;
    }

    public final zzfut zza(JSONObject jSONObject, String str) {
        zzfut zzfutVarZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                zzfutVarZzh = zzfuj.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    zzfutVarZzh = zzfuj.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString(TapjoyAuctionFlags.AUCTION_TYPE);
                    zzfutVarZzh = "string".equals(strOptString2) ? zzfuj.zzh(new zzdjn(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzfuj.zzl(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjl
                        @Override // com.google.android.gms.internal.ads.zzfnj
                        public final Object apply(Object obj) {
                            return new zzdjn(strOptString, (zzbdj) obj);
                        }
                    }, this.zza) : zzfuj.zzh(null);
                }
            }
            arrayList.add(zzfutVarZzh);
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdjn zzdjnVar : (List) obj) {
                    if (zzdjnVar != null) {
                        arrayList2.add(zzdjnVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
