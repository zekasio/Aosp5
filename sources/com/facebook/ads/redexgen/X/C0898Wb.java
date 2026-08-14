package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0898Wb implements InterfaceC0407Cc {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final InterfaceC0410Cf A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0409Ce A04;
    public InterfaceC0417Co A05;
    public InterfaceC0899Wc A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0411Cg A0A;
    public final Ch A0B;
    public final Ci A0C;
    public final C0551Ij A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, Ascii.DC2, 70, 93, 93, Ascii.DC2, 95, 83, 92, 75, Ascii.DC2, 80, 75, 70, 87, 65, Ascii.FS, 0, Ascii.DC4, 4, Ascii.US, Ascii.VT, 58, 61, 52};
    }

    static {
        A05();
        A0G = new C0900Wd();
        A0J = C0567Iz.A08(A04(32, 4, 79));
        A0H = C0567Iz.A08(A04(0, 4, 32));
        A0I = C0567Iz.A08(A04(28, 4, 74));
    }

    public C0898Wb() {
        this(0);
    }

    public C0898Wb(int i) {
        this(i, -9223372036854775807L);
    }

    public C0898Wb(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0551Ij(10);
        this.A0C = new Ci();
        this.A0A = new C0411Cg();
        this.A02 = -9223372036854775807L;
        this.A0B = new Ch();
    }

    private int A00(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            interfaceC0408Cd.AEB();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!interfaceC0408Cd.AD8(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            if (!A06(iA08, this.A01) || Ci.A00(iA08) == -1) {
                interfaceC0408Cd.AEt(1);
                this.A01 = 0;
                return 0;
            }
            Ci.A04(iA08, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7e(interfaceC0408Cd.A7F());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7e(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int iAEF = this.A05.AEF(interfaceC0408Cd, this.A00, true);
        if (iAEF == -1) {
            return -1;
        }
        this.A00 -= iAEF;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.AEH(this.A02 + ((this.A03 * 1000000) / ((long) this.A0C.A03)), 1, this.A0C.A02, 0, null);
        this.A03 += (long) this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C0551Ij c0551Ij, int i) {
        if (c0551Ij.A07() >= i + 4) {
            c0551Ij.A0Y(i);
            int iA08 = c0551Ij.A08();
            if (iA08 == A0J || iA08 == A0H) {
                return iA08;
            }
        }
        if (c0551Ij.A07() >= 40) {
            c0551Ij.A0Y(36);
            int iA082 = c0551Ij.A08();
            int i2 = A0I;
            if (iA082 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private InterfaceC0899Wc A02(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        interfaceC0408Cd.AD7(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Ci.A04(this.A0D.A08(), this.A0C);
        return new Dh(interfaceC0408Cd.A6t(), interfaceC0408Cd.A7F(), this.A0C);
    }

    private InterfaceC0899Wc A03(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        C0551Ij c0551Ij = new C0551Ij(this.A0C.A02);
        interfaceC0408Cd.AD7(c0551Ij.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i = 36;
            }
        } else {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i = 13;
            }
        }
        int iA01 = A01(c0551Ij, i);
        int seekHeader2 = A0J;
        if (iA01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (iA01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (iA01 == seekHeader4) {
                    C0425Dg c0425DgA00 = C0425Dg.A00(interfaceC0408Cd.A6t(), interfaceC0408Cd.A7F(), this.A0C, c0551Ij);
                    interfaceC0408Cd.AEt(this.A0C.A02);
                    return c0425DgA00;
                }
                interfaceC0408Cd.AEB();
                return null;
            }
        }
        DN dnA01 = DN.A01(interfaceC0408Cd.A6t(), interfaceC0408Cd.A7F(), this.A0C, c0551Ij);
        if (dnA01 != null && !this.A0A.A03()) {
            interfaceC0408Cd.AEB();
            int seekHeader5 = i + 141;
            interfaceC0408Cd.A3K(seekHeader5);
            interfaceC0408Cd.AD7(this.A0D.A00, 0, 3);
            this.A0D.A0Y(0);
            C0411Cg c0411Cg = this.A0A;
            int seekHeader6 = this.A0D.A0G();
            c0411Cg.A04(seekHeader6);
        }
        int seekHeader7 = this.A0C.A02;
        interfaceC0408Cd.AEt(seekHeader7);
        if (dnA01 == null || dnA01.A8g()) {
            return dnA01;
        }
        int seekHeader8 = A0H;
        if (iA01 == seekHeader8) {
            return A02(interfaceC0408Cd);
        }
        return dnA01;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(com.facebook.ads.redexgen.X.InterfaceC0408Cd r14, boolean r15) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0898Wb.A07(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A04 = interfaceC0409Ce;
        this.A05 = this.A04.AFD(0, 1);
        this.A04.A5D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final int ADX(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0408Cd, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0408Cd);
            InterfaceC0899Wc interfaceC0899Wc = this.A06;
            if (interfaceC0899Wc == null || (!interfaceC0899Wc.A8g() && (this.A08 & 1) != 0)) {
                InterfaceC0899Wc interfaceC0899WcA02 = A02(interfaceC0408Cd);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = interfaceC0899WcA02;
            }
            this.A04.AEM(this.A06);
            this.A05.A5V(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0408Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return A07(interfaceC0408Cd, true);
    }
}
