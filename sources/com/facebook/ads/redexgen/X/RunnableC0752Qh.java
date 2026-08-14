package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0752Qh implements Runnable {
    public final /* synthetic */ C0755Qk A00;

    public RunnableC0752Qh(C0755Qk c0755Qk) {
        this.A00 = c0755Qk;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            this.A00.A04.removeCallbacks(this);
            this.A00.A04.postDelayed(this, 250L);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
