package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhl implements zzbhp {
    zzbhl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzceiVar.zzbj();
        } else if ("resume".equals(str)) {
            zzceiVar.zzbk();
        }
    }
}
