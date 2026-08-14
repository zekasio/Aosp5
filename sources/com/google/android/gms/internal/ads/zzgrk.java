package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgrk {
    private static final zzgrk zza = new zzgrg(null);
    private static final zzgrk zzb = new zzgri(0 == true ? 1 : 0);

    /* synthetic */ zzgrk(zzgrj zzgrjVar) {
    }

    static zzgrk zzd() {
        return zza;
    }

    static zzgrk zze() {
        return zzb;
    }

    abstract List zza(Object obj, long j);

    abstract void zzb(Object obj, long j);

    abstract void zzc(Object obj, Object obj2, long j);
}
