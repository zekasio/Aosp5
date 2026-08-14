package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenb implements zzepn {
    private final zzfuu zza;
    private final zzeyb zzb;

    public zzenb(zzfuu zzfuuVar, zzeyb zzeybVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzenc zzc() throws Exception {
        return new zzenc(this.zzb);
    }
}
