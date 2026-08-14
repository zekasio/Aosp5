package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DR {
    public final int A00;
    public final int A01;
    public final long A02;
    public final DO A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public DR(DO r4, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        IK.A03(iArr.length == jArr2.length);
        IK.A03(jArr.length == jArr2.length);
        IK.A03(iArr2.length == jArr2.length);
        this.A03 = r4;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        for (int iA0B = C0567Iz.A0B(this.A07, j, true, false); iA0B >= 0; iA0B--) {
            if ((this.A04[iA0B] & 1) != 0) {
                return iA0B;
            }
        }
        return -1;
    }

    public final int A01(long j) {
        for (int iA0A = C0567Iz.A0A(this.A07, j, true, false); iA0A < this.A07.length; iA0A++) {
            if ((this.A04[iA0A] & 1) != 0) {
                return iA0A;
            }
        }
        return -1;
    }
}
