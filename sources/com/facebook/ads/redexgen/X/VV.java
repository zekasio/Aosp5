package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VV implements InterfaceC0417Co {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0485Ft A04;
    public C0485Ft A05;
    public C0485Ft A06;
    public InterfaceC0486Fu A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HW A0D;
    public final C0484Fs A0C = new C0484Fs();
    public final C0483Fr A0B = new C0483Fr();
    public final C0551Ij A0E = new C0551Ij(32);

    public VV(HW hw) {
        this.A0D = hw;
        this.A0A = hw.A6o();
        this.A04 = new C0485Ft(0L, this.A0A);
        C0485Ft c0485Ft = this.A04;
        this.A05 = c0485Ft;
        this.A06 = c0485Ft;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C0485Ft(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += (long) i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            HW hw = this.A0D;
            HV hv = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            hw.ADn(hv);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (this.A05.A03 - j));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.A05.A03 - j));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.X.X2 r20, com.facebook.ads.redexgen.X.C0483Fr r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VV.A07(com.facebook.ads.redexgen.X.X2, com.facebook.ads.redexgen.X.Fr):void");
    }

    private void A08(C0485Ft c0485Ft) {
        if (!c0485Ft.A02) {
            return;
        }
        boolean z = this.A06.A02;
        HV[] hvArr = new HV[(z ? 1 : 0) + (((int) (this.A06.A04 - c0485Ft.A04)) / this.A0A)];
        for (int i = 0; i < hvArr.length; i++) {
            hvArr[i] = c0485Ft.A01;
            c0485Ft = c0485Ft.A01();
        }
        this.A0D.ADo(hvArr);
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C0485Ft(0L, this.A0A);
        C0485Ft c0485Ft = this.A04;
        this.A05 = c0485Ft;
        this.A06 = c0485Ft;
        this.A01 = 0L;
        this.A0D.AFE();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(AZ az, X2 x2, boolean z, boolean z2, long j) {
        int iA09 = this.A0C.A09(az, x2, z, z2, this.A02, this.A0B);
        if (iA09 == -5) {
            this.A02 = az.A00;
            return -5;
        }
        if (iA09 != -4) {
            if (iA09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!x2.A04()) {
            long j2 = x2.A00;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
            if (j2 < j) {
                x2.A00(Integer.MIN_VALUE);
            }
            if (x2.A0A()) {
                A07(x2, this.A0B);
            }
            x2.A09(this.A0B.A00);
            A05(this.A0B.A01, x2.A01, this.A0B.A00);
        }
        return -4;
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC0486Fu interfaceC0486Fu) {
        this.A07 = interfaceC0486Fu;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void A5V(Format format) {
        Format formatA01 = A01(format, this.A00);
        boolean zA0K = this.A0C.A0K(formatA01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0486Fu interfaceC0486Fu = this.A07;
        if (interfaceC0486Fu != null && zA0K) {
            interfaceC0486Fu.ACe(formatA01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final int AEF(InterfaceC0408Cd interfaceC0408Cd, int i, boolean z) throws InterruptedException, IOException {
        int i2 = interfaceC0408Cd.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(i2);
        if (A0F[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "gj56WjutkODHGuBsULoCjgk";
        strArr[5] = "cXoHIYif5j6YkS";
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void AEG(C0551Ij c0551Ij, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            c0551Ij.A0c(this.A06.A01.A01, this.A06.A00(this.A01), iA00);
            i -= iA00;
            A02(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0417Co
    public final void AEH(long j, int i, int i2, int i3, C0416Cn c0416Cn) {
        if (this.A08) {
            A5V(this.A03);
        }
        if (this.A09) {
            if ((i & 1) != 0) {
                C0484Fs c0484Fs = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!c0484Fs.A0J(j)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j + this.A00;
        this.A0C.A0G(timeUs, i, (this.A01 - ((long) i2)) - ((long) i3), i2, c0416Cn);
    }
}
