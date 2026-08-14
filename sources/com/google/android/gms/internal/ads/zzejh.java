package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejh implements zzepn {
    private final Clock zza;
    private final zzeyx zzb;

    zzejh(Clock clock, zzeyx zzeyxVar) {
        this.zza = clock;
        this.zzb = zzeyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzh(new zzeji(this.zzb, this.zza.currentTimeMillis()));
    }
}
