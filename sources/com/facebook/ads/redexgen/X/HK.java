package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HK implements InterfaceC0773Rc {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Rc
    public final long A4f() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Rc
    public final void AEu(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
