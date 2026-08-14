package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavi implements Runnable {
    final /* synthetic */ zzavm zza;

    zzavi(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavm.zzh(this.zza);
    }
}
