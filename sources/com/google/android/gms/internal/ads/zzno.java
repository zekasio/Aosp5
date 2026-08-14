package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzno {
    public static final zzno zza;
    private final zznn zzb;

    static {
        zza = zzew.zza < 31 ? new zzno() : new zzno(zznn.zza);
    }

    public zzno() {
        this.zzb = null;
        zzdl.zzf(zzew.zza < 31);
    }

    private zzno(zznn zznnVar) {
        this.zzb = zznnVar;
    }

    public final LogSessionId zza() {
        zznn zznnVar = this.zzb;
        zznnVar.getClass();
        return zznnVar.zzb;
    }

    public zzno(LogSessionId logSessionId) {
        this.zzb = new zznn(logSessionId);
    }
}
