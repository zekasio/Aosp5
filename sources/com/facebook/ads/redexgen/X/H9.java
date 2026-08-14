package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H9 {
    public static byte[] A04;
    public static String[] A05 = {"zFpRfifZkCIQawK1FUSg1K3EtGdV6Nz", "WEmq", "TVYpI9shQgf8MMEfvFWnKjXtFk1mYiaB", "WCXJZ", "VBPbo", "2erUCN4YfMxeKpPmRmxhBeZiE0shrr6A", "I2AaOQprvAMyyOLMUfVLbbt0mFwKyNVO", "ZVSAIqFm1ddnxSH"};
    public static final String[] A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[5].charAt(16) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "hhyK";
            strArr[4] = "wZqiL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 6);
            i4++;
        }
    }

    public static void A03() {
        A04 = new byte[]{36, 114, 0};
    }

    static {
        A03();
        A06 = new String[0];
    }

    public H9(String str, int i, String str2, String[] strArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static H9 A00() {
        String strA02 = A02(0, 0, 1);
        return new H9(strA02, 0, strA02, new String[0]);
    }

    public static H9 A01(String str, int i) {
        String strTrim;
        String[] strArr;
        String name = str.trim();
        if (name.isEmpty()) {
            return null;
        }
        int voiceStartIndex = name.indexOf(A02(0, 1, 2));
        if (voiceStartIndex == -1) {
            strTrim = A02(0, 0, 1);
        } else {
            strTrim = name.substring(voiceStartIndex).trim();
            String[] strArr2 = A05;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A05[5] = "Nr5OesO8C9sIOUHXRuAUw2kYPHmeguzx";
            name = name.substring(0, voiceStartIndex);
        }
        String[] strArrA0l = C0567Iz.A0l(name, A02(1, 2, 40));
        String str2 = strArrA0l[0];
        if (strArrA0l.length > 1) {
            strArr = (String[]) Arrays.copyOfRange(strArrA0l, 1, strArrA0l.length);
        } else {
            strArr = A06;
        }
        return new H9(str2, i, strTrim, strArr);
    }
}
