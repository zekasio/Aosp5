package com.tapjoy.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0<Point> f1926a = new a();
    public static final u0<Rect> b = new b();

    public static class a implements u0<Point> {
        @Override // com.tapjoy.internal.u0
        public Point a(z0 z0Var) throws IOException {
            Point point = new Point();
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("x".equals(strT)) {
                    point.x = a1Var.r();
                } else if ("y".equals(strT)) {
                    point.y = a1Var.r();
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return point;
        }
    }

    public static class b implements u0<Rect> {
        @Override // com.tapjoy.internal.u0
        public Rect a(z0 z0Var) throws IOException {
            Rect rect = new Rect();
            a1 a1Var = (a1) z0Var;
            int iOrdinal = a1Var.y().ordinal();
            if (iOrdinal == 0) {
                a1Var.j();
                rect.left = a1Var.r();
                rect.top = a1Var.r();
                rect.right = a1Var.r();
                rect.bottom = a1Var.r();
                while (a1Var.o()) {
                    a1Var.B();
                }
                a1Var.m();
            } else {
                if (iOrdinal != 2) {
                    StringBuilder sbA = w1.a("Unexpected token: ");
                    sbA.append(a1Var.y());
                    throw new IllegalStateException(sbA.toString());
                }
                a1Var.k();
                while (a1Var.o()) {
                    String strT = a1Var.t();
                    if (TJAdUnitConstants.String.LEFT.equals(strT)) {
                        rect.left = a1Var.r();
                    } else if (TJAdUnitConstants.String.TOP.equals(strT)) {
                        rect.top = a1Var.r();
                    } else if (TJAdUnitConstants.String.RIGHT.equals(strT)) {
                        rect.right = a1Var.r();
                    } else if (TJAdUnitConstants.String.BOTTOM.equals(strT)) {
                        rect.bottom = a1Var.r();
                    } else {
                        a1Var.B();
                    }
                }
                a1Var.n();
            }
            return rect;
        }
    }
}
