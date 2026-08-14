package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzffn {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    JAVASCRIPT("javascript");

    private final String zze;

    zzffn(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
