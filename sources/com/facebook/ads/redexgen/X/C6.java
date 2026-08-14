package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6 implements Runnable {
    public final /* synthetic */ C9 A00;
    public final /* synthetic */ CA A01;

    public C6(C9 c9, CA ca) {
        this.A00 = c9;
        this.A01 = ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AAc();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
