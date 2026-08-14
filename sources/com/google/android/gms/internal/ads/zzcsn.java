package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsn implements zzgwy {
    private final zzcsm zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcsn(zzcsm zzcsmVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzcsmVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbwb) this.zzc.zzb(), null);
    }
}
