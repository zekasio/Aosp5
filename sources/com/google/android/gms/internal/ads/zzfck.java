package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfck {
    public static final zzfcr zza(Callable callable, Object obj, zzfcs zzfcsVar) {
        return zzb(callable, zzfcsVar.zzb, obj, zzfcsVar);
    }

    public static final zzfcr zzb(Callable callable, zzfuu zzfuuVar, Object obj, zzfcs zzfcsVar) {
        return new zzfcr(zzfcsVar, obj, zzfcs.zza, Collections.emptyList(), zzfuuVar.zzb(callable));
    }

    public static final zzfcr zzc(zzfut zzfutVar, Object obj, zzfcs zzfcsVar) {
        return new zzfcr(zzfcsVar, obj, zzfcs.zza, Collections.emptyList(), zzfutVar);
    }

    public static final zzfcr zzd(final zzfce zzfceVar, zzfuu zzfuuVar, Object obj, zzfcs zzfcsVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzfceVar.zza();
                return null;
            }
        }, zzfuuVar, obj, zzfcsVar);
    }
}
