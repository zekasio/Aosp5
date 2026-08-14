package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbd {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzB)).longValue());
    private boolean zzc = true;

    zzcbd() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final zzcao zzcaoVar) {
        if (zzcaoVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcaoVar.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
