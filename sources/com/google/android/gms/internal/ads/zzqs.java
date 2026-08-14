package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqs {
    public final zzqx zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqs(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzqxVar;
        this.zzb = mediaFormat;
        this.zzc = zzafVar;
        this.zzd = surface;
    }

    public static zzqs zza(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, MediaCrypto mediaCrypto) {
        return new zzqs(zzqxVar, mediaFormat, zzafVar, null, null, 0);
    }

    public static zzqs zzb(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqs(zzqxVar, mediaFormat, zzafVar, surface, null, 0);
    }
}
