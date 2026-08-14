package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1063b0 implements InterfaceC02856v {
    public final /* synthetic */ C1056at A00;

    public C1063b0(C1056at c1056at) {
        this.A00 = c1056at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 != null) {
            C1056at c1056at = this.A00;
            return c1056at.A04(c1056at.A00.reqInputFeatures);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
