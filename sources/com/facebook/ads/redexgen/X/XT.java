package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XT implements C9T {

    @Nullable
    public static PackageInfo A03;
    public static EnumC0629Lm A04;

    @Nullable
    public static String A05;
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0T[] A09;
    public static final AtomicBoolean A0A;
    public static final AtomicInteger A0B;
    public final AnonymousClass66 A00;
    public final C8U A01;
    public final AnonymousClass99 A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A08() {
        A07 = new byte[]{40, Ascii.CR, Ascii.NAK, Ascii.ETB, Ascii.ETB, 17, 7, 7, Ascii.GS, Ascii.SYN, Ascii.GS, Ascii.CAN, Ascii.GS, 0, Ascii.CR, Ascii.VT, 17, Ascii.SUB, Ascii.NAK, Ascii.SYN, Ascii.CAN, 17, Ascii.DLE, 41, 46, 56, 45, 42, 60, 87, 98, 109, 98, 111, 108, 100, 85, 68, 68, 75, 89, 93, 90, 75, 71, 80, 95, 75, 66, 81, 70, 71, 93, 91, 90, 78, 92, 71, 78, 92, 44, 62, 36, 41, 86, 67, 67, 69, 94, 85, 66, 67, 94, 88, 89, 72, 94, 83, 106, 97, 108, 108, 109, 122, 119, 124, 103, 99, 109, 102, 119, 109, 112, 124, 122, 105, 123, 62, 41, 50, 56, 48, 57, 79, 77, 92, 92, 73, 72, 83, 69, 72, 95, Ascii.NAK, Ascii.ETB, 4, 4, Ascii.US, 19, 4, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 91, 87, 77, 86, 76, 74, 65, 111, 106, 127, 106, 116, 123, 121, 100, 104, 110, 120, 120, 98, 101, 108, 116, 100, 123, 127, 98, 100, 101, 120, 116, 120, 127, 106, 127, 110, Ascii.FS, Ascii.GS, Ascii.SYN, Ascii.VT, 17, Ascii.FF, 1, Ascii.CR, Ascii.RS, 5, 5, Ascii.SO, 7, Ascii.DC4, 8, 4, Ascii.EM, Ascii.SO, Ascii.DC4, Ascii.SO, Ascii.GS, Ascii.SO, 5, Ascii.US, Ascii.CAN, 48, 35, 56, 56, 51, 58, 41, 58, 57, 49, 49, 51, 50, Ascii.RS, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, 42, 120, 44, 55, 51, 61, 54, 95, 86, 68, 72, 82, 79, 88, 71, 91, 86, 78, 82, 69, 52, 57, 59, 60, 48, 61, 38, 58, 56, 58, 49, 60, 38, 45, 42, 38, 52, 42, 37, 40, 51, 63, 35, 57, 62, 47, 41, 47, 40, 53, 50, 39, 42, 42, 35, 52, 75, 72, 68, 70, 75, 66, 109, 97, 107, 101, 5, Ascii.CR, Ascii.FF, 1, 9, Ascii.FS, 1, 7, 6, Ascii.ETB, Ascii.ESC, Ascii.CR, Ascii.SUB, Ascii.RS, 1, Ascii.VT, Ascii.CR, 72, 67, 82, 81, 73, 84, 77, 89, 82, 95, 86, 67, 64, 76, 90, 67, 90, 92, 80, 90, 92, 74, 93, 80, 70, 75, Ascii.SI, Ascii.DC2, Ascii.DC2, 9, Ascii.CAN, Ascii.EM, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 123, 124, 97, 102, 115, 126, 126, 119, 118, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 100, 119, 96, 97, 123, 125, 124, 63, 47, 62, 41, 41, 34, 51, 36, 41, 37, 43, 36, 56, 127, 111, 126, 105, 105, 98, 115, 123, 101, 104, 120, 100, 53, 34, 45, 57, 37, 39, 54, 39, 36, 47, 42, 47, 50, 63, Ascii.FS, 10, Ascii.FS, Ascii.FS, 6, 0, 1, Ascii.DLE, Ascii.ESC, 6, 2, 10, 70, 93, 90, 71, 74, 34, 36, 50, 37, 40, 54, 48, 50, 57, 35, 66, 85, 88, 68, 85, 70, 85, 89, 71, 127, 125, 118, 125, 106, 113, 123, 53, 46, 55, 55};
    }

    static {
        A08();
        A0A = new AtomicBoolean();
        A0B = new AtomicInteger(0);
        A05 = null;
        A06 = false;
        A09 = new C0T[]{C0T.A10, C0T.A0e, C0T.A11, C0T.A19, C0T.A0v, C0T.A0x, C0T.A1v, C0T.A1w, C0T.A1x};
    }

    public XT(C8U c8u, boolean z, AnonymousClass66 anonymousClass66) {
        this.A01 = c8u;
        this.A02 = new AnonymousClass99(c8u);
        this.A00 = anonymousClass66;
        A09(c8u, z);
    }

    @Nullable
    public static synchronized PackageInfo A00(C8U c8u) {
        if (!A06) {
            A03 = M0.A00(c8u);
            A06 = true;
        }
        return A03;
    }

    public static synchronized EnumC0629Lm A01(C8U c8u) {
        if (A04 == null) {
            A04 = C0630Ln.A00(c8u.A03().A8P());
        }
        return A04;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8U c8u, String str) {
        try {
            PackageManager packageManager = c8u.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C0635Lu.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A0A.compareAndSet(false, true)) {
                c8u.A06().A8y(A03(488, 7, 81), C03298z.A1P, new AnonymousClass90(e));
            }
            return null;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A09(final C8U c8u, boolean z) {
        if (!A0B.compareAndSet(0, 1)) {
            return;
        }
        A01(c8u);
        try {
            final SharedPreferences sharedPreferencesA00 = C0610Kt.A00(c8u);
            final AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
            final String str = A03(26, 4, 37) + anonymousClass99.A06();
            A05 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.9V
                public static byte[] A04;
                public static String[] A05 = {"XdxsWQHKmAYrPa6mv803llFsbG6xUBv1", "0ZMGl2pSIAaZIEqvxPmnMQII5PMyDfzp", "xK6bN8ERsE3qlK", "WJOztIfqKvqLg1zb8DcclROO5I1m6hYl", "NZ35AS4Ok4U2uFg9Bn0RAVLmEZFAhNaA", "i6NGDYiwjEbiTB59W8H8ewYatIcL2Rm5", "tt3j", "3tQ5yRyF2hXRO3n7qZm1zDaXW"};

                public static String A01(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    int i4 = 0;
                    while (true) {
                        int length = bArrCopyOfRange.length;
                        if (A05[2].length() != 14) {
                            throw new RuntimeException();
                        }
                        A05[0] = "ijq86j9eF5Bfako4vk0V9m1lrfYXSgO1";
                        if (i4 >= length) {
                            return new String(bArrCopyOfRange);
                        }
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
                        i4++;
                    }
                }

                public static void A02() {
                    A04 = new byte[]{124, 125, 115, 110, 125, 109, 106, 102, 100, 39, 104, 103, 109, 123, 102, 96, 109, 39, 127, 108, 103, 109, 96, 103, 110, 120, 104, 122, 107, 114, 78, 94, 65, 74, 78, 111, 109, 102, 109, 122, 97, 107};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        Method dump skipped, instruction units count: 203
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9V.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A0B.set(0);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:37:0x0345 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ba  */
    @Override // com.facebook.ads.redexgen.X.C9T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> A6W() {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XT.A6W():java.util.Map");
    }

    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Y() {
        return A7Z(C9S.A00());
    }

    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Z(C9R c9r) {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> mapA6W = A6W();
                if (TextUtils.isEmpty(C02575s.A00().A03())) {
                    C02575s.A07(this.A01);
                }
                mapA6W.put(A03(280, 4, 52), C02575s.A00().A03());
                mapA6W.put(A03(469, 10, 62), C9Y.A06(this.A02, this.A01, false));
                if (JR.A1K(this.A01)) {
                    mapA6W.put(A03(103, 10, 69), C01320u.A01(this.A01).A0K());
                }
                Iterator<Map.Entry<String, String>> it = mapA6W.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c9r.A2N(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA6W).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A03(0, 1, 107), A03(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (Throwable th) {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(A03(241, 26, 17), e);
        }
    }
}
