package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0633Ls {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, Ascii.SI, 75, 74, 91, 74, 93, 66, 70, 65, 74, Ascii.SI, 70, 73, Ascii.SI, 78, 95, 95, Ascii.SI, 70, 92, Ascii.SI, 122, 65, 70, 91, 86, 1, Ascii.CAN, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, Ascii.DC2, 9, Ascii.SO, 19, Ascii.RS, 84, 3, 73, Ascii.ETB, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 73, 50, 9, Ascii.SO, 19, Ascii.RS, 55, Ascii.VT, 6, Ascii.RS, 2, Ascii.NAK, 38, 4, 19, Ascii.SO, 17, Ascii.SO, 19, Ascii.RS};
    }

    static {
        A01();
        A01 = C0633Ls.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(C8U c8u) {
        boolean z = false;
        try {
            PackageManager packageManager = c8u.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean z2 = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c8u.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!A00(78, 38, 62).equals(activityInfoArr[i].name)) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z && !A03()) {
                z2 = false;
            }
            boolean isUnity = c8u.A03().A8P();
            if (isUnity) {
                String str = A00(32, 14, 8) + z2;
            }
            return z2;
        } catch (Throwable th) {
            if (c8u.A03().A8P()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
