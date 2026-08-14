package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgl implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbza.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzbza.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzceiVar.zzm().zzc(str2, str3, jElapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                zzbza.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbza.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzceiVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbza.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbza.zzj("No name given for CSI extra.");
            } else {
                zzceiVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
