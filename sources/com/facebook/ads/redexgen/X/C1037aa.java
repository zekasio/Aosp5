package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1037aa implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1037aa(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1035aY c1035aY = this.A00;
            return c1035aY.A08(c1035aY.A01.processName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
