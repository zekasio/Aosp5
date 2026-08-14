package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfgy implements Runnable {
    zzfgy() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfhb.zzc != null) {
            zzfhb.zzc.post(zzfhb.zzd);
            zzfhb.zzc.postDelayed(zzfhb.zze, 200L);
        }
    }
}
