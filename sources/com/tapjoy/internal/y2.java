package com.tapjoy.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class y2 {
    public static y2 b = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1948a;

    public Context a() {
        return this.f1948a;
    }

    public void a(Context context) {
        this.f1948a = context != null ? context.getApplicationContext() : null;
    }
}
