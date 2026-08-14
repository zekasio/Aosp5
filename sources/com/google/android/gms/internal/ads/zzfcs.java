package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfcs {
    private static final zzfut zza = zzfuj.zzh(null);
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final zzfct zzd;

    public zzfcs(zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, zzfct zzfctVar) {
        this.zzb = zzfuuVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfctVar;
    }

    public final zzfci zza(Object obj, zzfut... zzfutVarArr) {
        return new zzfci(this, obj, Arrays.asList(zzfutVarArr), null);
    }

    public final zzfcr zzb(Object obj, zzfut zzfutVar) {
        return new zzfcr(this, obj, zzfutVar, Collections.singletonList(zzfutVar), zzfutVar);
    }

    protected abstract String zzf(Object obj);
}
