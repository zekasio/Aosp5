package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfk extends zzcfl {
    public zzcfk(zzcei zzceiVar, zzawe zzaweVar, boolean z) {
        super(zzceiVar, zzaweVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcep, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
