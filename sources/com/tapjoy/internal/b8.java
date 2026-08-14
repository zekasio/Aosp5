package com.tapjoy.internal;

import android.graphics.PointF;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class b8 {
    public static final u0<b8> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f1763a;
    public PointF b;
    public ArrayList<a8> c = new ArrayList<>();

    public static class a implements u0<b8> {
        @Override // com.tapjoy.internal.u0
        public b8 a(z0 z0Var) {
            return new b8(z0Var);
        }
    }

    public b8(z0 z0Var) throws IOException {
        this.f1763a = r.UNSPECIFIED;
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        while (a1Var.o()) {
            String strT = a1Var.t();
            if (TJAdUnitConstants.String.BUTTONS.equals(strT)) {
                if (a1Var.y() == e1.BEGIN_ARRAY) {
                    a1Var.a(this.c, a8.m);
                } else {
                    a1Var.B();
                }
            } else if ("window_aspect_ratio".equals(strT)) {
                if (a1Var.y() == e1.BEGIN_OBJECT) {
                    PointF pointF = new PointF();
                    a1Var.k();
                    while (a1Var.o()) {
                        String strT2 = a1Var.t();
                        if (TJAdUnitConstants.String.WIDTH.equals(strT2)) {
                            pointF.x = (float) a1Var.q();
                        } else if (TJAdUnitConstants.String.HEIGHT.equals(strT2)) {
                            pointF.y = (float) a1Var.q();
                        } else {
                            a1Var.B();
                        }
                    }
                    a1Var.n();
                    if (pointF.x != 0.0f && pointF.y != 0.0f) {
                        this.b = pointF;
                    }
                } else {
                    a1Var.B();
                }
            } else if (TJAdUnitConstants.String.ORIENTATION.equals(strT)) {
                String strW = a1Var.w();
                if (TJAdUnitConstants.String.LANDSCAPE.equals(strW)) {
                    this.f1763a = r.LANDSCAPE;
                } else if (TJAdUnitConstants.String.PORTRAIT.equals(strW)) {
                    this.f1763a = r.PORTRAIT;
                }
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
    }

    public boolean a() {
        y7 y7Var;
        for (a8 a8Var : this.c) {
            y7 y7Var2 = a8Var.k;
            if ((y7Var2 != null && y7Var2.b == null && y7Var2.c == null) || ((y7Var = a8Var.l) != null && y7Var.b == null && y7Var.c == null)) {
                return false;
            }
        }
        return true;
    }
}
