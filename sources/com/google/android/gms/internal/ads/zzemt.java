package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemt implements zzepn {
    private final zzfuu zza;
    private final zzdsf zzb;

    zzemt(zzfuu zzfuuVar, zzdsf zzdsfVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzems
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzemu zzc() throws Exception {
        return new zzemu(this.zzb.zzc(), this.zzb.zzp(), com.google.android.gms.ads.internal.zzt.zzs().zzl(), this.zzb.zzn());
    }
}
