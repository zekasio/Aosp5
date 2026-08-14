package com.tapjoy;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.l4;
import com.tapjoy.internal.n4;
import com.tapjoy.internal.v5;
import com.tapjoy.internal.w1;
import com.tapjoy.internal.y5;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJAdUnitJSBridge implements TJWebViewJSInterfaceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TJWebViewJSInterface f1645a;
    public final TJJSBridgeDelegate b;
    public TJSplitWebView c;
    public ProgressDialog d;
    public boolean e;
    public boolean didLaunchOtherActivity = false;
    public boolean allowRedirect = true;
    public String otherActivityCallbackID = null;
    public boolean customClose = false;
    public boolean closeRequested = false;
    public String splitWebViewCallbackID = null;
    public final n4 f = new n4(this);
    public final ConcurrentLinkedQueue<Pair<String, JSONObject>> g = new ConcurrentLinkedQueue<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1646a;

        public a(String str) {
            this.f1646a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
            if (tJAdUnitJSBridge.c == null) {
                String str = this.f1646a;
                if (str != null) {
                    tJAdUnitJSBridge.invokeJSCallback(str, Boolean.FALSE);
                    return;
                }
                return;
            }
            String str2 = this.f1646a;
            if (str2 != null) {
                tJAdUnitJSBridge.invokeJSCallback(str2, Boolean.TRUE);
            }
            TJAdUnitJSBridge tJAdUnitJSBridge2 = TJAdUnitJSBridge.this;
            String str3 = tJAdUnitJSBridge2.splitWebViewCallbackID;
            if (str3 != null) {
                tJAdUnitJSBridge2.invokeJSCallback(str3, Boolean.TRUE);
                TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
            }
            ((ViewGroup) TJAdUnitJSBridge.this.c.getParent()).removeView(TJAdUnitJSBridge.this.c);
            TJAdUnitJSBridge.this.c = null;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1647a;

        public b(String str) {
            this.f1647a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
            TJSplitWebView tJSplitWebView = tJAdUnitJSBridge.c;
            if (tJSplitWebView != null) {
                tJAdUnitJSBridge.invokeJSCallback(this.f1647a, tJSplitWebView.getLastUrl());
            } else {
                tJAdUnitJSBridge.invokeJSCallback(this.f1647a, JSONObject.NULL);
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1648a;

        public c(String str) {
            this.f1648a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                TJAdUnitJSBridge.this.invokeJSCallback(this.f1648a, Integer.valueOf(i != -3 ? (i == -2 || i != -1) ? 0 : 2 : 1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f1649a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        public d(JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, String str, String str2, String str3, String str4, String str5) {
            this.f1649a = jSONObject;
            this.b = jSONArray;
            this.c = jSONObject2;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = TJAdUnitJSBridge.this.b.getWebView();
            if (webView != null) {
                TJSplitWebView tJSplitWebView = TJAdUnitJSBridge.this.c;
                if (tJSplitWebView == null) {
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                        tJAdUnitJSBridge.c = new TJSplitWebView(tJAdUnitJSBridge.b.getContext(), this.f1649a, TJAdUnitJSBridge.this);
                        viewGroup.addView(TJAdUnitJSBridge.this.c, new RelativeLayout.LayoutParams(-1, -1));
                        TJAdUnitJSBridge.this.c.animateOpen(viewGroup);
                    }
                } else if (tJSplitWebView != null) {
                    tJSplitWebView.setExitHosts(this.b);
                    TJAdUnitJSBridge.this.c.applyLayoutOption(this.c);
                }
                TJSplitWebView tJSplitWebView2 = TJAdUnitJSBridge.this.c;
                if (tJSplitWebView2 != null) {
                    String str = this.d;
                    if (str != null) {
                        tJSplitWebView2.setUserAgent(str);
                    }
                    TJAdUnitJSBridge.this.c.setTrigger(this.e, this.f);
                    TJAdUnitJSBridge tJAdUnitJSBridge2 = TJAdUnitJSBridge.this;
                    tJAdUnitJSBridge2.splitWebViewCallbackID = this.g;
                    try {
                        tJAdUnitJSBridge2.c.loadUrl(this.h);
                        return;
                    } catch (Exception e) {
                        TapjoyLog.w("TJAdUnitJSBridge", e.getMessage());
                        return;
                    }
                }
            }
            TJAdUnitJSBridge tJAdUnitJSBridge3 = TJAdUnitJSBridge.this;
            tJAdUnitJSBridge3.c = null;
            tJAdUnitJSBridge3.splitWebViewCallbackID = null;
            tJAdUnitJSBridge3.invokeJSCallback(this.g, Boolean.FALSE);
        }
    }

    public class e implements TJTaskHandler<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1650a;

        public e(String str) {
            this.f1650a = str;
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(Boolean bool) {
            TJAdUnitJSBridge.this.invokeJSCallback(this.f1650a, bool);
        }
    }

    public class f implements TJTaskHandler<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1651a;

        public f(String str) {
            this.f1651a = str;
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(Boolean bool) {
            TJAdUnitJSBridge.this.invokeJSCallback(this.f1651a, bool);
        }
    }

    public class g implements TJTaskHandler<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1652a;

        public g(String str) {
            this.f1652a = str;
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(Boolean bool) {
            TJAdUnitJSBridge.this.invokeJSCallback(this.f1652a, bool);
        }
    }

    public class h implements TJTaskHandler<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1653a;

        public h(String str) {
            this.f1653a = str;
        }

        @Override // com.tapjoy.TJTaskHandler
        public void onComplete(Boolean bool) {
            TJAdUnitJSBridge.this.invokeJSCallback(this.f1653a, bool);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f1654a;
        public final /* synthetic */ String b;

        public i(JSONObject jSONObject, String str) {
            this.f1654a = jSONObject;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TJAdUnitJSBridge.this.b.getWebView().evaluateJavascript(this.f1654a.getString("command"), null);
                TJAdUnitJSBridge.this.invokeJSCallback(this.b, Boolean.TRUE);
            } catch (Exception unused) {
                TJAdUnitJSBridge.this.invokeJSCallback(this.b, Boolean.FALSE);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1655a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public j(boolean z, Context context, String str, String str2, String str3) {
            this.f1655a = z;
            this.b = context;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1655a) {
                TJAdUnitJSBridge.this.d = ProgressDialog.show(this.b, this.c, this.d);
                return;
            }
            ProgressDialog progressDialog = TJAdUnitJSBridge.this.d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            TJAdUnitJSBridge.this.invokeJSCallback(this.e, Boolean.TRUE);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1656a;

        public k(String str) {
            this.f1656a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
            if (tJAdUnitJSBridge.c != null) {
                tJAdUnitJSBridge.invokeJSCallback(this.f1656a, Boolean.TRUE);
            } else {
                tJAdUnitJSBridge.invokeJSCallback(this.f1656a, Boolean.FALSE);
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebView f1657a;
        public boolean b;
        public boolean c;

        public l(WebView webView, boolean z, boolean z2) {
            this.f1657a = webView;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!(TJAdUnitJSBridge.this.b.getContext() instanceof Activity)) {
                TapjoyLog.e("TJAdUnitJSBridge", "Unable to present offerwall. No Activity context provided.");
                return;
            }
            if (!this.b) {
                this.f1657a.setVisibility(4);
                if (this.f1657a.getParent() instanceof RelativeLayout) {
                    ((RelativeLayout) this.f1657a.getParent()).getBackground().setAlpha(0);
                    ((RelativeLayout) this.f1657a.getParent()).setBackgroundColor(0);
                    return;
                }
                return;
            }
            this.f1657a.setVisibility(0);
            if (this.c) {
                if (this.f1657a.getParent() instanceof RelativeLayout) {
                    ((RelativeLayout) this.f1657a.getParent()).getBackground().setAlpha(0);
                    ((RelativeLayout) this.f1657a.getParent()).setBackgroundColor(0);
                }
                this.f1657a.setLayerType(1, null);
                return;
            }
            if (this.f1657a.getParent() instanceof RelativeLayout) {
                ((RelativeLayout) this.f1657a.getParent()).getBackground().setAlpha(255);
                ((RelativeLayout) this.f1657a.getParent()).setBackgroundColor(-1);
            }
            this.f1657a.setLayerType(0, null);
        }
    }

    public TJAdUnitJSBridge(TJJSBridgeDelegate tJJSBridgeDelegate) {
        this.b = tJJSBridgeDelegate;
        TapjoyLog.i("TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        WebView webView = tJJSBridgeDelegate.getWebView();
        if (webView == null) {
            TapjoyLog.e("TJAdUnitJSBridge", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        TJWebViewJSInterface tJWebViewJSInterface = new TJWebViewJSInterface(webView, this);
        this.f1645a = tJWebViewJSInterface;
        webView.addJavascriptInterface(tJWebViewJSInterface, TJAdUnitConstants.JAVASCRIPT_INTERFACE_ID);
        setEnabled(true);
    }

    public TJJSBridgeDelegate a() {
        return this.b;
    }

    public void alert(JSONObject jSONObject, String str) {
        String str2;
        JSONArray jSONArray;
        String string;
        TapjoyLog.d("TJAdUnitJSBridge", "alert_method: " + jSONObject);
        String string2 = "";
        try {
            string = jSONObject.getString(TJAdUnitConstants.String.TITLE);
        } catch (Exception e2) {
            e = e2;
            str2 = "";
        }
        try {
            string2 = jSONObject.getString(TJAdUnitConstants.String.MESSAGE);
            jSONArray = jSONObject.getJSONArray(TJAdUnitConstants.String.BUTTONS);
        } catch (Exception e3) {
            e = e3;
            str2 = string2;
            string2 = string;
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
            jSONArray = null;
            String str3 = str2;
            string = string2;
            string2 = str3;
        }
        Context context = this.b.getContext();
        if (context == null) {
            TapjoyLog.d("TJAdUnitJSBridge", "Cannot alert -- TJAdUnitActivity is null");
            return;
        }
        AlertDialog alertDialogCreate = Build.VERSION.SDK_INT >= 21 ? new AlertDialog.Builder(context, R.style.Theme.Material.Light.Dialog.Alert).setTitle(string).setMessage(string2).create() : new AlertDialog.Builder(context).setTitle(string).setMessage(string2).create();
        if (jSONArray == null || jSONArray.length() == 0) {
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            int i3 = i2 != 0 ? i2 != 1 ? -1 : -3 : -2;
            try {
                arrayList.add(jSONArray.getString(i2));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            alertDialogCreate.setButton(i3, (CharSequence) arrayList.get(i2), new c(str));
            i2++;
        }
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.show();
    }

    public void attachVolumeListener(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean("attach");
            int iOptInt = jSONObject.optInt(TJAdUnitConstants.String.INTERVAL, 500);
            if (iOptInt > 0) {
                this.b.attachVolumeListener(z, iOptInt);
                invokeJSCallback(str, true);
            } else {
                TapjoyLog.d("TJAdUnitJSBridge", "Invalid `interval` value passed to attachVolumeListener(): interval=" + iOptInt);
                invokeJSCallback(str, false);
            }
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("attachVolumeListener exception ");
            sbA.append(e2.toString());
            TapjoyLog.d("TJAdUnitJSBridge", sbA.toString());
            invokeJSCallback(str, false);
            e2.printStackTrace();
        }
    }

    public void cacheAsset(JSONObject jSONObject, String str) {
        String string;
        Long lValueOf = 0L;
        try {
            String string2 = jSONObject.getString("url");
            try {
                string = jSONObject.getString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            } catch (Exception unused) {
                string = "";
            }
            try {
                lValueOf = Long.valueOf(jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE));
            } catch (Exception unused2) {
            }
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().cacheAssetFromURL(string2, string, lValueOf.longValue()));
            } else {
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception unused3) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cachePathForURL(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().getPathOfCachedURL(string));
            } else {
                invokeJSCallback(str, "");
            }
        } catch (Exception unused) {
            invokeJSCallback(str, "");
        }
    }

    public void cleanUpJSBridge() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f1645a;
        if (tJWebViewJSInterface != null) {
            WebView webView = tJWebViewJSInterface.b;
            if (webView != null) {
                webView.removeAllViews();
                this.f1645a.b.destroy();
                this.f1645a.b = null;
            }
            this.f1645a = null;
        }
    }

    public void clearCache(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() == null) {
            invokeJSCallback(str, Boolean.FALSE);
        } else {
            TapjoyCache.getInstance().clearTapjoyCache();
            invokeJSCallback(str, Boolean.TRUE);
        }
    }

    public void clearLoggingLevel(JSONObject jSONObject, String str) {
        TapjoyAppSettings.getInstance().clearLoggingLevel();
    }

    public void clearVideo(JSONObject jSONObject, String str) {
        this.b.clearVideo(new h(str), jSONObject.optBoolean(TJAdUnitConstants.String.VISIBLE, false));
    }

    public void closeRequested(Boolean bool) {
        TJSplitWebView tJSplitWebView = this.c;
        if (tJSplitWebView != null) {
            if (tJSplitWebView.goBack()) {
                return;
            }
            this.c.a();
        } else {
            this.closeRequested = true;
            HashMap map = new HashMap();
            map.put(TJAdUnitConstants.String.FORCE_CLOSE, bool);
            invokeJSAdunitMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, map);
        }
    }

    public void contentError(JSONObject jSONObject, String str) {
        int i2;
        String string;
        try {
            i2 = jSONObject.getInt("code");
        } catch (JSONException e2) {
            TapjoyLog.e("TJAdUnitJSBridge", e2.getLocalizedMessage());
            i2 = -1;
        }
        try {
            string = jSONObject.getString(TJAdUnitConstants.String.MESSAGE);
        } catch (JSONException e3) {
            TapjoyLog.e("TJAdUnitJSBridge", e3.getLocalizedMessage());
            string = "Unknown Content Error";
        }
        TJJSBridgeDelegate tJJSBridgeDelegate = this.b;
        if (tJJSBridgeDelegate == null) {
            invokeJSCallback(str, false);
        } else {
            tJJSBridgeDelegate.fireContentError(new TJError(i2, string));
            invokeJSCallback(str, true);
        }
    }

    public void contentReady(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.valueOf(this.b.fireContentReady()));
    }

    public void destroy() {
    }

    public void dismiss(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
        this.b.dismiss();
    }

    public void dismissSplitView(JSONObject jSONObject, String str) {
        TapjoyUtil.runOnMainThread(new a(str));
    }

    public void dismissStoreView(JSONObject jSONObject, String str) {
        dismissSplitView(jSONObject, str);
    }

    public void display() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.DISPLAY, new Object[0]);
    }

    public void displayFullscreenWebview(JSONObject jSONObject, String str) {
        String string;
        Boolean boolValueOf = null;
        try {
            string = jSONObject.getString("url");
        } catch (JSONException unused) {
            string = null;
        }
        try {
            if (jSONObject.has(TJAdUnitConstants.String.REUSE_HTML)) {
                boolValueOf = Boolean.valueOf(jSONObject.getBoolean(TJAdUnitConstants.String.REUSE_HTML));
            }
        } catch (JSONException unused2) {
        }
        if (com.tapjoy.internal.a.b(string) && boolValueOf == null) {
            invokeJSCallback(str, false);
            return;
        }
        Intent intent = new Intent(this.b.getContext(), (Class<?>) TJWebViewActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(this.b.getContext().getPackageName());
        intent.putExtra("url", string);
        intent.putExtra(TJAdUnitConstants.String.REUSE_HTML, boolValueOf);
        String str2 = (String) this.b.getData(TJAdUnitConstants.String.HTML, String.class);
        if (str2 != null) {
            intent.putExtra(TJAdUnitConstants.String.HTML, str2);
        }
        this.b.getContext().startActivity(intent);
        invokeJSCallback(str, true);
    }

    public void displayStoreURL(JSONObject jSONObject, String str) {
        displayURL(jSONObject, str);
    }

    public void displayURL(JSONObject jSONObject, String str) {
        String str2;
        String strOptString;
        try {
            String strOptString2 = jSONObject.optString(TJAdUnitConstants.String.STYLE);
            String string = jSONObject.getString("url");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
            String strOptString3 = jSONObject.optString("userAgent", null);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString4 = jSONObjectOptJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON, null);
                strOptString = jSONObjectOptJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_TO, null);
                str2 = strOptString4;
            } else {
                str2 = null;
                strOptString = null;
            }
            if (TJAdUnitConstants.String.STYLE_SPLIT.equals(strOptString2)) {
                TapjoyUtil.runOnMainThread(new d(jSONObject, jSONArrayOptJSONArray, jSONObjectOptJSONObject, strOptString3, str2, strOptString, str, string));
                return;
            }
            this.didLaunchOtherActivity = true;
            this.otherActivityCallbackID = str;
            this.b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.TRUE);
            e2.printStackTrace();
        }
    }

    public void displayVideo(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (string.length() <= 0 || string == "") {
                invokeJSCallback(str, Boolean.FALSE);
            } else {
                this.b.loadVideoUrl(string, new g(str));
            }
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void fetchData(JSONObject jSONObject, String str) {
        try {
            invokeJSCallback(str, new TJDataFetcher().a(jSONObject.getJSONArray("values")));
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            TapjoyLog.e("TJAdUnitJSBridge", "Exception: " + e2.toString());
        }
    }

    public void flushBacklogMessageQueue() {
        while (true) {
            Pair<String, JSONObject> pairPoll = this.g.poll();
            if (pairPoll == null) {
                return;
            } else {
                onDispatchMethod((String) pairPoll.first, (JSONObject) pairPoll.second);
            }
        }
    }

    public void flushMessageQueue() {
        TJWebViewJSInterface tJWebViewJSInterface = this.f1645a;
        if (tJWebViewJSInterface == null) {
            return;
        }
        tJWebViewJSInterface.flushMessageQueue();
    }

    public void getCachedAssets(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            invokeJSCallback(str, TapjoyCache.getInstance().cachedAssetsToJSON());
        } else {
            invokeJSCallback(str, "");
        }
    }

    public void getKeyValue(JSONObject jSONObject, String str) {
        try {
            invokeJSCallback(str, new TJKeyValueStorage(this.b.getContext()).getValue(jSONObject.getString("key")));
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            TapjoyLog.e("TJAdUnitJSBridge", "Exception: " + e2.toString());
        }
    }

    public void getOrientation(JSONObject jSONObject, String str) {
        invokeJSCallback(str, this.b.getOrientation());
    }

    public void getSplitViewURL(JSONObject jSONObject, String str) {
        TapjoyUtil.runOnMainThread(new b(str));
    }

    public void getVolume(JSONObject jSONObject, String str) {
        Map<String, Object> volumeArgs = this.b.getVolumeArgs();
        if (volumeArgs != null) {
            invokeJSCallback(str, volumeArgs);
        } else {
            invokeJSCallback(str, false);
        }
    }

    public void hasSplitView(JSONObject jSONObject, String str) {
        TapjoyUtil.runOnMainThread(new k(str));
    }

    public void initMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void initViewabilityTracker(JSONObject jSONObject, String str) {
        n4 n4Var = this.f;
        if (n4Var.f1862a.a().getWebView() == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- WebView is null");
        } else if (n4Var.f1862a.a().getVideoView() == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- VideoView is null");
        } else if (jSONObject == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- json parameter is null");
        } else if (jSONObject.has(TJAdUnitConstants.String.OM_JAVASCRIPT_URL)) {
            try {
                jSONObject.getJSONArray(TJAdUnitConstants.String.VENDORS);
                if (TextUtils.isEmpty(n4.f)) {
                    String strOptString = jSONObject.optString(TJAdUnitConstants.String.OM_JAVASCRIPT_URL, null);
                    if (strOptString == null) {
                        TapjoyLog.d("TJOMViewabilityAgent", "Open Mediation JavaScript name not found in json.");
                    } else {
                        try {
                            TapjoyCachedAssetData cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(strOptString);
                            String fileContents = "";
                            if (cachedDataForURL == null) {
                                TapjoyCache.getInstance().cacheAssetFromURL(strOptString, "", 30L).get();
                                cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(strOptString);
                            }
                            if (cachedDataForURL != null) {
                                fileContents = TapjoyUtil.getFileContents(new File(cachedDataForURL.getLocalFilePath()));
                            }
                            n4.f = fileContents;
                        } catch (Exception unused) {
                            TapjoyLog.d("TJOMViewabilityAgent", "Failed downloading Open Mediation JavaScript");
                        }
                    }
                }
                if (TextUtils.isEmpty(n4.f)) {
                    n4Var.f1862a.invokeJSCallback(str, false);
                    return;
                } else {
                    TapjoyUtil.runOnMainThread(new l4(n4Var, jSONObject, str));
                    return;
                }
            } catch (JSONException unused2) {
                TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- unable to parse vendors from json");
            }
        } else {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- unable to parse om javascript url from json");
        }
        n4Var.f1862a.invokeJSCallback(str, false);
    }

    public void invokeJSAdunitMethod(String str, Object... objArr) {
        ArrayList<?> arrayList = new ArrayList<>(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f1645a;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback(arrayList, str, (String) null);
        }
    }

    public void invokeJSCallback(String str, Object... objArr) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.d("TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
            return;
        }
        ArrayList<?> arrayList = new ArrayList<>(Arrays.asList(objArr));
        TJWebViewJSInterface tJWebViewJSInterface = this.f1645a;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback(arrayList, "", str);
        }
    }

    public void isNetworkAvailable(JSONObject jSONObject, String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            invokeJSCallback(str, Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()));
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void log(JSONObject jSONObject, String str) {
        try {
            TapjoyLog.d("TJAdUnitJSBridge", "Logging message=" + jSONObject.getString(TJAdUnitConstants.String.MESSAGE));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void nativeEval(JSONObject jSONObject, String str) {
        TapjoyUtil.runOnMainThread(new i(jSONObject, str));
    }

    public void notifyOrientationChanged(String str, int i2, int i3) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.ORIENTATION, str);
        map.put(TJAdUnitConstants.String.WIDTH, Integer.valueOf(i2));
        map.put(TJAdUnitConstants.String.HEIGHT, Integer.valueOf(i3));
        invokeJSAdunitMethod(TJAdUnitConstants.String.ORIENTATION_CHANGED_EVENT, map);
    }

    @Override // com.tapjoy.TJWebViewJSInterfaceListener
    public void onDispatchMethod(String str, JSONObject jSONObject) {
        if (!this.e) {
            TapjoyLog.d("TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
            this.g.add(new Pair<>(str, jSONObject));
            return;
        }
        String strOptString = null;
        try {
            strOptString = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, null);
            JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.DATA);
            Method method = TJAdUnitJSBridge.class.getMethod(str, JSONObject.class, String.class);
            TapjoyLog.d("TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + strOptString);
            if (this.f1645a == null) {
                return;
            }
            method.invoke(this, jSONObject2, strOptString);
        } catch (Exception e2) {
            e2.printStackTrace();
            invokeJSCallback(strOptString, Boolean.FALSE);
        }
    }

    public void onVideoCompletion() {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_COMPLETE_EVENT);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoError(String str) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_ERROR_EVENT);
        map.put("error", str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoInfo(String str) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_INFO_EVENT);
        map.put(TJAdUnitConstants.String.VIDEO_INFO, str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoPaused(int i2) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PAUSE_EVENT);
        map.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoProgress(int i2) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PROGRESS_EVENT);
        map.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoReady(int i2, int i3, int i4) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_READY_EVENT);
        map.put(TJAdUnitConstants.String.VIDEO_DURATION, Integer.valueOf(i2));
        map.put(TJAdUnitConstants.String.VIDEO_WIDTH, Integer.valueOf(i3));
        map.put(TJAdUnitConstants.String.VIDEO_HEIGHT, Integer.valueOf(i4));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVideoStarted(int i2) {
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_START_EVENT);
        map.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, map);
    }

    public void onVolumeChanged() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.VOLUME_CHANGED, this.b.getVolumeArgs());
    }

    public void openApp(JSONObject jSONObject, String str) {
        try {
            Context context = this.b.getContext();
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(jSONObject.getString(TJAdUnitConstants.String.BUNDLE)));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void pauseVideo(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.valueOf(this.b.pauseVideo()));
    }

    public void playVideo(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.valueOf(this.b.playVideo()));
    }

    public void present(JSONObject jSONObject, String str) {
        try {
            Boolean.valueOf(false);
            Boolean boolValueOf = false;
            Boolean boolValueOf2 = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.VISIBLE));
            try {
                boolValueOf = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.TRANSPARENT));
            } catch (Exception unused) {
            }
            try {
                this.customClose = Boolean.valueOf(jSONObject.getString(TJAdUnitConstants.String.CUSTOM_CLOSE)).booleanValue();
            } catch (Exception unused2) {
            }
            this.b.getWebView().post(new l(this.b.getWebView(), boolValueOf2.booleanValue(), boolValueOf.booleanValue()));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void removeAssetFromCache(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, Boolean.valueOf(TapjoyCache.getInstance().removeAssetFromCache(string)));
            } else {
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setAllowRedirect(JSONObject jSONObject, String str) {
        boolean z;
        try {
            z = jSONObject.getBoolean("enabled");
        } catch (Exception unused) {
            z = true;
        }
        this.allowRedirect = z;
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void setBackgroundColor(JSONObject jSONObject, String str) {
        try {
            this.b.setBackgroundColor(jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_COLOR), new e(str));
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set background color. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void setBackgroundWebViewContent(JSONObject jSONObject, String str) {
        TapjoyLog.d("TJAdUnitJSBridge", "setBackgroundWebViewContent");
        try {
            this.b.setBackgroundContent(jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_CONTENT), new f(str));
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set background content. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void setCloseButtonClickable(JSONObject jSONObject, String str) {
        try {
            this.b.setCloseButtonClickable(jSONObject.optBoolean(TJAdUnitConstants.String.CLICKABLE));
            invokeJSCallback(str, true);
        } catch (Exception e2) {
            invokeJSCallback(str, false);
            e2.printStackTrace();
        }
    }

    public void setCloseButtonVisible(JSONObject jSONObject, String str) {
        try {
            this.b.setCloseButtonVisible(jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE));
            invokeJSCallback(str, true);
        } catch (Exception e2) {
            invokeJSCallback(str, false);
            e2.printStackTrace();
        }
    }

    public void setEnabled(boolean z) {
        this.e = z;
        if (z) {
            flushBacklogMessageQueue();
        }
    }

    public void setEventPreloadLimit(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() == null) {
            invokeJSCallback(str, Boolean.FALSE);
            return;
        }
        try {
            TJPlacementManager.setCachedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_CACHE_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set Tapjoy cache's event preload limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setKeyValue(JSONObject jSONObject, String str) {
        try {
            new TJKeyValueStorage(this.b.getContext()).setValue(jSONObject.getString("key"), jSONObject.get("value"));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            TapjoyLog.e("TJAdUnitJSBridge", "Exception: " + e2.toString());
        }
    }

    public void setLoggingLevel(JSONObject jSONObject, String str) {
        try {
            TapjoyAppSettings.getInstance().saveLoggingLevel(String.valueOf(jSONObject.getString(TJAdUnitConstants.String.LOGGING_LEVEL)));
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("setLoggingLevel exception ");
            sbA.append(e2.getLocalizedMessage());
            TapjoyLog.d("TJAdUnitJSBridge", sbA.toString());
            invokeJSCallback(str, false);
            e2.printStackTrace();
        }
    }

    public void setNavigationEventBlocker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, false);
    }

    public void setOrientation(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.ORIENTATION);
            invokeJSCallback(str, Boolean.valueOf(this.b.setOrientation((string.equals(TJAdUnitConstants.String.LANDSCAPE) || string.equals(TJAdUnitConstants.String.LANDSCAPE_LEFT)) ? 8 : string.equals(TJAdUnitConstants.String.LANDSCAPE_RIGHT) ? 0 : 1)));
        } catch (Exception unused) {
            invokeJSCallback(str, false);
        }
    }

    public void setPrerenderLimit(JSONObject jSONObject, String str) {
        try {
            TJPlacementManager.setPreRenderedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_PRE_RENDERED_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.w("TJAdUnitJSBridge", "Unable to set Tapjoy placement pre-render limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setScrollable(JSONObject jSONObject, String str) {
        invokeJSCallback(str, false);
    }

    public void setSpinnerVisible(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            String strOptString = jSONObject.optString(TJAdUnitConstants.String.TITLE);
            String strOptString2 = jSONObject.optString(TJAdUnitConstants.String.MESSAGE);
            Context context = this.b.getContext();
            if (context != null) {
                TapjoyUtil.runOnMainThread(new j(z, context, strOptString, strOptString2, str));
            } else {
                TapjoyLog.d("TJAdUnitJSBridge", "Cannot setSpinnerVisible -- Context is null");
                invokeJSCallback(str, Boolean.FALSE);
            }
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void setVideoMargins(JSONObject jSONObject, String str) {
        try {
            invokeJSCallback(str, Boolean.valueOf(this.b.setVideoMargins((float) jSONObject.optDouble(TJAdUnitConstants.String.LEFT, 0.0d), (float) jSONObject.optDouble(TJAdUnitConstants.String.TOP, 0.0d), (float) jSONObject.optDouble(TJAdUnitConstants.String.RIGHT, 0.0d), (float) jSONObject.optDouble(TJAdUnitConstants.String.BOTTOM, 0.0d))));
        } catch (Exception e2) {
            invokeJSCallback(str, false);
            e2.printStackTrace();
        }
    }

    public void setVideoMute(JSONObject jSONObject, String str) {
        try {
            this.b.muteVideo(jSONObject.getBoolean("enabled"));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (JSONException unused) {
            TapjoyLog.d("TJAdUnitJSBridge", "Failed to parse 'enabled' from json params.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setupSdkBeacons(JSONObject jSONObject, String str) {
        TapjoyLog.d("TJAdUnitJSBridge", "setupSdkBeacons_method: " + jSONObject);
        try {
            this.b.setupSdkBeacons(new v5(jSONObject.getString("url"), jSONObject.getJSONObject(TJAdUnitConstants.String.BEACON_PARAMS), jSONObject.getJSONObject(TJAdUnitConstants.String.BEACON_PATH_MAP)));
            HashMap map = new HashMap();
            map.put("status", "true");
            if (y5.e) {
                map.put("sdk_beacon_id", this.b.getBeaconId());
            }
            invokeJSCallback(str, map);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            e2.printStackTrace();
        }
    }

    public void shouldClose(JSONObject jSONObject, String str) {
        try {
            Boolean.valueOf(false);
            this.b.shouldClose(Boolean.valueOf(jSONObject.getString("close")).booleanValue());
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e2) {
            invokeJSCallback(str, Boolean.FALSE);
            this.b.shouldClose(true);
            e2.printStackTrace();
        }
        this.closeRequested = false;
    }

    public void startMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void startViewabilityTracker(JSONObject jSONObject, String str) {
        this.f.a(str);
    }

    public void triggerEvent(JSONObject jSONObject, String str) {
        if (this.b != null) {
            try {
                String string = jSONObject.getString("eventName");
                if (string.equals(TJAdUnitConstants.String.VIDEO_START)) {
                    this.b.fireOnVideoStart();
                    return;
                }
                if (string.equals(TJAdUnitConstants.String.VIDEO_COMPLETE)) {
                    this.b.fireOnVideoComplete();
                } else if (string.equals("error")) {
                    this.b.fireOnVideoError("Error while trying to play video.");
                } else if (string.equals(TJAdUnitConstants.String.CLICK)) {
                    this.b.fireOnClick();
                }
            } catch (Exception unused) {
                TapjoyLog.w("TJAdUnitJSBridge", "Unable to triggerEvent. No event name.");
            }
        }
    }

    public void triggerMoatVideoEvent(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void triggerViewabilityEvent(JSONObject jSONObject, String str) {
        this.f.a(jSONObject, str);
    }

    public void unsetOrientation(JSONObject jSONObject, String str) {
        invokeJSCallback(str, Boolean.valueOf(this.b.unsetOrientation()));
    }

    public void invokeJSAdunitMethod(String str, Map<String, Object> map) {
        TJWebViewJSInterface tJWebViewJSInterface = this.f1645a;
        if (tJWebViewJSInterface != null) {
            tJWebViewJSInterface.callback(map, str, (String) null);
        }
    }

    public void invokeJSCallback(String str, Map<String, Object> map) {
        this.f1645a.callback(map, "", str);
    }
}
