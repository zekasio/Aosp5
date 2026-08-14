package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzks {
    final String zza;
    long zzb;

    private zzks(zzkt zzktVar, String str) {
        this.zza = str;
        this.zzb = zzktVar.zzav().elapsedRealtime();
    }
}
