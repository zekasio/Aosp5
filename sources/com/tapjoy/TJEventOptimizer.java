package com.tapjoy;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.w1;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class TJEventOptimizer extends WebView {
    public static TJEventOptimizer b;
    public static CountDownLatch c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1678a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1679a;

        public a(Context context) {
            this.f1679a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TJEventOptimizer.b = new TJEventOptimizer(this.f1679a, null);
            } catch (Exception e) {
                TapjoyLog.w("TJEventOptimizer", e.getMessage());
            }
            TJEventOptimizer.c.countDown();
        }
    }

    public class b extends TJJSBridgeDelegate {
        public /* synthetic */ b(a aVar) {
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Context getContext() {
            return TJEventOptimizer.this.f1678a;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public WebView getWebView() {
            return TJEventOptimizer.this;
        }
    }

    public class c extends WebChromeClient {
        public /* synthetic */ c(TJEventOptimizer tJEventOptimizer, a aVar) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            StringBuilder sbA = w1.a("JS CONSOLE: ");
            sbA.append(consoleMessage.message());
            sbA.append(" -- From line ");
            sbA.append(consoleMessage.lineNumber());
            sbA.append(" of ");
            sbA.append(consoleMessage.sourceId());
            TapjoyLog.d("TJEventOptimizer", sbA.toString());
            return true;
        }
    }

    public class d extends WebViewClient {
        public /* synthetic */ d(TJEventOptimizer tJEventOptimizer, a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            TapjoyLog.d("TJEventOptimizer", "boostrap html loaded successfully");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TapjoyLog.e("TJEventOptimizer", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating a WebViewClient"));
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            TJEventOptimizer tJEventOptimizer = TJEventOptimizer.b;
            if (tJEventOptimizer != null) {
                ViewGroup viewGroup = (ViewGroup) tJEventOptimizer.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJEventOptimizer.b);
                }
                TJEventOptimizer.b.destroy();
                TJEventOptimizer.b = null;
            }
            TapjoyLog.e("TJEventOptimizer", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            return true;
        }
    }

    public /* synthetic */ TJEventOptimizer(Context context, a aVar) {
        super(context);
        this.f1678a = context;
        a aVar2 = null;
        new TJAdUnitJSBridge(new b(aVar2));
        try {
            getSettings().setJavaScriptEnabled(true);
            setWebViewClient(new d(this, aVar2));
            setWebChromeClient(new c(this, aVar2));
            loadUrl(TapjoyConnectCore.getHostURL() + TJAdUnitConstants.EVENTS_PROXY_PATH + TapjoyUtil.convertURLParams(TapjoyConnectCore.getGenericURLParams(), true));
        } catch (Exception e) {
            TapjoyLog.w("TJEventOptimizer", e.getMessage());
        }
    }

    public static TJEventOptimizer getInstance() {
        return b;
    }

    public static void init(Context context) {
        TapjoyLog.d("TJEventOptimizer", "Initializing event optimizer");
        c = new CountDownLatch(1);
        TapjoyUtil.runOnMainThread(new a(context));
        c.await();
        if (b == null) {
            throw new RuntimeException("Failed to init TJEventOptimizer");
        }
    }
}
