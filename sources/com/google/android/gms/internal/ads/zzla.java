package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzla {
    private final WifiManager zza;

    public zzla(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
    }
}
