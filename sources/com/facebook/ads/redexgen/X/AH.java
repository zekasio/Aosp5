package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AH extends AbstractC0596Kc {
    public final /* synthetic */ AB A00;

    public AH(AB ab) {
        this.A00 = ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0597Kd c0597Kd) {
        if (this.A00.getVideoView() != null) {
            this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
        }
    }
}
