package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FP extends d2 {
    public FP(C0947Xy c0947Xy, C01531p c01531p) {
        super(c0947Xy, c01531p);
    }

    private InterfaceC01350x A00(Runnable runnable) {
        return new C1182d0(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        ((C1219dc) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC01250n interfaceC01250n, C9H c9h, C9F c9f, C01541q c01541q) {
        C1219dc c1219dc = (C1219dc) interfaceC01250n;
        C1183d1 c1183d1 = new C1183d1(this, c01541q, c1219dc);
        A0C().postDelayed(c1183d1, c9h.A05().A05());
        c1219dc.A0A(this.A0B, A00(c1183d1), c01541q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AnonymousClass18 A0T() {
        return ((C1219dc) this.A01).A09();
    }
}
