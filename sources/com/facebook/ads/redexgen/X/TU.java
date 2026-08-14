package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TU implements OT {
    public final /* synthetic */ TO A00;

    public TU(TO to) {
        this.A00 = to;
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void A9x() {
        if (this.A00.A0Y()) {
            this.A00.A0M();
            this.A00.A0V.setToolbarActionMessage("");
            this.A00.A0V.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void ABP() {
        this.A00.A0A = false;
        this.A00.A0J.A07();
    }

    @Override // com.facebook.ads.redexgen.X.OT
    public final void ABQ() {
        this.A00.A0A = true;
        this.A00.A0J.A06();
    }
}
