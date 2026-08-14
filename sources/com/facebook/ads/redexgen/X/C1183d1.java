package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1183d1 extends L8 {
    public final /* synthetic */ C1219dc A00;
    public final /* synthetic */ C01541q A01;
    public final /* synthetic */ FP A02;

    public C1183d1(FP fp, C01541q c01541q, C1219dc c1219dc) {
        this.A02 = fp;
        this.A01 = c01541q;
        this.A00 = c1219dc;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        KH khA00 = KH.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(khA00.A03().getErrorCode(), khA00.A04());
        this.A02.A06.A0G(khA00);
    }
}
