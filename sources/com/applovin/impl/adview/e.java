package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes.dex */
public class e extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f813a;
    private final com.applovin.impl.sdk.y b;
    private final b c;

    public e(b bVar, com.applovin.impl.sdk.p pVar) {
        this.f813a = pVar;
        this.b = pVar.L();
        this.c = bVar;
    }

    protected b a() {
        return this.c;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.y.a()) {
            return false;
        }
        this.b.e("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.y.a()) {
            this.b.c("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        b bVar = this.c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (eVarP != null) {
                this.f813a.X().a(eVarP).a(com.applovin.impl.sdk.d.b.y, str3).a();
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.b.e("AdWebView", str3 + " for ad: " + eVarP);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            this.f813a.X().a(eVarP).a(com.applovin.impl.sdk.d.b.z).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.b.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + eVarP);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.f813a.X().a(eVarP).a(com.applovin.impl.sdk.d.b.B, str).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.b.e("AdWebView", str + " for ad: " + eVarP);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.c == null) {
            return true;
        }
        com.applovin.impl.sdk.y.i("AdWebView", "Render process gone for ad: " + this.c.p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.e eVarP = this.c.p();
        if (eVarP != null) {
            this.f813a.X().a(eVarP).a(com.applovin.impl.sdk.d.b.A).a();
        }
        if (((Boolean) this.f813a.a(com.applovin.impl.sdk.c.b.fr)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f813a.a(com.applovin.impl.sdk.c.b.fu)).booleanValue()) {
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (eVarP != null ? String.valueOf(eVarP.getAdIdNumber()) : "null"));
            }
            if (webView != null && webView.equals(this.c.s())) {
                this.c.f();
                AppLovinAdSize appLovinAdSizeB = this.c.b();
                if (Utils.isBML(appLovinAdSizeB)) {
                    this.c.a(appLovinAdSizeB);
                    this.c.e();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(android.webkit.WebView r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.e.a(android.webkit.WebView, java.lang.String):boolean");
    }

    private void b() {
        this.c.l();
    }

    private void a(PointF pointF) {
        this.c.a(pointF);
    }

    private void c() {
        this.c.k();
    }

    private void a(Uri uri, d dVar) {
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.b.b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f813a);
                com.applovin.impl.sdk.utils.k.c(this.c.g(), this.c.p(), this.c.r());
                return;
            }
            if (TapjoyConstants.LOG_LEVEL_INTERNAL.equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.b.b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            }
            if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.b.b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f813a.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.e.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                            com.applovin.impl.sdk.utils.k.a(e.this.c.g(), e.this.c.p(), e.this.c.r());
                        }
                    }

                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            com.applovin.impl.sdk.utils.k.b(e.this.c.g(), e.this.c.p(), e.this.c.r());
                            e.this.f813a.w().b(this);
                        }
                    }
                });
                Intent intent = new Intent(com.applovin.impl.sdk.p.y(), (Class<?>) AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f813a.B());
                intent.setFlags(DriveFile.MODE_READ_ONLY);
                com.applovin.impl.sdk.p.y().startActivity(intent);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.b.e("AdWebView", "Could not find load type in original uri");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.b.e("AdWebView", "Could not find url to load from query in original uri");
        }
    }

    private void a(com.applovin.impl.c.a aVar, d dVar) {
        a(aVar, dVar, false);
    }

    private void a(com.applovin.impl.c.a aVar, d dVar, boolean z) {
        com.applovin.impl.c.d dVarAQ = aVar.aQ();
        if (dVarAQ != null) {
            com.applovin.impl.c.m.a(dVarAQ.c(), this.c.q());
            a(dVar, dVarAQ.a(), z);
        }
    }

    private void a(d dVar, Uri uri) {
        a(dVar, uri, false);
    }

    private void a(d dVar, Uri uri, boolean z) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView appLovinAdViewR = this.c.r();
        if (appLovinAdViewR != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            if (currentAd instanceof com.applovin.impl.c.a) {
                ((com.applovin.impl.c.a) currentAd).o().o();
            }
            this.c.a(currentAd, appLovinAdViewR, uri, dVar.getAndClearLastClickLocation(), z);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.b.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            this.f813a.al().a(com.applovin.impl.sdk.network.j.o().c(StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode())).a(false).d(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
        } else if (com.applovin.impl.sdk.y.a()) {
            this.b.e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }
}
