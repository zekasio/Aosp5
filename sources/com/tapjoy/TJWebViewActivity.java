package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.w1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TJWebViewActivity extends TJActivity {
    public TJWebView f;
    public TJWebView g;
    public TJAdUnitJSBridge h;
    public boolean i;
    public int j = -1;

    public class BridgeDelegate extends TJJSBridgeDelegate {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f1708a;
            public final /* synthetic */ TJTaskHandler b;

            public a(String str, TJTaskHandler tJTaskHandler) {
                this.f1708a = str;
                this.b = tJTaskHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    TapjoyLog.d("TJWebViewActivity", "setBackgroundContent: " + this.f1708a);
                    TJWebViewActivity.this.f.loadDataWithBaseURL(null, this.f1708a, "text/html", "utf-8", null);
                    this.b.onComplete(true);
                } catch (Exception unused) {
                    StringBuilder sbA = w1.a("Error setting background content. backgroundWebView: ");
                    sbA.append(TJWebViewActivity.this.f);
                    sbA.append(", content: ");
                    sbA.append(this.f1708a);
                    TapjoyLog.d("TJWebViewActivity", sbA.toString());
                    this.b.onComplete(false);
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1709a;

            public b(boolean z) {
                this.f1709a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f1709a) {
                    TJWebViewActivity.this.c.setVisibility(0);
                } else {
                    TJWebViewActivity.this.c.setVisibility(4);
                }
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1710a;

            public c(boolean z) {
                this.f1710a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJWebViewActivity.this.c.setClickable(this.f1710a);
            }
        }

        public BridgeDelegate() {
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean dismiss() {
            super.dismiss();
            TJWebViewActivity.this.finish();
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean fireContentReady() {
            super.fireContentReady();
            TJWebViewActivity.this.setProgressSpinnerVisibility(false);
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Context getContext() {
            return TJWebViewActivity.this;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Map<String, Object> getOrientation() {
            String strB = TJWebViewActivity.this.b();
            HashMap map = new HashMap();
            map.put(TJAdUnitConstants.String.ORIENTATION, strB);
            map.put(TJAdUnitConstants.String.WIDTH, Integer.valueOf(TJWebViewActivity.this.d()));
            map.put(TJAdUnitConstants.String.HEIGHT, Integer.valueOf(TJWebViewActivity.this.a()));
            return map;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public WebView getWebView() {
            return TJWebViewActivity.this.g;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setBackgroundColor(String str, TJTaskHandler<Boolean> tJTaskHandler) {
            super.setBackgroundColor(str, tJTaskHandler);
            TJWebViewActivity.this.f.setBackgroundColor(Color.parseColor(str));
            tJTaskHandler.onComplete(true);
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setBackgroundContent(String str, TJTaskHandler<Boolean> tJTaskHandler) {
            super.setBackgroundContent(str, tJTaskHandler);
            TapjoyUtil.runOnMainThread(new a(str, tJTaskHandler));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setCloseButtonClickable(boolean z) {
            super.setCloseButtonClickable(z);
            TapjoyUtil.runOnMainThread(new c(z));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setCloseButtonVisible(boolean z) {
            super.setCloseButtonVisible(z);
            TapjoyUtil.runOnMainThread(new b(z));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean setOrientation(int i) {
            int iC = TJWebViewActivity.this.c();
            int i2 = TJWebViewActivity.this.j;
            if (i2 != -1) {
                iC = i2;
            }
            if ((TJWebViewActivity.this.a(iC) && TJWebViewActivity.this.a(i)) || (TJWebViewActivity.this.b(iC) && TJWebViewActivity.this.b(i))) {
                i = iC;
            }
            TJWebViewActivity.this.setRequestedOrientation(i);
            TJWebViewActivity tJWebViewActivity = TJWebViewActivity.this;
            tJWebViewActivity.j = i;
            tJWebViewActivity.i = true;
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void shouldClose(boolean z) {
            if (z) {
                TJWebViewActivity.this.finish();
            }
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean unsetOrientation() {
            TJWebViewActivity.this.setRequestedOrientation(-1);
            TJWebViewActivity tJWebViewActivity = TJWebViewActivity.this;
            tJWebViewActivity.j = -1;
            tJWebViewActivity.i = false;
            return true;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnitJSBridge tJAdUnitJSBridge = TJWebViewActivity.this.h;
            if (tJAdUnitJSBridge == null || !tJAdUnitJSBridge.closeRequested) {
                return;
            }
            TapjoyLog.d("TJWebViewActivity", "Did not receive callback from content. Closing ad.");
            TJWebViewActivity.this.finish();
        }
    }

    public class b extends WebViewClient {
        public /* synthetic */ b(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TJWebViewActivity.this.h.flushMessageQueue();
            TJWebViewActivity.this.h.display();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (webView != null) {
                webView.loadUrl("about:blank");
            }
            TJWebViewActivity.this.showErrorDialog();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return TJWebViewActivity.this.a(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return TJWebViewActivity.this.a(webResourceRequest.getUrl().toString());
        }
    }

    @Override // com.tapjoy.TJActivity
    public void e() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.h;
        if (tJAdUnitJSBridge == null || tJAdUnitJSBridge.closeRequested) {
            return;
        }
        TapjoyLog.d("TJWebViewActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
        this.h.closeRequested(false);
        new Handler(getMainLooper()).postDelayed(new a(), 1000L);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.h != null) {
            int iD = d();
            int iA = a();
            this.h.notifyOrientationChanged(iD > iA ? TJAdUnitConstants.String.LANDSCAPE : TJAdUnitConstants.String.PORTRAIT, iD, iA);
        }
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        boolean zBooleanValue;
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        a aVar = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
            str2 = null;
            zBooleanValue = false;
        } else {
            String str3 = extras.containsKey("url") ? (String) intent.getExtras().get("url") : null;
            zBooleanValue = extras.containsKey(TJAdUnitConstants.String.REUSE_HTML) ? ((Boolean) intent.getExtras().get(TJAdUnitConstants.String.REUSE_HTML)).booleanValue() : false;
            str2 = extras.containsKey(TJAdUnitConstants.String.HTML) ? (String) intent.getExtras().get(TJAdUnitConstants.String.HTML) : null;
            str = str3;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TJWebView tJWebView = new TJWebView(this);
        this.f = tJWebView;
        tJWebView.setBackgroundColor(0);
        this.f1623a.addView(this.f, -1, -1);
        TJWebView tJWebView2 = new TJWebView(this);
        this.g = tJWebView2;
        tJWebView2.setWebViewClient(new b(aVar));
        this.h = new TJAdUnitJSBridge(new BridgeDelegate());
        if (zBooleanValue) {
            this.g.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
        } else {
            this.g.loadUrl(str);
        }
        this.f1623a.addView(this.g, -1, -1);
        this.f1623a.addView(this.d);
        this.f1623a.addView(this.c);
        setContentView(this.f1623a, layoutParams);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f1623a.removeAllViews();
        TJWebView tJWebView = this.g;
        if (tJWebView != null) {
            tJWebView.loadUrl("about:blank");
            this.g.destroy();
            this.g = null;
        }
        TJAdUnitJSBridge tJAdUnitJSBridge = this.h;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.destroy();
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        TJWebView tJWebView = this.g;
        if (tJWebView != null) {
            tJWebView.onPause();
        }
        TJAdUnitJSBridge tJAdUnitJSBridge = this.h;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setEnabled(false);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        TJWebView tJWebView = this.g;
        if (tJWebView != null) {
            tJWebView.onResume();
        }
        TJAdUnitJSBridge tJAdUnitJSBridge = this.h;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setEnabled(true);
        }
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public boolean a(String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected() && URLUtil.isValidUrl(str)) {
                    try {
                        String host = new URL(TapjoyConnectCore.getHostURL()).getHost();
                        if ((host != null && str.contains(host)) || str.contains(TapjoyConnectCore.getRedirectDomain()) || str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()))) {
                            return false;
                        }
                    } catch (MalformedURLException unused) {
                    }
                    if (this.h.allowRedirect) {
                        Uri uri = Uri.parse(str);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(uri);
                        intent.addFlags(DriveFile.MODE_READ_ONLY);
                        if (this.g.getContext() != null) {
                            try {
                                this.g.getContext().startActivity(intent);
                                return true;
                            } catch (Exception e) {
                                StringBuilder sbA = w1.a("Exception in loading URL. ");
                                sbA.append(e.getMessage());
                                TapjoyLog.e("TJWebViewActivity", sbA.toString());
                            }
                        }
                    } else if (str.startsWith("javascript:")) {
                        try {
                            this.g.evaluateJavascript(str.replaceFirst("javascript:", ""), null);
                            return true;
                        } catch (Exception e2) {
                            StringBuilder sbA2 = w1.a("Exception in evaluateJavascript. Device not supported. ");
                            sbA2.append(e2.toString());
                            TapjoyLog.e("TJWebViewActivity", sbA2.toString());
                        }
                    }
                    return false;
                }
            }
        } catch (Exception e3) {
            StringBuilder sbA3 = w1.a("Exception getting NetworkInfo: ");
            sbA3.append(e3.getLocalizedMessage());
            TapjoyLog.d("TJWebViewActivity", sbA3.toString());
        }
        showErrorDialog();
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }
}
