package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DM {
    public static byte[] A00;
    public static String[] A01 = {"3vAPqkZTJ1VSon", "QUTM7SdDWyFumvZa4ixbAFeRkcyJbQtu", "xie3JnTyZ8PkMdNBWExCsKsV5Mn", "WzqQT7JP0s6wyXASN6VfDx7AAKIr1zQR", "8xy", "R913nsbqijjrVtiNLSpVoV0rL8armwI", "xGv", "6Jbm"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, Ascii.US, 74, Ascii.EM, 123, 47, 122, 42, 111, 59, 57, 106, 17, 69, 69, Ascii.DC4, 58, 110, 121, Ascii.SUB, 78, 91, Ascii.US, 10, 94, 74, Ascii.SI, 125, 4, 113, Ascii.DLE, 69, 60, 94, 40, 54, 79, 45, 43, 101, 123, 102, 126, 80, 71, 82, 0, 116, 38, 100, 50, 70, 75, 88, Ascii.US, 88, 70, 83, 1, 102, 124, 96, 61, Ascii.DC4, Ascii.SO, Ascii.DC2, 78, 63, 37, 57, 98, 112, 106, 118, 44, 94, 68, 88, 1, 83, 73, 85, 87, 60, 51, 51, 62, 111, 114, 54, 51, Ascii.DC2, Ascii.SI, 75, 77, 112, 117, 33, 33};
        if (A01[3].charAt(26) != 'I') {
            throw new RuntimeException();
        }
        A01[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
    }

    static {
        A01();
        A02 = new int[]{C0567Iz.A08(A00(79, 4, 5)), C0567Iz.A08(A00(59, 4, 48)), C0567Iz.A08(A00(63, 4, 66)), C0567Iz.A08(A00(67, 4, 105)), C0567Iz.A08(A00(71, 4, 38)), C0567Iz.A08(A00(75, 4, 8)), C0567Iz.A08(A00(43, 4, 14)), C0567Iz.A08(A00(55, 4, 15)), C0567Iz.A08(A00(51, 4, 17)), C0567Iz.A08(A00(87, 4, 61)), C0567Iz.A08(A00(91, 4, 64)), C0567Iz.A08(A00(0, 4, 71)), C0567Iz.A08(A00(4, 4, 119)), C0567Iz.A08(A00(19, 4, 22)), C0567Iz.A08(A00(23, 4, 6)), C0567Iz.A08(A00(8, 4, 99)), C0567Iz.A08(A00(12, 4, 29)), C0567Iz.A08(A00(31, 4, 55)), C0567Iz.A08(A00(27, 4, 15)), C0567Iz.A08(A00(47, 4, 45)), C0567Iz.A08(A00(83, 4, 104)), C0567Iz.A08(A00(35, 4, 68)), C0567Iz.A08(A00(95, 4, 62)), C0567Iz.A08(A00(39, 4, 23))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == C0567Iz.A08(A00(16, 3, 54))) {
            return true;
        }
        int[] iArr = A02;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A01[5] = "EPRlEFMBD24k0biyd";
        for (int compatibleBrand : iArr) {
            if (compatibleBrand == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return A05(interfaceC0408Cd, true);
    }

    public static boolean A04(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        return A05(interfaceC0408Cd, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.facebook.ads.redexgen.X.InterfaceC0408Cd r17, boolean r18) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DM.A05(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }
}
