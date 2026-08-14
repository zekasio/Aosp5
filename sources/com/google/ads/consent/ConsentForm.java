package com.google.ads.consent;

import android.R;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.gson.Gson;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    private enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    private ConsentForm(Builder builder) {
        Context context = builder.context;
        this.context = context;
        if (builder.listener == null) {
            this.listener = new ConsentFormListener(this) { // from class: com.google.ads.consent.ConsentForm.1
            };
        } else {
            this.listener = builder.listener;
        }
        this.personalizedAdsOption = builder.personalizedAdsOption;
        this.nonPersonalizedAdsOption = builder.nonPersonalizedAdsOption;
        this.adFreeOption = builder.adFreeOption;
        this.appPrivacyPolicyURL = builder.appPrivacyPolicyURL;
        Dialog dialog = new Dialog(context, R.style.Theme.Translucent.NoTitleBar);
        this.dialog = dialog;
        this.loadState = LoadState.NOT_READY;
        WebView webView = new WebView(context);
        this.webView = webView;
        webView.setBackgroundColor(0);
        dialog.setContentView(webView);
        dialog.setCancelable(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() { // from class: com.google.ads.consent.ConsentForm.2
            boolean isInternalRedirect;

            private boolean isConsentFormUrl(String url) {
                return !TextUtils.isEmpty(url) && url.startsWith("consent://");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void handleUrl(java.lang.String r7) {
                /*
                    r6 = this;
                    boolean r0 = r6.isConsentFormUrl(r7)
                    if (r0 != 0) goto L7
                    return
                L7:
                    r0 = 1
                    r6.isInternalRedirect = r0
                    android.net.Uri r7 = android.net.Uri.parse(r7)
                    java.lang.String r1 = "action"
                    java.lang.String r1 = r7.getQueryParameter(r1)
                    java.lang.String r2 = "status"
                    java.lang.String r2 = r7.getQueryParameter(r2)
                    java.lang.String r3 = "url"
                    java.lang.String r7 = r7.getQueryParameter(r3)
                    r1.hashCode()
                    int r3 = r1.hashCode()
                    r4 = 0
                    r5 = -1
                    switch(r3) {
                        case -1370505102: goto L42;
                        case 150940456: goto L39;
                        case 1671672458: goto L2e;
                        default: goto L2c;
                    }
                L2c:
                    r0 = -1
                    goto L4c
                L2e:
                    java.lang.String r0 = "dismiss"
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L37
                    goto L2c
                L37:
                    r0 = 2
                    goto L4c
                L39:
                    java.lang.String r3 = "browser"
                    boolean r1 = r1.equals(r3)
                    if (r1 != 0) goto L4c
                    goto L2c
                L42:
                    java.lang.String r0 = "load_complete"
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L4b
                    goto L2c
                L4b:
                    r0 = 0
                L4c:
                    switch(r0) {
                        case 0: goto L5e;
                        case 1: goto L58;
                        case 2: goto L50;
                        default: goto L4f;
                    }
                L4f:
                    goto L63
                L50:
                    r6.isInternalRedirect = r4
                    com.google.ads.consent.ConsentForm r7 = com.google.ads.consent.ConsentForm.this
                    com.google.ads.consent.ConsentForm.access$700(r7, r2)
                    goto L63
                L58:
                    com.google.ads.consent.ConsentForm r0 = com.google.ads.consent.ConsentForm.this
                    com.google.ads.consent.ConsentForm.access$800(r0, r7)
                    goto L63
                L5e:
                    com.google.ads.consent.ConsentForm r7 = com.google.ads.consent.ConsentForm.this
                    com.google.ads.consent.ConsentForm.access$600(r7, r2)
                L63:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.ads.consent.ConsentForm.AnonymousClass2.handleUrl(java.lang.String):void");
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                handleUrl(url);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String string = request.getUrl().toString();
                if (!isConsentFormUrl(string)) {
                    return false;
                }
                handleUrl(string);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (!isConsentFormUrl(url)) {
                    return false;
                }
                handleUrl(url);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                if (!this.isInternalRedirect) {
                    ConsentForm.this.updateDialogContent(view);
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                ConsentForm.this.loadState = LoadState.NOT_READY;
                ConsentForm.this.listener.onConsentFormError(error.toString());
            }
        });
    }

    public static class Builder {
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean personalizedAdsOption = false;
        private boolean nonPersonalizedAdsOption = false;
        private boolean adFreeOption = false;

        public Builder(Context context, URL appPrivacyPolicyURL) {
            this.context = context;
            this.appPrivacyPolicyURL = appPrivacyPolicyURL;
            if (appPrivacyPolicyURL == null) {
                throw new IllegalArgumentException("Must provide valid app privacy policy url to create a ConsentForm");
            }
        }

        public Builder withListener(ConsentFormListener listener) {
            this.listener = listener;
            return this;
        }

        public Builder withPersonalizedAdsOption() {
            this.personalizedAdsOption = true;
            return this;
        }

        public Builder withNonPersonalizedAdsOption() {
            this.nonPersonalizedAdsOption = true;
            return this;
        }

        public Builder withAdFreeOption() {
            this.adFreeOption = true;
            return this;
        }

        public ConsentForm build() {
            return new ConsentForm(this);
        }
    }

    private static String getApplicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    private static String getAppIconURIString(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strValueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return strValueOf.length() != 0 ? "data:image/png;base64,".concat(strValueOf) : new String("data:image/png;base64,");
    }

    private static String createJavascriptCommand(String command, String argumentsJSON) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_INFO, argumentsJSON);
        HashMap map2 = new HashMap();
        map2.put("args", map);
        return String.format("javascript:%s(%s)", command, new Gson().toJson(map2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDialogContent(WebView webView) {
        HashMap map = new HashMap();
        map.put("app_name", getApplicationName(this.context));
        map.put("app_icon", getAppIconURIString(this.context));
        map.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        map.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        map.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        map.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.getInstance(this.context).isRequestLocationInEeaOrUnknown()));
        map.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData consentDataLoadConsentData = ConsentInformation.getInstance(this.context).loadConsentData();
        map.put("plat", consentDataLoadConsentData.getSDKPlatformString());
        map.put("consent_info", consentDataLoadConsentData);
        webView.loadUrl(createJavascriptCommand("setUpConsentDialog", new Gson().toJson(map)));
    }

    public void load() {
        if (this.loadState == LoadState.LOADING) {
            this.listener.onConsentFormError("Cannot simultaneously load multiple consent forms.");
        } else if (this.loadState == LoadState.LOADED) {
            this.listener.onConsentFormLoaded();
        } else {
            this.loadState = LoadState.LOADING;
            this.webView.loadUrl("file:///android_asset/consentform.html");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoadComplete(String status) {
        if (TextUtils.isEmpty(status)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.onConsentFormError("No information");
        } else if (status.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.onConsentFormError(status);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.onConsentFormLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOpenBrowser(String urlString) {
        if (TextUtils.isEmpty(urlString)) {
            this.listener.onConsentFormError("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlString)));
        } catch (ActivityNotFoundException unused) {
            this.listener.onConsentFormError("No Activity found to handle browser intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDismiss(String status) {
        boolean z;
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(status)) {
            this.listener.onConsentFormError("No information provided.");
            return;
        }
        if (status.contains("Error")) {
            this.listener.onConsentFormError(status);
            return;
        }
        status.hashCode();
        z = true;
        switch (status) {
            case "ad_free":
                consentStatus = ConsentStatus.UNKNOWN;
                break;
            case "personalized":
                consentStatus = ConsentStatus.PERSONALIZED;
                z = false;
                break;
            case "non_personalized":
                consentStatus = ConsentStatus.NON_PERSONALIZED;
                z = false;
                break;
            default:
                consentStatus = ConsentStatus.UNKNOWN;
                z = false;
                break;
        }
        ConsentInformation.getInstance(this.context).setConsentStatus(consentStatus, "form");
        this.listener.onConsentFormClosed(consentStatus, Boolean.valueOf(z));
    }

    public void show() {
        if (this.loadState != LoadState.LOADED) {
            this.listener.onConsentFormError("Consent form is not ready to be displayed.");
            return;
        }
        if (ConsentInformation.getInstance(this.context).isTaggedForUnderAgeOfConsent()) {
            this.listener.onConsentFormError("Error: tagged for under age of consent");
            return;
        }
        this.dialog.getWindow().setLayout(-1, -1);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.google.ads.consent.ConsentForm.3
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialog) {
                ConsentForm.this.listener.onConsentFormOpened();
            }
        });
        this.dialog.show();
        if (this.dialog.isShowing()) {
            return;
        }
        this.listener.onConsentFormError("Consent form could not be displayed.");
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }
}
