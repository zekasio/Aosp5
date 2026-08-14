package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdnx(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzew)).booleanValue() ? Collections.singleton(new zzdbu(((zzdoq) this.zzb).zzb(), zzfuuVar)) : Collections.emptySet();
        zzgxg.zzb(setSingleton);
        return setSingleton;
    }
}
