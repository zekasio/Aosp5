package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f1501a = new t();
    protected String b;
    protected final List<t> c;
    private final t d;
    private final String e;
    private final Map<String, String> f;

    public t(String str, Map<String, String> map, t tVar) {
        this.d = tVar;
        this.e = str;
        this.f = Collections.unmodifiableMap(map);
        this.c = new ArrayList();
    }

    private t() {
        this.d = null;
        this.e = "";
        this.f = Collections.emptyMap();
        this.b = "";
        this.c = Collections.emptyList();
    }

    public String a() {
        return this.e;
    }

    public Map<String, String> b() {
        return this.f;
    }

    public String c() {
        return this.b;
    }

    public List<t> d() {
        return Collections.unmodifiableList(this.c);
    }

    public List<t> a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        for (t tVar : this.c) {
            if (str.equalsIgnoreCase(tVar.a())) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public t b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (t tVar : this.c) {
            if (str.equalsIgnoreCase(tVar.a())) {
                return tVar;
            }
        }
        return null;
    }

    public t c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.c.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            t tVar = (t) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(tVar.a())) {
                return tVar;
            }
            arrayList.addAll(tVar.d());
        }
        return null;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.e + "', text='" + this.b + "', attributes=" + this.f + '}';
    }
}
