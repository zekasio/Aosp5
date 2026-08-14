package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0460Eu implements Runnable {
    public final /* synthetic */ RunnableC0463Ex A00;

    public RunnableC0460Eu(RunnableC0463Ex runnableC0463Ex) {
        this.A00 = runnableC0463Ex;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
