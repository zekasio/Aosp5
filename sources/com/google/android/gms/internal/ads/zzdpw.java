package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpw implements zzgwy {
    private final zzdpv zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdpw(zzdpv zzdpvVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdpvVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqf zzdqfVar = (zzdqf) this.zzb.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set setZza = zzdpv.zza(zzdqfVar, zzfuuVar);
        zzgxg.zzb(setZza);
        return setZza;
    }
}
