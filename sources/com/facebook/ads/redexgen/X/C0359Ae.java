package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0359Ae {
    public static String[] A0C = {"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C0357Ac A04;
    public C0357Ac A05;
    public C0357Ac A06;
    public B1 A07;
    public Object A08;
    public boolean A09;
    public final C0379Az A0A = new C0379Az();
    public final B0 A0B = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C0358Ad A02(int i, long j, long j2) {
        FY fy = new FY(i, j2);
        this.A07.A09(fy.A02, this.A0A);
        int iA04 = this.A0A.A04(j);
        long jA09 = iA04 == -1 ? Long.MIN_VALUE : this.A0A.A09(iA04);
        boolean zA0A = A0A(fy, jA09);
        return new C0358Ad(fy, j, jA09, -9223372036854775807L, jA09 == Long.MIN_VALUE ? this.A0A.A07() : jA09, zA0A, A0B(fy, zA0A));
    }

    private long A00(int i) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i, this.A0A, true).A03;
        int i2 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A09(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i2) {
                return this.A03;
            }
        }
        for (C0357Ac c0357AcA0E = A0E(); c0357AcA0E != null; c0357AcA0E = c0357AcA0E.A01) {
            if (c0357AcA0E.A09.equals(obj)) {
                return c0357AcA0E.A02.A04.A03;
            }
        }
        for (C0357Ac c0357AcA0E2 = A0E(); c0357AcA0E2 != null; c0357AcA0E2 = c0357AcA0E2.A01) {
            int iA04 = this.A07.A04(c0357AcA0E2.A09);
            if (iA04 != -1) {
                int holderWindowIndex = this.A07.A09(iA04, this.A0A).A00;
                if (holderWindowIndex == i2) {
                    return c0357AcA0E2.A02.A04.A03;
                }
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C0358Ad A01(int i, int i2, int i3, long durationUs, long j) {
        long jA06;
        FY fy = new FY(i, i2, i3, j);
        boolean zA0A = A0A(fy, Long.MIN_VALUE);
        boolean zA0B = A0B(fy, zA0A);
        long jA0A = this.A07.A09(fy.A02, this.A0A).A0A(fy.A00, fy.A01);
        if (i3 == this.A0A.A02(i2)) {
            jA06 = this.A0A.A06();
        } else {
            jA06 = 0;
        }
        return new C0358Ad(fy, jA06, Long.MIN_VALUE, durationUs, jA0A, zA0A, zA0B);
    }

    @Nullable
    private C0358Ad A03(C0357Ac c0357Ac, long j) {
        long jLongValue;
        C0358Ad c0358Ad = c0357Ac.A02;
        if (c0358Ad.A06) {
            int iA03 = this.A07.A03(c0358Ad.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (iA03 == -1) {
                return null;
            }
            int i = this.A07.A0A(iA03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j2 = c0358Ad.A04.A03;
            if (this.A07.A0B(i, this.A0B).A00 == iA03) {
                long windowSequenceNumber = c0357Ac.A07();
                Pair<Integer, Long> pairA08 = this.A07.A08(this.A0B, this.A0A, i, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + c0358Ad.A01) - j));
                if (pairA08 == null) {
                    return null;
                }
                Object nextPeriodUid = pairA08.first;
                iA03 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = pairA08.second;
                jLongValue = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = c0357Ac.A01;
                if (nextPeriodUid3 != null && c0357Ac.A01.A09.equals(obj)) {
                    j2 = c0357Ac.A01.A02.A04.A03;
                } else {
                    j2 = this.A02;
                    long startPositionUs = j2 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                jLongValue = 0;
            }
            return A06(A07(iA03, jLongValue, j2), jLongValue, jLongValue);
        }
        FY currentPeriodId = c0358Ad.A04;
        this.A07.A09(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A01()) {
            int adGroupIndex = currentPeriodId.A00;
            int iA01 = this.A0A.A01(adGroupIndex);
            if (iA01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < iA01) {
                if (!this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return null;
                }
                return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, c0358Ad.A00, currentPeriodId.A03);
            }
            return A02(currentPeriodId.A02, c0358Ad.A00, currentPeriodId.A03);
        }
        long j3 = c0358Ad.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        A0C[1] = "6G";
        if (j3 != Long.MIN_VALUE) {
            int iA05 = this.A0A.A05(c0358Ad.A02);
            if (iA05 == -1) {
                return A02(currentPeriodId.A02, c0358Ad.A02, currentPeriodId.A03);
            }
            int iA02 = this.A0A.A02(iA05);
            if (!this.A0A.A0E(iA05, iA02)) {
                return null;
            }
            return A01(currentPeriodId.A02, iA05, iA02, c0358Ad.A02, currentPeriodId.A03);
        }
        int iA00 = this.A0A.A00();
        if (iA00 == 0) {
            return null;
        }
        int i2 = iA00 - 1;
        if (this.A0A.A09(i2) != Long.MIN_VALUE || this.A0A.A0D(i2)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i2);
        if (!this.A0A.A0E(i2, adGroupCount)) {
            return null;
        }
        long jA07 = this.A0A.A07();
        int i3 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i3, i2, adGroupCount, jA07, contentDurationUs);
    }

    private C0358Ad A04(C0358Ad c0358Ad, FY fy) {
        long jA07;
        long j = c0358Ad.A03;
        long endPositionUs = c0358Ad.A02;
        boolean zA0A = A0A(fy, endPositionUs);
        boolean zA0B = A0B(fy, zA0A);
        this.A07.A09(fy.A02, this.A0A);
        boolean isLastInPeriod = fy.A01();
        if (isLastInPeriod) {
            jA07 = this.A0A.A0A(fy.A00, fy.A01);
        } else {
            if (A0C[2].charAt(30) != 'V') {
                throw new RuntimeException();
            }
            A0C[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            jA07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new C0358Ad(fy, j, endPositionUs, c0358Ad.A00, jA07, zA0A, zA0B);
    }

    private C0358Ad A05(C0361Ag c0361Ag) {
        return A06(c0361Ag.A04, c0361Ag.A01, c0361Ag.A02);
    }

    private C0358Ad A06(FY fy, long j, long j2) {
        this.A07.A09(fy.A02, this.A0A);
        if (fy.A01()) {
            if (!this.A0A.A0E(fy.A00, fy.A01)) {
                return null;
            }
            return A01(fy.A02, fy.A00, fy.A01, j, fy.A03);
        }
        return A02(fy.A02, j2, fy.A03);
    }

    private FY A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int iA05 = this.A0A.A05(j);
        if (iA05 == -1) {
            return new FY(i, j2);
        }
        return new FY(i, iA05, this.A0A.A02(iA05), j2);
    }

    private boolean A08() {
        C0357Ac c0357AcA0E = A0E();
        if (c0357AcA0E == null) {
            return true;
        }
        while (true) {
            int iA03 = this.A07.A03(c0357AcA0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (c0357AcA0E.A01 != null && !c0357AcA0E.A02.A06) {
                c0357AcA0E = c0357AcA0E.A01;
            }
            if (iA03 == -1 || c0357AcA0E.A01 == null || c0357AcA0E.A01.A02.A04.A02 != iA03) {
                break;
            }
            c0357AcA0E = c0357AcA0E.A01;
        }
        boolean zA0S = A0S(c0357AcA0E);
        c0357AcA0E.A02 = A04(c0357AcA0E.A02, c0357AcA0E.A02.A04);
        if (!zA0S) {
            return true;
        }
        boolean zA0P = A0P();
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[3] = "GuDKwHudSgXHMcEdzJg";
        strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
        return !zA0P;
    }

    private boolean A09(C0357Ac c0357Ac, C0358Ad c0358Ad) {
        C0358Ad c0358Ad2 = c0357Ac.A02;
        return c0358Ad2.A03 == c0358Ad.A03 && c0358Ad2.A02 == c0358Ad.A02 && c0358Ad2.A04.equals(c0358Ad.A04);
    }

    private boolean A0A(FY fy, long j) {
        int iA00 = this.A07.A09(fy.A02, this.A0A).A00();
        if (iA00 == 0) {
            return true;
        }
        int i = iA00 - 1;
        boolean zA01 = fy.A01();
        if (this.A0A.A09(i) != Long.MIN_VALUE) {
            return !zA01 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (postrollAdCount == -1) {
            return false;
        }
        if (zA01 && fy.A00 == i && fy.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !zA01 && this.A0A.A02(i) == postrollAdCount;
    }

    private boolean A0B(FY fy, boolean z) {
        return !this.A07.A0B(this.A07.A09(fy.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(fy.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final C0357Ac A0C() {
        C0357Ac c0357Ac = this.A05;
        if (c0357Ac != null) {
            if (c0357Ac == this.A06) {
                this.A06 = c0357Ac.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            C0357Ac c0357Ac2 = this.A04;
            this.A05 = c0357Ac2;
            this.A06 = c0357Ac2;
        }
        return this.A05;
    }

    public final C0357Ac A0D() {
        C0357Ac c0357Ac = this.A06;
        IK.A04((c0357Ac == null || c0357Ac.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C0357Ac A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C0357Ac A0F() {
        return this.A04;
    }

    public final C0357Ac A0G() {
        return this.A05;
    }

    public final C0357Ac A0H() {
        return this.A06;
    }

    @Nullable
    public final C0358Ad A0I(long j, C0361Ag c0361Ag) {
        C0357Ac c0357Ac = this.A04;
        if (c0357Ac == null) {
            return A05(c0361Ag);
        }
        return A03(c0357Ac, j);
    }

    public final C0358Ad A0J(C0358Ad c0358Ad, int i) {
        return A04(c0358Ad, c0358Ad.A04.A00(i));
    }

    public final VW A0K(InterfaceC0375Au[] interfaceC0375AuArr, HT ht, HW hw, InterfaceC0466Fa interfaceC0466Fa, Object obj, C0358Ad c0358Ad) {
        long jA07;
        C0357Ac c0357Ac = this.A04;
        if (c0357Ac != null) {
            jA07 = c0357Ac.A07() + this.A04.A02.A01;
        } else {
            jA07 = c0358Ad.A03;
        }
        C0357Ac c0357Ac2 = new C0357Ac(interfaceC0375AuArr, jA07, ht, hw, interfaceC0466Fa, obj, c0358Ad);
        if (this.A04 != null) {
            IK.A04(A0P());
            this.A04.A01 = c0357Ac2;
        }
        this.A08 = null;
        this.A04 = c0357Ac2;
        this.A00++;
        return c0357Ac2.A08;
    }

    public final FY A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        C0357Ac c0357Ac = this.A04;
        if (c0357Ac != null) {
            c0357Ac.A0G(j);
        }
    }

    public final void A0N(B1 b1) {
        this.A07 = b1;
    }

    public final void A0O(boolean z) {
        C0357Ac c0357AcA0E = A0E();
        if (c0357AcA0E != null) {
            this.A08 = z ? c0357AcA0E.A09 : null;
            this.A03 = c0357AcA0E.A02.A04.A03;
            c0357AcA0E.A0D();
            A0S(c0357AcA0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C0357Ac c0357Ac = this.A04;
        return c0357Ac == null || (!c0357Ac.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(C0357Ac c0357Ac) {
        IK.A04(c0357Ac != null);
        boolean z = false;
        this.A04 = c0357Ac;
        while (c0357Ac.A01 != null) {
            c0357Ac = c0357Ac.A01;
            if (c0357Ac == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c0357Ac.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(VW vw) {
        C0357Ac c0357Ac = this.A04;
        return c0357Ac != null && c0357Ac.A08 == vw;
    }

    public final boolean A0U(FY fy, long j) {
        int iA03 = fy.A02;
        C0357Ac c0357Ac = null;
        for (C0357Ac c0357AcA0E = A0E(); c0357AcA0E != null; c0357AcA0E = c0357AcA0E.A01) {
            if (c0357Ac == null) {
                c0357AcA0E.A02 = A0J(c0357AcA0E.A02, iA03);
            } else {
                if (iA03 != -1) {
                    Object obj = c0357AcA0E.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0A(iA03, this.A0A, true).A03)) {
                        C0358Ad c0358AdA03 = A03(c0357Ac, j);
                        if (c0358AdA03 == null) {
                            return true ^ A0S(c0357Ac);
                        }
                        c0357AcA0E.A02 = A0J(c0357AcA0E.A02, iA03);
                        if (!A09(c0357AcA0E, c0358AdA03)) {
                            return true ^ A0S(c0357Ac);
                        }
                    }
                }
                return true ^ A0S(c0357Ac);
            }
            if (c0357AcA0E.A02.A06) {
                iA03 = this.A07.A03(iA03, this.A0A, this.A0B, this.A01, this.A09);
            }
            c0357Ac = c0357AcA0E;
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}
