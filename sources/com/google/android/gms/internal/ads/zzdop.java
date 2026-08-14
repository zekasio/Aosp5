package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdop implements zzfdb {
    private final Map zza;
    private final zzawe zzb;

    zzdop(zzawe zzaweVar, Map map) {
        this.zza = map;
        this.zzb = zzaweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbB(zzfcu zzfcuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbC(zzfcu zzfcuVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfcuVar)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcuVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzc(zzfcu zzfcuVar, String str) {
        if (this.zza.containsKey(zzfcuVar)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcuVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzd(zzfcu zzfcuVar, String str) {
        if (this.zza.containsKey(zzfcuVar)) {
            this.zzb.zzc(((zzdoo) this.zza.get(zzfcuVar)).zzb);
        }
    }
}
