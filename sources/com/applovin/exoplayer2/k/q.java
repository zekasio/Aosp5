package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import com.google.android.gms.games.GamesStatusCodes;
import com.loopj.android.http.AsyncHttpClient;
import cz.msebera.android.httpclient.HttpHeaders;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class q extends e implements t {
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final t.f f;
    private final t.f g;
    private final boolean h;
    private Predicate<String> i;
    private l j;
    private HttpURLConnection k;
    private InputStream l;
    private boolean m;
    private int n;
    private long o;
    private long p;

    public static final class a implements t.b {
        private aa b;
        private Predicate<String> c;
        private String d;
        private boolean g;
        private boolean h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t.f f589a = new t.f();
        private int e = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
        private int f = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;

        public a a(String str) {
            this.d = str;
            return this;
        }

        @Override // com.applovin.exoplayer2.k.t.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public q c() {
            q qVar = new q(this.d, this.e, this.f, this.g, this.f589a, this.c, this.h);
            aa aaVar = this.b;
            if (aaVar != null) {
                qVar.a(aaVar);
            }
            return qVar;
        }
    }

    @Deprecated
    public q() {
        this(null, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY);
    }

    @Deprecated
    public q(String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public q(String str, int i, int i2, boolean z, t.f fVar) {
        this(str, i, i2, z, fVar, null, false);
    }

    private q(String str, int i, int i2, boolean z, t.f fVar, Predicate<String> predicate, boolean z2) {
        super(true);
        this.e = str;
        this.c = i;
        this.d = i2;
        this.b = z;
        this.f = fVar;
        this.i = predicate;
        this.g = new t.f();
        this.h = z2;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.exoplayer2.k.e, com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws t.c {
        byte[] bArrA;
        this.j = lVar;
        long j = 0;
        this.p = 0L;
        this.o = 0L;
        b(lVar);
        try {
            HttpURLConnection httpURLConnectionD = d(lVar);
            this.k = httpURLConnectionD;
            this.n = httpURLConnectionD.getResponseCode();
            String responseMessage = httpURLConnectionD.getResponseMessage();
            int i = this.n;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.n == 416) {
                    if (lVar.g == u.a(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.m = true;
                        c(lVar);
                        if (lVar.h != -1) {
                            return lVar.h;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    bArrA = errorStream != null ? ai.a(errorStream) : ai.f;
                } catch (IOException unused) {
                    bArrA = ai.f;
                }
                byte[] bArr = bArrA;
                e();
                throw new t.e(this.n, responseMessage, this.n == 416 ? new j(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, lVar, bArr);
            }
            String contentType = httpURLConnectionD.getContentType();
            Predicate<String> predicate = this.i;
            if (predicate != null && !predicate.apply(contentType)) {
                e();
                throw new t.d(contentType, lVar);
            }
            if (this.n == 200 && lVar.g != 0) {
                j = lVar.g;
            }
            boolean zA = a(httpURLConnectionD);
            if (zA || lVar.h != -1) {
                this.o = lVar.h;
            } else {
                long jA = u.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                this.o = jA != -1 ? jA - j : -1L;
            }
            try {
                this.l = httpURLConnectionD.getInputStream();
                if (zA) {
                    this.l = new GZIPInputStream(this.l);
                }
                this.m = true;
                c(lVar);
                try {
                    a(j, lVar);
                    return this.o;
                } catch (IOException e) {
                    e();
                    if (e instanceof t.c) {
                        throw ((t.c) e);
                    }
                    throw new t.c(e, lVar, 2000, 1);
                }
            } catch (IOException e2) {
                e();
                throw new t.c(e2, lVar, 2000, 1);
            }
        } catch (IOException e3) {
            e();
            throw t.c.a(e3, lVar, 1);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws t.c {
        try {
            return b(bArr, i, i2);
        } catch (IOException e) {
            throw t.c.a(e, (l) ai.a(this.j), 2);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws t.c {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                long j = this.o;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.p;
                }
                a(this.k, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new t.c(e, (l) ai.a(this.j), 2000, 3);
                }
            }
        } finally {
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                d();
            }
        }
    }

    private HttpURLConnection d(l lVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url;
        URL url2 = new URL(lVar.f581a.toString());
        int i = lVar.c;
        byte[] bArr = lVar.d;
        long j = lVar.g;
        long j2 = lVar.h;
        boolean zB = lVar.b(1);
        if (!this.b && !this.h) {
            return a(url2, i, bArr, j, j2, zB, true, lVar.e);
        }
        int i2 = 0;
        URL urlA = url2;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i3;
                URL url3 = urlA;
                long j5 = j2;
                httpURLConnectionA = a(urlA, i3, bArr2, j3, j2, zB, false, lVar.e);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField(HttpHeaders.LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    urlA = a(url3, headerField, lVar);
                    i3 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionA.disconnect();
                    if (this.h && responseCode == 302) {
                        i3 = i5;
                        url = url3;
                    } else {
                        bArr2 = null;
                        url = url3;
                        i3 = 1;
                    }
                    urlA = a(url, headerField, lVar);
                }
                i2 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new t.c(new NoRouteToHostException("Too many redirects: " + i4), lVar, 2001, 1);
            }
        }
        return httpURLConnectionA;
    }

    private HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.c);
        httpURLConnectionA.setReadTimeout(this.d);
        HashMap map2 = new HashMap();
        t.f fVar = this.f;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.g.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j, j2);
        if (strA != null) {
            httpURLConnectionA.setRequestProperty("Range", strA);
        }
        String str = this.e;
        if (str != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z ? AsyncHttpClient.ENCODING_GZIP : HTTP.IDENTITY_CODING);
        httpURLConnectionA.setInstanceFollowRedirects(z2);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(l.a(i));
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private URL a(URL url, String str, l lVar) throws t.c {
        if (str == null) {
            throw new t.c("Null location redirect", lVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new t.c("Unsupported protocol redirect: " + protocol, lVar, 2001, 1);
            }
            if (this.b || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new t.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new t.c(e, lVar, 2001, 1);
        }
    }

    private void a(long j, l lVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) ai.a(this.l)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new t.c(new InterruptedIOException(), lVar, 2000, 1);
            }
            if (i == -1) {
                throw new t.c(lVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j -= (long) i;
            a(i);
        }
    }

    private int b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.o;
        if (j != -1) {
            long j2 = j - this.p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) ai.a(this.l)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.p += (long) i3;
        a(i3);
        return i3;
    }

    private static void a(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || ai.f611a < 19 || ai.f611a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) com.applovin.exoplayer2.l.a.b(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.applovin.exoplayer2.l.q.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return AsyncHttpClient.ENCODING_GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }
}
