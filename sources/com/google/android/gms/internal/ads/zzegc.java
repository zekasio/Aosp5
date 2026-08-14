package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegc implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcum zzb;
    private final zzcvg zzc;
    private final zzdce zzd;
    private final zzdbw zze;
    private final zzcng zzf;

    zzegc(zzcum zzcumVar, zzcvg zzcvgVar, zzdce zzdceVar, zzdbw zzdbwVar, zzcng zzcngVar) {
        this.zzb = zzcumVar;
        this.zzc = zzcvgVar;
        this.zzd = zzdceVar;
        this.zze = zzdbwVar;
        this.zzf = zzcngVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
