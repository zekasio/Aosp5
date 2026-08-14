package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzery implements zzepn {
    final zzfuu zza;
    final List zzb;
    final zzbac zzc;

    public zzery(zzbac zzbacVar, zzfuu zzfuuVar, List list, byte[] bArr) {
        this.zzc = zzbacVar;
        this.zza = zzfuuVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzerz(this.zza.zzb);
            }
        });
    }
}
