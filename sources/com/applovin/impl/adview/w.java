package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.sdk.ab;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class w extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f845a;
    private WeakReference<a> b;

    public interface a {
        void a(v vVar);

        void b(v vVar);

        void c(v vVar);

        void d(v vVar);
    }

    public w(com.applovin.impl.sdk.p pVar) {
        this.f845a = pVar.L();
    }

    public void a(WeakReference<a> weakReference) {
        this.b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f845a.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof v)) {
            return;
        }
        v vVar = (v) webView;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        a aVar = this.b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(vVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.b(vVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.c(vVar);
                return;
            }
            if ("/install".equals(path)) {
                aVar.d(vVar);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f845a.d("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f845a.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
