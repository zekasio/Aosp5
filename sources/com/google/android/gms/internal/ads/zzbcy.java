package com.google.android.gms.internal.ads;

import com.vungle.warren.AdLoader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcy {
    public static final zzbbw zza = zzbbw.zzd("gads:always_collect_trustless_token_at_native_side", false);
    public static final zzbbw zzb = zzbbw.zzd("gms:expose_token_for_gma:enabled", true);
    public static final zzbbw zzc = zzbbw.zzb("gads:timeout_for_trustless_token:millis", AdLoader.RETRY_DELAY);
    public static final zzbbw zzd = zzbbw.zzb("gads:cached_token:ttl_millis", 10800000);
}
