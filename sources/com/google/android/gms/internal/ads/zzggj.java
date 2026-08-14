package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggj {
    private HashMap zza = new HashMap();

    public final zzggl zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzggl zzgglVar = new zzggl(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgglVar;
    }
}
