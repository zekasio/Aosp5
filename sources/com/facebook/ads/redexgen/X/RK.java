package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RK {

    @Nullable
    public static R0 A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 121, 104, Ascii.ETB, 81, 81, Ascii.RS, 99, Ascii.SYN, 103, 127, 85, 116, Ascii.DC4, 73, 126, 19, 74, 72, 66, 77, Ascii.DC4, 78, 81, 86, Ascii.DC4, 115, 73, 85, 77, Ascii.ESC, 44, 9, 86, 113, 76, 80, 116, 73, 92, 87, 72, 84, 17, 109, 87, 92, 126, 82, 76, 72, 8, 83, 108, 82, Ascii.NAK, 67, 104, 73, 7, 48, Ascii.SO, 124, 116, Ascii.GS, 56, 9, 120, 53, 0, Ascii.SI, 40, 32, 37, 120, 62, 60, 56, 53, 61, Ascii.CR, 9, 47, 54, Ascii.DC4, 3, 41, Ascii.CR, 113, 70, 1, 42, 59, 56, 32, 61, 36, 38, 33, 40, 111, 45, 42, 41, 32, 61, 42, 111, 38, 33, 38, 59, 110, 125, 127, 125, 108, 19, 68, 75, 127, 71, 65, 110, 67, Ascii.SO, 81, 68, 112, 119, 65, 75, 92, 112, 109, Ascii.DLE, 76, 85, 66, 104, Ascii.CAN, 47, 72, 64, 91, 89, 69, 72, 71, 76, 118, 68, 70, 77, 76, 118, 70, 71, 57, 50, 35, 32, 56, 37, 60, Ascii.GS, 6, 51, 91, 46, 59, 7, 59, 3, 42, 80, 57, 92, 63, 63, 60, Ascii.CR, 42, Ascii.EM, 38, Ascii.ESC, 47, 33, 81, 5, Ascii.SI, 56, 84, 99};
    }

    static {
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(3, 29, 30));
        A04.add(A05(165, 29, 81));
        A04.add(A05(32, 29, 2));
        A04.add(A05(61, 29, 116));
        A04.add(A05(113, 29, 29));
        A05 = new AtomicBoolean();
    }

    public static R2 A00(C8U c8u) {
        return A03(true, c8u);
    }

    public static R2 A01(C8U c8u) {
        return A02(true, c8u);
    }

    public static R2 A02(boolean z, C8U c8u) {
        R6 r6 = new R6();
        R9 r9A04 = A04(c8u);
        if (!A0B(c8u)) {
            r6.A02(A04);
            r6.A01(A03);
        }
        if (C0619Lc.A04()) {
            Map<String, String> mapA02 = C0619Lc.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            r9A04.A08(mapA02);
        }
        return R4.A00().A01(r6.A00(r9A04.A09()).A03(z).A04(c8u.A03().A8P()).A05(), c8u.A06(), MX.A01());
    }

    public static R2 A03(boolean z, C8U c8u) {
        return R4.A00().A01(new R6().A03(z).A00(A04(c8u).A09()).A04(c8u.A03().A8P()).A05(), c8u.A06(), MX.A01());
    }

    public static R9 A04(C8U c8u) {
        A08(c8u);
        R9 r9 = new R9();
        if (A0B(c8u)) {
            r9.A02(360000).A04(120000);
        } else {
            r9.A02(JR.A07(c8u)).A04(JR.A09(c8u));
        }
        r9.A03(JR.A08(c8u)).A05(JR.A0A(c8u)).A06(JR.A0B(c8u));
        synchronized (RK.class) {
            if (A00 != null && (A00 instanceof R0)) {
                r9.A07(A00);
            }
        }
        return r9;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C8U c8u) {
        if (!A05.get()) {
            c8u.A06().A8y(A05(158, 7, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), C03298z.A20, new AnonymousClass90(A05(90, 23, 119)));
        }
    }

    public static synchronized void A09(R0 r0) {
        A00 = r0;
    }

    public static boolean A0A(C8U c8u) {
        int i = Build.VERSION.SDK_INT;
        String strA05 = A05(142, 16, 17);
        if (i < 17) {
            return Settings.System.getInt(c8u.getContentResolver(), strA05, 0) != 0;
        }
        int i2 = Settings.Global.getInt(c8u.getContentResolver(), strA05, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i2 != 0;
    }

    public static boolean A0B(C8U c8u) {
        String urlPrefix = c8u.A03().A7l();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(A05(0, 3, 50));
    }
}
