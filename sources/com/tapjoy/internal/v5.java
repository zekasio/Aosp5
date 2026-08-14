package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1929a;
    public Map<String, String> b = new HashMap();
    public String c;
    public String d;
    public TapjoyURLConnection e;
    public boolean f;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1930a;

        public a(Map map) {
            this.f1930a = map;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            v5.this.e.getResponseFromURL(v5.this.f1929a + v5.this.c, (Map<String, String>) null, (Map<String, String>) null, this.f1930a);
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1931a;

        public b(Map map) {
            this.f1931a = map;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            v5.this.e.getResponseFromURL(v5.this.f1929a + v5.this.d, (Map<String, String>) null, (Map<String, String>) null, this.f1931a);
        }
    }

    public v5(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f1929a = str;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.b.put(next, jSONObject.optString(next));
        }
        this.c = jSONObject2.optString(TJAdUnitConstants.String.BEACON_SHOW_PATH);
        this.d = jSONObject2.optString("error");
        this.e = new TapjoyURLConnection();
    }

    public void a() {
        if (TextUtils.isEmpty(this.c) || this.f) {
            return;
        }
        this.f = true;
        new a(new HashMap(this.b)).start();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        HashMap map = new HashMap(this.b);
        map.put("error", str);
        new b(map).start();
    }
}
