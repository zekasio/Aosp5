package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkt implements zzjq {
    private final zzdm zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzby zze = zzby.zza;

    public zzkt(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final long zza() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzby zzbyVar = this.zze;
        return j + (zzbyVar.zzc == 1.0f ? zzew.zzv(jElapsedRealtime) : zzbyVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final zzby zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final void zzg(zzby zzbyVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzbyVar;
    }
}
