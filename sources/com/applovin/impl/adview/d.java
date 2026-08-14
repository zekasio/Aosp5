package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.c.i;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class d extends h {
    private static WebView c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f808a;
    private final com.applovin.impl.sdk.p b;
    private com.applovin.impl.sdk.d.d d;
    private com.applovin.impl.sdk.ad.e e;
    private boolean f;

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public d(e eVar, com.applovin.impl.sdk.p pVar, Context context) {
        super(context);
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.b = pVar;
        this.f808a = pVar.L();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(eVar != null ? eVar : new ab());
        setWebChromeClient(new c(eVar != null ? eVar.a() : null, pVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.sdk.utils.h.i() && ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
            setWebViewRenderProcessClient(new f(pVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                com.applovin.impl.sdk.y unused = d.this.f808a;
                if (!com.applovin.impl.sdk.y.a()) {
                    return true;
                }
                d.this.f808a.b("AdWebView", "Received a LongClick event.");
                return true;
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.e eVar) {
        if (!this.f) {
            this.e = eVar;
            try {
                b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                    String strB = aVar.b();
                    if (!aVar.q() && aVar.isOpenMeasurementEnabled()) {
                        strB = this.b.ag().a(strB);
                    }
                    loadDataWithBaseURL(eVar.aw(), strB, "text/html", null, "");
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f808a.b("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (eVar instanceof com.applovin.impl.c.a) {
                    com.applovin.impl.c.a aVar2 = (com.applovin.impl.c.a) eVar;
                    com.applovin.impl.c.d dVarAQ = aVar2.aQ();
                    if (dVarAQ != null) {
                        com.applovin.impl.c.i iVarB = dVarAQ.b();
                        Uri uriB = iVarB.b();
                        String string = uriB != null ? uriB.toString() : "";
                        String strC = iVarB.c();
                        String strAU = aVar2.aU();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strC)) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f808a.e("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (iVarB.a() == i.a.STATIC) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f808a.b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.b.a(com.applovin.impl.sdk.c.b.eH), string);
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && aVar2.e()) {
                                strA = this.b.ag().a(strA);
                            }
                            loadDataWithBaseURL(eVar.aw(), strA, "text/html", null, "");
                            return;
                        }
                        if (iVarB.a() == i.a.HTML) {
                            if (StringUtils.isValidString(strC)) {
                                String strA2 = a(strAU, strC);
                                if (StringUtils.isValidString(strA2)) {
                                    strC = strA2;
                                }
                                if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                    strC = this.b.ag().a(strC);
                                }
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f808a.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + strC);
                                }
                                loadDataWithBaseURL(eVar.aw(), strC, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f808a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, eVar.aw(), strAU, this.b, aVar2);
                                return;
                            }
                            return;
                        }
                        if (iVarB.a() == i.a.IFRAME) {
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f808a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(string, eVar.aw(), strAU, this.b, aVar2);
                                return;
                            }
                            if (StringUtils.isValidString(strC)) {
                                String strA3 = a(strAU, strC);
                                if (StringUtils.isValidString(strA3)) {
                                    strC = strA3;
                                }
                                if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                    strC = this.b.ag().a(strC);
                                }
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f808a.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + strC);
                                }
                                loadDataWithBaseURL(eVar.aw(), strC, "text/html", null, "");
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f808a.e("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f808a.b("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.y.i("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    private void b(com.applovin.impl.sdk.ad.e eVar) {
        Boolean boolN;
        Integer numA;
        loadUrl("about:blank");
        int iAz = this.e.az();
        if (iAz >= 0) {
            setLayerType(iAz, null);
        }
        if (com.applovin.impl.sdk.utils.h.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.av());
        }
        if (com.applovin.impl.sdk.utils.h.c() && eVar.ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        x xVarAy = eVar.ay();
        if (xVarAy != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = xVarAy.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolC = xVarAy.c();
            if (boolC != null) {
                settings.setAllowFileAccess(boolC.booleanValue());
            }
            Boolean boolD = xVarAy.d();
            if (boolD != null) {
                settings.setLoadWithOverviewMode(boolD.booleanValue());
            }
            Boolean boolE = xVarAy.e();
            if (boolE != null) {
                settings.setUseWideViewPort(boolE.booleanValue());
            }
            Boolean boolF = xVarAy.f();
            if (boolF != null) {
                settings.setAllowContentAccess(boolF.booleanValue());
            }
            Boolean boolG = xVarAy.g();
            if (boolG != null) {
                settings.setBuiltInZoomControls(boolG.booleanValue());
            }
            Boolean boolH = xVarAy.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolI = xVarAy.i();
            if (boolI != null) {
                settings.setSaveFormData(boolI.booleanValue());
            }
            Boolean boolJ = xVarAy.j();
            if (boolJ != null) {
                settings.setGeolocationEnabled(boolJ.booleanValue());
            }
            Boolean boolK = xVarAy.k();
            if (boolK != null) {
                settings.setNeedInitialFocus(boolK.booleanValue());
            }
            Boolean boolL = xVarAy.l();
            if (boolL != null) {
                settings.setAllowFileAccessFromFileURLs(boolL.booleanValue());
            }
            Boolean boolM = xVarAy.m();
            if (boolM != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolM.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.h.d() && (numA = xVarAy.a()) != null) {
                settings.setMixedContentMode(numA.intValue());
            }
            if (!com.applovin.impl.sdk.utils.h.e() || (boolN = xVarAy.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(boolN.booleanValue());
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.y.a()) {
                this.f808a.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f808a.b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        super.destroy();
    }

    com.applovin.impl.sdk.ad.e getCurrentAd() {
        return this.e;
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.p pVar, com.applovin.impl.c.a aVar) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled() && !aVar.q()) {
                strA = pVar.ag().a(strA);
            }
            String str4 = strA;
            if (com.applovin.impl.sdk.y.a()) {
                this.f808a.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        String strA2 = a((String) pVar.a(com.applovin.impl.sdk.c.b.eI), str);
        if (StringUtils.isValidString(strA2)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled()) {
                strA2 = pVar.ag().a(strA2);
            }
            String str5 = strA2;
            if (com.applovin.impl.sdk.y.a()) {
                this.f808a.b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str5);
            }
            loadDataWithBaseURL(str2, str5, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f808a.b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.l lVar, final com.applovin.impl.sdk.p pVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String strA = lVar.a();
                d.c();
                if (d.c == null) {
                    appLovinPostbackListener.onPostbackFailure(strA, -1);
                    return;
                }
                if (lVar.c() != null) {
                    strA = StringUtils.appendQueryParameters(strA, lVar.c(), ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dw)).booleanValue());
                }
                String str = "al_firePostback('" + strA + "');";
                if (com.applovin.impl.sdk.utils.h.c()) {
                    d.c.evaluateJavascript(str, null);
                } else {
                    d.c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(strA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (c != null) {
            return;
        }
        WebView webViewTryToCreateWebView = Utils.tryToCreateWebView(com.applovin.impl.sdk.p.y(), "postbacks");
        c = webViewTryToCreateWebView;
        if (webViewTryToCreateWebView == null) {
            return;
        }
        webViewTryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
        c.setWebViewClient(new WebViewClient() { // from class: com.applovin.impl.adview.d.4
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView != d.c) {
                    return true;
                }
                d.c.destroy();
                WebView unused = d.c = null;
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.c();
                    }
                });
                return true;
            }
        });
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.d;
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.d = dVar;
    }
}
