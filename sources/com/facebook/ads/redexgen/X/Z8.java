package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z8 implements InterfaceC02856v {
    public final /* synthetic */ C0970Yv A00;

    public Z8(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A02 != null) {
            C0970Yv c0970Yv = this.A00;
            return c0970Yv.A08(c0970Yv.A02.getInstallerPackageName(this.A00.A00.getPackageName()));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
