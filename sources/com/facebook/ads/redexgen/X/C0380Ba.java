package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0380Ba implements InterfaceC0871Ux {
    public static byte[] A0G;
    public static String[] A0H = {"8Cwpq0myFqrjMYQXCF426Bvv7lF", "BCZ", "9QEkehaQ45REYiwwIXw9otHnKiruCzQN", "DxeLZUhsDe6Etn8eMTd", "i0KDABCUI1wPuXC", "cHzp87p", "Z4Mhgoj", "Wxs5ICSBRzcNleT3VwYrHD2lep8WMSnM"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0526Hi A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;

    @Nullable
    public final C0531Hp A0A;
    public final C0531Hp A0B = new C0531Hp();

    @Nullable
    public final I0<? super C0380Ba> A0C;

    @Nullable
    public final InterfaceC0553Il<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[0] = "a9yJ7ENBXfuIUHaNhs8YhzHERJT";
            strArr2[1] = "38v";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{Ascii.US, 92, 126, 126, 120, 109, 105, 48, 88, 115, 126, 114, 121, 116, 115, 122, 8, 36, 37, 63, 46, 37, 63, 102, 7, 46, 37, 44, 63, 35, 84, 120, 121, 99, 114, 121, 99, 58, 69, 118, 121, 112, 114, Ascii.SYN, 55, 52, 51, 39, 62, 38, Ascii.SUB, 38, 38, 34, Ascii.SYN, 51, 38, 51, 1, 61, 39, 32, 49, 55, 82, 117, 120, 116, 117, 104, 114, 104, 111, 126, 117, 111, 59, 115, 126, 122, 127, 126, 105, 104, 59, 64, 48, 19, Ascii.US, Ascii.GS, 8, Ascii.NAK, 19, Ascii.DC2, 38, Ascii.GS, 4, 4, 72, 4, 7, Ascii.VT, 9, Ascii.FS, 1, 7, 6, 72, Ascii.SUB, Ascii.CR, Ascii.FF, 1, Ascii.SUB, Ascii.CR, Ascii.VT, Ascii.FS, 54, 41, 53, 50, 109, 94, 81, 88, 90, 7, 60, 60, 115, 62, 50, 61, 42, 115, 33, 54, 55, 58, 33, 54, 48, 39, 32, 105, 115, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 48, 60, 61, 61, 54, 48, 39, 115, 39, 60, 115, 45, Ascii.SYN, Ascii.GS, 0, 8, Ascii.GS, Ascii.ESC, Ascii.FF, Ascii.GS, Ascii.FS, 88, 59, Ascii.ETB, Ascii.SYN, Ascii.FF, Ascii.GS, Ascii.SYN, Ascii.FF, 85, 52, Ascii.GS, Ascii.SYN, Ascii.US, Ascii.FF, Ascii.DLE, 88, 35, 127, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 105, 69, 68, 94, 79, 68, 94, 7, 120, 75, 68, 77, 79, 10, 113, 59, 0, Ascii.VT, Ascii.SYN, Ascii.RS, Ascii.VT, Ascii.CR, Ascii.SUB, Ascii.VT, 10, 78, Ascii.VT, Ascii.FS, Ascii.FS, 1, Ascii.FS, 78, Ascii.EM, 6, 7, 2, Ascii.VT, 78, 10, 7, Ascii.GS, Ascii.CR, 1, 0, 0, Ascii.VT, Ascii.CR, Ascii.SUB, 7, 0, 9, 59, 0, Ascii.GS, Ascii.ESC, Ascii.RS, Ascii.RS, 1, Ascii.FS, Ascii.SUB, Ascii.VT, 10, 78, Ascii.RS, Ascii.FS, 1, Ascii.SUB, 1, Ascii.CR, 1, 2, 78, Ascii.FS, Ascii.VT, 10, 7, Ascii.FS, Ascii.VT, Ascii.CR, Ascii.SUB, 84, 78, Ascii.ETB, 49, 39, 48, 111, 3, 37, 39, 44, 54, 122, 2, 127, 4, 49, Ascii.CR, Ascii.SYN, Ascii.ESC, 10, Ascii.FS, 79, 71, 51, Ascii.VT, 68, 70, 66, 71, 51, Ascii.VT, 68, 70, 64, 71, 51, Ascii.VT, 68, 70, 75, Ascii.VT, Ascii.DLE, Ascii.GS, Ascii.FF, Ascii.SUB, 84, 115, 127, 125, 62, 113, 126, 116, 98, 127, 121, 116, 62, 127, 123, 120, 100, 100, 96, 62, 121, 126, 100, 117, 98, 126, 113, 124, 62, 120, 100, 100, 96, 62, 88, 100, 100, 96, 68, 98, 113, 126, 99, 96, 127, 98, 100, 52, 83, 120, 101, 126, 123, 117, 116, 89, 126, 96, 101, 100, 67, 100, 98, 117, 113, 125, 41, 37, 39, 100, 43, 36, 46, 56, 37, 35, 46, 100, 37, 33, 34, 62, 62, 58, 100, 35, 36, 62, 47, 56, 36, 43, 38, 100, 34, 62, 62, 58, 100, 2, 62, 62, 58, Ascii.RS, 56, 43, 36, 57, 58, 37, 56, 62, 110, Ascii.FF, 35, 50, 47, 46, 6, 47, 36, 45, 62, 34, 3, 36, 58, 63, 62, Ascii.EM, 62, 56, 47, 43, 39, 55, 43, 43, 47, Ascii.VT, Ascii.ETB, Ascii.ETB, 19, Ascii.DLE, 2, Ascii.SI, Ascii.SO, 5, Ascii.US, 2, Ascii.US, Ascii.DC2, 126, 101, 110, 115, 123, 110, 104, 127, 110, 111, 78, 101, 111, 68, 109, 66, 101, 123, 126, 127};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(HttpStatus.SC_MULTIPLE_CHOICES, 25, 29));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Il != com.facebook.ads.internal.exoplayer2.util.Predicate<java.lang.String> */
    public C0380Ba(String str, @Nullable InterfaceC0553Il<String> interfaceC0553Il, @Nullable I0<? super C0380Ba> i0, int i, int i2, boolean z, @Nullable C0531Hp c0531Hp) {
        this.A0E = IK.A02(str);
        this.A0D = interfaceC0553Il;
        this.A0C = i0;
        this.A08 = i;
        this.A09 = i2;
        this.A0F = z;
        this.A0A = c0531Hp;
    }

    private int A00(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A02;
        String[] strArr = A0H;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[0] = "bWPLRd721NhcJPFUmTbRIXPAhQ9";
        strArr2[1] = "JEA";
        if (j != -1) {
            long j2 = j - this.A00;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = this.A05.read(bArr, i, i2);
        String[] strArr3 = A0H;
        if (strArr3[6].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0H;
        strArr4[0] = "AfChosDvH2k0xVUSu60NEuB2wOO";
        strArr4[1] = "7R7";
        if (i3 == -1) {
            if (this.A02 == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.A00 += (long) i3;
        I0<? super C0380Ba> i0 = this.A0C;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }

    private final long A01() {
        long j = this.A02;
        return j == -1 ? j : j - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 57));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA03 = A03(296, 1, 85);
        String strA032 = A03(43, 21, 32);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(strA032, A03(166, 27, 10) + headerField + strA03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 101));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        Log.w(strA032, A03(64, 22, 105) + headerField + A03(297, 3, 45) + headerField2 + strA03);
                        jMax = Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    Log.e(strA032, A03(193, 26, 88) + headerField2 + strA03);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A04(C0526Hi c0526Hi) throws IOException {
        HttpURLConnection httpURLConnectionA05;
        URL url = new URL(c0526Hi.A04.toString());
        byte[] bArr = c0526Hi.A06;
        long j = c0526Hi.A03;
        long j2 = c0526Hi.A02;
        boolean zA02 = c0526Hi.A02(1);
        if (!this.A0F) {
            if (A0H[4].length() == 2) {
                throw new RuntimeException();
            }
            A0H[3] = "AfmLjTAqEjfBoFvfwAy";
            return A05(url, bArr, j, j2, zA02, true);
        }
        int redirectCount = 0;
        while (true) {
            int i = redirectCount + 1;
            if (redirectCount <= 20) {
                httpURLConnectionA05 = A05(url, bArr, j, j2, zA02, false);
                int responseCode = httpURLConnectionA05.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                    break;
                }
                bArr = null;
                String headerField = httpURLConnectionA05.getHeaderField(A03(86, 8, 14));
                httpURLConnectionA05.disconnect();
                url = A06(url, headerField);
                redirectCount = i;
            } else {
                throw new NoRouteToHostException(A03(125, 20, 33) + i);
            }
        }
        return httpURLConnectionA05;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        C0531Hp c0531Hp = this.A0A;
        if (c0531Hp != null) {
            for (Map.Entry<String, String> entry : c0531Hp.A00().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = A03(325, 6, 27) + j + A03(0, 1, 64);
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty(A03(120, 5, 77), str);
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 48), this.A0E);
        if (!z) {
            httpURLConnection.setRequestProperty(A03(1, 15, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), A03(474, 8, 25));
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (A0H[2].charAt(11) != 'E') {
            throw new RuntimeException();
        }
        A0H[7] = "Y4214PJ0d833V29vzm0V8RPiGXomA3ZU";
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 20));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (A03(469, 5, 17).equals(protocol) || A03(465, 4, 45).equals(protocol)) {
                return url2;
            }
            throw new ProtocolException(A03(255, 31, 28) + protocol);
        }
        throw new ProtocolException(A03(94, 22, 26));
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(A03(43, 21, 32), A03(219, 36, 28), e);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        byte[] andSet = A0I.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.A01;
            long j2 = this.A03;
            if (j != j2) {
                int readLength = (int) Math.min(j2 - j, andSet.length);
                int i = this.A05.read(andSet, 0, readLength);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                String[] strArr = A0H;
                if (strArr[0].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0H[2] = "xCxIxiNgjMSECsgVhCWdWfEPU1XUNw0H";
                if (i != -1) {
                    this.A01 += (long) i;
                    I0<? super C0380Ba> i0 = this.A0C;
                    if (i0 != null) {
                        i0.AAG(this, i);
                    }
                } else {
                    throw new EOFException();
                }
            } else {
                A0I.set(andSet);
                return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j) {
        if (C0567Iz.A02 != 19 && C0567Iz.A02 != 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else {
                if (A0H[4].length() == 2) {
                    throw new RuntimeException();
                }
                A0H[7] = "fvAwzL9wombuya3LmhGM8hGg4ouN1XgQ";
                if (j <= 2048) {
                    return;
                }
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 98).equals(name) || A03(396, 69, 56).equals(name)) {
                Method unexpectedEndOfInput = inputStream.getClass().getSuperclass().getDeclaredMethod(A03(482, 20, 121), new Class[0]);
                unexpectedEndOfInput.setAccessible(true);
                unexpectedEndOfInput.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[PHI: r4
      0x00ae: PHI (r4v5 long) = (r4v4 long), (r4v9 long) binds: [B:32:0x00ab, B:29:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACw(com.facebook.ads.redexgen.X.C0526Hi r11) throws com.facebook.ads.redexgen.X.C0530Ho {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0380Ba.ACw(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws C0530Ho {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e) {
                    throw new C0530Ho(e, this.A04, 3);
                }
            }
            this.A05 = null;
            if (A0H[3].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[0] = "hQ3mc1CdxqPeh2AA8lkYs0MW7MP";
            strArr[1] = "PCj";
            A07();
            if (this.A07) {
                this.A07 = false;
                I0<? super C0380Ba> i0 = this.A0C;
                if (i0 != null) {
                    i0.ACa(this);
                }
            }
        } catch (Throwable th) {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                I0<? super C0380Ba> i02 = this.A0C;
                if (i02 != null) {
                    i02.ACa(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws C0530Ho {
        try {
            A08();
            return A00(bArr, i, i2);
        } catch (IOException e) {
            throw new C0530Ho(e, this.A04, 2);
        }
    }
}
