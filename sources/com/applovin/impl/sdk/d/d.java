package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1274a;
    private final g b;

    public static void a(long j, AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public static void a(AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, p pVar) {
    }

    public void a() {
    }

    public void a(long j) {
    }

    public void b() {
    }

    public void b(long j) {
    }

    public void c() {
    }

    public void c(long j) {
    }

    public void d() {
    }

    public void d(long j) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public d(AppLovinAdImpl appLovinAdImpl, p pVar) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1274a = pVar;
        this.b = pVar.P();
    }
}
