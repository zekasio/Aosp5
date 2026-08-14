package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0443Dz {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, Ascii.RS, Ascii.SYN, Ascii.CR, 67, 89, 84, 127, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, 63, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, 127, 124, 116, 127, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, Ascii.CAN, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, Ascii.CAN, 111, 121, 110, Ascii.CAN, 90, 81, 76, Ascii.CAN, 92, 93, 72, 76, 80, Ascii.CAN, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, Ascii.US, 104, 126, 105, Ascii.US, 89, 80, 77, 82, 94, 75, Ascii.US, 75, 70, 79, 90, 5, Ascii.US, 5, 19, 4, Ascii.ETB, Ascii.CAN, 46, 57, 7, 42, 46, 43, 42, 61, Ascii.GS, 42, 46, 43, 42, 61, 102, 99, 118, 99, 19, Ascii.CAN, 1, 85};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x007a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C0889Vs A00(com.facebook.ads.redexgen.X.InterfaceC0408Cd r19) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0443Dz.A00(com.facebook.ads.redexgen.X.Cd):com.facebook.ads.redexgen.X.Vs");
    }

    public static void A03(InterfaceC0408Cd interfaceC0408Cd, C0889Vs c0889Vs) throws InterruptedException, IOException {
        IK.A01(interfaceC0408Cd);
        IK.A01(c0889Vs);
        interfaceC0408Cd.AEB();
        C0551Ij c0551Ij = new C0551Ij(8);
        C0442Dy c0442DyA00 = C0442Dy.A00(interfaceC0408Cd, c0551Ij);
        while (c0442DyA00.A00 != C0567Iz.A08(A01(214, 4, 50))) {
            Log.w(A01(199, 15, 127), A01(83, 28, 37) + c0442DyA00.A00);
            long bytesToSkip = c0442DyA00.A01 + 8;
            if (c0442DyA00.A00 == C0567Iz.A08(A01(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 4, 14))) {
                bytesToSkip = 12;
            }
            if (bytesToSkip <= 2147483647L) {
                interfaceC0408Cd.AEt((int) bytesToSkip);
                c0442DyA00 = C0442Dy.A00(interfaceC0408Cd, c0551Ij);
            } else {
                throw new C0360Af(A01(17, 40, 39) + c0442DyA00.A00);
            }
        }
        interfaceC0408Cd.AEt(8);
        c0889Vs.A06(interfaceC0408Cd.A7F(), c0442DyA00.A01);
    }
}
