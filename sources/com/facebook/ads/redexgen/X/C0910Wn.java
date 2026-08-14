package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0910Wn extends Cq {
    public static byte[] A03;
    public static String[] A04 = {"Es", "iHC9pRtfoWLcycijntiJYXN2", "TuGPNLSlit", "098OJ58R6u", "VNifGSmWt2UpuuC8pFHITdWilQmWPSdD", "nPBEvfeprzzMECJ3xuyevnTK", "FVZwpUplP67oS0xaMKq2ljUJ3jrVNcvU", "q6VKpvb2t6NLzvXLeBGroGgfRiC5SSnv"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{77, 121, 104, 101, 99, 44, 106, 99, 126, 97, 109, 120, 44, 98, 99, 120, 44, 127, 121, 124, 124, 99, 126, 120, 105, 104, 54, 44, 99, 119, 102, 107, 109, 45, 101, 53, 51, 51, 47, 99, 110, 99, 117, Ascii.DLE, 4, Ascii.NAK, Ascii.CAN, Ascii.RS, 94, Ascii.SYN, 70, 64, 64, 92, Ascii.FS, Ascii.GS, Ascii.DLE, 6, 49, 37, 52, 57, 63, 127, 61, 32, 100, 49, 125, 60, 49, 36, 61, 38, 50, 35, 46, 40, 104, 42, 55, 34, 32};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C0910Wn(InterfaceC0417Co interfaceC0417Co) {
        super(interfaceC0417Co);
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C0551Ij c0551Ij, long j) throws C0360Af {
        if (this.A00 == 2) {
            int iA04 = c0551Ij.A04();
            super.A00.AEG(c0551Ij, iA04);
            super.A00.AEH(j, 1, iA04, 0, null);
            return;
        }
        int iA0E = c0551Ij.A0E();
        if (iA0E == 0) {
            boolean z = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "UGwyap6YoK";
            strArr2[3] = "84lnx1SX4s";
            if (!z) {
                byte[] bArr = new byte[c0551Ij.A04()];
                c0551Ij.A0c(bArr, 0, bArr.length);
                Pair<Integer, Integer> pairA03 = IO.A03(bArr);
                Format format = Format.A07(null, A00(58, 15, 95), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArr), null, 0, null);
                super.A00.A5V(format);
                this.A01 = true;
                return;
            }
        }
        if (this.A00 == 10 && iA0E != 1) {
            return;
        }
        int iA042 = c0551Ij.A04();
        super.A00.AEG(c0551Ij, iA042);
        super.A00.AEH(j, 1, iA042, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    @Override // com.facebook.ads.redexgen.X.Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(com.facebook.ads.redexgen.X.C0551Ij r17) throws com.facebook.ads.redexgen.X.C0906Wj {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0910Wn.A0C(com.facebook.ads.redexgen.X.Ij):boolean");
    }
}
