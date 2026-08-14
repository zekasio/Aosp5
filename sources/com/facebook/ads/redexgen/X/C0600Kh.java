package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0600Kh {
    public static byte[] A0E;
    public static String[] A0F = {"D9utVieqpHmzq", "1reJ20tywIkt8c03XFg68iFkPgUpcQh9", "1hiVgm3FzyAWthqubctijKn7iSl8t7OZ", "2MGbhVYWK6vnLzanQZMPK5FLJbU6N2Mg", "tHlP6Jv5sj70nCQXOaNATx3kiWqPf1Tp", "kSrICwDX6P2QTtBsWrInLj9wi3Ca9feR", "Z5GcmA6HHHf7tKUPWv2sbOMAsuTj15Gl", "CZogAanemwBaq"};
    public int A00;
    public C8U A01;
    public KM A02;

    @Nullable
    public M4 A03;

    @Nullable
    public String A04;

    @Nullable
    public String A05;
    public String A06;

    @Nullable
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AdPlacementType A0B;
    public final KR A0C;

    @Nullable
    public final String A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-69, -68, -91, -88, -61, -87, -68, -76, -87, -74, -83, -87, -78, -89, -87, -61, -72, -67, -76, -87, Ascii.DC2, Ascii.NAK, 48, 35, Ascii.SYN, 33, 32, 35, 37, Ascii.SUB, Ascii.US, Ascii.CAN, 48, Ascii.DC4, 32, Ascii.US, Ascii.ETB, Ascii.SUB, Ascii.CAN, 48, Ascii.GS, Ascii.DC2, 36, 37, 48, 38, 33, Ascii.NAK, Ascii.DC2, 37, Ascii.SYN, 48, 37, Ascii.SUB, Ascii.RS, Ascii.SYN, 10, 17, Ascii.FF, 39, 17, Ascii.FF, -32, -25, -30, -3, -14, -25, -21, -29, -3, -14, -19, -23, -29, -20, -29, -20, -23, -27, -18, -12, -1, -14, -27, -15, -11, -27, -13, -12, -1, -23, -28, -73, -61, -60, -60, -75, -50, -49, -41, -39, -23, -53, -50, -23, -45, -50, Ascii.VT, Ascii.RS, Ascii.SUB, Ascii.CAN, 7, 37, Ascii.SO, Ascii.SI, Ascii.DC4, Ascii.SUB, Ascii.EM, -16, -19, -15, -17, -16, -4, -5, -10, -8, -13, -65, -70, -68, -73, -43, -68, -62, -73, -67, -4, 6, Ascii.DC2, 0, 8, -1, 7, -4, Ascii.DC2, -12, -9, Ascii.DC2, -8, Ascii.VT, 3, -8, 5, -4, -8, 1, -10, -8, -14, -18, 6, -7, -20, -6, -5, -7, -16, -22, -5, -20, -21, -43, -54, -36, -35, -24, -36, -54, -33, -50, -51, -24, -43, -40, -52, -54, -43, -50, Ascii.SYN, Ascii.GS, Ascii.NAK, 39, 9, Ascii.FF, Ascii.ESC, 39, Ascii.SUB, Ascii.CR, Ascii.EM, Ascii.GS, Ascii.CR, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.FF, -86, -90, -101, -99, -97, -89, -97, -88, -82, -71, -93, -98, -59, -63, -74, -72, -70, -62, -70, -61, -55, -44, -55, -50, -59, -70, 39, Ascii.SUB, 38, 42, Ascii.SUB, 40, 41, 52, 41, Ascii.RS, 34, Ascii.SUB, Ascii.FS, Ascii.GS, 10, Ascii.FF, Ascii.DC4, 40, Ascii.GS, Ascii.ESC, 10, Ascii.FF, Ascii.SO, -49, -64, -56, -53, -57, -68, -49, -64, -38, -60, -65, Ascii.SO, -1, Ascii.CR, Ascii.SO, Ascii.EM, 7, 9, -2, -1, -30, -44, -49, -33, -45};
    }

    static {
        A02();
    }

    public C0600Kh(C8U c8u, String str, @Nullable M4 m4, KM km, @Nullable String str2, int i, boolean z, boolean z2, KR kr, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.A01 = c8u;
        this.A06 = str;
        this.A03 = m4;
        this.A02 = km;
        this.A0D = str2;
        this.A00 = i;
        this.A0A = z;
        this.A08 = z2;
        this.A0C = kr;
        this.A0B = km.A04();
        this.A07 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    private long A00() {
        SharedPreferences sharedPreferencesA00 = C0610Kt.A00(this.A01);
        String strA01 = A01(173, 17, 50);
        String string = sharedPreferencesA00.getString(strA01, A01(0, 0, 83));
        if (string == null) {
            return 0L;
        }
        String string2 = Locale.getDefault().toString();
        if (A0F[5].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[7] = "UbRIo10SAcnK0";
        strArr[0] = "rMKDtS17rDD7f";
        if (string.equals(string2)) {
            return C2E.A00(this.A01.A00()).A09();
        }
        sharedPreferencesA00.edit().putString(strA01, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final KM A05() {
        return this.A02;
    }

    @Nullable
    public final M4 A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> A08(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0600Kh.A08(java.util.Map):java.util.Map");
    }
}
