package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdpi {
    private final zzdpn zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdpi(zzdpn zzdpnVar, Executor executor) {
        this.zza = zzdpnVar;
        this.zzc = zzdpnVar.zza();
        this.zzb = executor;
    }

    public final zzdph zza() {
        zzdph zzdphVar = new zzdph(this);
        zzdph.zza(zzdphVar);
        return zzdphVar;
    }
}
