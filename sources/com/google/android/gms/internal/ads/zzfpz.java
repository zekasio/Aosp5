package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpz {
    private static final zzfpz zza = new zzfpx();
    private static final zzfpz zzb = new zzfpy(-1);
    private static final zzfpz zzc = new zzfpy(1);

    /* synthetic */ zzfpz(zzfpx zzfpxVar) {
    }

    public static zzfpz zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfpz zzb(int i, int i2);

    public abstract zzfpz zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfpz zzd(boolean z, boolean z2);

    public abstract zzfpz zze(boolean z, boolean z2);
}
