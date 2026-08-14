package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0894Vx implements InterfaceC0434Dq {
    public final C0550Ii A00 = new C0550Ii(new byte[4]);
    public final /* synthetic */ C0892Vv A01;

    public C0894Vx(C0892Vv c0892Vv) {
        this.A01 = c0892Vv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0434Dq
    public final void A48(C0551Ij c0551Ij) {
        if (c0551Ij.A0E() != 0) {
            return;
        }
        c0551Ij.A0Z(7);
        int iA04 = c0551Ij.A04() / 4;
        for (int i = 0; i < iA04; i++) {
            c0551Ij.A0a(this.A00, 4);
            int iA042 = this.A00.A04(16);
            this.A00.A08(3);
            if (iA042 == 0) {
                this.A00.A08(13);
            } else {
                int iA043 = this.A00.A04(13);
                this.A01.A06.put(iA043, new W0(new C0893Vw(this.A01, iA043)));
                C0892Vv.A01(this.A01);
            }
        }
        if (this.A01.A05 != 2) {
            this.A01.A06.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0434Dq
    public final void A8K(C0563Iv c0563Iv, InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
    }
}
