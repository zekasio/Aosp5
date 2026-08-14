package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FT implements Runnable {
    public final /* synthetic */ CE A00;

    public FT(CE ce) {
        this.A00 = ce;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G) {
                this.A00.A08.AAP(this.A00);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
