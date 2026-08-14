package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0471Ff implements Runnable {
    public final /* synthetic */ C0477Fl A00;
    public final /* synthetic */ C0478Fm A01;
    public final /* synthetic */ C0479Fn A02;
    public final /* synthetic */ InterfaceC0480Fo A03;

    public RunnableC0471Ff(C0477Fl c0477Fl, InterfaceC0480Fo interfaceC0480Fo, C0478Fm c0478Fm, C0479Fn c0479Fn) {
        this.A00 = c0477Fl;
        this.A03 = interfaceC0480Fo;
        this.A01 = c0478Fm;
        this.A02 = c0479Fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.ABE(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
