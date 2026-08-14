package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzauc implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzatu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzaue zze;

    zzauc(zzaue zzaueVar, final zzatu zzatuVar, final WebView webView, final boolean z) {
        this.zze = zzaueVar;
        this.zzb = zzatuVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzaub
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzauc zzaucVar = this.zza;
                zzatu zzatuVar2 = zzatuVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzaucVar.zze.zzd(zzatuVar2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
