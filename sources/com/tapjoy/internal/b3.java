package com.tapjoy.internal;

import android.provider.Settings;
import com.tapjoy.internal.w2;

/* JADX INFO: loaded from: classes2.dex */
public class b3 implements a2, w2.a {
    public static b3 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1759a = 0.0f;
    public final c2 b;
    public final z1 c;
    public b2 d;
    public v2 e;

    public b3(c2 c2Var, z1 z1Var) {
        this.b = c2Var;
        this.c = z1Var;
    }

    public static b3 c() {
        if (f == null) {
            f = new b3(new c2(), new z1());
        }
        return f;
    }

    public void a(boolean z) {
        if (z) {
            o3.g.a();
        } else {
            o3.g.b();
        }
    }

    public void b() {
        o3 o3Var = o3.g;
        o3Var.b();
        o3Var.f1870a.clear();
        o3.h.post(new n3(o3Var));
        w2 w2Var = w2.d;
        w2Var.f1934a = false;
        w2Var.b = false;
        w2Var.c = null;
        b2 b2Var = this.d;
        b2Var.f1758a.getContentResolver().unregisterContentObserver(b2Var);
    }

    public void a() {
        w2 w2Var = w2.d;
        w2Var.c = this;
        w2Var.f1934a = true;
        w2Var.b = false;
        w2Var.a();
        o3.g.a();
        b2 b2Var = this.d;
        b2Var.e = b2Var.a();
        b2Var.b();
        b2Var.f1758a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, b2Var);
    }
}
