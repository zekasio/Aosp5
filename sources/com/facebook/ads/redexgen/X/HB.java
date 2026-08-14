package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HB {
    public static byte[] A01;
    public static String[] A02 = {"BH2zNHpX", "Dnuq9wFIL2", "vBkvmD9EAd5t9FTNthVuCuoibAfWrGUa", "Nhu3hv03L3KjBzyMucsPwsjdroL1", "9TVwE8RhMB8DaYr8DWqJ6OPYy1", "9JupfOkL4WUcaojH", "ecCz7RACP0dYyLgy5uflHn", "VPA8JBGLf77hbCQNqSGQ8FIxNIe4WZlE"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, Ascii.SYN, 48, 76, 56, 55, 79, 91, 77, 94, 76, 56, 55, 79, 77, 66, 54, 42, 35, 4, Ascii.FS, Ascii.VT, 6, 3, Ascii.SO, 74, Ascii.VT, 6, 3, Ascii.CR, 4, 7, Ascii.SI, 4, Ascii.RS, 74, Ascii.FS, Ascii.VT, 6, Ascii.US, Ascii.SI, 80, 74, 106, 77, 85, 66, 79, 74, 71, 3, 66, 77, 64, 75, 76, 81, 3, 85, 66, 79, 86, 70, Ascii.EM, 3, 42, Ascii.DC2, Ascii.DLE, 9, 9, Ascii.DLE, Ascii.ETB, Ascii.RS, 89, Ascii.ESC, Ascii.CAN, Ascii.GS, 89, Ascii.SUB, Ascii.FF, Ascii.FS, 89, 10, Ascii.FS, Ascii.CR, Ascii.CR, Ascii.DLE, Ascii.ETB, Ascii.RS, 67, 89, 118, 78, 76, 85, 85, 76, 75, 66, 5, 70, 80, 64, 5, 82, 76, 81, 77, 5, 71, 68, 65, 5, 77, 64, 68, 65, 64, 87, Ascii.US, 5, Ascii.SYN, 45, 40, 45, 44, 52, 45, 99, 32, 54, 38, 99, 48, 38, 55, 55, 42, 45, 36, 99, 51, 1, 6, Ascii.DC2, Ascii.DLE, Ascii.DLE, 39, 17, 1, 52, 5, Ascii.SYN, Ascii.ETB, 1, Ascii.SYN, 36, 95, 35, 81, 34, 59, 77, 57, 54, 78, 76, 57, Ascii.SYN, 78, 72, 72, 91, 57, Ascii.SYN, 78, 77, 57, 54, 78, 76, 77, 75, 79, 76, 90, 65, 41, 36, 33, 47, 38, 120, 116, 105, 82, Ascii.DC2, 19, Ascii.NAK, Ascii.RS, 4, Ascii.NAK, 2, 91, 80, 90, 103, 116, 99, 56, 54, 63, 62, 35, 56, 63, 54, 113, 36, 63, 34, 36, 33, 33, 62, 35, 37, 52, 53, 113, 52, 63, 37, 56, 37, 40, 107, 113, 118, 119, 33, 44, 35, 42, 44, 37, 38, 52, Ascii.ETB, Ascii.DC2, Ascii.NAK, Ascii.RS, 49, 41, 74, 78, 67, 67, 75, 66, 7, Ascii.VT, Ascii.SUB, Ascii.EM, Ascii.VT, Ascii.DC4, 8, Ascii.DC2, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.NAK, 67, 88, 86, 89, 69, 109, 119, 100, 123, 121, 126, 107, 120, 126, 99, 52};
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 61));
        A04 = Pattern.compile(A03(3, 12, 60));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 0
            r5 = 3
            r4 = 2
            r3 = 1
            switch(r0) {
                case -1364013995: goto L3d;
                case -1074341483: goto L4e;
                case 100571: goto L73;
                case 109757538: goto L84;
                default: goto Lb;
            }
        Lb:
            r0 = -1
        Lc:
            if (r0 == 0) goto L98
            if (r0 == r3) goto L97
            if (r0 == r4) goto L97
            if (r0 == r5) goto L96
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 43
            r1 = 22
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 60
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L3d:
            r2 = 197(0xc5, float:2.76E-43)
            r1 = 6
            r0 = 40
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        L4e:
            r2 = 254(0xfe, float:3.56E-43)
            r1 = 6
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r6 = r8.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HB.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 10
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HB.A02
            java.lang.String r1 = "MJ40TcK0DidUTvS4"
            r0 = 5
            r2[r0] = r1
            if (r6 == 0) goto Lb
            r0 = 2
            goto Lc
        L73:
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 3
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 3
            goto Lc
        L84:
            r2 = 281(0x119, float:3.94E-43)
            r1 = 5
            r0 = 82
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 0
            goto Lc
        L96:
            return r4
        L97:
            return r3
        L98:
            return r7
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A00(java.lang.String):int");
    }

    public static int A01(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment A02(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A02(java.lang.String):android.text.Layout$Alignment");
    }

    public static String A04(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return C0567Iz.A0m(strTrim, A03(156, 5, 39))[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.text.SpannableStringBuilder r5, com.facebook.ads.redexgen.X.H6 r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A06(android.text.SpannableStringBuilder, com.facebook.ads.redexgen.X.H6, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(java.lang.String r6, android.text.SpannableStringBuilder r7) {
        /*
            int r1 = r6.hashCode()
            r0 = 3309(0xced, float:4.637E-42)
            r5 = 3
            r4 = 2
            r3 = 1
            if (r1 == r0) goto La0
            r0 = 3464(0xd88, float:4.854E-42)
            if (r1 == r0) goto L8f
            r0 = 96708(0x179c4, float:1.35517E-40)
            if (r1 == r0) goto L7e
            r0 = 3374865(0x337f11, float:4.729193E-39)
            if (r1 == r0) goto L6d
        L19:
            r0 = -1
        L1a:
            if (r0 == 0) goto L67
            if (r0 == r3) goto L61
            if (r0 == r4) goto L5b
            if (r0 == r5) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 209(0xd1, float:2.93E-43)
            r1 = 31
            r0 = 9
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r6)
            r2 = 16
            r1 = 2
            r0 = 85
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 60
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
        L54:
            return
        L55:
            r0 = 38
            r7.append(r0)
            goto L54
        L5b:
            r0 = 32
            r7.append(r0)
            goto L54
        L61:
            r0 = 62
            r7.append(r0)
            goto L54
        L67:
            r0 = 60
            r7.append(r0)
            goto L54
        L6d:
            r2 = 260(0x104, float:3.64E-43)
            r1 = 4
            r0 = 49
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L19
            r0 = 2
            goto L1a
        L7e:
            r2 = 192(0xc0, float:2.69E-43)
            r1 = 3
            r0 = 65
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L19
            r0 = 3
            goto L1a
        L8f:
            r2 = 252(0xfc, float:3.53E-43)
            r1 = 2
            r0 = 5
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L19
            r0 = 0
            goto L1a
        La0:
            r2 = 206(0xce, float:2.89E-43)
            r1 = 2
            r0 = 88
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A07(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    public static void A08(String str, H8 h8) {
        String strA03 = A03(141, 15, 60);
        Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if (A03(248, 4, 35).equals(strGroup)) {
                    A09(strGroup2, h8);
                } else if (A03(187, 5, 16).equals(strGroup)) {
                    h8.A0B(A02(strGroup2));
                } else if (A03(264, 8, 35).equals(strGroup)) {
                    A0A(strGroup2, h8);
                } else if (A03(277, 4, 70).equals(strGroup)) {
                    h8.A05(HC.A00(strGroup2));
                } else {
                    Log.w(strA03, A03(121, 20, 27) + strGroup + A03(15, 1, 32) + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.w(strA03, A03(65, 26, 33) + matcher.group());
            }
        }
    }

    public static void A09(String str, H8 h8) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            h8.A06(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            h8.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 77))) {
            h8.A03(HC.A00(str)).A07(0);
            return;
        }
        int i = Integer.parseInt(str);
        if (i < 0) {
            i--;
        }
        H8 h8A03 = h8.A03(i);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "nfwpqDM6";
        strArr2[6] = "ldPC0GHiWge259aJMdVkFd";
        h8A03.A07(1);
    }

    public static void A0A(String str, H8 h8) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            h8.A08(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            h8.A08(Integer.MIN_VALUE);
        }
        h8.A04(HC.A00(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(java.lang.String r11, com.facebook.ads.redexgen.X.H9 r12, android.text.SpannableStringBuilder r13, java.util.List<com.facebook.ads.redexgen.X.H6> r14, java.util.List<com.facebook.ads.redexgen.X.HA> r15) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A0B(java.lang.String, com.facebook.ads.redexgen.X.H9, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(java.lang.String r10, java.lang.String r11, com.facebook.ads.redexgen.X.H8 r12, java.util.List<com.facebook.ads.redexgen.X.H6> r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A0C(java.lang.String, java.lang.String, com.facebook.ads.redexgen.X.H8, java.util.List):void");
    }

    public static void A0D(List<H6> list, String str, H9 h9, List<HA> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            H6 h6 = list.get(i);
            int iA09 = h6.A09(str, h9.A01, h9.A03, h9.A02);
            if (iA09 > 0) {
                list2.add(new HA(iA09, h6));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0E(java.lang.String r10) {
        /*
            int r1 = r10.hashCode()
            r0 = 98
            r9 = 0
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r1 == r0) goto L9f
            r0 = 99
            if (r1 == r0) goto L8e
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L64
            r0 = 3314158(0x3291ee, float:4.644125E-39)
            if (r1 == r0) goto L53
            r0 = 117(0x75, float:1.64E-43)
            if (r1 == r0) goto L42
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L31
        L23:
            r0 = -1
        L24:
            if (r0 == 0) goto Lb1
            if (r0 == r3) goto Lb1
            if (r0 == r4) goto Lb1
            if (r0 == r5) goto Lb1
            if (r0 == r6) goto Lb1
            if (r0 == r7) goto Lb1
            return r9
        L31:
            r2 = 287(0x11f, float:4.02E-43)
            r1 = 1
            r0 = 26
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 5
            goto L24
        L42:
            r2 = 286(0x11e, float:4.01E-43)
            r1 = 1
            r0 = 78
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 4
            goto L24
        L53:
            r2 = 240(0xf0, float:3.36E-43)
            r1 = 4
            r0 = 21
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 3
            goto L24
        L64:
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 1
            r0 = 82
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r8 = r10.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HB.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 10
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HB.A02
            java.lang.String r1 = "tlO5iwEB"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pEnQwZlkHTTTq7cfdXWDKW"
            r0 = 6
            r2[r0] = r1
            if (r8 == 0) goto L23
            r0 = 2
            goto L24
        L8e:
            r2 = 196(0xc4, float:2.75E-43)
            r1 = 1
            r0 = 41
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L9f:
            r2 = 195(0xc3, float:2.73E-43)
            r1 = 1
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 0
            goto L24
        Lb1:
            return r3
        Lb2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HB.A0E(java.lang.String):boolean");
    }

    public static boolean A0F(String str, Matcher matcher, C0551Ij c0551Ij, H8 h8, StringBuilder sb, List<H6> list) {
        try {
            h8.A0A(HC.A01(matcher.group(1))).A09(HC.A01(matcher.group(2)));
            A08(matcher.group(3), h8);
            sb.setLength(0);
            while (true) {
                String strA0P = c0551Ij.A0P();
                if (!TextUtils.isEmpty(strA0P)) {
                    if (sb.length() > 0) {
                        sb.append(A03(0, 1, 38));
                    }
                    sb.append(strA0P.trim());
                } else {
                    A0C(str, sb.toString(), h8, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 60), A03(91, 30, 125) + matcher.group());
            return false;
        }
    }

    public final boolean A0G(C0551Ij c0551Ij, H8 h8, List<H6> list) {
        String strA0P = c0551Ij.A0P();
        if (strA0P == null) {
            return false;
        }
        Matcher matcher = A03.matcher(strA0P);
        if (matcher.matches()) {
            return A0F(null, matcher, c0551Ij, h8, this.A00, list);
        }
        String strA0P2 = c0551Ij.A0P();
        if (strA0P2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(strA0P2);
        if (matcher2.matches()) {
            return A0F(strA0P.trim(), matcher2, c0551Ij, h8, this.A00, list);
        }
        return false;
    }
}
