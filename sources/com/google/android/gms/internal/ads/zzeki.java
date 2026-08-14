package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeki implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;
    private final zzbzg zzc;
    private final zzbyn zzd;

    public zzeki(zzfuu zzfuuVar, zzeyx zzeyxVar, zzbzg zzbzgVar, zzbyn zzbynVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeyxVar;
        this.zzc = zzbzgVar;
        this.zzd = zzbynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzekj zzc() throws Exception {
        return new zzekj(this.zzb.zzj, this.zzc, this.zzd.zzj());
    }
}
