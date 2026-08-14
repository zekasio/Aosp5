package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1X {
    public static byte[] A01;
    public static final /* synthetic */ C1X[] A02;
    public static final C1X A03;
    public static final C1X A04;
    public static final C1X A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, 1, Ascii.SO, Ascii.FF, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ESC, 3, 1, Ascii.FS, Ascii.VT, 10, Ascii.FF, 3, 1, Ascii.SYN, Ascii.DLE, Ascii.DC2, Ascii.DLE, Ascii.ESC, Ascii.SYN, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        A05 = new C1X(strA01, 0, strA01);
        String strA012 = A01(13, 14, 115);
        A04 = new C1X(strA012, 1, strA012);
        String strA013 = A01(0, 13, 126);
        A03 = new C1X(strA013, 2, strA013);
        A02 = new C1X[]{A05, A04, A03};
    }

    public C1X(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static C1X A00(String str) {
        for (C1X c1x : values()) {
            if (c1x.A00.equalsIgnoreCase(str)) {
                return c1x;
            }
        }
        return A03;
    }

    public static C1X valueOf(String str) {
        return (C1X) Enum.valueOf(C1X.class, str);
    }

    public static C1X[] values() {
        return (C1X[]) A02.clone();
    }
}
