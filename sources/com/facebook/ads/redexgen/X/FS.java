package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FS implements Runnable {
    public final /* synthetic */ CE A00;

    public FS(CE ce) {
        this.A00 = ce;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
