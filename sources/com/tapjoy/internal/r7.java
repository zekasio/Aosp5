package com.tapjoy.internal;

import android.graphics.Rect;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class r7 {
    public static final u0<r7> h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1899a;
    public final String b;
    public final boolean c;
    public final String d;
    public String e;
    public String f;
    public final k6 g;

    public static class a implements u0<r7> {
        @Override // com.tapjoy.internal.u0
        public r7 a(z0 z0Var) throws IOException {
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            Rect rect = null;
            String strW = null;
            String strE = null;
            String strE2 = null;
            o7 o7VarA = null;
            String strW2 = "";
            boolean zP = false;
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("region".equals(strT)) {
                    rect = (Rect) a1Var.a(v0.b);
                } else if ("value".equals(strT)) {
                    strW = a1Var.w();
                } else if ("dismiss".equals(strT)) {
                    zP = a1Var.p();
                } else if ("url".equals(strT)) {
                    strW2 = a1Var.w();
                } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(strT)) {
                    strE = a1Var.e();
                } else if ("ad_content".equals(strT)) {
                    strE2 = a1Var.e();
                } else if (o7.a(strT)) {
                    o7VarA = o7.a(strT, a1Var);
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return new r7(rect, strW, zP, strW2, strE, strE2, o7VarA);
        }
    }

    public r7(Rect rect, String str, boolean z, String str2, String str3, String str4, k6 k6Var) {
        this.f1899a = rect;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = k6Var;
    }
}
