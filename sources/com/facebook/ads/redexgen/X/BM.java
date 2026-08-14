package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BM implements Runnable {
    public final /* synthetic */ BS A00;
    public final /* synthetic */ C0402Bw A01;

    public BM(BS bs, C0402Bw c0402Bw) {
        this.A00 = bs;
        this.A01 = c0402Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01.AA6(this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
