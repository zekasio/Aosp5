package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0433Dp {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0426Di A05;
    public final C0550Ii A06 = new C0550Ii(new byte[64]);
    public final C0563Iv A07;

    public C0433Dp(InterfaceC0426Di interfaceC0426Di, C0563Iv c0563Iv) {
        this.A05 = interfaceC0426Di;
        this.A07 = c0563Iv;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            long jA04 = ((long) this.A06.A04(3)) << 30;
            this.A06.A08(1);
            long jA042 = jA04 | ((long) (this.A06.A04(15) << 15));
            this.A06.A08(1);
            long jA043 = jA042 | ((long) this.A06.A04(15));
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long jA044 = ((long) this.A06.A04(3)) << 30;
                this.A06.A08(1);
                long jA045 = jA044 | ((long) (this.A06.A04(15) << 15));
                this.A06.A08(1);
                long jA046 = jA045 | ((long) this.A06.A04(15));
                this.A06.A08(1);
                this.A07.A07(jA046);
                this.A04 = true;
            }
            long pts = this.A07.A07(jA043);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEK();
    }

    public final void A03(C0551Ij c0551Ij) throws C0360Af {
        c0551Ij.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0551Ij.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AD4(this.A01, true);
        this.A05.A48(c0551Ij);
        this.A05.AD3();
    }
}
