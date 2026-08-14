package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1372a;
    private String b;
    private Map<String, String> c;
    private Map<String, String> d;
    private final JSONObject e;
    private String f;
    private final T g;
    private final int h;
    private int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    protected c(a<T> aVar) {
        this.f1372a = aVar.b;
        this.b = aVar.f1373a;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.c;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
    }

    public String a() {
        return this.f1372a;
    }

    public void a(String str) {
        this.f1372a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public Map<String, String> c() {
        return this.c;
    }

    public Map<String, String> d() {
        return this.d;
    }

    public JSONObject e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public T g() {
        return this.g;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.h - this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.m;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f1372a + ", backupEndpoint=" + this.f + ", httpMethod=" + this.b + ", httpHeaders=" + this.d + ", body=" + this.e + ", emptyResponse=" + this.g + ", initialRetryAttempts=" + this.h + ", retryAttemptsLeft=" + this.i + ", timeoutMillis=" + this.j + ", retryDelayMillis=" + this.k + ", exponentialRetries=" + this.l + ", retryOnAllErrors=" + this.m + ", encodingEnabled=" + this.n + ", gzipBodyEncoding=" + this.o + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f1372a;
        if (str == null ? cVar.f1372a != null : !str.equals(cVar.f1372a)) {
            return false;
        }
        Map<String, String> map = this.c;
        if (map == null ? cVar.c != null : !map.equals(cVar.c)) {
            return false;
        }
        Map<String, String> map2 = this.d;
        if (map2 == null ? cVar.d != null : !map2.equals(cVar.d)) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null ? cVar.f != null : !str2.equals(cVar.f)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null ? cVar.b != null : !str3.equals(cVar.b)) {
            return false;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null ? cVar.e != null : !jSONObject.equals(cVar.e)) {
            return false;
        }
        T t = this.g;
        if (t == null ? cVar.g == null : t.equals(cVar.g)) {
            return this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f1372a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.g;
        int iHashCode5 = ((((((((((((((((iHashCode4 + (t != null ? t.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0);
        Map<String, String> map = this.c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    public static <T> a<T> a(p pVar) {
        return new a<>(pVar);
    }

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f1373a;
        String b;
        String c;
        Map<String, String> e;
        JSONObject f;
        T g;
        int i;
        int j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;
        int h = 1;
        Map<String, String> d = CollectionUtils.map();

        public a(p pVar) {
            this.i = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.df)).intValue();
            this.j = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.de)).intValue();
            this.l = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dd)).booleanValue();
            this.m = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fb)).booleanValue();
            this.n = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.fg)).booleanValue();
        }

        public a<T> a(String str) {
            this.b = str;
            return this;
        }

        public a<T> b(String str) {
            this.f1373a = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public a<T> c(String str) {
            this.c = str;
            return this;
        }

        public a<T> a(T t) {
            this.g = t;
            return this;
        }

        public a<T> a(int i) {
            this.h = i;
            return this;
        }

        public a<T> b(int i) {
            this.i = i;
            return this;
        }

        public a<T> c(int i) {
            this.j = i;
            return this;
        }

        public a<T> a(boolean z) {
            this.k = z;
            return this;
        }

        public a<T> b(boolean z) {
            this.l = z;
            return this;
        }

        public a<T> c(boolean z) {
            this.m = z;
            return this;
        }

        public a<T> d(boolean z) {
            this.n = z;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }
    }
}
