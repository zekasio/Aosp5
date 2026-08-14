package com.google.android.gms.measurement.internal;

import com.vungle.warren.AdLoader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjy {
    final /* synthetic */ zzkc zza;
    private zzjx zzb;

    zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    final void zza(long j) {
        this.zzb = new zzjx(this, this.zza.zzt.zzav().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, AdLoader.RETRY_DELAY);
    }

    final void zzb() {
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            this.zza.zzd.removeCallbacks(zzjxVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
