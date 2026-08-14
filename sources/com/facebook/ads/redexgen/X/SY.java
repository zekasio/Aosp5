package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SY extends L8 {
    public static byte[] A02;
    public final /* synthetic */ P2 A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public SY(P2 p2, AnonymousClass84 anonymousClass84) {
        this.A00 = p2;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (this.A00.A0D.getState() == EnumC0764Qt.A02 && this.A00.A0D.getCurrentPositionInMillis() == A00()) {
            this.A00.A0I(A00(0, 22, 49));
        }
    }
}
