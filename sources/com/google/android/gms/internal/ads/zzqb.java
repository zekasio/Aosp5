package com.google.android.gms.internal.ads;

import com.vungle.warren.utility.platform.Platform;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqb {
    public static final boolean zza;

    static {
        boolean z = false;
        if (Platform.MANUFACTURER_AMAZON.equals(zzew.zzc) && ("AFTM".equals(zzew.zzd) || "AFTB".equals(zzew.zzd))) {
            z = true;
        }
        zza = z;
    }
}
