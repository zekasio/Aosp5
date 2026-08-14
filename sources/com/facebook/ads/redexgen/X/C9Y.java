package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Y {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, Ascii.EM, 8, 5, 9, 2, Ascii.SI, 9, 34, 9, Ascii.CAN, Ascii.ESC, 3, Ascii.RS, 7, 42, 3, Ascii.RS, 45, 2, 8, Ascii.RS, 3, 5, 8, 87, 42, 46, 63, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, Ascii.CAN, Ascii.FS, Ascii.DC2, Ascii.GS, 113, Ascii.RS, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, Ascii.DLE, Ascii.DC4, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, Ascii.DC4, 47, 42, 47, 46, 54, 47, 1, Ascii.CAN, Ascii.DC4, Ascii.SYN, 85, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.RS, Ascii.EM, Ascii.DC4, Ascii.DC4, Ascii.DLE, 85, Ascii.SUB, Ascii.US, 8, 85, Ascii.DC2, Ascii.NAK, Ascii.SI, Ascii.RS, 9, Ascii.NAK, Ascii.SUB, Ascii.ETB, 85, Ascii.SO, Ascii.SUB, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, Ascii.FF, 50, 52, 54, 61, 39, 60, 58, 44, 59, Ascii.SYN, 40, 46, 44, 39, 61, Ascii.SYN, 37, 40, 58, 61, Ascii.SYN, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, Ascii.CAN, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    @TargetApi(17)
    @VisibleForTesting
    public static String A01(C8U c8u) {
        return WebSettings.getDefaultUserAgent(c8u);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(final C8U c8u) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.9X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                String str = (String) C9Y.A04.get();
                if (str != null) {
                    return str;
                }
                WebView webView = new WebView(c8u.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.9W
                    @Override // android.webkit.WebViewClient
                    @RequiresApi(api = 26)
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        O6.A02(C03298z.A2g);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    C9Y.A04.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            MM.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c8u, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C8U c8u, AnonymousClass99 anonymousClass99) {
        String strA07 = anonymousClass99.A07();
        if (TextUtils.isEmpty(strA07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                c8u.A06().A8y(A00(116, 7, 65), C03298z.A1Z, new AnonymousClass90(A00(73, 7, 29)));
            }
        }
        return strA07;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8U c8u, boolean z) {
        if (c8u == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 74));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long jA01 = JQ.A01(c8u);
        String strA00 = A00(143, 23, 90);
        String strA002 = A00(133, 10, 64);
        String strA003 = A00(88, 28, 104);
        if (jA01 > 0) {
            SharedPreferences sharedPreferences = c8u.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA003, c8u), 0);
            String string = sharedPreferences.getString(strA002, null);
            long j = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < jA01) {
                A04.set(string);
                return string;
            }
        }
        String strA01 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                strA01 = A01(c8u);
                A04.set(strA01);
            } catch (Throwable th) {
                A09(c8u, th);
            }
        }
        if (strA01 == null) {
            strA01 = A02(c8u);
        }
        if (strA01 == null) {
            String userAgentString = A00;
            return userAgentString;
        }
        String[] strArr = A02;
        if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        A02[7] = "Kvz6zSF";
        if (jA01 > 0) {
            String userAgentString2 = ProcessUtils.getProcessSpecificName(strA003, c8u);
            SharedPreferences sharedPreferences2 = c8u.getSharedPreferences(userAgentString2, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            String userAgentString3 = A04.get();
            editorEdit.putString(strA002, userAgentString3).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA01;
    }

    public static String A05(AnonymousClass99 anonymousClass99, C8U c8u) {
        if (JQ.A04(c8u)) {
            return A00(63, 5, 117) + A03(c8u, anonymousClass99) + A00(39, 6, 127) + anonymousClass99.A06() + A00(45, 6, 121) + anonymousClass99.A04() + A00(38, 1, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
        }
        return A00(0, 0, 40);
    }

    public static String A06(AnonymousClass99 anonymousClass99, C8U c8u, boolean z) {
        return A04(c8u, z) + A00(0, 38, 127) + c8u.A03().A7m() + A00(57, 6, 54) + AnonymousClass99.A03 + A00(38, 1, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION) + A05(anonymousClass99, c8u) + A00(68, 5, 69) + c8u.A03().A7n() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C8U c8u, Throwable th) {
        c8u.A06().A8y(A00(166, 8, 84), C03298z.A2f, new AnonymousClass90(th));
    }
}
