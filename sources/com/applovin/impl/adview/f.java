package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f815a;
    private final WebViewRenderProcessClient b = new WebViewRenderProcessClient() { // from class: com.applovin.impl.adview.f.1
        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                com.applovin.impl.sdk.ad.e currentAd = ((d) webView).getCurrentAd();
                f.this.f815a.X().a(currentAd).a(com.applovin.impl.sdk.d.b.C).a();
                f.this.f815a.L();
                if (com.applovin.impl.sdk.y.a()) {
                    f.this.f815a.L().e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    f(com.applovin.impl.sdk.p pVar) {
        this.f815a = pVar;
    }

    WebViewRenderProcessClient a() {
        return this.b;
    }
}
