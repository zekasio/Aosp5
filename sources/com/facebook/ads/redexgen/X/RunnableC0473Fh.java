package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0473Fh implements Runnable {
    public final /* synthetic */ C0477Fl A00;
    public final /* synthetic */ InterfaceC0480Fo A01;

    public RunnableC0473Fh(C0477Fl c0477Fl, InterfaceC0480Fo interfaceC0480Fo) {
        this.A00 = c0477Fl;
        this.A01 = interfaceC0480Fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AC3(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
