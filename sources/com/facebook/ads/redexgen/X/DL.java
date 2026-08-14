package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DL {
    public static byte[] A00;
    public static String[] A01 = {"kk3S4O13iVXJvtm5AjTeD8rK", "Zu4hi0TCs3bKXIhBk2aWCiDe3xK", "JowY5N4XtyrwAA9epoNCHGChZ5QJHmq", "OOxBqRpXIUSrAU80JlBeMYgVyXHV", "tCZgrksHUVK4eCN8oQ7yIu", "GrKlMP1w4PgYrm5YCKNZqmcWRop33Hln", "0sCqI3ucQZfe3Uil9qNltLDWT8T5PAU", "ug"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{76, 111, 111, 116, 93, 104, 115, 113, 73, 104, 117, 112, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, Ascii.CAN, 72, 75, 75, 80, Ascii.CAN, 78, 93, 74, 75, 81, 87, 86, 2, Ascii.CAN};
    }

    static {
        A04();
    }

    public static int A00(byte[] bArr) {
        DK parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A00;
        }
        return -1;
    }

    @Nullable
    public static DK A01(byte[] bArr) {
        C0551Ij c0551Ij = new C0551Ij(bArr);
        if (c0551Ij.A07() < 32) {
            return null;
        }
        c0551Ij.A0Y(0);
        if (c0551Ij.A08() != c0551Ij.A04() + 4) {
            return null;
        }
        int iA08 = c0551Ij.A08();
        int i = D3.A0r;
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[7];
        int length = str.length();
        int atomType = str2.length();
        if (length == atomType) {
            throw new RuntimeException();
        }
        A01[6] = "KiHnRKSUZsnBoZKY996tMhDtZ8Gdi7J";
        if (iA08 != i) {
            return null;
        }
        int atomType2 = c0551Ij.A08();
        int iA01 = D3.A01(atomType2);
        if (iA01 > 1) {
            Log.w(A02(0, 12, 31), A02(12, 26, 59) + iA01);
            return null;
        }
        UUID uuid = new UUID(c0551Ij.A0L(), c0551Ij.A0L());
        if (iA01 == 1) {
            c0551Ij.A0Z(c0551Ij.A0H() * 16);
        }
        int iA0H = c0551Ij.A0H();
        if (iA0H != c0551Ij.A04()) {
            return null;
        }
        byte[] data = new byte[iA0H];
        c0551Ij.A0c(data, 0, iA0H);
        return new DK(uuid, iA01, data);
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        DK dkA01 = A01(bArr);
        if (dkA01 != null) {
            return dkA01.A01;
        }
        if (A01[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "A19aWphbBlm9ojDJQ1W47aeMdyevB22";
        strArr[1] = "rfVibYQBAeR1UXfUamieG6t7la8";
        return null;
    }
}
