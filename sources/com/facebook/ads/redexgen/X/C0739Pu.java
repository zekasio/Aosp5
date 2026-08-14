package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0739Pu extends AbstractC03329c<AnonymousClass88> {
    public final /* synthetic */ AnonymousClass89 A00;

    public C0739Pu(AnonymousClass89 anonymousClass89) {
        this.A00 = anonymousClass89;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass88 anonymousClass88) {
        int iA00 = anonymousClass88.A00();
        int iA01 = anonymousClass88.A01();
        if (this.A00.A00 > 0 && iA00 == iA01 && iA01 > this.A00.A00) {
            return;
        }
        if (iA01 < iA00 + 500) {
            if (iA01 == 0) {
                AnonymousClass89 anonymousClass89 = this.A00;
                anonymousClass89.A0d(anonymousClass89.A00);
                return;
            } else {
                this.A00.A0d(iA01);
                return;
            }
        }
        this.A00.A0d(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03329c
    public final Class<AnonymousClass88> A01() {
        return AnonymousClass88.class;
    }
}
