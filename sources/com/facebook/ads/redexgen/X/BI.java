package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BI implements InterfaceC0862Uo, Comparator<I8> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<I8> A02 = new TreeSet<>(this);

    public BI(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(I8 i8, I8 i82) {
        if (i8.A00 - i82.A00 == 0) {
            return i8.compareTo(i82);
        }
        return i8.A00 < i82.A00 ? -1 : 1;
    }

    private void A01(I4 i4, long j) {
        while (this.A00 + j > this.A01) {
            boolean zIsEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!zIsEmpty) {
                try {
                    i4.ADx(this.A02.first());
                } catch (I2 unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACN(I4 i4, I8 i8) {
        this.A02.add(i8);
        this.A00 += i8.A01;
        A01(i4, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACO(I4 i4, I8 i8) {
        this.A02.remove(i8);
        this.A00 -= i8.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I3
    public final void ACP(I4 i4, I8 i8, I8 i82) {
        ACO(i4, i8);
        ACN(i4, i82);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0862Uo
    public final void ACQ(I4 i4, String str, long j, long j2) {
        A01(i4, j2);
    }
}
