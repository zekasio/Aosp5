package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0536Hu implements Runnable {
    public final InterfaceC0535Ht A00;

    public RunnableC0536Hu(InterfaceC0535Ht interfaceC0535Ht) {
        this.A00 = interfaceC0535Ht;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.ABM();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
