package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5 implements Runnable {
    public final /* synthetic */ C9 A00;
    public final /* synthetic */ CA A01;
    public final /* synthetic */ Exception A02;

    public C5(C9 c9, CA ca, Exception exc) {
        this.A00 = c9;
        this.A01 = ca;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AAd(this.A02);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
