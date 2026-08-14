package com.applovin.impl.sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ae extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1235a;
    private final y b;
    private WebView c;
    private final Set<WebView> d = Collections.synchronizedSet(new HashSet());

    public ae(p pVar) {
        this.f1235a = pVar;
        this.b = pVar.L();
    }

    public void a(final com.applovin.impl.sdk.network.l lVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.1
            @Override // java.lang.Runnable
            public void run() {
                String strAppendQueryParameters = StringUtils.appendQueryParameters(lVar.a(), lVar.c(), ((Boolean) ae.this.f1235a.a(com.applovin.impl.sdk.c.b.dw)).booleanValue());
                if (ae.this.c == null) {
                    ae aeVar = ae.this;
                    aeVar.c = aeVar.b("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
                    if (ae.this.c == null) {
                        y unused = ae.this.b;
                        if (y.a()) {
                            ae.this.b.e("WebTrackerManager", "Failed to fire postback since web view could not be created");
                        }
                        appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                        return;
                    }
                }
                String str = "al_firePostback('" + strAppendQueryParameters + "')";
                if (com.applovin.impl.sdk.utils.h.c()) {
                    ae.this.c.evaluateJavascript(str, null);
                } else {
                    ae.this.c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
            }
        });
    }

    public void a(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (y.a()) {
                this.b.e("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (y.a()) {
                    this.b.e("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    final WebView webViewB = ae.this.b(str);
                    if (webViewB == null) {
                        y unused = ae.this.b;
                        if (y.a()) {
                            ae.this.b.e("WebTrackerManager", "Failed to fire tracker since web view could not be created");
                            return;
                        }
                        return;
                    }
                    ae.this.d.add(webViewB);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.ae.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ae.this.a(webViewB);
                        }
                    }, ((Integer) ae.this.f1235a.a(com.applovin.impl.sdk.c.b.db)).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView b(String str) {
        Utils.assertMainThread();
        WebView webViewTryToCreateWebView = Utils.tryToCreateWebView(p.y(), "web tracker");
        if (webViewTryToCreateWebView == null) {
            return null;
        }
        webViewTryToCreateWebView.getSettings().setJavaScriptEnabled(true);
        webViewTryToCreateWebView.setWebViewClient(this);
        webViewTryToCreateWebView.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewTryToCreateWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final WebView webView) {
        if (webView == null || !this.d.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.3
            @Override // java.lang.Runnable
            public void run() {
                webView.destroy();
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.c) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.4
                @Override // java.lang.Runnable
                public void run() {
                    ae.this.c.destroy();
                    ae.this.c = null;
                }
            });
            return true;
        }
        a(webView);
        return true;
    }
}
