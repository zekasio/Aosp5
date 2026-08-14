package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9N {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-56, -7, -10, -56, -52, -8, -57, -58, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, Ascii.DLE, 5, -3, 8, 5, Ascii.SYN, 1, -60, -59, -68, 10, Ascii.VT, Ascii.DLE, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0615Ky A00() {
        return new C0931Xi();
    }

    public static LE A01(C0946Xx c0946Xx) {
        return new C0930Xh(c0946Xx);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        MM.A01.execute(new C0932Xj(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C0946Xx c0946Xx) {
        if (JT.A0P(c0946Xx) && !A05.getAndSet(true)) {
            try {
                C03208p reportHandler = new C03208p(Thread.getDefaultUncaughtExceptionHandler(), c0946Xx, new C0928Xf());
                Thread.setDefaultUncaughtExceptionHandler(reportHandler);
            } catch (Exception e) {
                c0946Xx.A06().A8y(A02(181, 7, 62), C03298z.A1X, new AnonymousClass90(e));
            }
        }
    }

    public static void A07(C0946Xx c0946Xx) {
        A0G(c0946Xx, null, null, 3);
    }

    public static void A08(C0946Xx c0946Xx) {
        A0G(c0946Xx, null, null, 3);
    }

    public static void A09(C0946Xx c0946Xx) {
        if (JR.A1b(c0946Xx)) {
            A0E(c0946Xx, 0);
        }
        if (JR.A1i(c0946Xx)) {
            A0B(c0946Xx);
        }
    }

    public static void A0A(C0946Xx c0946Xx) {
        if (JR.A1c(c0946Xx)) {
            A0F(c0946Xx, null, 3);
        }
    }

    public static void A0B(C0946Xx c0946Xx) {
        MX.A06.execute(new C0933Xk(c0946Xx));
    }

    public static void A0C(C0946Xx c0946Xx) {
        C03238t.A0C(c0946Xx, new C0927Xe(c0946Xx), new C0937Xo(), BuildConfigApi.isDebug());
        c0946Xx.A08();
        AnonymousClass68.A04(c0946Xx, null);
    }

    public static void A0E(C0946Xx c0946Xx, int i) {
        C8T.A01(c0946Xx);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            KV.A02();
        }
        A06(c0946Xx);
        LB.A00(JR.A0k(c0946Xx), BuildConfigApi.isDebug(), A00(), A01(c0946Xx));
        AnonymousClass61.A03(JR.A02(c0946Xx));
        RK.A09(new C0929Xg(c0946Xx));
        if (i == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c0946Xx.A06().A9I(A02(178, 3, 33), C03298z.A0R, new AnonymousClass90(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c0946Xx, AudienceNetworkActivity.class);
        MX.A05(c0946Xx);
        C0586Js.A05(c0946Xx);
        C01320u.A01(c0946Xx);
        if (JR.A0u(c0946Xx)) {
            C02374y.A00(c0946Xx);
        }
        if (JR.A1I(c0946Xx)) {
            XW.A02().A7N(c0946Xx);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C0946Xx c0946Xx, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C8T.A01(c0946Xx);
        boolean z = false;
        synchronized (C9N.class) {
            if (!A00) {
                if (i != 1 && i != 2) {
                    if (i == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0E(c0946Xx, i);
            MX.A08.execute(new C0934Xl(c0946Xx, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String strA02 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C9M(true, strA02));
            } else {
                Log.w(A02(8, 17, 60), strA02);
            }
        }
    }

    public static void A0G(C0946Xx c0946Xx, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        KV.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        RK.A06();
        A0F(c0946Xx, initListener, i);
    }

    public static synchronized boolean A0H() {
        return A00;
    }
}
