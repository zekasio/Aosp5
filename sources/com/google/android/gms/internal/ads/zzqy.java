package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqy {
    public static void zza(zzqs zzqsVar, zzno zznoVar) {
        LogSessionId logSessionIdZza = zznoVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqsVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
