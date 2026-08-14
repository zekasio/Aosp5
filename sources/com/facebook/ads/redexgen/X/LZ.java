package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.drive.DriveFile;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LZ {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-47, -17, -4, -75, 2, -82, 1, 2, -17, 0, 2, -82, -49, 3, -14, -9, -13, -4, -15, -13, -36, -13, 2, 5, -3, 0, -7, -49, -15, 2, -9, 4, -9, 2, 7, -68, -82, -37, -17, -7, -13, -82, 1, 3, 0, -13, -82, 2, -10, -17, 2, -82, -9, 2, -75, 1, -82, -9, -4, -82, 7, -3, 3, 0, -82, -49, -4, -14, 0, -3, -9, -14, -37, -17, -4, -9, -12, -13, 1, 2, -68, 6, -5, -6, -82, -12, -9, -6, -13, -68, -15, -19, -20, 32, Ascii.SI, Ascii.DC4, Ascii.DLE, Ascii.EM, Ascii.SO, Ascii.DLE, -7, Ascii.DLE, Ascii.US, 34, Ascii.SUB, Ascii.GS, Ascii.SYN, -26, -13, -28, -26, -24, -7, -18, -5, -18, -7, -2, Ascii.CAN, 37, Ascii.ESC, 41, 38, 32, Ascii.ESC, -27, 32, 37, 43, Ascii.FS, 37, 43, -27, Ascii.CAN, Ascii.SUB, 43, 32, 38, 37, -27, Ascii.CR, 0, -4, Ascii.SO, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -58, -60, -41, -56, -54, -46, -43, -36, -111, -91, -75, -78, -70, -74, -92, -91, -81, -88, -32, -16, -19, -11, -15, -29, -16, -45, -48, -54, -23, -25, -14, -14, -21, -8, -49, -22, -82, -73, -76, -80, -71, -65, -97, -70, -74, -80, -71, -56, -44, -46, -109, -58, -45, -55, -41, -44, -50, -55, -109, -57, -41, -44, -36, -40, -54, -41, -109, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -60, -50, -55, -47, -35, -37, -100, -49, -36, -46, -32, -35, -41, -46, -100, -28, -45, -36, -46, -41, -36, -43, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -22, -32, -13, -32, -19, -32, -89, -74, -87, -91, -72, -87, -93, -78, -87, -69, -93, -72, -91, -90, -13, -17, -70, -77, -64, -74, -66, -73, -60, -90, -69, -65, -73, -73, -61, -61, -65, -34, -22, -22, -26, -80, -91, -91, -26, -30, -41, -17, -92, -35, -27, -27, -35, -30, -37, -92, -39, -27, -29, -91, -23, -22, -27, -24, -37, -91, -41, -26, -26, -23, -91, -67, -55, -55, -59, -56, -67, -79, -62, -69, -75, -60, -54, -47, -64, -51, -57, -68, -44, 37, 33, Ascii.SYN, 46, -29, Ascii.FS, 36, 36, Ascii.FS, 33, Ascii.SUB, -29, Ascii.CAN, 36, 34, Ascii.FF, -1, -5, Ascii.CR, -22, Ascii.SI, 6, -5};
    }

    static {
        A04();
    }

    public static Intent A00(Uri uri) {
        Intent intent = new Intent(A03(118, 26, 123), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    @VisibleForTesting
    public static Intent A01(C0947Xy c0947Xy, Uri uri) {
        Intent intentA00 = A00(uri);
        intentA00.addCategory(A03(144, 33, 39));
        intentA00.addFlags(DriveFile.MODE_READ_ONLY);
        intentA00.putExtra(A03(HttpStatus.SC_PARTIAL_CONTENT, 34, 41), c0947Xy.getPackageName());
        intentA00.putExtra(A03(278, 14, 8), false);
        if (JR.A1M(c0947Xy)) {
            if (A03(292, 2, 81).equals(uri.getScheme())) {
                intentA00.setPackage(A03(259, 19, 67));
            }
        }
        return intentA00;
    }

    public static Intent A02(C0947Xy c0947Xy, Uri uri) {
        Intent intentA00 = A00(uri);
        intentA00.setPackage(A03(240, 19, 50));
        intentA00.putExtra(A03(187, 8, 74), c0947Xy.getPackageName());
        intentA00.putExtra(A03(354, 7, 31), true);
        return intentA00;
    }

    private void A05(C0947Xy c0947Xy, Uri uri) throws LL {
        LN.A0B(c0947Xy, A01(c0947Xy, uri));
    }

    private final void A06(C0947Xy c0947Xy, Uri uri) throws LX, LL {
        if (A0C(c0947Xy)) {
            if (JR.A1f(c0947Xy) && LN.A0C(c0947Xy, A02(c0947Xy, uri))) {
                return;
            }
            Intent intentA01 = A01(c0947Xy, uri);
            intentA01.setPackage(A03(240, 19, 50));
            LN.A0B(c0947Xy, intentA01);
            return;
        }
        throw new LX();
    }

    private void A07(C0947Xy c0947Xy, Uri uri, String str) {
        AdActivityIntent adActivityIntentA04 = LN.A04(c0947Xy);
        adActivityIntentA04.addFlags(DriveFile.MODE_READ_ONLY);
        adActivityIntentA04.putExtra(A03(376, 8, 90), EnumC0608Kq.A02);
        adActivityIntentA04.putExtra(A03(177, 10, 66), uri.toString());
        adActivityIntentA04.putExtra(A03(195, 11, 15), str);
        adActivityIntentA04.putExtra(A03(294, 11, 22), System.currentTimeMillis());
        try {
            LN.A09(c0947Xy, adActivityIntentA04);
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c0947Xy.A06().A8y(A03(107, 11, 73), C03298z.A0D, new AnonymousClass90(cause2));
            Log.e(A03(90, 17, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), A03(0, 90, 82), cause2);
        }
    }

    private final void A08(C0947Xy c0947Xy, Uri uri, String str) throws LL {
        boolean zA05 = JS.A05(c0947Xy);
        if (A0B(uri) && zA05) {
            A07(c0947Xy, uri, str);
        } else {
            c0947Xy.A0D().A89(zA05);
            A05(c0947Xy, uri);
        }
    }

    public static void A09(LZ lz, C0947Xy c0947Xy, Uri uri, String str) {
        lz.A0D(c0947Xy, uri, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(com.facebook.ads.redexgen.X.LZ r5, com.facebook.ads.redexgen.X.C0947Xy r6, android.net.Uri r7, java.lang.String r8) throws com.facebook.ads.redexgen.X.LL {
        /*
            boolean r0 = A0B(r7)
            if (r0 == 0) goto L31
            java.lang.String r3 = r7.getHost()
            r2 = 361(0x169, float:5.06E-43)
            r1 = 15
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L31
            r4 = 1
        L1b:
            java.lang.String r3 = r7.getScheme()
            r2 = 348(0x15c, float:4.88E-43)
            r1 = 6
            r0 = 20
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L33
            if (r4 == 0) goto L3b
            goto L33
        L31:
            r4 = 0
            goto L1b
        L33:
            r5.A06(r6, r7)     // Catch: com.facebook.ads.redexgen.X.LX -> L37
            goto L3e
        L37:
            r5.A08(r6, r7, r8)
            goto L3e
        L3b:
            r5.A08(r6, r7, r8)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LZ.A0A(com.facebook.ads.redexgen.X.LZ, com.facebook.ads.redexgen.X.Xy, android.net.Uri, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0B(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 24
            if (r1 < r0) goto L38
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r3 = r0.isCleartextTrafficPermitted()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LZ.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LZ.A01
            java.lang.String r1 = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK"
            r0 = 7
            r2[r0] = r1
            if (r3 != 0) goto L38
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L5f
        L38:
            r0 = 1
        L39:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L4e
            r2 = 305(0x131, float:4.27E-43)
            r1 = 4
            r0 = 19
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5d
        L4e:
            r2 = 343(0x157, float:4.8E-43)
            r1 = 5
            r0 = 25
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L5e
        L5d:
            r4 = 1
        L5e:
            return r4
        L5f:
            r0 = 0
            goto L39
        L61:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LZ.A0B(android.net.Uri):boolean");
    }

    private boolean A0C(C0947Xy c0947Xy) {
        for (ResolveInfo appInfo : c0947Xy.getPackageManager().queryIntentActivities(new Intent(A03(118, 26, 123), C0617La.A00(A03(309, 34, 58))), 0)) {
            if (appInfo.activityInfo.applicationInfo.packageName.equals(A03(240, 19, 50))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0D(C0947Xy c0947Xy, Uri uri, String str) {
        return LN.A0E(c0947Xy, uri, str);
    }

    public static boolean A0E(LZ lz, C0947Xy c0947Xy, Uri uri, String str) {
        try {
            A0A(lz, c0947Xy, uri, str);
            return true;
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            c0947Xy.A06().A8y(A03(107, 11, 73), C03298z.A05, new AnonymousClass90(cause2));
            return false;
        }
    }
}
