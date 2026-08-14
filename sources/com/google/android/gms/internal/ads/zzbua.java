package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbua extends zzbuc {
    private final String zza;
    private final int zzb;

    public zzbua(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbua)) {
            zzbua zzbuaVar = (zzbua) obj;
            if (Objects.equal(this.zza, zzbuaVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbuaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final String zzc() {
        return this.zza;
    }
}
