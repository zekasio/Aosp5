package com.tapjoy.internal;

import android.os.Build;
import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k3 {
    public e2 b;
    public s2 c;
    public long e = System.nanoTime();
    public a d = a.AD_STATE_IDLE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j3 f1834a = new j3(null);

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public void a() {
    }

    public void a(float f) {
        a3.f1744a.a(e(), f);
    }

    public void a(WebView webView) {
        this.f1834a = new j3(webView);
    }

    public void a(q2 q2Var, h2 h2Var) {
        a(q2Var, h2Var, null);
    }

    public void b() {
        this.f1834a.clear();
    }

    public void c() {
        a3.f1744a.a(e(), "finishSession", new Object[0]);
    }

    public void d() {
        a3.f1744a.a(e(), "publishImpressionEvent", new Object[0]);
    }

    public WebView e() {
        return this.f1834a.get();
    }

    public void f() {
        this.e = System.nanoTime();
        this.d = a.AD_STATE_IDLE;
    }

    public void a(g2 g2Var) {
        a3.f1744a.a(e(), "init", g2Var.c());
    }

    public void a(k2 k2Var, String str) {
        a3.f1744a.a(e(), k2Var, str);
    }

    public void a(q2 q2Var, h2 h2Var, JSONObject jSONObject) {
        String str = q2Var.h;
        JSONObject jSONObject2 = new JSONObject();
        h3.a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        h3.a(jSONObject2, "adSessionType", h2Var.h);
        JSONObject jSONObject3 = new JSONObject();
        h3.a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        h3.a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        h3.a(jSONObject3, "os", "Android");
        h3.a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        h3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        h3.a(jSONObject4, "partnerName", h2Var.f1808a.f1869a);
        h3.a(jSONObject4, "partnerVersion", h2Var.f1808a.b);
        h3.a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        h3.a(jSONObject5, "libraryVersion", "1.3.16-tapjoy");
        h3.a(jSONObject5, "appId", y2.b.f1948a.getApplicationContext().getPackageName());
        h3.a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject5);
        String str2 = h2Var.g;
        if (str2 != null) {
            h3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = h2Var.f;
        if (str3 != null) {
            h3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (p2 p2Var : Collections.unmodifiableList(h2Var.c)) {
            h3.a(jSONObject6, p2Var.f1879a, p2Var.c);
        }
        a3.f1744a.a(e(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public void a(String str) {
        a3.f1744a.a(e(), str, (JSONObject) null);
    }

    public void a(String str, JSONObject jSONObject) {
        a3.f1744a.a(e(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        a3.f1744a.a(e(), "publishLoadedEvent", jSONObject);
    }
}
