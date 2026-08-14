package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1074bB implements C6N {
    public static String[] A02 = {"iWDBF2OKl3jtj3mE0UZLtkhUaVvUxXqs", "ms2LCEwCyzsqM8QDDj0PRev1P1CSm3w7", "hMtVrOKQMF9h", "gi6PEiuAAOhVuZEccjIoIAk9XYc1uF", "R32JKWcbl7Qu2cyp2LhmQehQDOktlipk", "kBJUlLOX6LAUVPMDIzawXbz3hNZwTKWy", "5r9f7V6KCkM3IvysTdnytDlDBRDUQAcw", "vGzO7SO4CN32udhBb2qyIGFDHHv1hOkX"};
    public final C1072b9 A00;
    public final C0946Xx A01;

    public C1074bB(C0946Xx c0946Xx) {
        this.A01 = c0946Xx;
        this.A00 = new C1072b9(c0946Xx);
    }

    public final C1072b9 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final void AE3(Throwable th) {
        if (th == null || AnonymousClass69.A00(this.A01) >= Math.random()) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        C1072b9 c1072b9 = this.A00;
        String strA02 = C6I.A04.A02();
        String strA022 = C6J.A06.A02();
        HashMap map = new HashMap();
        String message = th.getMessage();
        if (string != null) {
            int length = string.length();
            if (A02[1].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A02[5] = "Ct83iaSYEVOHUGfDQtOJkAbKybUxEBTx";
            if (length > 500) {
                string = string.substring(0, 500);
            }
        }
        c1072b9.A9A(strA02, strA022, map, null, message, string, th.getClass().getSimpleName());
    }
}
