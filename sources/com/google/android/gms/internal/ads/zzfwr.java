package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwq zza(String str) throws GeneralSecurityException {
        for (zzfwq zzfwqVar : zza) {
            if (zzfwqVar.zza()) {
                return zzfwqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
