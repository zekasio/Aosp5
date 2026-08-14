package com.tapjoy.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class z7 extends o7 implements o6 {
    public static final u0<z7> f = new a();
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public static class a implements u0<z7> {
        @Override // com.tapjoy.internal.u0
        public z7 a(z0 z0Var) throws IOException {
            a1 a1Var = (a1) z0Var;
            a1Var.k();
            String strW = null;
            String strW2 = null;
            String strW3 = null;
            int iR = 1;
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("id".equals(strT)) {
                    strW = a1Var.w();
                } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(strT)) {
                    strW2 = a1Var.w();
                } else if (FirebaseAnalytics.Param.QUANTITY.equals(strT)) {
                    iR = a1Var.r();
                } else if ("token".equals(strT)) {
                    strW3 = a1Var.w();
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            return new z7(strW, strW2, iR, strW3);
        }
    }

    public z7(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }
}
