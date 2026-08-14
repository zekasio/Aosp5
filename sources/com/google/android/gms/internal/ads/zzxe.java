package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxe implements Runnable {
    private final zzxd zza;

    public zzxe(zzxd zzxdVar) {
        this.zza = zzxdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK();
    }
}
