package com.tapjoy.internal;

import android.os.Handler;
import android.webkit.WebView;
import com.vungle.warren.AdLoader;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m3 extends k3 {
    public WebView f;
    public Long g = null;
    public final Map<String, p2> h;
    public final String i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebView f1850a;

        public a() {
            this.f1850a = m3.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1850a.destroy();
        }
    }

    public m3(Map<String, p2> map, String str) {
        this.h = map;
        this.i = str;
    }

    @Override // com.tapjoy.internal.k3
    public void a() {
        super.a();
        WebView webView = new WebView(y2.b.a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f);
        a3.f1744a.a(this.f, this.i);
        for (String str : this.h.keySet()) {
            a3.f1744a.a(this.f, this.h.get(str).b.toExternalForm(), str);
        }
        this.g = Long.valueOf(System.nanoTime());
    }

    @Override // com.tapjoy.internal.k3
    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.g.longValue(), TimeUnit.NANOSECONDS)), AdLoader.RETRY_DELAY));
        this.f = null;
    }

    @Override // com.tapjoy.internal.k3
    public void a(q2 q2Var, h2 h2Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(h2Var.d);
        for (String str : mapUnmodifiableMap.keySet()) {
            h3.a(jSONObject, str, (p2) mapUnmodifiableMap.get(str));
        }
        a(q2Var, h2Var, jSONObject);
    }
}
