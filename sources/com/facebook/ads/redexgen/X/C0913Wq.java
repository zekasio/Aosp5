package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0913Wq implements InterfaceC0414Cl {
    public final long A00;
    public final C0413Ck A01;

    public C0913Wq(long j) {
        this(j, 0L);
    }

    public C0913Wq(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0413Ck(j2 == 0 ? C0415Cm.A04 : new C0415Cm(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return false;
    }
}
