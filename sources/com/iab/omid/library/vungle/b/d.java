package com.iab.omid.library.vungle.b;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f1599a = new d();
    private Context b;

    private d() {
    }

    public static d a() {
        return f1599a;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.b;
    }
}
