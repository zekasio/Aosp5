package com.applovin.impl.sdk.d;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1270a;
    private final String b;
    private final Map<String, String> c;
    private final boolean d;

    public a(String str, String str2) {
        this(str, str2, null, false);
    }

    public a(String str, String str2, Map<String, String> map, boolean z) {
        this.f1270a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
    }

    public String a() {
        return this.f1270a;
    }

    public String b() {
        return this.b;
    }

    public Map<String, String> c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f1270a + "', backupUrl='" + this.b + "', headers='" + this.c + "', shouldFireInWebView='" + this.d + "'}";
    }
}
