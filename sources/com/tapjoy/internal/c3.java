package com.tapjoy.internal;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1767a;

    public String a() {
        return "1.3.16-tapjoy";
    }

    public void a(Context context) {
        a.a((Object) context, "Application Context cannot be null");
        if (this.f1767a) {
            return;
        }
        this.f1767a = true;
        b3 b3VarC = b3.c();
        b3VarC.d = b3VarC.b.a(new Handler(), context, b3VarC.c.a(), b3VarC);
        w2.d.a(context);
        h3.a(context);
        y2.b.a(context);
    }

    public boolean b() {
        return this.f1767a;
    }
}
