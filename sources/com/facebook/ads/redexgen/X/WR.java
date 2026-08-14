package com.facebook.ads.redexgen.X;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WR implements InterfaceC0414Cl {
    public final /* synthetic */ WQ A00;

    public WR(WQ wq) {
        this.A00 = wq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A00.A0B.A03(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long granule) {
        if (granule != 0) {
            long jA04 = this.A00.A0B.A04(granule);
            WQ wq = this.A00;
            return new C0413Ck(new C0415Cm(granule, wq.A00(wq.A09, jA04, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
        }
        return new C0413Ck(new C0415Cm(0L, this.A00.A09));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return true;
    }
}
