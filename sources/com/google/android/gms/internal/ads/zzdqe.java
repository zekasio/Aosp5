package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqe implements zzgwy {
    private final zzdpv zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdqe(zzdpv zzdpvVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzdpvVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqf zzdqfVar = (zzdqf) this.zzb.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set setZzi = zzdpv.zzi(zzdqfVar, zzfuuVar);
        zzgxg.zzb(setZzi);
        return setZzi;
    }
}
