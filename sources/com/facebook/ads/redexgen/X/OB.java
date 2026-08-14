package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OB extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"dutFbLT0SJ7F8tp2omMpyLiOAYVHs", "eQZAVGISCoayl61p0XGnY6zF77MwgQ", "oGFUl4XXjxY0ysGh9uHTM5Bs0jmGzYfS", "nw1FzUJk4sGWtK2y2h7dLK31U1IoYOTN", "MQohGS04hBsrr", "rz5lEB2hDVgjaI0SM6Y5mQ12Lmz2ba", "Gakm8d7sZsS0Gn2hVSl3GYNL92Z8TRo6", "Ty7sQNcmLenaFb4R0BQbvtPuiVx7Fgst"};
    public Date A00;
    public boolean A01 = false;
    public final C0947Xy A02;
    public final WeakReference<T5> A03;
    public final WeakReference<O9> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<MK> A06;
    public final WeakReference<C0767Qw> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{92, 126, 124, 119, 122, 50, 92, 112, 113, 107, 109, 112, 115, 83, 114, 121, 126, 114, 115, 55, 4, 19, Ascii.RS, 7, 19, 6, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, 39, 32, 59, 82, 34, 19, 6, Ascii.SUB, 82, Ascii.DC4, Ascii.GS, 0, 82, 52, Ascii.ESC, Ascii.RS, Ascii.ETB, 82, 51, 17, 17, Ascii.ETB, 1, 1, 82, 71, 122, 118, 112, 99, 34, 102, 99, 118, 99, 56, 34, 53, 41, 41, 45, 93, 56, Ascii.SI, Ascii.SI, Ascii.DC2, Ascii.SI, 53, Ascii.SO, 19, 1, 6, 5, 64, 50, 5, 17, Ascii.NAK, 5, 19, Ascii.DC4, 64, 6, Ascii.SI, Ascii.DC2, 64, 38, 9, Ascii.FF, 5, 64, 33, 3, 3, 5, 19, 19, 64, 49, 10, Ascii.ETB, 5, 2, 1, 68, 54, 1, Ascii.NAK, 17, 1, Ascii.ETB, Ascii.DLE, 68, 2, Ascii.VT, Ascii.SYN, 68, 34, Ascii.CR, 8, 1, 68, 37, 7, 7, 1, Ascii.ETB, Ascii.ETB, 68, 0, 1, 10, Ascii.CR, 1, 0, 98, 99, 104, 111, 99, 98, 89, 115, 116, 111, 89, 118, 103, 114, 110, 33, 54, 54, 43, 54, Ascii.ESC, 39, 43, 32, 33, Ascii.DLE, 7, 7, Ascii.SUB, 7, 42, 17, Ascii.DLE, 6, Ascii.SYN, 7, Ascii.FS, 5, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 40, 47, 56, 39, 45, 33, 32, 96, 39, 45, 33, 126, 113, 116, 125, 99, 121, 85, 125, 111, 104, 85, 120, 111, 121, 101, 127, 120, 105, 111, 85, 111, 120, 120, 101, 120, 102, 101, 107, 110, 99, 100, 109, 85, 126, 99, 103, 111, 85, 99, 100, 85, 103, 99, 102, 102, 99, 121, Ascii.DC2, Ascii.EM, 8, 70, 70, 57, 46, 46, 35, 57, 49, 44, 40, 37, 35, 46, 57, 47, 44, 51, 50, 47, 57, 2, 3, 65, Ascii.US, Ascii.CAN, 3, Ascii.RS, 9, 58, 45, 57, 61, 45, 59, 60, Ascii.ETB, 33, 44, Ascii.GS, Ascii.FF, 17, Ascii.GS, 70, Ascii.EM, 5, 8, 0, 7, 6, 17, Ascii.FS, Ascii.EM, Ascii.DC4, 47, 0, 17, 4, Ascii.CAN, Ascii.GS, Ascii.SI, 8, 53, Ascii.FS, 3, Ascii.SI, Ascii.GS};
    }

    static {
        A02();
    }

    public OB(C0947Xy c0947Xy, WeakReference<O9> weakReference, WeakReference<C0767Qw> weakReference2, WeakReference<MK> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<T5> weakReference5, AtomicInteger atomicInteger, AtomicReference<String> atomicReference, boolean z) {
        this.A02 = c0947Xy;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = weakReference4;
        this.A03 = weakReference5;
        this.A08 = atomicInteger;
        this.A09 = atomicReference;
        this.A0A = z;
    }

    @RequiresApi(api = 21)
    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, 35), StandardCharsets.UTF_8.name(), HttpStatus.SC_FORBIDDEN, A01(13, 6, 93), Collections.singletonMap(A01(0, 13, 85), A01(268, 8, 38)), new ByteArrayInputStream(A01(13, 6, 93).getBytes()));
    }

    private void A03(int i, CharSequence charSequence, long j) {
        JSONObject jSONObject = new JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 14), i);
            jSONObject.put(A01(170, 17, 63), charSequence);
            jSONObject.put(A01(HttpStatus.SC_ACCEPTED, 21, 64), z);
            jSONObject.put(A01(223, 22, 64), j);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A06().A8y(A01(306, 8, 32), C03298z.A2c, new AnonymousClass90(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 72) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, @Nullable String str) {
        if (A01(245, 23, 54).equals(str)) {
            this.A02.A0D().AFZ();
            return;
        }
        this.A02.A0D().AFa(i, str);
        A03(i, str, new Date().getTime() - this.A00.getTime());
        if (this.A04.get() != null) {
            this.A04.get().AAn(i, str);
        }
    }

    @RequiresApi(api = 21)
    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(187, 11, 4))) {
            return;
        }
        this.A02.A0D().AFe(webResourceResponse.getStatusCode(), C0636Lv.A01(webResourceResponse.getStatusCode(), A01(67, 10, 55), A01(0, 0, 49) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(145, 15, 76), str);
            jSONObject.put(A01(296, 10, 58), str2);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        C0947Xy c0947Xy = this.A02;
        if (c0947Xy != null) {
            c0947Xy.A06().A8y(A01(306, 8, 32), C03298z.A2Z, new AnonymousClass90(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 72) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r6 = r8.getPath()
            java.lang.String r4 = r8.getScheme()
            if (r6 == 0) goto L90
            if (r4 == 0) goto L90
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 4
            r0 = 82
            java.lang.String r3 = A01(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.OB.A0C
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto La8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.OB.A0C
            java.lang.String r1 = "e0NZ0IpncKNbspdHVbaE77hYKi1pXgCT"
            r0 = 6
            r2[r0] = r1
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L90
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 19
            r1 = 36
            r0 = 56
            java.lang.String r0 = A01(r2, r1, r0)
            r3.append(r0)
            r3.append(r6)
            r3.toString()
        L4d:
            com.facebook.ads.redexgen.X.Xy r0 = r7.A02
            java.util.List r5 = com.facebook.ads.redexgen.X.C7U.A09(r0)
            boolean r4 = A0A(r6, r5)
            if (r4 != 0) goto L8f
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 77
            r1 = 31
            r0 = 42
            java.lang.String r0 = A01(r2, r1, r0)
            r3.append(r0)
            r3.append(r6)
            r3.toString()
        L77:
            java.lang.String r3 = com.facebook.ads.redexgen.X.T5.A03()
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 37
            r0 = 46
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r3, r0)
            java.lang.String r0 = r5.toString()
            r7.A07(r6, r0)
        L8f:
            return r4
        L90:
            r3 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.OB.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto La8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.OB.A0C
            java.lang.String r1 = "yXDUwGubOAV6buqiBYARa4GXiUTiAdtJ"
            r0 = 2
            r2[r0] = r1
            return r3
        La8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.OB.A08(android.net.Uri):boolean");
    }

    public static boolean A0A(String str, List<String> list) {
        String lowerPath = str.toLowerCase(Locale.getDefault());
        for (String cacheDir : list) {
            if (lowerPath.startsWith(cacheDir)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0D().AFb(this.A03.get() != null);
        if (this.A03.get() != null && this.A05.get() != null && !this.A05.get().get()) {
            this.A03.get().A0F();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0D().AFc();
        this.A00 = new Date();
        new Handler().postDelayed(new T6(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean zA0r = JR.A0r(this.A02);
        String strA01 = A01(0, 0, 49);
        if (zA0r || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), strA01 + ((Object) webResourceError.getDescription()));
            return;
        }
        this.A02.A0D().AFd(C0636Lv.A01(webResourceError.getErrorCode(), strA01 + ((Object) webResourceError.getDescription()), strA01 + webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0D().AFf();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C03298z.A2Y);
        O9 o9 = this.A04.get();
        if (o9 != null) {
            o9.ACu();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse webResourceResponseA00 = A00();
            A05(webResourceRequest, webResourceResponseA00);
            return webResourceResponseA00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().AAJ(str, new OG().A03(this.A07.get()).A02(this.A06.get()).A05());
            return true;
        }
        return true;
    }
}
