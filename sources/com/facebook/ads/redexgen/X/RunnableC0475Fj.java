package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0475Fj implements Runnable {
    public final /* synthetic */ C0477Fl A00;
    public final /* synthetic */ C0479Fn A01;
    public final /* synthetic */ InterfaceC0480Fo A02;

    public RunnableC0475Fj(C0477Fl c0477Fl, InterfaceC0480Fo interfaceC0480Fo, C0479Fn c0479Fn) {
        this.A00 = c0477Fl;
        this.A02 = interfaceC0480Fo;
        this.A01 = c0479Fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A02.AAZ(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
