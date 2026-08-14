package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1177cv extends L8 {
    public final /* synthetic */ C0474Fi A00;
    public final /* synthetic */ C01541q A01;
    public final /* synthetic */ FL A02;

    public C1177cv(FL fl, C01541q c01541q, C0474Fi c0474Fi) {
        this.A02 = fl;
        this.A01 = c01541q;
        this.A00 = c0474Fi;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0D().A4Z(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new KH(adErrorType, ""));
    }
}
