package com.tapjoy.internal;

import android.graphics.Point;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class w7 {
    public static final u0<w7> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7 f1937a;
    public final Point b;
    public final Point c;

    public static class a implements u0<w7> {
        @Override // com.tapjoy.internal.u0
        public w7 a(z0 z0Var) throws IOException {
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            y7 y7Var = null;
            Point pointB = null;
            Point pointB2 = null;
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("image".equals(strT)) {
                    String strW = a1Var.w();
                    if (!TextUtils.isEmpty(strW)) {
                        y7Var = new y7(new URL(strW));
                    }
                } else if (TJAdUnitConstants.String.LANDSCAPE.equals(strT)) {
                    pointB = b(a1Var);
                } else if (TJAdUnitConstants.String.PORTRAIT.equals(strT)) {
                    pointB2 = b(a1Var);
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return new w7(y7Var, pointB, pointB2);
        }

        public Point b(z0 z0Var) throws IOException {
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            Point point = null;
            while (a1Var.o()) {
                if ("offset".equals(a1Var.t())) {
                    a1Var.k();
                    int iR = 0;
                    int iR2 = 0;
                    while (a1Var.o()) {
                        String strT = a1Var.t();
                        if ("x".equals(strT)) {
                            iR = a1Var.r();
                        } else if ("y".equals(strT)) {
                            iR2 = a1Var.r();
                        } else {
                            a1Var.B();
                        }
                    }
                    a1Var.n();
                    point = new Point(iR, iR2);
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return point;
        }
    }

    public w7(y7 y7Var, Point point, Point point2) {
        this.f1937a = y7Var;
        this.b = point;
        this.c = point2;
    }
}
