package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbct {
    public static final zzbbw zza = zzbbw.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbbw zzb = zzbbw.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbbw zzc = zzbbw.zzc("gads:public_beta:traffic_multiplier", "1.0");
    public static final zzbbw zzd = zzbbw.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzbbw zze = zzbbw.zzd("gads:sdk_crash_report_enabled", false);
    public static final zzbbw zzf = zzbbw.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbbw zzg = zzbbw.zza("gads:trapped_exception_sample_rate", 0.01d);
}
