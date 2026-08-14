package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JF implements Runnable {
    public final /* synthetic */ C0402Bw A00;
    public final /* synthetic */ JM A01;

    public JF(JM jm, C0402Bw c0402Bw) {
        this.A01 = jm;
        this.A00 = c0402Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ACi(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
