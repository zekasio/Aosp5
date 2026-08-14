package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1114bp extends AbstractRunnableC0612Kv {
    public final /* synthetic */ C1111bm A00;

    public C1114bp(C1111bm c1111bm) {
        this.A00 = c1111bm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0612Kv
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
