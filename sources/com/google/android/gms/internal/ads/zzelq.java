package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelq implements zzepn {
    private final zzfuu zza;
    private final zzdni zzb;
    private final String zzc;
    private final zzeyx zzd;

    public zzelq(zzfuu zzfuuVar, zzdni zzdniVar, zzeyx zzeyxVar, String str) {
        this.zza = zzfuuVar;
        this.zzb = zzdniVar;
        this.zzd = zzeyxVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzelr zzc() throws Exception {
        return new zzelr(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
