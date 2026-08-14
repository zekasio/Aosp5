package com.applovin.impl.mediation.debugger.b.c;

import android.content.Context;
import com.applovin.impl.sdk.utils.h;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1037a;
    private final String b;
    private final boolean c;

    d(String str, String str2, Context context) {
        this.f1037a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = h.a(str, context);
    }

    public String a() {
        return this.f1037a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
