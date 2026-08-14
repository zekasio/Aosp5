package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.loopj.android.http.AsyncHttpClient;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1239dx implements C0K {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"0sQYFfkZHHeVMKUBSEw8nV", "OMjsYZjecgzBPFsO2qu9DXSbxh5JXpo7", "UT2rHb55ERwVxNOqpRWPVvfe1UkWVyPP", "dnZnJ0uYb7k8tLcQy7f3QyFDUQrwjEiR", "oxpcdWRNT0kUjhHWpmvIkR5l", "M5dLDfrAE2TxcxVuZGCd0hZ7u7RiqVG3", "YVmAwTI", "30bRwIya64cDsyZ9K4ZP4bQrXzvqCneG"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;

    @Nullable
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
            if (A09[7].charAt(10) == 'N') {
                throw new RuntimeException();
            }
            A09[3] = "xmylGJpTyqy6yVXTtCE3KaogQJsBWdto";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-65, 8, Ascii.DC2, -65, 8, Ascii.CR, 19, 4, 17, 17, Ascii.DC4, Ascii.SI, 19, 4, 3, -65, 19, Ascii.SO, -65, -45, 42, Ascii.FS, 39, Ascii.ESC, -45, 34, Ascii.EM, Ascii.EM, 38, Ascii.CAN, 39, -45, -19, -31, 36, 48, 47, 53, 38, 47, 53, -18, 45, 38, 47, 40, 53, 41, -5, -31, -100, -84, -110, -43, -31, -32, -32, -41, -43, -26, -37, -31, -32, -110, -37, -27, -110, -45, -44, -27, -41, -32, -26, -109, 8, 52, 51, 57, 42, 51, 57, -27, 46, 51, 43, 52, -27, 43, 52, 55, -27, 37, -1, 44, 44, 41, 44, -38, Ascii.RS, 35, 45, Ascii.GS, 41, 40, 40, Ascii.US, Ascii.GS, 46, 35, 40, 33, -38, 2, 46, 46, 42, Ascii.SI, 44, 38, -3, 41, 40, 40, Ascii.US, Ascii.GS, 46, 35, 41, 40, -17, Ascii.FS, Ascii.FS, Ascii.EM, Ascii.FS, -54, Ascii.DLE, Ascii.SI, Ascii.RS, Ascii.CR, Ascii.DC2, 19, Ascii.CAN, 17, -54, 19, Ascii.CAN, Ascii.DLE, Ascii.EM, -54, Ascii.DLE, Ascii.FS, Ascii.EM, Ascii.ETB, -54, -31, Ascii.SO, Ascii.SO, Ascii.VT, Ascii.SO, -68, Ascii.VT, Ascii.FF, 1, 10, 5, 10, 3, -68, -1, Ascii.VT, 10, 10, 1, -1, Ascii.DLE, 5, Ascii.VT, 10, -68, 2, Ascii.VT, Ascii.SO, -68, 10, 55, 55, 52, 55, -27, 55, 42, 38, 41, 46, 51, 44, -27, 41, 38, 57, 38, -27, 43, 55, 52, 50, -27, -50, -6, -6, -10, -37, -8, -14, -39, -11, -5, -8, -23, -21, 1, -5, -8, -14, -61, -83, -38, -3, -15, -17, 2, -9, -3, -4, Ascii.DC2, 51, 40, 49, -29, 38, 50, 49, 49, 40, 38, 55, 44, 50, 49, -29, -21, -6, 7, 0, -2, -53, -34, -38, -35, -103, -36, -24, -25, -19, -34, -25, -19, -103, -30, -25, -33, -24, -103, -33, -21, -24, -26, -103, Ascii.SI, 34, Ascii.RS, 33, 38, 43, 36, -35, 48, 44, 50, 47, 32, 34, -35, Ascii.ESC, 54, 54, -25, 52, 40, 53, 64, -25, 57, 44, 43, 48, 57, 44, 42, 59, 58, 1, -25, -9, -47, -73, 4, 0, 4, -4, -47, -73, 62, 85, 80, 65, 79, Ascii.EM, 49};
    }

    static {
        A04();
        A07 = C1239dx.class.getSimpleName();
    }

    public C1239dx(String str) {
        this(str, C0I.A01(str));
    }

    public C1239dx(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C1239dx(String str, @Nullable String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) C0J.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    private HttpURLConnection A02(int i, int i2) throws C1241dz, IOException {
        String strA01;
        HttpURLConnection httpURLConnection;
        boolean z;
        int code = 0;
        String headerField = this.A03;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append(A01(234, 16, 102));
            if (i > 0) {
                strA01 = A01(19, 13, 86) + i;
            } else {
                strA01 = A01(0, 0, 78);
            }
            sb.append(strA01);
            sb.append(A01(15, 4, 66));
            sb.append(headerField);
            sb.toString();
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 5, 60), A01(322, 6, 127) + i + A01(50, 1, 18));
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            String[] strArr = A09;
            if (strArr[1].charAt(4) == strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[2] = "PLgwygtF0FJvu0SiSas8utQP577qcxnM";
            strArr2[0] = "YPLv6eSsZkmOoYsRk43xhT";
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                headerField = httpURLConnection.getHeaderField(A01(226, 8, 49));
                code++;
                httpURLConnection.disconnect();
            }
            if (code > 5) {
                throw new C1241dz(A01(293, 20, 106) + code);
            }
        } while (z);
        return httpURLConnection;
    }

    private void A03() throws C1241dz {
        String str = A01(255, 23, 28) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionA02 = A02(0, AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
                this.A05 = httpURLConnectionA02.getContentLength();
                this.A06 = httpURLConnectionA02.getContentType();
                inputStream = httpURLConnectionA02.getInputStream();
                Log.i(A07, A01(74, 18, 104) + this.A03 + A01(313, 9, 58) + this.A06 + A01(32, 18, 100) + this.A05);
                C0I.A05(inputStream);
            } catch (IOException e) {
                Log.e(A07, A01(129, 25, 77) + this.A03, e);
                C0I.A05(inputStream);
                if (httpURLConnectionA02 == null) {
                    return;
                }
            }
            httpURLConnectionA02.disconnect();
        } catch (Throwable th) {
            C0I.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws C1241dz {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new C1241dz(A01(154, 29, 63) + this.A03 + A01(19, 13, 86) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ACx(int i) throws C1241dz {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1241dz {
        HttpURLConnection httpURLConnection = this.A02;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (NullPointerException e) {
                throw new C1241dz(A01(92, 37, 93), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final synchronized int length() throws C1241dz {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1241dz {
        InputStream inputStream = this.A01;
        String strA01 = A01(183, 24, 104);
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new GI(A01(278, 15, 96) + this.A03 + A01(0, 15, 66), e);
            } catch (IOException e2) {
                throw new C1241dz(strA01 + this.A03, e2);
            }
        }
        throw new C1241dz(strA01 + this.A03 + A01(51, 23, 21));
    }

    public final String toString() {
        return A01(HttpStatus.SC_MULTI_STATUS, 19, 41) + this.A03 + A01(328, 1, 87);
    }
}
