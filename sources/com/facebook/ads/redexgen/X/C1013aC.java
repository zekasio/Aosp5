package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1013aC implements InterfaceC02856v {
    public final /* synthetic */ C1009a8 A00;

    public C1013aC(C1009a8 c1009a8) {
        this.A00 = c1009a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 != null) {
            C1009a8 c1009a8 = this.A00;
            return c1009a8.A08(c1009a8.A00.getAddress());
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
