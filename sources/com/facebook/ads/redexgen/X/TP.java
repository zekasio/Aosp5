package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TP implements InterfaceC0728Pj {
    public final /* synthetic */ TO A00;

    public TP(TO to) {
        this.A00 = to;
    }

    public /* synthetic */ TP(TO to, TV tv) {
        this(to);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0728Pj
    public final void AAQ() {
        this.A00.A0X(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0728Pj
    public final void AAz() {
        if (!TextUtils.isEmpty(this.A00.A0D.A0U())) {
            this.A00.A0H.A93(this.A00.A0D.A0U(), new OG().A03(this.A00.A06.getViewabilityChecker()).A02(this.A00.A06.getTouchDataRecorder()).A05());
            AnonymousClass29.A00(this.A00.A0D.A0W());
            this.A00.A0G.A0D().A2Y();
        }
        this.A00.A0L.A3s(this.A00.A0M.A6m());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0728Pj
    public final void ABK() {
        this.A00.A0L.A3s(this.A00.A0M.A6Z());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0728Pj
    public final void ACu() {
        this.A00.A0L.AAF(15);
    }
}
