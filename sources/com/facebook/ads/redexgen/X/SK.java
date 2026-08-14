package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SK extends L8 {
    public static byte[] A02;
    public final /* synthetic */ C8N A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public SK(C8N c8n, AnonymousClass84 anonymousClass84) {
        this.A00 = c8n;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (this.A00.A0B.getState() == EnumC0764Qt.A02 && this.A00.A0B.getCurrentPositionInMillis() == A00()) {
            this.A00.A0G(A00(0, 22, 11));
        }
    }
}
