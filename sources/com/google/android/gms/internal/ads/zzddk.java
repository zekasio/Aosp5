package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddk implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;

    public zzddk(zzdcz zzdczVar, zzgxl zzgxlVar) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.zza.zzf((zzctm) this.zzb.zzb());
        zzgxg.zzb(setZzf);
        return setZzf;
    }
}
