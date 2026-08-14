package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1210dT extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C1209dS A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1210dT(C1209dS c1209dS) {
        this.A00 = c1209dS;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A00.A02.A0D().AFY();
        this.A00.A04.loadUrl(A00(0, 11, 35) + this.A00.A00.A03());
    }
}
