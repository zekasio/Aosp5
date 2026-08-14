package com.vungle.warren.ui.view;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.google.gson.JsonObject;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.omsdk.WebViewObserver;
import com.vungle.warren.ui.view.WebViewAPI;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class VungleWebClient extends WebViewClient implements WebViewAPI {
    public static final String TAG = "VungleWebClient";
    private WebViewAPI.MRAIDDelegate MRAIDDelegate;
    private Advertisement advertisement;
    private boolean collectConsent;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private ExecutorService offloadExecutor;
    private Placement placement;
    private boolean ready;
    private WebViewObserver webViewObserver;

    public VungleWebClient(Advertisement advertisement, Placement placement, ExecutorService executorService) {
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = executorService;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setConsentStatus(boolean z, String str, String str2, String str3, String str4) {
        this.collectConsent = z;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setMRAIDDelegate(WebViewAPI.MRAIDDelegate mRAIDDelegate) {
        this.MRAIDDelegate = mRAIDDelegate;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        String str2 = TAG;
        Log.d(str2, "MRAID Command " + str);
        if (TextUtils.isEmpty(str)) {
            Log.e(str2, "Invalid URL ");
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            if (scheme.equals("mraid")) {
                final String host = uri.getHost();
                if (host == null) {
                    return false;
                }
                if ("propertiesChangeCompleted".equals(host) && !this.ready) {
                    runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ")");
                    this.ready = true;
                } else if (this.MRAIDDelegate != null) {
                    final JsonObject jsonObject = new JsonObject();
                    for (String str3 : uri.getQueryParameterNames()) {
                        jsonObject.addProperty(str3, uri.getQueryParameter(str3));
                    }
                    final Handler handler = new Handler();
                    this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.warren.ui.view.VungleWebClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (VungleWebClient.this.MRAIDDelegate.processCommand(host, jsonObject)) {
                                handler.post(new Runnable() { // from class: com.vungle.warren.ui.view.VungleWebClient.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        VungleWebClient.this.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
                                    }
                                });
                            }
                        }
                    });
                }
                return true;
            }
            if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                Log.d(str2, "Open URL" + str);
                if (this.MRAIDDelegate != null) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("url", str);
                    this.MRAIDDelegate.processCommand("openNonMraid", jsonObject2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        int adType = this.advertisement.getAdType();
        if (adType == 0) {
            runJavascriptOnWebView(webView, "function actionClicked(action){Android.performAction(action);};");
        } else if (adType == 1) {
            this.loadedWebView = webView;
            webView.setVisibility(0);
            notifyPropertiesChange(true);
        } else {
            throw new IllegalArgumentException("Unknown Client Type!");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean z) {
        if (this.loadedWebView != null) {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty(TJAdUnitConstants.String.WIDTH, Integer.valueOf(this.loadedWebView.getWidth()));
            jsonObject2.addProperty(TJAdUnitConstants.String.HEIGHT, Integer.valueOf(this.loadedWebView.getHeight()));
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("x", (Number) 0);
            jsonObject3.addProperty("y", (Number) 0);
            jsonObject3.addProperty(TJAdUnitConstants.String.WIDTH, Integer.valueOf(this.loadedWebView.getWidth()));
            jsonObject3.addProperty(TJAdUnitConstants.String.HEIGHT, Integer.valueOf(this.loadedWebView.getHeight()));
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("sms", (Boolean) false);
            jsonObject4.addProperty("tel", (Boolean) false);
            jsonObject4.addProperty("calendar", (Boolean) false);
            jsonObject4.addProperty("storePicture", (Boolean) false);
            jsonObject4.addProperty("inlineVideo", (Boolean) false);
            jsonObject.add("maxSize", jsonObject2);
            jsonObject.add("screenSize", jsonObject2);
            jsonObject.add("defaultPosition", jsonObject3);
            jsonObject.add("currentPosition", jsonObject3);
            jsonObject.add("supports", jsonObject4);
            jsonObject.addProperty("placementType", this.advertisement.getTemplateType());
            Boolean bool = this.isViewable;
            if (bool != null) {
                jsonObject.addProperty("isViewable", bool);
            }
            jsonObject.addProperty("os", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
            jsonObject.addProperty("osVersion", Integer.toString(Build.VERSION.SDK_INT));
            jsonObject.addProperty("incentivized", Boolean.valueOf(this.placement.isIncentivized()));
            jsonObject.addProperty("enableBackImmediately", Boolean.valueOf(this.advertisement.getShowCloseDelay(this.placement.isIncentivized()) == 0));
            jsonObject.addProperty(ClientCookie.VERSION_ATTR, "1.0");
            if (this.collectConsent) {
                jsonObject.addProperty("consentRequired", (Boolean) true);
                jsonObject.addProperty("consentTitleText", this.gdprTitle);
                jsonObject.addProperty("consentBodyText", this.gdprBody);
                jsonObject.addProperty("consentAcceptButtonText", this.gdprAccept);
                jsonObject.addProperty("consentDenyButtonText", this.gdprDeny);
            } else {
                jsonObject.addProperty("consentRequired", (Boolean) false);
            }
            jsonObject.addProperty("sdkVersion", BuildConfig.VERSION_NAME);
            Log.d(TAG, "loadJsjavascript:window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObject + "," + z + ")");
            runJavascriptOnWebView(this.loadedWebView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObject + "," + z + ")");
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setAdVisibility(boolean z) {
        this.isViewable = Boolean.valueOf(z);
        notifyPropertiesChange(false);
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            String str3 = TAG;
            Log.e(str3, "Error desc " + str);
            Log.e(str3, "Error for URL " + str2);
            handleWebViewError(str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21) {
            String str = TAG;
            Log.e(str, "Error desc " + webResourceResponse.getStatusCode());
            Log.e(str, "Error for URL " + webResourceRequest.getUrl().toString());
            handleWebViewError(String.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl().toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            String str = TAG;
            Log.e(str, "Error desc " + webResourceError.getDescription().toString());
            Log.e(str, "Error for URL " + webResourceRequest.getUrl().toString());
            handleWebViewError(webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    private void handleWebViewError(String str, String str2) {
        boolean zIsCriticalAsset = isCriticalAsset(str2);
        String str3 = str2 + " " + str;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str3, zIsCriticalAsset);
        }
    }

    private boolean isCriticalAsset(String str) {
        Advertisement advertisement;
        if (TextUtils.isEmpty(str) || (advertisement = this.advertisement) == null) {
            return false;
        }
        return advertisement.getDownloadableUrls().containsValue(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w(TAG, "onRenderProcessGone url: " + webView.getUrl() + ",  did crash: " + renderProcessGoneDetail.didCrash());
        this.loadedWebView = null;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            return webClientErrorHandler.onWebRenderingProcessGone(webView, renderProcessGoneDetail.didCrash());
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runJavascriptOnWebView(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    static class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        WebViewAPI.WebClientErrorHandler errorHandler;

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            String str = VungleWebClient.TAG;
            StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb.append(webView.getTitle());
            sb.append(", URL = ");
            sb.append(webView.getOriginalUrl());
            sb.append(", (webViewRenderProcess != null) = ");
            sb.append(webViewRenderProcess != null);
            Log.w(str, sb.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }
}
