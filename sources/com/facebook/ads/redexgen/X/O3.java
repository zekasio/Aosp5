package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.drive.DriveFile;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O3 extends WebViewClient {
    public static byte[] A04;
    public WeakReference<O1> A00 = new WeakReference<>(null);
    public final WeakReference<C0947Xy> A01;
    public final WeakReference<O0> A02;
    public final WeakReference<C0690Nx> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, Ascii.SI, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, Ascii.ESC, Ascii.ETB, 41, 9, Ascii.SYN, Ascii.FF, Ascii.SUB, Ascii.ETB, 17, Ascii.FF, -42, 17, Ascii.SYN, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.FS, -42, Ascii.VT, 9, Ascii.FS, Ascii.CR, Ascii.SI, Ascii.ETB, Ascii.SUB, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, Ascii.ETB, Ascii.DC4, Ascii.FS, Ascii.CAN, 10, Ascii.ETB, 4, Ascii.VT, 6, 17, 17, 7, 6, 8, Ascii.DLE, 4, Ascii.SUB, Ascii.ETB, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public O3(WeakReference<C0947Xy> weakReference, WeakReference<O0> weakReference2, WeakReference<C0690Nx> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C0947Xy c0947Xy) {
        c0947Xy.A06().A8y(A00(11, 11, 101), C03298z.A09, new AnonymousClass90(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 6) + str));
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 10);
        C0947Xy c0947Xy = this.A01.get();
        if (c0947Xy == null) {
            return false;
        }
        if (TE.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) {
            return true;
        }
        try {
            Uri uriA00 = C0617La.A00(str);
            String scheme = uriA00.getScheme();
            try {
                boolean zA0t = JR.A0t(c0947Xy);
                String strA002 = A00(48, 33, 71);
                String strA003 = A00(22, 26, 113);
                String strA004 = A00(105, 6, 103);
                if (zA0t) {
                    if (!TE.A0D.contains(scheme)) {
                        String scheme2 = A00(101, 4, 5);
                        if (!scheme2.equals(scheme)) {
                            if (strA004.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA003, uriA00);
                            }
                            intent.addCategory(strA002);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(DriveFile.MODE_READ_ONLY);
                            }
                            try {
                                boolean canOpen = LN.A0B(c0947Xy, intent);
                                if (!canOpen) {
                                    A02(str, c0947Xy);
                                }
                                return true;
                            } catch (LL unused) {
                                boolean canOpen2 = strA004.equals(scheme);
                                if (canOpen2) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!LN.A0B(c0947Xy, new Intent(strA003, C0617La.A00(stringExtra)))) {
                                            A02(str, c0947Xy);
                                        }
                                        return true;
                                    }
                                }
                                AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 5, 6) + str);
                                anonymousClass90.A03(1);
                                c0947Xy.A06().A8z(A00(11, 11, 101), C03298z.A06, anonymousClass90);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (TE.A0A && strA004.equalsIgnoreCase(scheme)) {
                    Intent uri = Intent.parseUri(str, 1);
                    uri.addCategory(strA002);
                    uri.setComponent(null);
                    uri.setSelector(null);
                    if (c0947Xy.getPackageManager().resolveActivity(uri, 65536) != null && LN.A0B(c0947Xy, uri)) {
                        webView.goBack();
                        return true;
                    }
                } else if ((TE.A0A && C0636Lv.A04(str)) || !TE.A0D.contains(scheme)) {
                    return LN.A0B(c0947Xy, new Intent(strA003, uriA00));
                }
            } catch (Exception e) {
                c0947Xy.A06().A8z(strA00, C03298z.A2a, new AnonymousClass90(e));
                c0947Xy.A0D().A8E(e.toString());
            }
            return false;
        } catch (SecurityException e2) {
            c0947Xy.A06().A8z(strA00, C03298z.A2a, new AnonymousClass90(e2));
            return true;
        }
    }

    public final void A04(WeakReference<O1> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0690Nx c0690Nx = this.A03.get();
        if (c0690Nx != null) {
            c0690Nx.A03();
        }
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.ABg(str);
        }
        O1 o1 = this.A00.get();
        if (o1 != null) {
            o1.AAA(webView.canGoBack());
            o1.AAp(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.ABi(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C0947Xy c0947Xy = this.A01.get();
        if (c0947Xy != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            sb.append(strA00);
            sb.append(str);
            c0947Xy.A0D().A8B(C0636Lv.A01(i, sb.toString(), strA00 + str2));
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C0947Xy c0947Xy = this.A01.get();
        if (c0947Xy != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            sb.append(strA00);
            sb.append((Object) webResourceError.getDescription());
            c0947Xy.A0D().A8B(C0636Lv.A01(errorCode, sb.toString(), strA00 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C0947Xy c0947Xy = this.A01.get();
        if (c0947Xy != null) {
            c0947Xy.A0D().A8C();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C0947Xy c0947Xy = this.A01.get();
        if (c0947Xy != null) {
            c0947Xy.A0D().A8D();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C03298z.A2b);
        O0 o0 = this.A02.get();
        if (o0 != null) {
            o0.AC6();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
