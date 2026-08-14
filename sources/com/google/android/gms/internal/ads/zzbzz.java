package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzbzz {
    private final zzbzs zza;
    private final AtomicInteger zzb;

    public zzbzz() {
        zzbzs zzbzsVar = new zzbzs();
        this.zza = zzbzsVar;
        this.zzb = new AtomicInteger(0);
        zzfuj.zzq(zzbzsVar, new zzbzx(this), zzbzn.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zze(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzd(obj);
    }

    @Deprecated
    public final void zzi(zzbzw zzbzwVar, zzbzu zzbzuVar) {
        zzfuj.zzq(this.zza, new zzbzy(this, zzbzwVar, zzbzuVar), zzbzn.zzf);
    }
}
