package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Dh implements InterfaceC0899Wc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public Dh(long j, long j2, Ci ci) {
        this.A04 = j2;
        this.A01 = ci.A02;
        this.A00 = ci.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j - j2;
            this.A03 = A7e(j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final C0413Ck A7O(long positionOffset) {
        long j = this.A02;
        if (j == -1) {
            return new C0413Ck(new C0415Cm(0L, this.A04));
        }
        long j2 = (((long) this.A00) * positionOffset) / 8000000;
        int i = this.A01;
        long jA0E = C0567Iz.A0E((j2 / ((long) i)) * ((long) i), 0L, j - ((long) i));
        long j3 = this.A04 + jA0E;
        long jA7e = A7e(j3);
        C0415Cm seekPoint = new C0415Cm(jA7e, j3);
        if (jA7e < positionOffset) {
            long j4 = this.A02;
            int i2 = this.A01;
            if (jA0E != j4 - ((long) i2)) {
                long j5 = ((long) i2) + j3;
                return new C0413Ck(seekPoint, new C0415Cm(A7e(j5), j5));
            }
        }
        return new C0413Ck(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Wc
    public final long A7e(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / ((long) this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0414Cl
    public final boolean A8g() {
        return this.A02 != -1;
    }
}
