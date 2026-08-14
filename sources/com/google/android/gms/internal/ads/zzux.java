package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzux {
    private final zzdm zza = zzdm.zza;

    protected final zzuy zza(zzcp zzcpVar, int[] iArr, int i, zzws zzwsVar, zzfqk zzfqkVar) {
        return new zzuy(zzcpVar, iArr, 0, zzwsVar, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, zzfqkVar, this.zza);
    }
}
