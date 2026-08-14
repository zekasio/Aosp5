package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfnt {
    private static final Logger zza = Logger.getLogger(zzfnt.class.getName());
    private static final zzfns zzb = new zzfns(null);

    private zzfnt() {
    }

    static String zza(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    static boolean zzb(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
