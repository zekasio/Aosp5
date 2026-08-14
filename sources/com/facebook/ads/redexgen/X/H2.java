package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H2 {
    public static byte[] A02;
    public static String[] A03 = {"5moU6oTWlMaw1sDVAQ0KQ9vMfu", "p49r3ReMaXkyq3mZFz3vXo8SK9LaCwKA", "zB3eTtV", "qmKjW68jdxdUPQHo", "qXdLPSjDEI4OIDX4GQuIV", "", "iFy7tRn7HMov4f4CYUKnyhY2lj6xewaE", "7WU313Gqg3541KnskWJgurkNM7"};
    public static final Pattern A04;
    public final C0551Ij A00 = new C0551Ij();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[3].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WbeGi2EdgzwyYonzf4wPzmwNCcWtg9MW";
            strArr[6] = "HcL7UN1N9oazqVf2QAldqbU1hHC9CZ0b";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b = bArrCopyOfRange[i4];
            String[] strArr2 = A03;
            if (strArr2[7].length() != strArr2[0].length()) {
                String[] strArr3 = A03;
                strArr3[4] = "JF2Fp1R2vbvas833wDrB0";
                strArr3[5] = "";
                bArrCopyOfRange[i4] = (byte) ((b - i3) - 66);
                i4 += 0;
            } else {
                String[] strArr4 = A03;
                strArr4[1] = "nmNaQjGJyPE7mmPpZpQG0xjHlUJrvUW4";
                strArr4[6] = "jsP66PUWr33y4hLthtnL6xZSYxJtrhjf";
                bArrCopyOfRange[i4] = (byte) ((b - i3) - 86);
                i4++;
            }
        }
    }

    public static void A07() {
        A02 = new byte[]{-10, -76, -18, -81, -81, -40, -22, -38, -9, Ascii.FF, -34, -38, -39, -12, -19, -25, -31, -29, -69, -96, -90, -39, -36, -96, -37, -88, -89, -96, -38, -37, Ascii.CR, Ascii.FF, Ascii.SO, Ascii.SYN, Ascii.DC2, Ascii.GS, Ascii.SUB, 32, Ascii.EM, Ascii.SI, -40, Ascii.SO, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.GS, -72, -59, -62, -70, 53, 65, 62, 65, 68, 33, 42, 41, 47, -24, 33, Ascii.FS, 40, 36, 39, 52, -36, -27, -28, -22, -93, -23, -22, -17, -30, -37, -31, -22, -23, -17, -88, -14, -32, -28, -30, -29, -17, -15, -4, -23, -12, -15, -21, -5, -20, -1, -5, -76, -21, -20, -22, -10, -7, -24, -5, -16, -10, -11, 58, 51, 41, 42, 55, 49, 46, 51, 42, -34, -17};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 40));
    }

    public static char A00(C0551Ij c0551Ij, int i) {
        return (char) c0551Ij.A00[i];
    }

    public static String A02(C0551Ij c0551Ij) {
        int limit = c0551Ij.A06();
        int iA07 = c0551Ij.A07();
        int position = 0;
        while (limit < iA07 && position == 0) {
            int i = limit + 1;
            int position2 = c0551Ij.A00[limit];
            int limit2 = (char) position2;
            position = limit2 == 41 ? 1 : 0;
            limit = i;
        }
        return c0551Ij.A0S((limit - 1) - c0551Ij.A06()).trim();
    }

    public static String A03(C0551Ij c0551Ij, StringBuilder sb) {
        sb.setLength(0);
        int iA06 = c0551Ij.A06();
        int iA07 = c0551Ij.A07();
        boolean z = false;
        while (iA06 < iA07 && !z) {
            char c = (char) c0551Ij.A00[iA06];
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                iA06++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        c0551Ij.A0Z(iA06 - c0551Ij.A06());
        return sb.toString();
    }

    public static String A04(C0551Ij c0551Ij, StringBuilder sb) {
        A0A(c0551Ij);
        if (c0551Ij.A04() == 0) {
            return null;
        }
        String strA03 = A03(c0551Ij, sb);
        String strA01 = A01(0, 0, 21);
        if (!strA01.equals(strA03)) {
            return strA03;
        }
        return strA01 + ((char) c0551Ij.A0E());
    }

    public static String A05(C0551Ij c0551Ij, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iA06 = c0551Ij.A06();
            String strA04 = A04(c0551Ij, sb);
            if (strA04 == null) {
                return null;
            }
            if (A01(118, 1, 28).equals(strA04) || A01(8, 1, 102).equals(strA04)) {
                c0551Ij.A0Y(iA06);
                z = true;
            } else {
                sb2.append(strA04);
            }
        }
        String string = sb2.toString();
        String[] strArr = A03;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A03[2] = "Zajsfk5";
        return string;
    }

    public static String A06(C0551Ij c0551Ij, StringBuilder sb) {
        A0A(c0551Ij);
        if (c0551Ij.A04() < 5) {
            return null;
        }
        if (!A01(3, 5, 31).equals(c0551Ij.A0S(5))) {
            return null;
        }
        int iA06 = c0551Ij.A06();
        String strA04 = A04(c0551Ij, sb);
        if (strA04 == null) {
            return null;
        }
        String token = A01(117, 1, 13);
        if (token.equals(strA04)) {
            c0551Ij.A0Y(iA06);
            String token2 = A01(0, 0, 21);
            return token2;
        }
        String strA02 = null;
        String token3 = A01(0, 1, 120);
        if (token3.equals(strA04)) {
            strA02 = A02(c0551Ij);
        }
        String strA042 = A04(c0551Ij, sb);
        String token4 = A01(1, 1, 53);
        if (!token4.equals(strA042) || strA042 == null) {
            return null;
        }
        return strA02;
    }

    private void A08(H6 h6, String str) {
        if (A01(0, 0, 21).equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Pattern pattern = A04;
            String[] strArr = A03;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "I8JZnIR9egwAM0HwkjEQFl8l1n";
            strArr2[0] = "OMVURqNL7mUYh9I5H6Apgp30fA";
            Matcher matcher = pattern.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                h6.A0K(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA0l = C0567Iz.A0l(str, A01(9, 2, 90));
        String str2 = strArrA0l[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            h6.A0J(str2.substring(0, iIndexOf2));
            int idPrefixIndex = iIndexOf2 + 1;
            h6.A0I(str2.substring(idPrefixIndex));
        } else {
            h6.A0J(str2);
        }
        int idPrefixIndex2 = strArrA0l.length;
        if (idPrefixIndex2 > 1) {
            int idPrefixIndex3 = strArrA0l.length;
            h6.A0L((String[]) Arrays.copyOfRange(strArrA0l, 1, idPrefixIndex3));
        }
    }

    public static void A09(C0551Ij c0551Ij) {
        while (!TextUtils.isEmpty(c0551Ij.A0P())) {
        }
    }

    public static void A0A(C0551Ij c0551Ij) {
        boolean z = true;
        while (c0551Ij.A04() > 0 && z) {
            if (!A0D(c0551Ij)) {
                boolean zA0C = A0C(c0551Ij);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "hJK3qjOtPloIxgY8vJytqI0HGH";
                strArr2[0] = "GkPADoSnbvIPHM1na4c3lEMD25";
                if (!zA0C) {
                    z = false;
                }
            }
            z = true;
        }
    }

    public static void A0B(C0551Ij c0551Ij, H6 h6, StringBuilder sb) {
        A0A(c0551Ij);
        String token = A03(c0551Ij, sb);
        String strA01 = A01(0, 0, 21);
        if (strA01.equals(token)) {
            return;
        }
        if (!A01(2, 1, 94).equals(A04(c0551Ij, sb))) {
            return;
        }
        A0A(c0551Ij);
        String strA05 = A05(c0551Ij, sb);
        if (strA05 == null || strA01.equals(strA05)) {
            return;
        }
        int iA06 = c0551Ij.A06();
        String strA04 = A04(c0551Ij, sb);
        if (!A01(8, 1, 102).equals(strA04)) {
            if (A01(118, 1, 28).equals(strA04)) {
                c0551Ij.A0Y(iA06);
            } else {
                return;
            }
        }
        if (A01(50, 5, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES).equals(token)) {
            h6.A0C(IP.A02(strA05));
            return;
        }
        if (A01(30, 16, 85).equals(token)) {
            h6.A0B(IP.A02(strA05));
            return;
        }
        if (A01(93, 15, 49).equals(token)) {
            if (!A01(108, 9, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION).equals(strA05)) {
                return;
            }
            h6.A0G(true);
        } else {
            if (A01(55, 11, 101).equals(token)) {
                h6.A0D(strA05);
                return;
            }
            if (A01(76, 11, 37).equals(token)) {
                if (!A01(46, 4, 0).equals(strA05)) {
                    return;
                }
                h6.A0E(true);
            } else {
                if (!A01(66, 10, 32).equals(token) || !A01(87, 6, 50).equals(strA05)) {
                    return;
                }
                h6.A0F(true);
            }
        }
    }

    public static boolean A0C(C0551Ij c0551Ij) {
        int limit = c0551Ij.A06();
        int iA07 = c0551Ij.A07();
        byte[] bArr = c0551Ij.A00;
        if (limit + 2 > iA07) {
            return false;
        }
        int i = limit + 1;
        if (bArr[limit] != 47) {
            return false;
        }
        int limit2 = i + 1;
        if (bArr[i] == 42) {
            while (limit2 + 1 < iA07) {
                int i2 = limit2 + 1;
                if (((char) bArr[limit2]) == '*' && ((char) bArr[i2]) == '/') {
                    iA07 = i2 + 1;
                    String[] strArr = A03;
                    if (strArr[4].length() == strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    A03[3] = "JvQuY0ttidF2MFD";
                    limit2 = iA07;
                } else {
                    limit2 = i2;
                }
            }
            c0551Ij.A0Z(iA07 - c0551Ij.A06());
            return true;
        }
        return false;
    }

    public static boolean A0D(C0551Ij c0551Ij) {
        char cA00 = A00(c0551Ij, c0551Ij.A06());
        if (cA00 != '\t' && cA00 != '\n' && cA00 != '\f' && cA00 != '\r') {
            String[] strArr = A03;
            if (strArr[1].charAt(8) == strArr[6].charAt(8)) {
                throw new RuntimeException();
            }
            A03[2] = "XdMJqir";
            if (cA00 != ' ') {
                return false;
            }
        }
        c0551Ij.A0Z(1);
        String[] strArr2 = A03;
        if (strArr2[1].charAt(8) == strArr2[6].charAt(8)) {
            A03[3] = "JQij4b";
            return true;
        }
        String[] strArr3 = A03;
        strArr3[7] = "YUo1DIFuEN1uIrNP3uzwlzTLm0";
        strArr3[0] = "TeHQYLZm1GheElXx48zfUEG6q3";
        return true;
    }

    public final H6 A0E(C0551Ij c0551Ij) {
        this.A01.setLength(0);
        int iA06 = c0551Ij.A06();
        A09(c0551Ij);
        this.A00.A0b(c0551Ij.A00, c0551Ij.A06());
        this.A00.A0Y(iA06);
        String strA06 = A06(this.A00, this.A01);
        if (strA06 != null) {
            if (A01(117, 1, 13).equals(A04(this.A00, this.A01))) {
                H6 h6 = new H6();
                A08(h6, strA06);
                String strA04 = null;
                boolean z = false;
                while (true) {
                    String strA01 = A01(118, 1, 28);
                    if (!z) {
                        C0551Ij c0551Ij2 = this.A00;
                        if (A03[2].length() != 7) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "P2Yqf81YsUpWwfjUTZqElTDCCY";
                        strArr[0] = "xGmVLGcPrtNhIWRwMqh3QWIima";
                        int iA062 = c0551Ij2.A06();
                        strA04 = A04(this.A00, this.A01);
                        z = strA04 == null || strA01.equals(strA04);
                        if (!z) {
                            this.A00.A0Y(iA062);
                            A0B(this.A00, h6, this.A01);
                        }
                    } else {
                        if (strA01.equals(strA04)) {
                            return h6;
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
