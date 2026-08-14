package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1561a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.1-Applovin";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.applovin.internal.b.g().a(context);
        com.iab.omid.library.applovin.utils.a.a(context);
        com.iab.omid.library.applovin.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.applovin.internal.a.a().a(context);
    }

    void a(boolean z) {
        this.f1561a = z;
    }

    boolean b() {
        return this.f1561a;
    }

    void c() {
        g.a();
        com.iab.omid.library.applovin.internal.a.a().d();
    }
}
