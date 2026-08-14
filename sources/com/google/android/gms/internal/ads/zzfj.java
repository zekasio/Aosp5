package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzfj zza(int i) {
        this.zzd = 6;
        return this;
    }

    public final zzfj zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzfj zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzfj zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzfl zze() {
        if (this.zza != null) {
            return new zzfl(this.zza, this.zzb, this.zzc, this.zzd);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
