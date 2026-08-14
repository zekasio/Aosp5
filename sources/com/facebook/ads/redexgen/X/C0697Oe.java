package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0697Oe {
    public static final int A00 = Lr.A01.heightPixels;
    public static final int A01 = Lr.A01.widthPixels;

    public static float A00(C1B c1b) {
        int iA01 = c1b.A0D().A01();
        int height = c1b.A0D().A00();
        if (height > 0) {
            return iA01 / height;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        return (int) (((double) (A01 - (AbstractC0698Of.A08 * 2))) / d);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = MS.A01(16);
        int i = OQ.A0A * 2;
        int ctaSpacing = AbstractC0698Of.A08;
        int ctaMargin2 = ctaMargin + i + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d) {
        return d < 0.9d;
    }

    public static boolean A04(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A05(int i, int i2, double d) {
        return i == 2 || A04(d, i2);
    }
}
