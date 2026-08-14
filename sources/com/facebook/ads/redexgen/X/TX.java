package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TX implements InterfaceC0627Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TW A01;

    public TX(TW tw, int i) {
        this.A01 = tw;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void AAN() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void ABy(float f) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
