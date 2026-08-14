package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class B1 {
    public static String[] A00 = {"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    public static final B1 A01 = new XE();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C0379Az A0A(int i, C0379Az c0379Az, boolean z);

    public abstract B0 A0D(int i, B0 b0, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == A06(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            if (i == A06(z)) {
                return A05(z);
            }
            return i + 1;
        }
        throw new IllegalStateException();
    }

    public final int A03(int nextWindowIndex, C0379Az c0379Az, B0 b0, int i, boolean z) {
        int i2 = A09(nextWindowIndex, c0379Az).A00;
        if (A0B(i2, b0).A01 == nextWindowIndex) {
            int iA02 = A02(i2, i, z);
            if (iA02 == -1) {
                return -1;
            }
            return A0B(iA02, b0).A00;
        }
        return nextWindowIndex + 1;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(B0 b0, C0379Az c0379Az, int i, long j) {
        return A08(b0, c0379Az, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(B0 b0, C0379Az c0379Az, int i, long j, long j2) {
        IK.A00(i, 0, A01());
        A0D(i, b0, false, j2);
        if (j == -9223372036854775807L) {
            j = b0.A01();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = b0.A00;
        long jA03 = b0.A03() + j;
        long jA07 = A09(i2, c0379Az).A07();
        while (jA07 != -9223372036854775807L) {
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (jA03 < jA07 || i2 >= b0.A01) {
                break;
            }
            jA03 -= jA07;
            i2++;
            jA07 = A09(i2, c0379Az).A07();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(jA03));
    }

    public final C0379Az A09(int i, C0379Az c0379Az) {
        return A0A(i, c0379Az, false);
    }

    public final B0 A0B(int i, B0 b0) {
        return A0C(i, b0, false);
    }

    public final B0 A0C(int i, B0 b0, boolean z) {
        return A0D(i, b0, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, C0379Az c0379Az, B0 b0, int i2, boolean z) {
        return A03(i, c0379Az, b0, i2, z) == -1;
    }
}
