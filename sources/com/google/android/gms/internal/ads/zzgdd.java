package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdd {
    private static final zzgdd zza = new zzgdd();
    private static final zzgdc zzb = new zzgdc(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgdd zza() {
        return zza;
    }

    public final zzggn zzb() {
        zzggn zzggnVar = (zzggn) this.zzc.get();
        return zzggnVar == null ? zzb : zzggnVar;
    }
}
