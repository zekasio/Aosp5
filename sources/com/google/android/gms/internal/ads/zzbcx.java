package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcx {
    public static final zzbbw zza = zzbbw.zzb("gads:ad_loader:timeout_ms", 60000);
    public static final zzbbw zzb = zzbbw.zzb("gads:rendering:timeout_ms", 60000);
    public static final zzbbw zzc = zzbbw.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
}
