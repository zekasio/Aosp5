package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CK implements VW, VX {
    public static String[] A06 = {"xZ98n6jXZ", "w0wM6S1AW5kwd8mBaLXb8IJFUPLi1ZSY", "", "5GeP1Ey0MjdLLaKEOlMigJbDmIHcG3Ps", "Q5WYazqpabUa99ZYxsI", "Gm0HQrfOciURdkrLDtJ", "cUS8ttxVNiquYZeS", "9hpvQN9G3pxye3p4YcQpNMMd2GK"};
    public long A00;
    public long A01;
    public long A02;
    public VX A03;
    public C0876Vc[] A04 = new C0876Vc[0];
    public final VW A05;

    public CK(VW vw, boolean z, long j, long j2) {
        this.A05 = vw;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C0378Ax A00(long j, C0378Ax c0378Ax) {
        long jA0E = C0567Iz.A0E(c0378Ax.A01, 0L, j - this.A01);
        long j2 = c0378Ax.A00;
        long j3 = this.A00;
        long jA0E2 = C0567Iz.A0E(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jA0E == c0378Ax.A01 && jA0E2 == c0378Ax.A00) {
            return c0378Ax;
        }
        return new C0378Ax(jA0E, jA0E2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0488Fw
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AAP(VW vw) {
        this.A03.AAP(this);
    }

    public static boolean A02(long j, HQ[] hqArr) {
        if (j != 0) {
            for (HQ hq : hqArr) {
                if (hq != null && !C0544Ic.A09(hq.A7P().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final boolean A4A(long j) {
        return this.A05.A4A(j);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A4p(long j, boolean z) {
        this.A05.A4p(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5e(long j, C0378Ax c0378Ax) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5e(j, A00(j, c0378Ax));
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A5t() {
        long jA5t = this.A05.A5t();
        if (jA5t != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jA5t < j) {
                return jA5t;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long A71() {
        long jA71 = this.A05.A71();
        if (jA71 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jA71 < j) {
                return jA71;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final TrackGroupArray A7h() {
        return this.A05.A7h();
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void A9Y() throws IOException {
        this.A05.A9Y();
    }

    @Override // com.facebook.ads.redexgen.X.VX
    public final void ABw(VW vw) {
        this.A03.ABw(this);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADG(VX vx, long j) {
        this.A03 = vx;
        this.A05.ADG(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final long ADb() {
        if (A03()) {
            long j = this.A02;
            this.A02 = -9223372036854775807L;
            long jADb = ADb();
            return jADb != -9223372036854775807L ? jADb : j;
        }
        long jADb2 = this.A05.ADb();
        String[] strArr = A06;
        if (strArr[7].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "JN4lYhgdVtJugUzGLO1";
        strArr2[4] = "V7PIoeFvQi5pkabjQnk";
        if (jADb2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        IK.A04(jADb2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jADb2 > discontinuityUs) {
            z = false;
        }
        IK.A04(z);
        return jADb2;
    }

    @Override // com.facebook.ads.redexgen.X.VW
    public final void ADi(long j) {
        this.A05.ADi(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.facebook.ads.redexgen.X.VW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEP(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A02 = r0
            com.facebook.ads.redexgen.X.Vc[] r3 = r8.A04
            int r2 = r3.length
            r7 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A00()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.VW r0 = r8.A05
            long r5 = r0.AEP(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L34
            long r1 = r8.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L35
        L34:
            r7 = 1
        L35:
            com.facebook.ads.redexgen.X.IK.A04(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CK.AEP(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    @Override // com.facebook.ads.redexgen.X.VW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEQ(com.facebook.ads.redexgen.X.HQ[] r16, boolean[] r17, com.facebook.ads.redexgen.X.InterfaceC0487Fv[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r4 = r18
            int r0 = r4.length
            com.facebook.ads.redexgen.X.Vc[] r0 = new com.facebook.ads.redexgen.X.C0876Vc[r0]
            r15.A04 = r0
            int r0 = r4.length
            com.facebook.ads.redexgen.X.Fv[] r11 = new com.facebook.ads.redexgen.X.InterfaceC0487Fv[r0]
            r2 = 0
        Lb:
            int r0 = r4.length
            r3 = 0
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.Vc[] r1 = r15.A04
            r0 = r4[r2]
            com.facebook.ads.redexgen.X.Vc r0 = (com.facebook.ads.redexgen.X.C0876Vc) r0
            r1[r2] = r0
            r0 = r1[r2]
            if (r0 == 0) goto L1f
            r0 = r1[r2]
            com.facebook.ads.redexgen.X.Fv r3 = r0.A01
        L1f:
            r11[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L24:
            com.facebook.ads.redexgen.X.VW r8 = r15.A05
            r10 = r17
            r9 = r16
            r13 = r20
            r12 = r19
            long r7 = r8.AEQ(r9, r10, r11, r12, r13)
            boolean r0 = r15.A03()
            if (r0 == 0) goto L92
            long r0 = r15.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L92
            boolean r0 = A02(r0, r9)
            if (r0 == 0) goto L92
            r0 = r7
        L45:
            r15.A02 = r0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r1 = r15.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L90
            long r1 = r15.A00
            r5 = -9223372036854775808
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L90
        L5d:
            r0 = 1
        L5e:
            com.facebook.ads.redexgen.X.IK.A04(r0)
            r5 = 0
        L62:
            int r0 = r4.length
            if (r5 >= r0) goto L98
            r0 = r11[r5]
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.Vc[] r0 = r15.A04
            r0[r5] = r3
        L6d:
            com.facebook.ads.redexgen.X.Vc[] r0 = r15.A04
            r0 = r0[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L62
        L76:
            r0 = r4[r5]
            if (r0 == 0) goto L84
            com.facebook.ads.redexgen.X.Vc[] r0 = r15.A04
            r0 = r0[r5]
            com.facebook.ads.redexgen.X.Fv r1 = r0.A01
            r0 = r11[r5]
            if (r1 == r0) goto L6d
        L84:
            com.facebook.ads.redexgen.X.Vc[] r2 = r15.A04
            r1 = r11[r5]
            com.facebook.ads.redexgen.X.Vc r0 = new com.facebook.ads.redexgen.X.Vc
            r0.<init>(r15, r1)
            r2[r5] = r0
            goto L6d
        L90:
            r0 = 0
            goto L5e
        L92:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L45
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CK.AEQ(com.facebook.ads.redexgen.X.HQ[], boolean[], com.facebook.ads.redexgen.X.Fv[], boolean[], long):long");
    }
}
