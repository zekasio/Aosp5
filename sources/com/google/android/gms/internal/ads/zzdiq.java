package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdiq implements zzgwy {
    private final zzdij zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdiq(zzdij zzdijVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdijVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbu(((zzdlq) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
