package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddp implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;

    public zzddp(zzdcz zzdczVar, zzgxl zzgxlVar) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
