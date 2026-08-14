package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8h, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C8h {
    public static byte[] A01;
    public static String[] A02 = {"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    public final C03118d A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, -39, -41, -86, -44, Ascii.VT, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, ByteCompanionObject.MIN_VALUE, -109, -124, 95, -109, ByteCompanionObject.MIN_VALUE, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public abstract String A06();

    public abstract C8b[] A0A();

    static {
        A04();
    }

    public C8h(C03118d c03118d) {
        this.A00 = c03118d;
    }

    private String A00() {
        C8b[] c8bArrA0A = A0A();
        if (c8bArrA0A.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String strA01 = A01(0, 0, 31);
        for (int i = 0; i < c8bArrA0A.length - 1; i++) {
            strA01 = strA01 + c8bArrA0A[i].A02() + A01(20, 2, 35);
        }
        return strA01 + c8bArrA0A[c8bArrA0A.length - 1].A02();
    }

    public static String A02(String str, C8b[] c8bArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 106));
        for (int i = 0; i < c8bArr.length - 1; i++) {
            sb.append(c8bArr[i].A01);
            if (A02[2].length() != 3) {
                throw new RuntimeException();
            }
            A02[4] = "CXWyM2Ol";
            sb.append(A01(20, 2, 35));
        }
        sb.append(c8bArr[c8bArr.length - 1].A01);
        sb.append(A01(6, 6, 79));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C8b[] c8bArr, C8b c8b) {
        return A02(str, c8bArr) + A01(12, 7, 121) + c8b.A01 + A01(2, 4, 32);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 4) + A06() + A01(0, 2, 30) + A00() + A01(19, 1, 48));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 34) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
