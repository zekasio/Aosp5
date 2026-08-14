package com.google.android.gms.internal.ads;

import android.system.OsConstants;
import com.applovin.impl.sdk.l$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfu {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Throwable th) {
        return l$$ExternalSyntheticApiModelOutline0.m278m((Object) th) && l$$ExternalSyntheticApiModelOutline0.m269m((Object) th).errno == OsConstants.EACCES;
    }
}
