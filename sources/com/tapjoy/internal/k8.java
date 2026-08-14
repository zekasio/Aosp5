package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k8 extends j8<a> {
    public final z6 d;
    public final b5 e;
    public final v4 f;
    public final i5 g;
    public Context h;
    public final String i;
    public boolean j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g7 f1840a;
        public final List<String> b;

        public a(g7 g7Var, List<String> list) {
            this.f1840a = g7Var;
            this.b = list;
        }
    }

    public k8(z6 z6Var, b5 b5Var, v4 v4Var, i5 i5Var, String str, boolean z, Context context) {
        this.d = z6Var;
        this.e = b5Var;
        this.f = v4Var;
        this.g = i5Var;
        this.i = str;
        this.j = z;
        this.h = context;
    }

    @Override // com.tapjoy.internal.j8, com.tapjoy.internal.n1
    public Object a() {
        a aVar = (a) super.a();
        g7 g7Var = aVar.f1840a;
        if (!(g7Var instanceof f7)) {
            g7Var.b();
            if (!aVar.f1840a.a()) {
                aVar.f1840a = new f7();
            }
        }
        return aVar;
    }

    @Override // com.tapjoy.internal.j8, com.tapjoy.internal.n1
    public Map<String, Object> b() {
        Map<String, Object> mapB = super.b();
        mapB.put(TJAdUnitConstants.String.VIDEO_INFO, new y0(com.tapjoy.internal.a.a(this.e)));
        mapB.put(TapjoyConstants.TJC_APP_PLACEMENT, new y0(com.tapjoy.internal.a.a(this.f)));
        mapB.put("user", new y0(com.tapjoy.internal.a.a(this.g, (w4) null)));
        mapB.put("placement", this.i);
        return mapB;
    }

    @Override // com.tapjoy.internal.n1
    public String c() {
        return "placement";
    }

    @Override // com.tapjoy.internal.j8, com.tapjoy.internal.n1
    public Object a(z0 z0Var) throws IOException {
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        v7 v7Var = null;
        q7 q7Var = null;
        List listC = null;
        while (a1Var.o()) {
            String strT = a1Var.t();
            if ("interstitial".equals(strT)) {
                v7Var = (v7) a1Var.b(v7.m);
            } else if ("contextual_button".equals(strT)) {
                q7Var = (q7) a1Var.b(q7.d);
            } else if ("enabled_placements".equals(strT)) {
                listC = a1Var.c();
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
        if (v7Var != null && (v7Var.b() || v7Var.a())) {
            return new a(new e7(this.d, this.i, v7Var, this.h), listC);
        }
        if (q7Var != null) {
            return new a(new u6(this.d, this.i, q7Var, this.h), listC);
        }
        return new a(new f7(), listC);
    }
}
