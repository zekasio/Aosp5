package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J1 {
    public static byte[] A05;
    public static String[] A06 = {"6HhNm3cPNapwaqbb", "rETS2R3vEEslStUJRpCBgfLkJK0S9xqh", "MEYGBk1oMmhBWHD5huW8XB9PkOXmJxmW", "Ebyfs41o5airltqaiKadsdL394JDYdET", "45eNA9gLGf59sMGZ1iMI", "", "A0Zue4QITY9ZnpF1VrB6IK97BmW1DYMt", "lY4WeGl5g11cW0QvoH9uVkbc4B0XWsja"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[1].charAt(1)) {
                throw new RuntimeException();
            }
            A06[3] = "kNkKJeUYPfq8eMd2tA59MaBH22H8N5Ts";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{Ascii.CR, 58, 58, 55, 58, -24, 56, 41, 58, 59, 49, 54, 47, -24, 9, Ascii.RS, Ascii.VT, -24, 43, 55, 54, 46, 49, 47};
    }

    static {
        A02();
    }

    public J1(List<byte[]> initializationData, int i, int i2, int i3, float f) {
        this.A04 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
    }

    public static J1 A00(C0551Ij c0551Ij) throws C0360Af {
        try {
            c0551Ij.A0Z(4);
            int iA0E = (c0551Ij.A0E() & 3) + 1;
            if (iA0E != 3) {
                ArrayList arrayList = new ArrayList();
                int numSequenceParameterSets = c0551Ij.A0E() & 31;
                for (int j = 0; j < numSequenceParameterSets; j++) {
                    arrayList.add(A03(c0551Ij));
                }
                int iA0E2 = c0551Ij.A0E();
                for (int numPictureParameterSets = 0; numPictureParameterSets < iA0E2; numPictureParameterSets++) {
                    arrayList.add(A03(c0551Ij));
                }
                int i = -1;
                int i2 = -1;
                float f = 1.0f;
                int width = A06[4].length();
                if (width == 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[2] = "yEkjaL4nSOxIxbdygxb0eg7rmaPMv2Rh";
                strArr[1] = "JEi8k2PtpDNktftvz60xHr0NAbywlG3U";
                if (numSequenceParameterSets > 0) {
                    byte[] bArr = (byte[]) arrayList.get(0);
                    byte[] bArr2 = (byte[]) arrayList.get(0);
                    int height = bArr.length;
                    C0546Ie c0546IeA06 = C0547If.A06(bArr2, iA0E, height);
                    i = c0546IeA06.A06;
                    i2 = c0546IeA06.A02;
                    f = c0546IeA06.A00;
                }
                return new J1(arrayList, iA0E, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C0360Af(A01(0, 24, 119), e);
        }
    }

    public static byte[] A03(C0551Ij c0551Ij) {
        int offset = c0551Ij.A0I();
        int iA06 = c0551Ij.A06();
        c0551Ij.A0Z(offset);
        return IO.A08(c0551Ij.A00, iA06, offset);
    }
}
