package com.applovin.impl.sdk.e;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1280a;
    private boolean b;
    protected final com.applovin.impl.sdk.p f;
    protected final String g;
    protected final com.applovin.impl.sdk.y h;

    public boolean g() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public a(String str, com.applovin.impl.sdk.p pVar) {
        this(str, pVar, false);
    }

    public a(String str, com.applovin.impl.sdk.p pVar, boolean z) {
        this.g = str;
        this.f = pVar;
        this.h = pVar.L();
        this.f1280a = com.applovin.impl.sdk.p.y();
        this.b = z;
    }

    protected com.applovin.impl.sdk.p d() {
        return this.f;
    }

    public String e() {
        return this.g;
    }

    protected Context f() {
        return this.f1280a;
    }
}
