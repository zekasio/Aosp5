package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ST implements InterfaceC0627Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L8 A01;
    public final /* synthetic */ SQ A02;

    public ST(SQ sq, int i, L8 l8) {
        this.A02 = sq;
        this.A00 = i;
        this.A01 = l8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void AAN() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void ABy(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
