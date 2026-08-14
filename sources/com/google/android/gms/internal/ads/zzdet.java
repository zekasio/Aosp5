package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdet implements zzgwy {
    private final zzgxl zza;

    public zzdet(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdeq) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgxg.zzb(setSingleton);
        return setSingleton;
    }
}
