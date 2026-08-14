package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhe implements zzbhp {
    zzbhe() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfnb.zzc("true", str) && !zzfnb.zzc(TJAdUnitConstants.String.FALSE, str)) {
                return;
            }
            zzfkw.zzi(zzceiVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
