package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S1 extends AbstractC0766Qv {
    public final /* synthetic */ C8K A00;

    public S1(C8K c8k) {
        this.A00 = c8k;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A02() {
        if (!this.A00.A0D.A07()) {
            C8K c8k = this.A00;
            c8k.setImpressionRecordingFlag(c8k.A0D);
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((TW) ((TW) this.A00)).A0A.A93(this.A00.A0A, new OG().A03(this.A00.A09).A02(this.A00.A0D).A04(((TW) ((TW) this.A00)).A08.A0X()).A05());
                this.A00.A0C.A0D().A2Y();
                AnonymousClass29.A00(this.A00.A03.A0W());
            }
        }
    }
}
