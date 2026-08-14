package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f1554a = new AtomicBoolean();
    private String b;
    private WebView c;
    private EventListener d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            y.i("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        this.b = stringExtra2;
        if (StringUtils.isValidString(stringExtra2)) {
            this.c.loadUrl(this.b);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.d = eventListener;
        this.b = str;
        this.f1554a.set(false);
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final p pVar) {
        WebView webViewTryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.c = webViewTryToCreateWebView;
        if (webViewTryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(webViewTryToCreateWebView);
        WebSettings settings = this.c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setHorizontalScrollBarEnabled(true);
        this.c.setScrollBarStyle(33554432);
        this.c.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                pVar.L();
                if (y.a()) {
                    pVar.L().b("AppLovinWebViewActivity", "Handling url load: " + str);
                }
                if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.d != null) {
                    if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                        return true;
                    }
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                    if (StringUtils.isValidString(str2)) {
                        String queryParameter = uri.getQueryParameter(str2);
                        pVar.L();
                        if (y.a()) {
                            pVar.L().b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                        }
                        AppLovinWebViewActivity.this.d.onReceivedEvent(queryParameter);
                        return true;
                    }
                    pVar.L();
                    if (!y.a()) {
                        return true;
                    }
                    pVar.L().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (AppLovinWebViewActivity.this.c != webView) {
                    return true;
                }
                AppLovinWebViewActivity.this.c.destroy();
                AppLovinWebViewActivity.this.c = null;
                AppLovinWebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((Boolean) pVar.a(b.fs)).booleanValue() && AppLovinWebViewActivity.this.f1554a.compareAndSet(false, true)) {
                            AppLovinWebViewActivity.this.a(pVar);
                            if (StringUtils.isValidString(AppLovinWebViewActivity.this.b)) {
                                AppLovinWebViewActivity.this.c.loadUrl(AppLovinWebViewActivity.this.b);
                                return;
                            }
                            return;
                        }
                        AppLovinWebViewActivity.this.finish();
                    }
                });
                return true;
            }
        });
    }
}
