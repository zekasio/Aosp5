package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VM implements GY {
    public final long[] A00;
    public final GX[] A01;

    public VM(GX[] gxArr, long[] jArr) {
        this.A01 = gxArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j) {
        int iA0B = C0567Iz.A0B(this.A00, j, true, false);
        if (iA0B != -1) {
            GX[] gxArr = this.A01;
            if (gxArr[iA0B] != null) {
                return Collections.singletonList(gxArr[iA0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i) {
        boolean z = true;
        IK.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        IK.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j) {
        int iA0A = C0567Iz.A0A(this.A00, j, false, false);
        if (iA0A < this.A00.length) {
            return iA0A;
        }
        return -1;
    }
}
