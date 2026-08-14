package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0800Sd implements P9 {
    public static byte[] A01;
    public static String[] A02 = {"0PGepnyvQncL93SwwJBKfYdUcygiJGu5", "mA1Oa6p2jIMu30EggfbRnzpoMhUl4ssl", "uwNPSbrm", "iNgEEx1gRKfrkJTOWqECaM4K08S9ZrIg", "vqVg9oljZl3AjvyleCGqLOYkhmYrxu", "amhtUlMIP3hZuFCKepG62aSokShv2UYv", "BTFyXEOVMEP0nOw0jY0q9zOCSLZ2OeYc", "tcCWg0XVw1JTHEC59N6ZXoklrHSl9wSv"};
    public final /* synthetic */ A1 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
            String[] strArr = A02;
            if (strArr[0].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WujDwNVbN3bAuExlfya79vhQsxgnNgQM";
            strArr2[5] = "dVRJVduTnq2Mgx4vxcEM2Hhpe9jWwRq5";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{91, 90, 44, 111, 126, 109, 127, 100, 105, 104, 87, 69, 66, 127, 86, 73, 69, 87};
    }

    static {
        A01();
    }

    public C0800Sd(A1 a1) {
        this.A00 = a1;
    }

    @Override // com.facebook.ads.redexgen.X.P9
    public final void ABx() {
        C0946Xx c0946XxA00 = C8T.A00();
        if (c0946XxA00 != null) {
            c0946XxA00.A06().A8y(A00(10, 8, 19), C03298z.A2d, new AnonymousClass90(A00(0, 10, 63)));
        }
    }
}
