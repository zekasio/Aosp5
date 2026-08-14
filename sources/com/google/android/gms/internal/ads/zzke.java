package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzke implements zzjv {
    public final zzsn zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzke(zzsu zzsuVar, boolean z) {
        this.zza = new zzsn(zzsuVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final zzcn zza() {
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
