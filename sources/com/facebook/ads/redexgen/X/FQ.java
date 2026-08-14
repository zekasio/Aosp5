package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FQ extends d2 {

    @Nullable
    public View A00;
    public C0451El A01;

    public FQ(C0451El c0451El, C01531p c01531p) {
        super(c0451El, c01531p);
        this.A01 = c0451El;
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
        } else {
            this.A01.A0D().A3o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC01250n interfaceC01250n, C9H c9h, C9F c9f, C01541q c01541q) {
        this.A01.A0D().A3h();
        C1220dd c1220dd = (C1220dd) interfaceC01250n;
        C1186d5 c1186d5 = new C1186d5(this, c01541q, c1220dd);
        A0C().postDelayed(c1186d5, c9h.A05().A05());
        c1220dd.A0I(this.A01, this.A08, this.A07.A07, new C1185d4(this, c1186d5), c01541q);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0R(boolean z) {
        super.A0R(z);
        this.A00 = null;
    }
}
