package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajz implements Runnable {
    final /* synthetic */ zzako zza;
    final /* synthetic */ zzaka zzb;

    zzajz(zzaka zzakaVar, zzako zzakoVar) {
        this.zzb = zzakaVar;
        this.zza = zzakoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
