package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FU {
    public static byte[] A03;
    public static String[] A04 = {"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    public InterfaceC0407Cc A00;
    public final InterfaceC0409Ce A01;
    public final InterfaceC0407Cc[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, Ascii.DC4, Ascii.CAN, 2, Ascii.ESC, 19, 87, 5, Ascii.DC2, Ascii.SYN, 19, 87, 3, Ascii.US, Ascii.DC2, 87, 4, 3, 5, Ascii.DC2, Ascii.SYN, Ascii.SUB, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    static {
        A01();
    }

    public FU(InterfaceC0407Cc[] interfaceC0407CcArr, InterfaceC0409Ce interfaceC0409Ce) {
        this.A02 = interfaceC0407CcArr;
        this.A01 = interfaceC0409Ce;
    }

    public final InterfaceC0407Cc A02(InterfaceC0408Cd interfaceC0408Cd, Uri uri) throws InterruptedException, IOException {
        InterfaceC0407Cc interfaceC0407Cc = this.A00;
        if (interfaceC0407Cc != null) {
            return interfaceC0407Cc;
        }
        InterfaceC0407Cc[] interfaceC0407CcArr = this.A02;
        int length = interfaceC0407CcArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC0407Cc interfaceC0407Cc2 = interfaceC0407CcArr[i];
            try {
                if (interfaceC0407Cc2.AEv(interfaceC0408Cd)) {
                    this.A00 = interfaceC0407Cc2;
                    interfaceC0408Cd.AEB();
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0408Cd.AEB();
                throw th;
            }
            interfaceC0408Cd.AEB();
            i++;
        }
        InterfaceC0407Cc interfaceC0407Cc3 = this.A00;
        if (A04[6].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "fQ5Ua6";
        strArr[7] = "HZXGBz";
        if (interfaceC0407Cc3 != null) {
            interfaceC0407Cc3.A8I(this.A01);
            return this.A00;
        }
        throw new VT(A00(24, 34, 125) + C0567Iz.A0S(this.A02) + A00(0, 24, 5), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
