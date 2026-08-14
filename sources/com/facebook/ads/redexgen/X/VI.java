package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VI implements GY {
    public final List<GX> A00;

    public VI(List<GX> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i) {
        IK.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j) {
        return j < 0 ? 0 : -1;
    }
}
