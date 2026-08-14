package com.tapjoy;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJWebViewJSInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<String> f1713a = new ConcurrentLinkedQueue<>();
    public WebView b;
    public TJWebViewJSInterfaceListener c;
    public boolean d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebView f1714a;
        public String b;

        public a(TJWebViewJSInterface tJWebViewJSInterface, WebView webView, String str) {
            this.f1714a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1714a != null) {
                if (!this.b.startsWith("javascript:")) {
                    try {
                        this.f1714a.loadUrl(this.b);
                        return;
                    } catch (Exception e) {
                        TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                        StringBuilder sbA = w1.a("Exception in loadUrl. Device not supported. ");
                        sbA.append(e.toString());
                        TapjoyLog.e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType, sbA.toString()));
                        return;
                    }
                }
                try {
                    String strReplaceFirst = this.b.replaceFirst("javascript:", "");
                    this.b = strReplaceFirst;
                    WebView webView = this.f1714a;
                    if (webView == null) {
                        return;
                    }
                    webView.evaluateJavascript(strReplaceFirst, null);
                } catch (Exception e2) {
                    TapjoyErrorMessage.ErrorType errorType2 = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    StringBuilder sbA2 = w1.a("Exception in evaluateJavascript. Device not supported. ");
                    sbA2.append(e2.toString());
                    TapjoyLog.e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType2, sbA2.toString()));
                }
            }
        }
    }

    public TJWebViewJSInterface(WebView webView, TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener) {
        this.b = webView;
        this.c = tJWebViewJSInterfaceListener;
    }

    public void callback(ArrayList<?> arrayList, String str, String str2) {
        try {
            callbackToJavaScript(new JSONArray((Collection) arrayList), str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callbackToJavaScript(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ARGUMENTS, obj);
            if (str != null && str.length() > 0) {
                jSONObject.put("method", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put(TJAdUnitConstants.String.CALLBACK_ID, str2);
            }
            jSONObject2.put(TJAdUnitConstants.String.DATA, jSONObject);
            String str3 = "javascript:if(window.AndroidWebViewJavascriptBridge) AndroidWebViewJavascriptBridge._handleMessageFromAndroid('" + jSONObject2 + "');";
            if (!this.d) {
                this.f1713a.add(str3);
                return;
            }
            WebView webView = this.b;
            if (webView != null) {
                TapjoyUtil.runOnMainThread(new a(this, webView, str3));
            } else {
                TapjoyLog.w("TJWebViewJSInterface", "No available webview to execute js");
            }
        } catch (Exception e) {
            StringBuilder sbA = w1.a("Exception in callback to JS: ");
            sbA.append(e.toString());
            TapjoyLog.e("TJWebViewJSInterface", sbA.toString());
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public void dispatchMethod(String str) {
        TapjoyLog.d("TJWebViewJSInterface", "dispatchMethod params: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getJSONObject(TJAdUnitConstants.String.DATA).getString("method");
            TapjoyLog.d("TJWebViewJSInterface", "method: " + string);
            TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener = this.c;
            if (tJWebViewJSInterfaceListener == null || this.b == null) {
                return;
            }
            tJWebViewJSInterfaceListener.onDispatchMethod(string, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void flushMessageQueue() {
        if (this.d) {
            return;
        }
        while (true) {
            String strPoll = this.f1713a.poll();
            if (strPoll == null) {
                this.d = true;
                return;
            } else {
                WebView webView = this.b;
                if (webView != null) {
                    TapjoyUtil.runOnMainThread(new a(this, webView, strPoll));
                }
            }
        }
    }

    public void callback(Map<?, ?> map, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            callbackToJavaScript(jSONArray, str, str2);
        } catch (Exception e) {
            StringBuilder sbA = w1.a("Exception in callback to JS: ");
            sbA.append(e.toString());
            TapjoyLog.e("TJWebViewJSInterface", sbA.toString());
            e.printStackTrace();
        }
    }
}
