package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelk implements zzepn {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzepn zzc;
    private final long zzd;

    public zzelk(zzepn zzepnVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzepnVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        zzelj zzeljVar = (zzelj) this.zza.get();
        if (zzeljVar == null || zzeljVar.zza()) {
            zzeljVar = new zzelj(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeljVar);
        }
        return zzeljVar.zza;
    }
}
