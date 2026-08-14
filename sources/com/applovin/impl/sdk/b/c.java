package com.applovin.impl.sdk.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1259a;
    private Map<String, String> b;

    public static c a(String str) {
        return a(str, null);
    }

    public static c a(String str, Map<String, String> map) {
        return new c(str, map);
    }

    private c(String str, Map<String, String> map) {
        this.f1259a = str;
        this.b = map;
    }

    public Map<String, String> a() {
        return this.b;
    }

    public String b() {
        return this.f1259a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f1259a + "'params='" + this.b + "'}";
    }
}
