package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhn implements zzbhp {
    zzbhn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (map.keySet().contains(TJAdUnitConstants.String.VIDEO_START)) {
            zzceiVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzceiVar.zzas(false);
        }
    }
}
