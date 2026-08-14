package com.tapjoy.internal;

import android.graphics.Point;
import android.os.SystemClock;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class v7 extends p7 {
    public static final u0<v7> m = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y7 f1932a;
    public y7 b;
    public y7 c;
    public Point d;
    public y7 e;
    public y7 f;
    public String g;
    public k6 h;
    public ArrayList<r7> i = new ArrayList<>();
    public ArrayList<r7> j = new ArrayList<>();
    public Map<String, Object> k;
    public w7 l;

    public static class a implements u0<v7> {
        @Override // com.tapjoy.internal.u0
        public v7 a(z0 z0Var) {
            return new v7(z0Var);
        }
    }

    public v7() {
    }

    public boolean a() {
        return (this.c == null || this.b == null || this.f == null) ? false : true;
    }

    public boolean b() {
        return (this.c == null || this.f1932a == null || this.e == null) ? false : true;
    }

    public v7(z0 z0Var) throws IOException {
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        String strE = null;
        String strE2 = null;
        while (a1Var.o()) {
            String strT = a1Var.t();
            if ("frame".equals(strT)) {
                a1Var.k();
                while (a1Var.o()) {
                    String strT2 = a1Var.t();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(strT2)) {
                        this.f1932a = y7.f.a(a1Var);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(strT2)) {
                        this.b = y7.f.a(a1Var);
                    } else if ("close_button".equals(strT2)) {
                        this.c = y7.f.a(a1Var);
                    } else if ("close_button_offset".equals(strT2)) {
                        this.d = v0.f1926a.a(a1Var);
                    } else {
                        a1Var.B();
                    }
                }
                a1Var.n();
            } else if (VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(strT)) {
                a1Var.k();
                while (a1Var.o()) {
                    String strT3 = a1Var.t();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(strT3)) {
                        this.e = y7.f.a(a1Var);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(strT3)) {
                        this.f = y7.f.a(a1Var);
                    } else {
                        a1Var.B();
                    }
                }
                a1Var.n();
            } else if ("url".equals(strT)) {
                this.g = a1Var.e();
            } else if (Arrays.binarySearch(o7.f1874a, strT) >= 0) {
                this.h = o7.a(strT, a1Var);
            } else if ("mappings".equals(strT)) {
                a1Var.k();
                while (a1Var.o()) {
                    String strT4 = a1Var.t();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(strT4)) {
                        a1Var.a(this.i, r7.h);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(strT4)) {
                        a1Var.a(this.j, r7.h);
                    } else {
                        a1Var.B();
                    }
                }
                a1Var.n();
            } else if ("meta".equals(strT)) {
                this.k = a1Var.d();
            } else if ("ttl".equals(strT)) {
                a1Var.q();
                SystemClock.elapsedRealtime();
            } else if ("no_more_today".equals(strT)) {
                this.l = w7.d.a(a1Var);
            } else if ("ad_content".equals(strT)) {
                strE2 = a1Var.e();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(strT)) {
                strE = a1Var.e();
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
        if (this.g == null) {
            this.g = "";
        }
        ArrayList<r7> arrayList = this.i;
        if (arrayList != null) {
            for (r7 r7Var : arrayList) {
                if (r7Var.f == null) {
                    r7Var.f = strE2;
                }
                if (r7Var.e == null) {
                    r7Var.e = strE;
                }
            }
        }
        ArrayList<r7> arrayList2 = this.j;
        if (arrayList2 != null) {
            for (r7 r7Var2 : arrayList2) {
                if (r7Var2.f == null) {
                    r7Var2.f = strE2;
                }
                if (r7Var2.e == null) {
                    r7Var2.e = strE;
                }
            }
        }
    }
}
