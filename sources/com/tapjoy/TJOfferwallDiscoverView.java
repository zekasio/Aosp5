package com.tapjoy;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TJOfferwallDiscoverView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TJWebView f1685a;
    public TJAdUnitJSBridge b;
    public TJOfferwallDiscoverListener c;
    public TapjoyHttpURLResponse d;
    public boolean e;
    public boolean f;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1686a;

        /* JADX INFO: renamed from: com.tapjoy.TJOfferwallDiscoverView$a$a, reason: collision with other inner class name */
        public class RunnableC0102a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TapjoyHttpURLResponse f1687a;
            public final /* synthetic */ String b;

            public RunnableC0102a(TapjoyHttpURLResponse tapjoyHttpURLResponse, String str) {
                this.f1687a = tapjoyHttpURLResponse;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = this.f1687a.statusCode;
                if (i != 200) {
                    TJOfferwallDiscoverListener tJOfferwallDiscoverListener = TJOfferwallDiscoverView.this.c;
                    if (tJOfferwallDiscoverListener != null) {
                        tJOfferwallDiscoverListener.requestFailure(new TJError(i, "Unknown Error"));
                    }
                    TJOfferwallDiscoverView.this.clearContent();
                    return;
                }
                TJOfferwallDiscoverListener tJOfferwallDiscoverListener2 = TJOfferwallDiscoverView.this.c;
                if (tJOfferwallDiscoverListener2 != null) {
                    tJOfferwallDiscoverListener2.requestSuccess();
                }
                TJOfferwallDiscoverView tJOfferwallDiscoverView = TJOfferwallDiscoverView.this;
                TapjoyHttpURLResponse tapjoyHttpURLResponse = this.f1687a;
                tJOfferwallDiscoverView.d = tapjoyHttpURLResponse;
                TJWebView tJWebView = tJOfferwallDiscoverView.f1685a;
                if (tJWebView != null) {
                    tJWebView.loadDataWithBaseURL(this.b, tapjoyHttpURLResponse.response, "text/html", "charset=UTF-8", null);
                } else {
                    TapjoyLog.d("TJOfferwallDiscoverView", "Webview is null");
                }
            }
        }

        public a(String str) {
            this.f1686a = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            String placementURL = TapjoyConnectCore.getPlacementURL();
            String str = placementURL + "v1/apps/" + TapjoyConnectCore.getAppID() + "/content?";
            TapjoyURLConnection tapjoyURLConnection = new TapjoyURLConnection();
            Map<String, String> genericURLParams = TapjoyConnectCore.getGenericURLParams();
            genericURLParams.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
            TapjoyUtil.safePut(genericURLParams, TJAdUnitConstants.PARAM_PLACEMENT_NAME, this.f1686a, true);
            TapjoyUtil.safePut(genericURLParams, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, "true", true);
            TapjoyUtil.safePut(genericURLParams, "offerwall_discover", "true", true);
            TapjoyUtil.runOnMainThread(new RunnableC0102a(tapjoyURLConnection.getResponseFromURL(str, (Map<String, String>) null, (Map<String, String>) null, genericURLParams), placementURL));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJOfferwallDiscoverView.this.removeAllViews();
            TJWebView tJWebView = TJOfferwallDiscoverView.this.f1685a;
            if (tJWebView != null) {
                tJWebView.loadUrl("about:blank");
                TJOfferwallDiscoverView.this.f1685a.destroy();
                TJOfferwallDiscoverView.this.b.destroy();
                TJOfferwallDiscoverView tJOfferwallDiscoverView = TJOfferwallDiscoverView.this;
                tJOfferwallDiscoverView.f1685a = null;
                tJOfferwallDiscoverView.b = null;
            }
            TJOfferwallDiscoverView.this.e = false;
            TJOfferwallDiscoverView.this.f = false;
        }
    }

    public class c extends TJJSBridgeDelegate {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TJOfferwallDiscoverView.this.c.contentReady();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TJError f1691a;

            public b(TJError tJError) {
                this.f1691a = tJError;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJOfferwallDiscoverView.this.c.contentError(this.f1691a);
            }
        }

        public /* synthetic */ c(a aVar) {
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean fireContentError(TJError tJError) {
            super.fireContentError(tJError);
            if (TJOfferwallDiscoverView.this.c == null) {
                return true;
            }
            TapjoyUtil.runOnMainThread(new b(tJError));
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean fireContentReady() {
            super.fireContentReady();
            if (TJOfferwallDiscoverView.this.c == null) {
                return true;
            }
            TapjoyUtil.runOnMainThread(new a());
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Context getContext() {
            return TJOfferwallDiscoverView.this.f1685a.getContext();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public <T> T getData(String str, Class<T> cls) {
            return str.equalsIgnoreCase(TJAdUnitConstants.String.HTML) ? (T) TJOfferwallDiscoverView.this.d.response : (T) super.getData(str, cls);
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public WebView getWebView() {
            return TJOfferwallDiscoverView.this.f1685a;
        }
    }

    public class d extends WebViewClient {
        public /* synthetic */ d(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TJOfferwallDiscoverView.this.b.flushMessageQueue();
            TJOfferwallDiscoverView tJOfferwallDiscoverView = TJOfferwallDiscoverView.this;
            if (!tJOfferwallDiscoverView.e && tJOfferwallDiscoverView.isLaidOut()) {
                TJOfferwallDiscoverView.this.b.display();
                TJOfferwallDiscoverView.this.e = true;
            }
            TJOfferwallDiscoverView.this.f = true;
        }
    }

    public TJOfferwallDiscoverView(Context context) {
        super(context);
        this.e = false;
        this.f = false;
    }

    public void clearContent() {
        TapjoyUtil.runOnMainThread(new b());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TJAdUnitJSBridge tJAdUnitJSBridge = this.b;
        if (tJAdUnitJSBridge == null || this.e || !this.f) {
            return;
        }
        tJAdUnitJSBridge.display();
        this.e = true;
    }

    public void requestContent(Context context, String str) {
        if (!TapjoyConnectCore.isConnected()) {
            TJOfferwallDiscoverListener tJOfferwallDiscoverListener = this.c;
            if (tJOfferwallDiscoverListener != null) {
                tJOfferwallDiscoverListener.requestFailure(new TJError(-1, "Tapjoy SDK is not connected"));
                return;
            }
            return;
        }
        if (context == null) {
            TJOfferwallDiscoverListener tJOfferwallDiscoverListener2 = this.c;
            if (tJOfferwallDiscoverListener2 != null) {
                tJOfferwallDiscoverListener2.requestFailure(new TJError(0, "Context is null"));
            }
            clearContent();
            return;
        }
        if (com.tapjoy.internal.a.b(str)) {
            TJOfferwallDiscoverListener tJOfferwallDiscoverListener3 = this.c;
            if (tJOfferwallDiscoverListener3 != null) {
                tJOfferwallDiscoverListener3.requestFailure(new TJError(0, "Placement is null"));
            }
            clearContent();
            return;
        }
        clearContent();
        TJWebView tJWebView = new TJWebView(context);
        this.f1685a = tJWebView;
        a aVar = null;
        tJWebView.setWebViewClient(new d(aVar));
        this.b = new TJAdUnitJSBridge(new c(aVar));
        addView(this.f1685a, -1, -1);
        new a(str).start();
    }

    public void setListener(TJOfferwallDiscoverListener tJOfferwallDiscoverListener) {
        this.c = tJOfferwallDiscoverListener;
    }

    public TJOfferwallDiscoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f = false;
    }

    public TJOfferwallDiscoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f = false;
    }

    public TJOfferwallDiscoverView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = false;
        this.f = false;
    }
}
