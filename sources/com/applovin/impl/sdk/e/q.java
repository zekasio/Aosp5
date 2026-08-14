package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.mediation.j;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q extends com.applovin.impl.sdk.e.a implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f1308a;
    private AppLovinAdLoadListener b;
    private com.applovin.impl.adview.d c;

    public q(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessJavaScriptTagAd", pVar);
        this.f1308a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, pVar);
        this.b = appLovinAdLoadListener;
        pVar.ar().a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Rendering AppLovin ad #" + this.f1308a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    q qVar = q.this;
                    q qVar2 = q.this;
                    qVar.c = new com.applovin.impl.adview.d(new a(qVar2.f), q.this.f, q.this.f());
                    q.this.c.loadDataWithBaseURL(q.this.f1308a.aw(), q.this.f1308a.b(), "text/html", null, "");
                } catch (Throwable th) {
                    q.this.f.ar().b(q.this);
                    com.applovin.impl.sdk.y yVar2 = q.this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        q.this.h.b(q.this.g, "Failed to initialize WebView", th);
                    }
                    if (q.this.b != null) {
                        q.this.b.failedToReceiveAd(-1);
                        q.this.b = null;
                    }
                }
            }
        });
    }

    @Override // com.applovin.impl.mediation.j.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.h().equalsIgnoreCase(this.f1308a.N())) {
            this.f.ar().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.b;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f1308a);
                this.b = null;
            }
        }
    }

    private class a extends com.applovin.impl.adview.e {
        private a(com.applovin.impl.sdk.p pVar) {
            super(null, pVar);
        }

        @Override // com.applovin.impl.adview.e
        protected boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.y yVar = q.this.h;
            if (com.applovin.impl.sdk.y.a()) {
                q.this.h.c(q.this.g, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.d)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (!a(scheme, com.applovin.impl.sdk.c.b.cp)) {
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.cq)) {
                com.applovin.impl.sdk.y yVar2 = q.this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    q.this.h.b(q.this.g, "Ad load succeeded");
                }
                if (q.this.b == null) {
                    return true;
                }
                q.this.b.adReceived(q.this.f1308a);
                q.this.b = null;
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.cr)) {
                com.applovin.impl.sdk.y yVar3 = q.this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    q.this.h.b(q.this.g, "Ad load failed");
                }
                if (q.this.b == null) {
                    return true;
                }
                q.this.b.failedToReceiveAd(204);
                q.this.b = null;
                return true;
            }
            com.applovin.impl.sdk.y yVar4 = q.this.h;
            if (!com.applovin.impl.sdk.y.a()) {
                return true;
            }
            q.this.h.e(q.this.g, "Unrecognized webview event");
            return true;
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            Iterator<String> it = q.this.f.b(bVar).iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
