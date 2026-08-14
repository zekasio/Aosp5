package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpx extends zzfpz {
    zzfpx() {
        super(null);
    }

    static final zzfpz zzf(int i) {
        return i < 0 ? zzfpz.zzb : i > 0 ? zzfpz.zzc : zzfpz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final zzfpz zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final zzfpz zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final zzfpz zzd(boolean z, boolean z2) {
        return zzf(zzfsq.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final zzfpz zze(boolean z, boolean z2) {
        return zzf(zzfsq.zza(false, false));
    }
}
