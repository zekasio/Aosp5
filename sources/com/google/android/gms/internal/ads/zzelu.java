package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelu implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelu(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelk(((zzepv) this.zza).zzb(), ((Long) zzbca.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
