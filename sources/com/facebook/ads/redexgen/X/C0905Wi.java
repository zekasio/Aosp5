package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0905Wi extends Cq {
    public static byte[] A05;
    public static String[] A06 = {"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C0551Ij A03;
    public final C0551Ij A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    static {
        A01();
    }

    public C0905Wi(InterfaceC0417Co interfaceC0417Co) {
        super(interfaceC0417Co);
        this.A04 = new C0551Ij(C0547If.A03);
        this.A03 = new C0551Ij(4);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C0551Ij c0551Ij, long j) throws C0360Af {
        int iA0E = c0551Ij.A0E();
        long jA09 = j + (((long) c0551Ij.A09()) * 1000);
        if (iA0E == 0 && !this.A02) {
            C0551Ij videoSequence = new C0551Ij(new byte[c0551Ij.A04()]);
            c0551Ij.A0c(videoSequence.A00, 0, c0551Ij.A04());
            J1 j1A00 = J1.A00(videoSequence);
            this.A01 = j1A00.A02;
            super.A00.A5V(Format.A03(null, A00(28, 9, 114), null, -1, -1, j1A00.A03, j1A00.A01, -1.0f, j1A00.A04, -1, j1A00.A00, null));
            this.A02 = true;
            return;
        }
        if (iA0E != 1 || !this.A02) {
            return;
        }
        byte[] bArr = this.A03.A00;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int i = 4 - this.A01;
        int i2 = 0;
        while (c0551Ij.A04() > 0) {
            c0551Ij.A0c(this.A03.A00, i, this.A01);
            this.A03.A0Y(0);
            int iA0H = this.A03.A0H();
            this.A04.A0Y(0);
            super.A00.AEG(this.A04, 4);
            super.A00.AEG(c0551Ij, iA0H);
            i2 = i2 + 4 + iA0H;
        }
        InterfaceC0417Co interfaceC0417Co = super.A00;
        int i3 = this.A00 != 1 ? 0 : 1;
        if (A06[6].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
        strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
        interfaceC0417Co.AEH(jA09, i3, i2, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C0551Ij c0551Ij) throws C0906Wj {
        int iA0E = c0551Ij.A0E();
        int i = (iA0E >> 4) & 15;
        int i2 = iA0E & 15;
        if (i2 == 7) {
            this.A00 = i;
            return i != 5;
        }
        throw new C0906Wj(A00(0, 28, 8) + i2);
    }
}
