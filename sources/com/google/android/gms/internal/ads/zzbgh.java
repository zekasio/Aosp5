package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgh implements zzbhp {
    private final zzbgi zza;

    public zzbgh(zzbgi zzbgiVar) {
        this.zza = zzbgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzbza.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZza = null;
        if (map.containsKey(TJAdUnitConstants.String.VIDEO_INFO)) {
            try {
                bundleZza = com.google.android.gms.ads.internal.util.zzbu.zza(new JSONObject((String) map.get(TJAdUnitConstants.String.VIDEO_INFO)));
            } catch (JSONException e) {
                zzbza.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZza == null) {
            zzbza.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundleZza);
        }
    }
}
