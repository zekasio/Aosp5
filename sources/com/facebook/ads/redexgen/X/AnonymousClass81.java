package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.81, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass81 extends AbstractC0626Lj {
    public final /* synthetic */ KX A00;

    public AnonymousClass81(KX kx) {
        this.A00 = kx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0639Ly c0639Ly) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0D(QS.A04) && !this.A00.A04) {
            if (!this.A00.A0D(QS.A03)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new KZ(this), this.A00.A00);
    }
}
