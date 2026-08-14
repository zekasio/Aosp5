package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxi {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgxi(int i, int i2, zzgxh zzgxhVar) {
        this.zza = zzgwv.zzc(i);
        this.zzb = zzgwv.zzc(i2);
    }

    public final zzgxi zza(zzgxl zzgxlVar) {
        this.zzb.add(zzgxlVar);
        return this;
    }

    public final zzgxi zzb(zzgxl zzgxlVar) {
        this.zza.add(zzgxlVar);
        return this;
    }

    public final zzgxj zzc() {
        return new zzgxj(this.zza, this.zzb, null);
    }
}
