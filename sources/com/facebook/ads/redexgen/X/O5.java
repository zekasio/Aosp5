package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O5 extends WebViewClient {
    public final /* synthetic */ O6 A00;

    public O5(O6 o6) {
        this.A00 = o6;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C03298z.A2e);
        return true;
    }
}
