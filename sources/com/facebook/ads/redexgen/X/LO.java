package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LO implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0947Xy A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public LO(C0947Xy c0947Xy) {
        this.A00 = c0947Xy;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(0, 4, 88));
            anonymousClass90.A03(1);
            anonymousClass90.A04(1);
            anonymousClass90.A08(false);
            this.A00.A06().A8z(A00(4, 7, 112), C03298z.A1Y, anonymousClass90);
        } catch (Throwable otsl) {
            L0.A00(otsl, this);
        }
    }
}
