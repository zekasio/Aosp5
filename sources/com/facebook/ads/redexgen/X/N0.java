package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N0 {
    public static byte[] A00;
    public static String[] A01 = {"Ja1bzDC4XO6MJovALms6", "IsGiV6tW8eEZvxsgDHoXbhWPQfEYRFJe", "F2wXUvOdg1ErZ5Wo6Cgjufn4T4zC8kyY", "0BOYk9mrV7ZAWg7WZWP8YYSS1bLPwSw8", "ohe2pYr3qvUc9pGZYOoHj0caDSEXBlEt", "i3VOTigCB6pNI1", "51BdPbZeK1jUSv1wKhHS", "aZfUmaE3Xil8RoSsFIMTsgdGf"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(18) != strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A01[3] = "NODd4hgwoPsa2k2MnOsaUDtymSUydbAu";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{61, 57, 58, Ascii.SO, Ascii.US, Ascii.DC2, Ascii.RS, Ascii.NAK, Ascii.CAN, Ascii.RS, 53, Ascii.RS, Ascii.SI, Ascii.FF, Ascii.DC4, 9, Ascii.DLE, 9, 46, 38, 35, 111, 59, 32, 111, 61, 42, 33, 43, 42, 61, 111, 1, 46, 59, 38, 57, 42, 111, 59, 42, 34, 63, 35, 46, 59, 42, 97, 111, 10, 34, 63, 59, 54, 111, Ascii.SO, 33, 43, 61, 32, 38, 43, 111, Ascii.EM, 38, 42, 56, 111, 56, 38, 35, 35, 111, 45, 42, 111, 61, 42, 59, 58, 61, 33, 42, 43, 97, 52, 59, 46, 51, 44, 63, 5, 46, 63, 55, 42, 54, 59, 46, 63};
    }

    static {
        A02();
    }

    public static View A00(C0947Xy c0947Xy, Throwable th) {
        A03(c0947Xy, th);
        return new View(c0947Xy);
    }

    public static void A03(C0947Xy c0947Xy, Throwable th) {
        c0947Xy.A06().A8y(A01(85, 15, 44), C03298z.A1v, new AnonymousClass90(th));
        Log.e(A01(0, 17, 13), A01(17, 68, 57), th);
    }
}
