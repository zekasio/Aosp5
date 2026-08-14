package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UL extends AbstractC01260o {
    public static byte[] A01;
    public final /* synthetic */ UB A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UL(UB ub) {
        this.A00 = ub;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0B(C1217da c1217da) {
        this.A00.A1T(c1217da);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.A9s();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0F(InterfaceC01250n interfaceC01250n) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0G(KH kh) {
        this.A00.A11().A0D().A2a(MJ.A01(this.A00.A00), kh.A03().getErrorCode(), kh.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.AAi(kh);
        }
    }
}
