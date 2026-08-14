package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwf implements zzgwy {
    private final zzgxl zza;

    public zzcwf(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    public static zzcwe zzc(Set set) {
        return new zzcwe(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwe zzb() {
        return new zzcwe(((zzgxj) this.zza).zzb());
    }
}
