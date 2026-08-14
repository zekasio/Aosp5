package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfka implements Closeable {
    public static zzfkm zza() {
        return new zzfkm();
    }

    public static zzfkm zzb(final int i, zzfkl zzfklVar) {
        return new zzfkm(new zzfok() { // from class: com.google.android.gms.internal.ads.zzfjy
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfok() { // from class: com.google.android.gms.internal.ads.zzfjz
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzfka.zze();
            }
        }, zzfklVar);
    }

    public static zzfkm zzc(zzfok<Integer> zzfokVar, zzfok<Integer> zzfokVar2, zzfkl zzfklVar) {
        return new zzfkm(zzfokVar, zzfokVar2, zzfklVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
