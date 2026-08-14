package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzb {
    private final zzdyx zza;
    private final zzfuu zzb;

    public zzdzb(zzdyx zzdyxVar, zzfuu zzfuuVar) {
        this.zza = zzdyxVar;
        this.zzb = zzfuuVar;
    }

    public final void zza(zzfcd zzfcdVar) {
        zzfuu zzfuuVar = this.zzb;
        final zzdyx zzdyxVar = this.zza;
        zzfuj.zzq(zzfuuVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyxVar.getWritableDatabase();
            }
        }), new zzdza(this, zzfcdVar), this.zzb);
    }
}
