package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0468Fc implements Runnable {
    public final /* synthetic */ C0477Fl A00;
    public final /* synthetic */ InterfaceC0480Fo A01;

    public RunnableC0468Fc(C0477Fl c0477Fl, InterfaceC0480Fo interfaceC0480Fo) {
        this.A00 = c0477Fl;
        this.A01 = interfaceC0480Fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.ABV(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
