package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeml implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;

    zzeml(zzfuu zzfuuVar, zzeyx zzeyxVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzemm zzc() throws Exception {
        return new zzemm("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
