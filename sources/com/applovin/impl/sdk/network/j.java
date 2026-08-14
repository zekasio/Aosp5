package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1392a;
    private String b;
    private String c;
    private String d;
    private Map<String, String> e;
    private Map<String, String> f;
    private Map<String, Object> g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private int m;

    public boolean p() {
        return this.j;
    }

    j(JSONObject jSONObject, p pVar) throws Exception {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, Object> map3;
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        if (JsonUtils.valueExists(jSONObject, "parameters")) {
            map = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters")));
        } else {
            map = CollectionUtils.map();
        }
        if (JsonUtils.valueExists(jSONObject, "httpHeaders")) {
            map2 = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders")));
        } else {
            map2 = CollectionUtils.map();
        }
        if (JsonUtils.valueExists(jSONObject, "requestBody")) {
            map3 = Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody")));
        } else {
            map3 = CollectionUtils.map();
        }
        this.f1392a = string;
        this.b = string3;
        this.l = string2;
        this.c = string4;
        this.d = string5;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.j = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.k = jSONObject.optBoolean("shouldFireInWebView", false);
        this.m = i;
    }

    private j(a aVar) {
        this.f1392a = UUID.randomUUID().toString();
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.f1393a;
        this.m = 0;
    }

    String a() {
        return this.b;
    }

    String b() {
        return this.c;
    }

    String c() {
        return this.d;
    }

    Map<String, String> d() {
        return this.e;
    }

    Map<String, String> e() {
        return this.f;
    }

    Map<String, Object> f() {
        return this.g;
    }

    boolean g() {
        return this.h;
    }

    boolean h() {
        return this.i;
    }

    boolean i() {
        return this.k;
    }

    String j() {
        return this.l;
    }

    int k() {
        return this.m;
    }

    void l() {
        this.m++;
    }

    void m() {
        Map<String, String> map = CollectionUtils.map(this.e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.e = map;
    }

    JSONObject n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f1392a);
        jSONObject.put("communicatorRequestId", this.l);
        jSONObject.put("httpMethod", this.b);
        jSONObject.put("targetUrl", this.c);
        jSONObject.put("backupUrl", this.d);
        jSONObject.put("isEncodingEnabled", this.h);
        jSONObject.put("gzipBodyEncoding", this.i);
        jSONObject.put("isAllowedPreInitEvent", this.j);
        jSONObject.put("attemptNumber", this.m);
        if (this.e != null) {
            jSONObject.put("parameters", new JSONObject(this.e));
        }
        if (this.f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f));
        }
        if (this.g != null) {
            jSONObject.put("requestBody", new JSONObject(this.g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f1392a + "', communicatorRequestId='" + this.l + "', httpMethod='" + this.b + "', targetUrl='" + this.c + "', backupUrl='" + this.d + "', attemptNumber=" + this.m + ", isEncodingEnabled=" + this.h + ", isGzipBodyEncoding=" + this.i + ", isAllowedPreInitEvent=" + this.j + ", shouldFireInWebView=" + this.k + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1392a.equals(((j) obj).f1392a);
    }

    public int hashCode() {
        return this.f1392a.hashCode();
    }

    public static a o() {
        return new a();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1393a;
        private String b;
        private String c;
        private String d;
        private Map<String, String> e;
        private Map<String, String> f;
        private Map<String, Object> g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;

        public a a(String str) {
            this.f1393a = str;
            return this;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.d = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f = map;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.g = map;
            return this;
        }

        public a a(boolean z) {
            this.h = z;
            return this;
        }

        public a b(boolean z) {
            this.i = z;
            return this;
        }

        public a c(boolean z) {
            this.j = z;
            return this;
        }

        public a d(boolean z) {
            this.k = z;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }
}
