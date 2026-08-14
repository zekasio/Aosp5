package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O7 implements Runnable {
    public final /* synthetic */ O8 A00;
    public final /* synthetic */ O9 A01;

    public O7(O8 o8, O9 o9) {
        this.A00 = o8;
        this.A01 = o9;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AA3();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
