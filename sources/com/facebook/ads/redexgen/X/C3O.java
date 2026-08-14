package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3O {
    public static byte[] A00;
    public static final C3N A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{115, 114, 82, 121, 111, 104, 121, 120, 76, 110, 121, 79, 127, 110, 115, 112, 112, 6, 7, 39, Ascii.FF, Ascii.SUB, Ascii.GS, Ascii.FF, Ascii.CR, 58, 10, Ascii.ESC, 6, 5, 5, 119, 118, 86, 125, 107, 108, 125, 124, 75, 123, 106, 119, 116, 116, 89, 123, 123, 125, 104, 108, 125, 124, 126, 127, 66, 101, 126, 97, 95, 116, 98, 101, 116, 117, 66, 114, 99, 126, 125, 125};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A01 = new FH();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C1144cK();
        } else {
            A01 = new C3N();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof cP) {
            throw new NullPointerException(A00(53, 18, 81));
        }
        if (i == 0) {
            A01.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof cP) {
            throw new NullPointerException(A00(17, 14, 41));
        }
        if (i5 == 0) {
            A01.A04(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof cP) {
            throw new NullPointerException(A00(0, 17, 92));
        }
        if (i3 == 0) {
            A01.A05(viewParent, view, i, i2, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cP) {
            throw new NullPointerException(A00(31, 22, 88));
        }
        if (i2 == 0) {
            A01.A06(viewParent, view, view2, i);
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f, float f2) {
        return A01.A07(viewParent, view, f, f2);
    }

    public static boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return A01.A08(viewParent, view, f, f2, z);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cP) {
            return ((cP) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            return A01.A09(viewParent, view, view2, i);
        }
        return false;
    }
}
