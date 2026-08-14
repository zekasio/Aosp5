package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BS A01;

    public BR(BS bs, int i) {
        this.A01 = bs;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AA8(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
