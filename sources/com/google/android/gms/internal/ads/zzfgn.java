package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfgn implements Runnable {
    final /* synthetic */ zzfgo zza;
    private final WebView zzb;

    zzfgn(zzfgo zzfgoVar) {
        this.zza = zzfgoVar;
        this.zzb = zzfgoVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
