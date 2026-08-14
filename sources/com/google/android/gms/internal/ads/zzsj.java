package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsj {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzfl zza;
    public final Uri zzb;
    public final Map zzc;

    public zzsj(long j, zzfl zzflVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzflVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
