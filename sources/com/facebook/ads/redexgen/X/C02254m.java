package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02254m {
    public static String[] A00 = {"UqypfisWbLbbWLDfIVvpiaUsz0iS", "wEiCJDeLGzLJebV", "cX", "dRMEhdR7kDOm9Ob", "SmhGT229bW5LAFpAZzaxeRYqKvMDeGhX", "QcSoUKFtoryhyFMFYIfDI81ChPsDlMu7", "SBvSWfqovIH0ljTVzoffsyrdWCNw", "n"};

    public static int A00(C02214i c02214i, C4D c4d, View view, View view2, C4T c4t, boolean z) {
        if (c4t.A0W() == 0 || c02214i.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(c4t.A0p(view) - c4t.A0p(view2)) + 1;
        }
        int iA0C = c4d.A0C(view2);
        int iA0F = c4d.A0F(view);
        String[] strArr = A00;
        if (strArr[4].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[3] = "xd2oZUwi45Npmqe";
        strArr2[1] = "1k2xoHfklbXXQiR";
        return Math.min(c4d.A0B(), iA0C - iA0F);
    }

    public static int A01(C02214i c02214i, C4D c4d, View view, View view2, C4T c4t, boolean z) {
        if (c4t.A0W() == 0 || c02214i.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c02214i.A03();
        }
        return (int) (((c4d.A0C(view2) - c4d.A0F(view)) / (Math.abs(c4t.A0p(view) - c4t.A0p(view2)) + 1)) * c02214i.A03());
    }

    public static int A02(C02214i c02214i, C4D c4d, View view, View view2, C4T c4t, boolean z, boolean z2) {
        int iMax;
        if (c4t.A0W() != 0) {
            int iA03 = c02214i.A03();
            String[] strArr = A00;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[6] = "xSzU3PMpL9LC7k2G9V08vNIV3nIP";
            strArr2[0] = "UsrmTbcEPDcBULmsiiLKltF5MwgK";
            if (iA03 != 0 && view != null && view2 != null) {
                int iMin = Math.min(c4t.A0p(view), c4t.A0p(view2));
                int iMax2 = Math.max(c4t.A0p(view), c4t.A0p(view2));
                if (z2) {
                    iMax = Math.max(0, (c02214i.A03() - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!z) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(c4d.A0C(view2) - c4d.A0F(view)) / (Math.abs(c4t.A0p(view) - c4t.A0p(view2)) + 1))) + (c4d.A0A() - c4d.A0F(view)));
            }
        }
        return 0;
    }
}
