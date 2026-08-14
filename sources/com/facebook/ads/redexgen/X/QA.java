package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QA extends AbstractC03329c<AnonymousClass84> {
    public final /* synthetic */ AnonymousClass89 A00;

    public QA(AnonymousClass89 anonymousClass89) {
        this.A00 = anonymousClass89;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass84 anonymousClass84) {
        int iA00 = anonymousClass84.A00();
        if (this.A00.A00 > 0 && iA00 == this.A00.A0B.getDuration() && this.A00.A0B.getDuration() > this.A00.A00) {
            return;
        }
        this.A00.A0e(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    public final Class<AnonymousClass84> A01() {
        return AnonymousClass84.class;
    }
}
