package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1205dO implements OF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1204dN A01;
    public final /* synthetic */ UB A02;

    public C1205dO(AbstractC1204dN abstractC1204dN, int i, UB ub) {
        this.A01 = abstractC1204dN;
        this.A00 = i;
        this.A02 = ub;
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1Z(this.A01.A04);
        }
        this.A02.A1c(z, true);
    }
}
