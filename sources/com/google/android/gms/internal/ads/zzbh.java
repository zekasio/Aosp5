package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbh {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        return zzb;
    }

    public static synchronized void zzb(String str) {
        if (zza.add(str)) {
            zzb = zzb + ", " + str;
        }
    }
}
