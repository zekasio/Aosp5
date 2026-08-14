package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1129c5 implements InterfaceC02013n {
    public final /* synthetic */ F9 A00;

    public C1129c5(F9 f9) {
        this.A00 = f9;
    }

    private final void A00(C02023o c02023o) {
        int i = c02023o.A00;
        if (i == 1) {
            this.A00.A06.A1Q(this.A00, c02023o.A02, c02023o.A01);
            return;
        }
        if (i == 2) {
            this.A00.A06.A1R(this.A00, c02023o.A02, c02023o.A01);
        } else if (i == 4) {
            this.A00.A06.A1T(this.A00, c02023o.A02, c02023o.A01, c02023o.A03);
        } else {
            if (i != 8) {
                return;
            }
            this.A00.A06.A1S(this.A00, c02023o.A02, c02023o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final AbstractC02244l A5Q(int i) {
        AbstractC02244l abstractC02244lA1G = this.A00.A1G(i, true);
        if (abstractC02244lA1G == null || this.A00.A01.A0K(abstractC02244lA1G.A0H)) {
            return null;
        }
        return abstractC02244lA1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void A9U(int i, int i2, Object obj) {
        this.A00.A1f(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void A9o(int i, int i2) {
        this.A00.A1c(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void A9p(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void A9q(int i, int i2) {
        this.A00.A1g(i, i2, true);
        F9 f9 = this.A00;
        f9.A0G = true;
        f9.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void A9r(int i, int i2) {
        this.A00.A1g(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void AAV(C02023o c02023o) {
        A00(c02023o);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02013n
    public final void AAX(C02023o c02023o) {
        A00(c02023o);
    }
}
