package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WA implements InterfaceC0426Di {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0437Dt> A04;
    public final InterfaceC0417Co[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public WA(List<C0437Dt> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0417Co[list.size()];
    }

    private boolean A02(C0551Ij c0551Ij, int i) {
        if (c0551Ij.A04() == 0) {
            return false;
        }
        if (c0551Ij.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A48(C0551Ij c0551Ij) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0551Ij, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0551Ij, 0)) {
                return;
            }
            int iA06 = c0551Ij.A06();
            int iA04 = c0551Ij.A04();
            for (InterfaceC0417Co output : this.A05) {
                c0551Ij.A0Y(iA06);
                output.AEG(c0551Ij, iA04);
            }
            this.A01 += iA04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        int i = 0;
        while (true) {
            InterfaceC0417Co[] interfaceC0417CoArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i < interfaceC0417CoArr.length) {
                C0437Dt c0437Dt = this.A04.get(i);
                c0440Dw.A05();
                InterfaceC0417Co interfaceC0417CoAFD = interfaceC0409Ce.AFD(c0440Dw.A03(), 3);
                interfaceC0417CoAFD.A5V(Format.A0A(c0440Dw.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c0437Dt.A02), c0437Dt.A01, null));
                this.A05[i] = interfaceC0417CoAFD;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
        if (this.A03) {
            for (InterfaceC0417Co interfaceC0417Co : this.A05) {
                interfaceC0417Co.AEH(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        this.A03 = false;
    }
}
