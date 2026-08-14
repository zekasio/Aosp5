package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0524Hg implements R2 {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC03288y A00;
    public Executor A01;
    public boolean A02;
    public R7 A03;
    public final RC A04 = new C0540Hy();
    public final RH A05;
    public final RI A06;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Ascii.DLE, Ascii.DC2, 55, 58, 95, 55, 53, 74, 71, Ascii.SO, 74, 72, Ascii.SI, 76, 90, 93, 67, Ascii.SI, Ascii.SO, 71, 93, Ascii.SO, 64, 65, 90, Ascii.SO, 79, Ascii.SO, 88, 79, 66, 71, 74, Ascii.SO, 123, 124, 98, Ascii.SO, 65, 72, Ascii.SO, 94, 102, 106, 9, Ascii.RS, 106, 119, 106, Ascii.FS, Ascii.DLE, 98, 100, Ascii.DLE, Ascii.CR, Ascii.DLE, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, Ascii.CR, Ascii.FS, Ascii.US, 7, Ascii.SUB, 3, 72, Ascii.CR, Ascii.SUB, Ascii.SUB, 7, Ascii.SUB, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, 127, 126, 127, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, Ascii.CAN, 4, 4, 0, 94, 0, 2, Ascii.US, 8, 9, 56, Ascii.US, 3, 4, 127, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    static {
        A0A();
        A09 = R2.class.getSimpleName();
    }

    public C0524Hg(R7 r7, InterfaceC03288y interfaceC03288y, Executor executor) {
        A0B();
        this.A03 = r7;
        this.A06 = new HN(r7.A04());
        final RI ri = this.A06;
        this.A05 = new AbstractC0537Hv(ri) { // from class: com.facebook.ads.redexgen.X.4M
        };
        this.A01 = executor;
        this.A00 = interfaceC03288y;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamAD1 = null;
        try {
            outputStreamAD1 = this.A05.AD1(httpURLConnection);
            if (outputStreamAD1 != null) {
                this.A05.AFk(outputStreamAD1, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStreamAD1 != null) {
                try {
                    outputStreamAD1.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStreamAD1 != null) {
                try {
                    outputStreamAD1.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final R1 A01(RE re) throws RF {
        R1 c0525Hh;
        String strA07 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        R1 r1A05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                boolean isE2E = C0619Lc.A04();
                HttpURLConnection httpURLConnectionA08 = A08(re.A05(), isE2E ? A09() : null);
                A0H(httpURLConnectionA08, re);
                A0G(httpURLConnectionA08, re);
                boolean isE2E2 = this.A06.A8Z();
                if (isE2E2) {
                    this.A06.A9E(httpURLConnectionA08, re.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean pinKeys = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (pinKeys || z)) {
                    try {
                        RJ.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e) {
                        this.A00.A9I(strA07, C03298z.A1y, new AnonymousClass90(e));
                    } catch (Exception e2) {
                        this.A00.A9I(strA07, C03298z.A1x, new AnonymousClass90(e2));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && re.A06() != null) {
                    A00(httpURLConnectionA08, re.A06());
                }
                if (httpURLConnectionA08.getDoInput()) {
                    c0525Hh = A06(httpURLConnectionA08);
                } else {
                    c0525Hh = new C0525Hh(httpURLConnectionA08, null);
                }
                if (this.A06.A8Z()) {
                    this.A06.A9F(c0525Hh);
                }
                httpURLConnectionA08.disconnect();
                return c0525Hh;
            } catch (Exception e3) {
                try {
                    try {
                        r1A05 = A05(null);
                        if (r1A05 == null || r1A05.A7a() <= 0) {
                            throw new RF(e3, r1A05);
                        }
                        if (this.A06.A8Z()) {
                            this.A06.A9F(r1A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return r1A05;
                    } catch (Exception unused) {
                        Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                        if (r1A05 != null && r1A05.A7a() > 0) {
                            if (this.A06.A8Z()) {
                                this.A06.A9F(r1A05);
                            }
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            return r1A05;
                        }
                        throw new RF(e3, r1A05);
                    }
                } catch (Throwable unused2) {
                    if (r1A05 != null && r1A05.A7a() > 0) {
                        if (this.A06.A8Z()) {
                            this.A06.A9F(r1A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return r1A05;
                    }
                    throw new RF(e3, r1A05);
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8Z()) {
                this.A06.A9F(r1A05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Nullable
    private final R1 A02(RE re) {
        if (this.A03.A04()) {
            A0C(re);
        }
        R1 r1A01 = null;
        try {
            r1A01 = A01(re);
            return r1A01;
        } catch (RF e) {
            this.A05.AAl(e);
            return r1A01;
        } catch (Exception e2) {
            this.A05.AAl(new RF(e2, r1A01));
            return r1A01;
        }
    }

    @Nullable
    private final R1 A03(String str, RG rg, RA ra) {
        return A02(new Hm(str, rg, ra));
    }

    @Nullable
    private final R1 A04(String str, String str2, byte[] bArr, RA ra) {
        return A02(new C0527Hk(str, null, str2, bArr, ra));
    }

    private final R1 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] bArrADe = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bArrADe = this.A05.ADe(errorStream);
            }
            C0525Hh c0525Hh = new C0525Hh(httpURLConnection, bArrADe);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return c0525Hh;
        } catch (Throwable th) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final R1 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamAD0 = null;
        byte[] bArrADe = null;
        try {
            inputStreamAD0 = this.A05.AD0(httpURLConnection);
            if (inputStreamAD0 != null) {
                bArrADe = this.A05.ADe(inputStreamAD0);
            }
            C0525Hh c0525Hh = new C0525Hh(httpURLConnection, bArrADe);
            if (inputStreamAD0 != null) {
                try {
                    inputStreamAD0.close();
                } catch (Exception unused) {
                }
            }
            return c0525Hh;
        } catch (Throwable th) {
            if (inputStreamAD0 != null) {
                try {
                    inputStreamAD0.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, @Nullable Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ACz(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(HttpStatus.SC_PARTIAL_CONTENT, 14, 74));
        int i = -1;
        if (property2 != null) {
            try {
                i = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        String proxyAddress = strArr[2];
        if (portStr.charAt(28) == proxyAddress.charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!zIsEmpty && i > 0 && i <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(RE re) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean zEquals = re.A03().equals(RD.A06);
        String strA07 = A07(41, 1, 33);
        if (zEquals && re.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(re.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(strA07);
        }
        Map<String, String> mapA06 = re.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : mapA06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 109));
        sb.append(re.A05());
        sb.append(strA07);
        String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(RE re, R3 r3) {
        this.A04.A5k(this, r3, this.A01).A5H(re);
        if (this.A03.A04()) {
            A0C(re);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, R3 r3, RA ra) {
        A0D(new C0527Hk(str, null, str2, bArr, ra), r3);
    }

    private void A0G(HttpURLConnection httpURLConnection, RE re) {
        Map<String, String> mapA06 = re.A02().A06();
        R0 r0A05 = re.A02().A05();
        for (String str : mapA06.keySet()) {
            String name = mapA06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (r0A05 != null) {
            Map<String, String> mapA5W = r0A05.A5W(this.A03.A03());
            for (String str2 : mapA5W.keySet()) {
                String value = mapA5W.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, RE re) throws IOException {
        RA raA02 = re.A02();
        httpURLConnection.setConnectTimeout(raA02.A00());
        httpURLConnection.setReadTimeout(raA02.A02());
        this.A05.ADI(httpURLConnection, re.A03(), re.A04());
    }

    private final boolean A0I(Throwable th, long j, RE re) {
        RA raA02 = re.A02();
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A8Z()) {
            String str = A07(67, 15, 35) + jCurrentTimeMillis + A07(42, 7, 23) + raA02.A00() + A07(49, 7, 109) + raA02.A02();
        }
        if (this.A02) {
            return jCurrentTimeMillis >= ((long) raA02.A02());
        }
        long jA00 = raA02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return jCurrentTimeMillis >= jA00;
    }

    public final R1 A0J(RE re) throws RF {
        long j;
        long length;
        long endTimeMillis;
        long startTime = System.currentTimeMillis();
        int iA01 = re.A02().A01();
        long jA03 = re.A02().A03();
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) re.A02().A04());
        for (int i = 0; i < iA01; i++) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "w7CndVwumsN";
            strArr[7] = "Wx3tR5uVNB4";
            if (jCurrentTimeMillis <= jCurrentTimeMillis2) {
                break;
            }
            try {
                if (this.A06.A8Z()) {
                    String str = (i + 1) + A07(37, 4, 115) + iA01 + A07(56, 9, 70) + re.A05();
                }
                startTime = System.currentTimeMillis();
                try {
                    R1 r1A01 = A01(re);
                    if (r1A01 != null) {
                        this.A00.A98(startTime, System.currentTimeMillis() - startTime, r1A01.A5o().length, re.A04 == null ? 0L : re.A04.length, r1A01.A7a(), null);
                        return r1A01;
                    }
                    continue;
                } catch (RF e) {
                    e = e;
                    if (!A0I(e, startTime, re) || i >= iA01 - 1) {
                        boolean isRecoverable = this.A05.AAl(e);
                        if (isRecoverable && i < iA01 - 1) {
                            long j2 = 0;
                            if (jA03 > 0) {
                                try {
                                    Thread.sleep(jA03);
                                } catch (InterruptedException e2) {
                                    InterfaceC03288y interfaceC03288y = this.A00;
                                    long jCurrentTimeMillis3 = System.currentTimeMillis() - startTime;
                                    if (re.A04 != null) {
                                        int numTries = re.A04.length;
                                        j2 = numTries;
                                    }
                                    interfaceC03288y.A98(startTime, jCurrentTimeMillis3, 0L, j2, 0, e2);
                                    throw e;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            R1 r1A00 = e.A00();
                            InterfaceC03288y interfaceC03288y2 = this.A00;
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - startTime;
                            if (r1A00 == null || r1A00.A5o() == null) {
                                length = 0;
                            } else {
                                length = r1A00.A5o().length;
                            }
                            if (re.A04 == null) {
                                endTimeMillis = 0;
                            } else {
                                int numTries2 = re.A04.length;
                                endTimeMillis = numTries2;
                            }
                            long startTime2 = length;
                            interfaceC03288y2.A98(startTime, jCurrentTimeMillis4, startTime2, endTimeMillis, r1A00 == null ? 0 : r1A00.A7a(), e);
                            throw e;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (RF e3) {
                e = e3;
                if (A08[4].length() == 10) {
                    throw new RuntimeException();
                }
                A08[5] = "aIX15CFtbyRTCgSwX4E1qAS9DeUF";
            }
        }
        InterfaceC03288y interfaceC03288y3 = this.A00;
        long jCurrentTimeMillis5 = System.currentTimeMillis() - startTime;
        if (re.A04 == null) {
            j = 0;
        } else {
            int numTries3 = re.A04.length;
            j = numTries3;
        }
        interfaceC03288y3.A98(startTime, jCurrentTimeMillis5, 0L, j, 0, new TimeoutException(A07(82, 35, 27)));
        return null;
    }

    public final R7 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.R2
    @Nullable
    @Deprecated
    public final R1 ADA(String str, Map<String, String> map) {
        return A03(str, new RG(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.R2
    @Nullable
    @Deprecated
    public final R1 ADB(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.R2
    public final void ADC(String str, byte[] bArr, R3 r3) {
        A0F(str, A07(135, 47, 70), bArr, r3, this.A03.A00());
    }
}
