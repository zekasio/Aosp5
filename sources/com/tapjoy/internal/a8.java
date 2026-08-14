package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a8 {
    public static final u0<a8> m = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c8 f1755a;
    public c8 b;
    public c8 c;
    public c8 d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public y7 k;
    public y7 l;

    public static class a implements u0<a8> {
        @Override // com.tapjoy.internal.u0
        public a8 a(z0 z0Var) {
            return new a8(z0Var);
        }
    }

    public a8(z0 z0Var) throws IOException {
        this.e = 9;
        this.f = 10;
        this.j = false;
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        while (a1Var.o()) {
            String strT = a1Var.t();
            if ("x".equals(strT)) {
                this.f1755a = c8.a(a1Var.w());
            } else if ("y".equals(strT)) {
                this.b = c8.a(a1Var.w());
            } else if (TJAdUnitConstants.String.WIDTH.equals(strT)) {
                this.c = c8.a(a1Var.w());
            } else if (TJAdUnitConstants.String.HEIGHT.equals(strT)) {
                this.d = c8.a(a1Var.w());
            } else if ("url".equals(strT)) {
                this.g = a1Var.w();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(strT)) {
                this.h = a1Var.w();
            } else if ("ad_content".equals(strT)) {
                this.i = a1Var.w();
            } else if ("dismiss".equals(strT)) {
                this.j = a1Var.p();
            } else if ("value".equals(strT)) {
                a1Var.w();
            } else if ("image".equals(strT)) {
                this.k = (y7) a1Var.a(y7.f);
            } else if ("image_clicked".equals(strT)) {
                this.l = (y7) a1Var.a(y7.f);
            } else if ("align".equals(strT)) {
                String strW = a1Var.w();
                if (TJAdUnitConstants.String.LEFT.equals(strW)) {
                    this.e = 9;
                } else if (TJAdUnitConstants.String.RIGHT.equals(strW)) {
                    this.e = 11;
                } else if ("center".equals(strW)) {
                    this.e = 14;
                } else {
                    a1Var.B();
                }
            } else if ("valign".equals(strT)) {
                String strW2 = a1Var.w();
                if (TJAdUnitConstants.String.TOP.equals(strW2)) {
                    this.f = 10;
                } else if ("middle".equals(strW2)) {
                    this.f = 15;
                } else if (TJAdUnitConstants.String.BOTTOM.equals(strW2)) {
                    this.f = 12;
                } else {
                    a1Var.B();
                }
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
    }
}
