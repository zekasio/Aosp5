package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A04' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7I {
    public static byte[] A01;
    public static String[] A02 = {"fU4XiUh", "4ASLCGhodwv3fY7yqE", "BFhkWaiQLcBXUQO4Yi7KFwSjCE1nMNEL", "IBfibZ8IWoONy44J9jH8jZ0p3ibNlB3T", "FmTm3wR2K52Lz7zbwKhVmki4cB", "JxTEYV1Vluo7DhPyeTARHiExSqxbiuYf", "t7Mb3YBBhyhswQ5hXIhgNczDQ93Q9bzO", "oX4F1jUgCDnefIZx9v8TRjWfCJBhCFOT"};
    public static final /* synthetic */ C7I[] A03;
    public static final C7I A04;
    public static final C7I A05;
    public static final C7I A06;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].length() == 29) {
                throw new RuntimeException();
            }
            A02[1] = "";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{61, 52, 69, 81, 74, 67, 47, 51, 49, 42, 35, 79, 80, 87, 84, 36, 63, 54, 70, Ascii.EM, 2, Ascii.VT, 120, 127, 124};
    }

    static {
        A01();
        A06 = new C7I(A00(19, 6, 91), 0, A00(8, 7, 115));
        A05 = new C7I(A00(15, 4, 102), 1, A00(3, 5, 19));
        String strA00 = A00(0, 3, 97);
        A04 = new C7I(strA00, 2, strA00);
        A03 = new C7I[]{A06, A05, A04};
    }

    public C7I(String str, int i, String str2) {
        this.A00 = str2;
    }

    public final String A02() {
        return this.A00;
    }

    public static C7I valueOf(String str) {
        return (C7I) Enum.valueOf(C7I.class, str);
    }

    public static C7I[] values() {
        return (C7I[]) A03.clone();
    }
}
