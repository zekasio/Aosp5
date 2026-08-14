package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ BS A03;

    public BP(BS bs, int i, long j, long j2) {
        this.A03 = bs;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.A01.AA9(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
