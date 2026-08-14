package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1115bq extends AbstractRunnableC0612Kv {
    public final /* synthetic */ C1111bm A00;
    public final /* synthetic */ KH A01;

    public C1115bq(C1111bm c1111bm, KH kh) {
        this.A00 = c1111bm;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0612Kv
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), C0620Ld.A00(this.A01));
        }
    }
}
