package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S8 extends AbstractC0766Qv {
    public final /* synthetic */ C8L A00;

    public S8(C8L c8l) {
        this.A00 = c8l;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A02() {
        if (!this.A00.A0H.A07()) {
            C8L c8l = this.A00;
            c8l.setImpressionRecordingFlag(c8l.A0H);
            if (!TextUtils.isEmpty(this.A00.A0C)) {
                ((TW) ((TW) this.A00)).A0A.A93(this.A00.A0C, new OG().A03(this.A00.A0B).A02(this.A00.A0H).A04(((TW) ((TW) this.A00)).A08.A0X()).A05());
                this.A00.A0G.A0D().A2Y();
                AnonymousClass29.A00(this.A00.A04.A0W());
            }
        }
    }
}
