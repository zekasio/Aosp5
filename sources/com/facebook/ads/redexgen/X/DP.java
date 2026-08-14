package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DP {
    public static byte[] A05;
    public static String[] A06 = {"C09qkhbo3vRSWUJSgSkEV0X", "WA1yWV5061NHQxIGBHZdG7C7pKjO5Y9H", "pYBemDtXYAadS99Nmeaz8GF", "NyHZMe4zCbCNgYs1LmeICE7hAZM3ASIf", "", "Aq1CtCEX8aJa", "3dQVxpobetg6gtuImvAOL3PNXFyzfQ27", "PtQ4b0lS5cBc"};
    public final int A00;
    public final C0416Cn A01;

    @Nullable
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "3n0Xyqau0qpDSx89MxSLBxd";
            strArr2[0] = "tz3h4DDpAPGNu8T48YqRwIi";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{118, 127, 113, Ascii.DLE, 34, 34, 36, 60, 56, 63, 54, 113, Ascii.DLE, Ascii.DC4, 2, 124, Ascii.DC2, 5, 3, 113, 50, 35, 40, 33, 37, 62, 113, 60, 62, 53, 52, 127, 72, 110, 125, 127, 119, 89, 114, 127, 110, 101, 108, 104, 117, 115, 114, 94, 115, 100, 58, 1, Ascii.FS, Ascii.SUB, Ascii.US, Ascii.US, 0, Ascii.GS, Ascii.ESC, 10, Ascii.VT, 79, Ascii.US, Ascii.GS, 0, Ascii.ESC, 10, Ascii.FF, Ascii.ESC, 6, 0, 1, 79, Ascii.FS, Ascii.FF, 7, 10, 2, 10, 79, Ascii.ESC, Ascii.SYN, Ascii.US, 10, 79, 72, 114, 115, 114, 32, 2, 3, 2, Ascii.DC2, 95, 89, 82, 95, 32, 38, 45, 48};
    }

    static {
        A02();
    }

    public DP(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        IK.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C0416Cn(A00(str), bArr, i2, i3);
    }

    public static int A00(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 118))) {
                    b = 2;
                }
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 6))) {
                    b = 3;
                }
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 91))) {
                    b = 0;
                }
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 36))) {
                    b = 1;
                }
                break;
        }
        if (b == 0 || b == 1) {
            return 1;
        }
        if (b == 2 || b == 3) {
            return 2;
        }
        Log.w(A01(32, 18, 123), A01(50, 36, 8) + str + A01(0, 32, 54));
        return 1;
    }
}
