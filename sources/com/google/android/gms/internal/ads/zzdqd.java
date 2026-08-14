package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqd implements zzgwy {
    private final zzdpv zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdqd(zzdpv zzdpvVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdpvVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqf zzdqfVar = (zzdqf) this.zzb.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set setZzh = zzdpv.zzh(zzdqfVar, zzfuuVar);
        zzgxg.zzb(setZzh);
        return setZzh;
    }
}
