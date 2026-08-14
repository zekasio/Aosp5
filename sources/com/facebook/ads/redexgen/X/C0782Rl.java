package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0782Rl extends L8 {
    public final /* synthetic */ QK A00;

    public C0782Rl(QK qk) {
        this.A00 = qk;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (!this.A00.A03) {
            C03319b c03319b = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c03319b.A02(new NE(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.84
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
