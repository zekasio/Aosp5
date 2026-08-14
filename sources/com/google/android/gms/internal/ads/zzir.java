package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzir {
    public static zzno zza(Context context, zzjc zzjcVar, boolean z) {
        zznk zznkVarZzb = zznk.zzb(context);
        if (zznkVarZzb == null) {
            zzee.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzno(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzjcVar.zzC(zznkVarZzb);
        }
        return new zzno(zznkVarZzb.zza());
    }
}
