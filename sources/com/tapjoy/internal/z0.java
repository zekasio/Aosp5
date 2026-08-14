package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0 implements b1, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, Object> f1955a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f1956a;

        public z0 a(InputStream inputStream) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            return new a1(inputStreamReader);
        }

        public abstract z0 a(String str);
    }

    public static z0 a(InputStream inputStream) {
        a aVar = a.f1956a;
        if (aVar == null) {
            aVar = a1.q;
            a.f1956a = aVar;
        }
        return aVar.a(inputStream);
    }

    public static z0 b(String str) {
        a aVar = a.f1956a;
        if (aVar == null) {
            aVar = a1.q;
            a.f1956a = aVar;
        }
        return aVar.a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> List<E> c() throws IOException {
        LinkedList linkedList = new LinkedList();
        a1 a1Var = (a1) this;
        a1Var.j();
        while (a1Var.o()) {
            linkedList.add(g());
        }
        a1Var.m();
        return linkedList;
    }

    public Map<String, Object> d() throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        return linkedHashMap;
    }

    public String e() {
        if (h()) {
            return null;
        }
        return ((a1) this).w();
    }

    public URL f() throws h1 {
        HashMap<String, Object> map = this.f1955a;
        URI uri = (URI) (map != null ? map.get("BASE_URI") : null);
        if (uri == null) {
            return new URL(((a1) this).w());
        }
        try {
            return uri.resolve(new URI(((a1) this).w())).toURL();
        } catch (URISyntaxException e) {
            throw new h1(e);
        }
    }

    public Object g() throws IOException {
        a1 a1Var = (a1) this;
        e1 e1VarY = a1Var.y();
        int iOrdinal = e1VarY.ordinal();
        if (iOrdinal == 0) {
            return c();
        }
        if (iOrdinal == 2) {
            return d();
        }
        if (iOrdinal == 5) {
            return a1Var.w();
        }
        if (iOrdinal == 6) {
            return new u1(a1Var.w());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(a1Var.p());
        }
        if (iOrdinal == 8) {
            a1Var.v();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + e1VarY);
    }

    public boolean h() throws IOException {
        a1 a1Var = (a1) this;
        if (a1Var.y() != e1.NULL) {
            return false;
        }
        a1Var.v();
        return true;
    }

    public boolean a() {
        return ((a1) this).y() == e1.BEGIN_OBJECT;
    }

    public boolean b() {
        return ((a1) this).y() == e1.STRING;
    }

    public String a(String str) {
        return h() ? str : ((a1) this).w();
    }

    public <T> T b(u0<T> u0Var) {
        if (h()) {
            return null;
        }
        return u0Var.a(this);
    }

    public void a(Map map) throws IOException {
        a1 a1Var = (a1) this;
        a1Var.k();
        while (a1Var.o()) {
            map.put(a1Var.t(), g());
        }
        a1Var.n();
    }

    public <T> T a(u0<T> u0Var) {
        return u0Var.a(this);
    }

    public <T> void a(List<T> list, u0<T> u0Var) throws IOException {
        a1 a1Var = (a1) this;
        a1Var.j();
        while (a1Var.o()) {
            list.add(u0Var.a(this));
        }
        a1Var.m();
    }
}
