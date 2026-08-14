package com.tapjoy.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class l3 extends k3 {
    public l3(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
