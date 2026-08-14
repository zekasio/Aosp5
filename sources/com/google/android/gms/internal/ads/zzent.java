package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzent implements zzepn {
    private final zzepn zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzent(zzepn zzepnVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzepnVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        zzfut zzfutVarZzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzfutVarZzb = zzfuj.zzn(zzfutVarZzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfuj.zzf(zzfutVarZzb, Throwable.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzens
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(null);
            }
        }, zzbzn.zzf);
    }
}
