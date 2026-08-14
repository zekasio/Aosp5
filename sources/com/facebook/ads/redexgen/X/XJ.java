package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XJ implements InterfaceC0542Ia {
    public static byte[] A04;

    @Nullable
    public XG A00;

    @Nullable
    public InterfaceC0542Ia A01;
    public final AJ A02;
    public final C0858Uk A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, 127, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public XJ(AJ aj, IN in) {
        this.A02 = aj;
        this.A03 = new C0858Uk(in);
    }

    private void A01() {
        this.A03.A02(this.A01.A7H());
        C0362Ah playbackParameters = this.A01.A7E();
        if (!playbackParameters.equals(this.A03.A7E())) {
            this.A03.AEf(playbackParameters);
            this.A02.ABo(playbackParameters);
        }
    }

    private boolean A03() {
        XG xg = this.A00;
        return (xg == null || xg.A8R() || (!this.A00.A8c() && this.A00.A84())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(XG xg) {
        if (xg == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(XG xg) throws AM {
        InterfaceC0542Ia interfaceC0542Ia;
        InterfaceC0542Ia interfaceC0542IaA6w = xg.A6w();
        if (interfaceC0542IaA6w != null && interfaceC0542IaA6w != (interfaceC0542Ia = this.A01)) {
            if (interfaceC0542Ia == null) {
                this.A01 = interfaceC0542IaA6w;
                this.A00 = xg;
                this.A01.AEf(this.A03.A7E());
                A01();
                return;
            }
            throw AM.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah A7E() {
        InterfaceC0542Ia interfaceC0542Ia = this.A01;
        if (interfaceC0542Ia != null) {
            return interfaceC0542Ia.A7E();
        }
        return this.A03.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final long A7H() {
        if (A03()) {
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah AEf(C0362Ah c0362Ah) {
        InterfaceC0542Ia interfaceC0542Ia = this.A01;
        if (interfaceC0542Ia != null) {
            c0362Ah = interfaceC0542Ia.AEf(c0362Ah);
        }
        this.A03.AEf(c0362Ah);
        this.A02.ABo(c0362Ah);
        return c0362Ah;
    }
}
