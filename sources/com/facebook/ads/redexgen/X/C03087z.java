package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03087z extends AbstractC0598Ke {
    public final /* synthetic */ KX A00;

    public C03087z(KX kx) {
        this.A00 = kx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0607Kp c0607Kp) {
        if (this.A00.A01 == null || this.A00.A03 || c0607Kp.A00().getAction() != 0) {
            return;
        }
        this.A00.A05.removeCallbacksAndMessages(null);
        if (this.A00.A0D(QS.A05)) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        if (this.A00.A02) {
            this.A00.A05.postDelayed(new KY(this), this.A00.A00);
        }
    }
}
