package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1098bZ extends AbstractRunnableC0612Kv {
    public final /* synthetic */ C1095bW A00;
    public final /* synthetic */ KH A01;

    public C1098bZ(C1095bW c1095bW, KH kh) {
        this.A00 = c1095bW;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0612Kv
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(C0620Ld.A00(this.A01));
        }
    }
}
