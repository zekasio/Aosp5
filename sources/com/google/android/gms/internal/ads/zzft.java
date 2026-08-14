package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.games.GamesStatusCodes;
import cz.msebera.android.httpclient.HttpHost;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzft extends zzfa implements zzgd {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzgc zzf;
    private final zzgc zzg;
    private zzfl zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzft() {
        this(null, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzc
            r3.setConnectTimeout(r4)
            int r4 = r2.zzd
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzgc r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzgc r5 = r2.zzg
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L79
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "bytes="
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L75
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L75:
            java.lang.String r4 = r4.toString()
        L79:
            if (r4 == 0) goto L80
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L80:
            java.lang.String r4 = r2.zze
            if (r4 == 0) goto L89
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L89:
            r4 = 1
            if (r4 == r10) goto L8f
            java.lang.String r5 = "identity"
            goto L91
        L8f:
            java.lang.String r5 = "gzip"
        L91:
            java.lang.String r6 = "Accept-Encoding"
            r3.setRequestProperty(r6, r5)
            r3.setInstanceFollowRedirects(r11)
            r5 = 0
            r3.setDoOutput(r5)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfl.zza(r4)
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzfl zzflVar) throws zzfz {
        if (str == null) {
            throw new zzfz("Null location redirect", zzflVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new zzfz("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzflVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzfz("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzflVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzfz(e, zzflVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzee.zzc("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(byte[] r7, int r8, int r9) throws com.google.android.gms.internal.ads.zzfz {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.zzm     // Catch: java.io.IOException -> L33
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.zzn     // Catch: java.io.IOException -> L33
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
        L16:
            r7 = -1
            goto L32
        L18:
            long r2 = (long) r9     // Catch: java.io.IOException -> L33
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L33
            int r9 = (int) r0     // Catch: java.io.IOException -> L33
        L1e:
            java.io.InputStream r0 = r6.zzj     // Catch: java.io.IOException -> L33
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r4) goto L29
            goto L16
        L29:
            long r8 = r6.zzn     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.zzn = r8     // Catch: java.io.IOException -> L33
            r6.zzg(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfl r8 = r6.zzh
            int r9 = com.google.android.gms.internal.ads.zzew.zza
            r9 = 2
            com.google.android.gms.internal.ads.zzfz r7 = com.google.android.gms.internal.ads.zzfz.zza(r7, r8, r9)
            goto L3f
        L3e:
            throw r7
        L3f:
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zza(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r25) throws com.google.android.gms.internal.ads.zzfz {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[Catch: Exception -> 0x0068, all -> 0x0089, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x0020, B:17:0x0028, B:23:0x0037, B:25:0x0047, B:27:0x004f, B:29:0x0059, B:30:0x0067), top: B:46:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: Exception -> 0x0068, all -> 0x0089, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x0020, B:17:0x0028, B:23:0x0037, B:25:0x0047, B:27:0x004f, B:29:0x0059, B:30:0x0067), top: B:46:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[Catch: Exception -> 0x0068, all -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:15:0x0020, B:17:0x0028, B:23:0x0037, B:25:0x0047, B:27:0x004f, B:29:0x0059, B:30:0x0067), top: B:46:0x0020 }] */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzfz {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.zzj     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L7a
            long r3 = r10.zzm     // Catch: java.lang.Throwable -> L89
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.zzn     // Catch: java.lang.Throwable -> L89
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.zzi     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L68
            int r8 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L89
            int r8 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L89
            r9 = 20
            if (r8 <= r9) goto L20
            goto L68
        L20:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L30
            int r3 = r7.read()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            r4 = -1
            if (r3 == r4) goto L68
            goto L37
        L30:
            r5 = 2048(0x800, double:1.012E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L37
            goto L68
        L37:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            if (r4 != 0) goto L4f
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            if (r3 == 0) goto L68
        L4f:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            if (r3 == 0) goto L67
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            r3.invoke(r7, r1)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
            goto L68
        L67:
            throw r1     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L89
        L68:
            r2.close()     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L89
            goto L7a
        L6c:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfz r3 = new com.google.android.gms.internal.ads.zzfz     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzfl r4 = r10.zzh     // Catch: java.lang.Throwable -> L89
            int r5 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L89
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L89
            throw r3     // Catch: java.lang.Throwable -> L89
        L7a:
            r10.zzj = r1
            r10.zzm()
            boolean r1 = r10.zzk
            if (r1 == 0) goto L88
            r10.zzk = r0
            r10.zzh()
        L88:
            return
        L89:
            r2 = move-exception
            r10.zzj = r1
            r10.zzm()
            boolean r1 = r10.zzk
            if (r1 == 0) goto L98
            r10.zzk = r0
            r10.zzh()
        L98:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfa, com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfqn.zzd() : new zzfr(httpURLConnection.getHeaderFields());
    }

    private zzft(String str, int i, int i2, boolean z, zzgc zzgcVar, zzfnv zzfnvVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzgcVar;
        this.zzg = new zzgc();
    }
}
