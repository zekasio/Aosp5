package com.tapjoy.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class z2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f1957a;
    public final /* synthetic */ String b;

    public z2(a3 a3Var, WebView webView, String str) {
        this.f1957a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1957a.loadUrl(this.b);
    }
}
