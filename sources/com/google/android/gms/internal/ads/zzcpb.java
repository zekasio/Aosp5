package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpb implements zzgwy {
    private final zzcor zza;
    private final zzgxl zzb;

    public zzcpb(zzcor zzcorVar, zzgxl zzgxlVar) {
        this.zza = zzcorVar;
        this.zzb = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdbu((zzcqb) this.zzb.zzb(), zzbzn.zzf));
        zzgxg.zzb(setSingleton);
        return setSingleton;
    }
}
