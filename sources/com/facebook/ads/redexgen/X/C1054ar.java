package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1054ar implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1054ar(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1035aY c1035aY = this.A00;
            return c1035aY.A04(c1035aY.A01.theme);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
