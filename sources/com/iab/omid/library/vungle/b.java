package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.b.d;
import com.iab.omid.library.vungle.b.f;
import com.iab.omid.library.vungle.d.e;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1595a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.3.21-Vungle";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.vungle.b.b.a().a(context);
        com.iab.omid.library.vungle.d.b.a(context);
        d.a().a(context);
    }

    void a(boolean z) {
        this.f1595a = z;
    }

    boolean b() {
        return this.f1595a;
    }
}
