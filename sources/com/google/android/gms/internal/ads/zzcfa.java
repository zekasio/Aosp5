package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfa implements Runnable {
    final /* synthetic */ zzcfb zza;

    zzcfa(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
