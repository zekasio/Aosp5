package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzduf;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzgwy;
import com.google.android.gms.internal.ads.zzgxg;
import com.google.android.gms.internal.ads.zzgxl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzan implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzan(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzam zzb() {
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzam(zzfuuVar, ((zzduf) this.zzb).zzb());
    }
}
