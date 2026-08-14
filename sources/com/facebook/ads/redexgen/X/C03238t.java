package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03238t {

    @VisibleForTesting
    public static SparseIntArray A00;

    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C03248u> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<C8r> A0A;
    public static final AtomicReference<InterfaceC03228s> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, Ascii.CAN, 3, 5, Ascii.DLE, Ascii.DC4, 9, Ascii.SI, Ascii.SO, -64, 19, 8, Ascii.SI, Ascii.NAK, Ascii.FF, 4, -64, Ascii.SO, Ascii.SI, Ascii.DC4, -64, 8, 1, Ascii.DLE, Ascii.DLE, 5, Ascii.SO, -64, 8, 5, Ascii.DC2, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, Ascii.DLE, 2, -69, -32, 17, 0, 9, Ascii.SI, -69, Ascii.DC2, 4, Ascii.SI, 3, -69, Ascii.SO, Ascii.DLE, -3, Ascii.SI, Ascii.DC4, Ascii.VT, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, Ascii.CR, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C8U c8u) {
        if ((A01(457, 7, 71).equals(str) && C03298z.A1z == i) || A01(HttpStatus.SC_UNPROCESSABLE_ENTITY, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return JT.A05(c8u);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C03248u> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        return list;
    }

    public static void A05(C8U c8u, int i, int i2) {
        c8u.A06().A8y(A01(427, 10, 60), C03298z.A2W, new AnonymousClass90(A01(338, 33, 80) + i, A01(87, 9, 13) + i2));
    }

    @Deprecated
    public static void A06(@Nullable C8U c8u, String str, int i, AnonymousClass90 anonymousClass90) {
        if (c8u == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C8T.A01(c8u.A00());
        if (A02 && anonymousClass90.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i, anonymousClass90));
        }
        try {
            if (A0I(c8u, str, i, Math.random(), anonymousClass90)) {
                A09(c8u, str, i, anonymousClass90);
            }
        } catch (Throwable th) {
            A0F(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A07(C8U c8u, String str, int i, AnonymousClass90 anonymousClass90) {
        try {
            anonymousClass90.A03(2);
            anonymousClass90.A08(false);
            anonymousClass90.A04(1);
            if (JT.A0Q(c8u)) {
                anonymousClass90.A06(true);
            } else {
                anonymousClass90.A06(false);
            }
            A06(c8u, str, i, anonymousClass90);
        } catch (Throwable th) {
            A0F(th);
        }
    }

    @Deprecated
    public static void A08(C8U c8u, String str, int i, AnonymousClass90 anonymousClass90) {
        try {
            anonymousClass90.A03(2);
            anonymousClass90.A06(false);
            A06(c8u, str, i, anonymousClass90);
        } catch (Throwable th) {
            A0F(th);
        }
    }

    public static void A09(C8U c8u, String str, int i, AnonymousClass90 anonymousClass90) {
        synchronized (C03238t.class) {
            if (!A03) {
                int iA01 = JT.A01(c8u);
                if (A09.getAndIncrement() < iA01 - 1) {
                    A07.add(new C03248u(str, i, anonymousClass90));
                } else if (A09.get() == iA01) {
                    A07.add(new C03248u(A01(427, 10, 60), C03298z.A2T, new AnonymousClass90(A01(140, 42, 0) + str + A01(47, 1, 19) + i)));
                }
            } else {
                A0A(c8u, str, i, anonymousClass90, true);
            }
        }
    }

    public static void A0A(C8U c8u, String str, int i, AnonymousClass90 anonymousClass90, boolean z) throws Throwable {
        InterfaceC03228s interfaceC03228s = A0B.get();
        boolean z2 = interfaceC03228s != null && interfaceC03228s.A8e();
        if (A08.get() || z2) {
            int iA00 = anonymousClass90.A00();
            String strA01 = A01(289, 17, 46);
            String strA012 = A01(31, 16, 8);
            if (iA00 == 0) {
                Log.e(strA01, A01(182, 37, 40) + str + strA012 + i, anonymousClass90);
            } else {
                Log.i(strA01, A01(306, 32, 116) + str + strA012 + i + A01(19, 12, 63) + anonymousClass90.getMessage() + A01(0, 19, 80) + anonymousClass90.A02());
            }
        }
        C0938Xp c0938Xp = new C0938Xp(c8u, str, i, anonymousClass90, interfaceC03228s);
        if (z) {
            A01.execute(c0938Xp);
        } else {
            c0938Xp.run();
        }
    }

    public static void A0C(C0946Xx c0946Xx, InterfaceC03228s interfaceC03228s, C8r c8r, boolean z) {
        A0A.set(c8r);
        A0B.set(interfaceC03228s);
        A08.set(z);
        synchronized (C03238t.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C0939Xq(c0946Xx));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8q
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C8U c8u) {
        Boolean bool = A0C.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return JT.A0A(c8u) != 0;
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C8U c8u, String str, int i, double d, AnonymousClass90 anonymousClass90) {
        double logProbability;
        int iA0E;
        try {
            int iA04 = JT.A04(c8u);
            if (iA04 < 1) {
                return false;
            }
            HashMap<String, Integer> mapA0M = JT.A0M(c8u);
            Set<String> setKeySet = mapA0M.keySet();
            String str2 = str + A01(47, 1, 19) + i;
            boolean zContains = setKeySet.contains(str2);
            if (zContains) {
                Integer num = mapA0M.get(str2);
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue == 0) {
                    return false;
                }
                if (iIntValue > 0) {
                    return d <= 1.0d / ((double) iIntValue);
                }
                int iA03 = JT.A03(c8u);
                if (iA03 < 1) {
                    return false;
                }
                logProbability = ((double) (iA04 * iA03)) / 10000.0d;
            } else if (!anonymousClass90.A09()) {
                logProbability = 0.0d;
            } else {
                double logProbability2 = iA04;
                logProbability = logProbability2 / 100.0d;
            }
            double dA00 = c8u.A07().A00();
            if (A01(HttpStatus.SC_UNPROCESSABLE_ENTITY, 5, 56).equals(str)) {
                if (c8u.A03().A8P()) {
                    return true;
                }
                int iA06 = JT.A06(c8u);
                if (iA06 == 0) {
                    return false;
                }
                if (iA06 > 0) {
                    double d2 = 1.0d / ((double) iA06);
                    return zContains ? dA00 <= d2 * logProbability : dA00 <= d2;
                }
            }
            if (A01(457, 7, 71).equals(str) && C03298z.A1z == i) {
                if (!A08.get()) {
                    iA0E = JT.A0E(c8u);
                } else {
                    iA0E = 1;
                }
                if (iA0E == 0) {
                    return false;
                }
                if (iA0E > 0) {
                    double d3 = 1.0d / ((double) iA0E);
                    if (zContains) {
                        return dA00 <= d3 * logProbability;
                    }
                    String[] strArr = A05;
                    if (strArr[4].length() == strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[4] = "UCVKOFALDBGOqUDhQrKLO3Bmgt3EZK";
                    strArr2[0] = "0av5HRm0swjvR429TUKJ";
                    return dA00 <= d3;
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                if (JT.A0S(c8u) && anonymousClass90.A0A()) {
                    return !zContains || d >= 1.0d - logProbability;
                }
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int iA0A = JT.A0A(c8u);
                if (iA0A == 0) {
                    A0C.set(false);
                    return false;
                }
                if (iA0A > 0) {
                    double d4 = 1.0d / ((double) iA0A);
                    return zContains ? dA00 <= d4 * logProbability : dA00 <= d4;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (c8u.A03().A8P()) {
                    return true;
                }
                int iA0B = JT.A0B(c8u);
                if (iA0B == 0) {
                    return false;
                }
                if (iA0B > 0) {
                    double d5 = 1.0d / ((double) iA0B);
                    return zContains ? dA00 <= d5 * logProbability : dA00 <= d5;
                }
            }
            return d >= 1.0d - logProbability;
        } catch (Throwable th) {
            A0F(th);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C8U c8u, String str, int eventsLimit, AnonymousClass90 anonymousClass90) {
        if (!JT.A0P(c8u)) {
            return true;
        }
        int i = A00.get(eventsLimit);
        int iA00 = JT.A00(c8u);
        if (anonymousClass90.A01() != -1) {
            iA00 = anonymousClass90.A01();
        } else {
            int iA002 = A00(str, eventsLimit, c8u);
            if (iA00 < iA002) {
                iA00 = iA002;
            }
        }
        if (i >= iA00) {
            if (A06.contains(Integer.valueOf(i))) {
                boolean zA0B = anonymousClass90.A0B();
                if (A05[3].charAt(3) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "DtDXz8TrFQQZw1pkgy";
                strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                if (zA0B) {
                    A05(c8u, eventsLimit, i);
                }
            }
            A00.put(eventsLimit, i + 1);
            return true;
        }
        A00.put(eventsLimit, i + 1);
        return false;
    }
}
