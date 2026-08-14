package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdf extends zzfa implements zzgd {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzgc zzh;
    private zzfl zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    zzcdf(String str, zzgi zzgiVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcde(this);
        this.zzs = new HashSet();
        zzdl.zzc(str);
        this.zzg = str;
        this.zzh = new zzgc();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzgiVar != null) {
            zzf(zzgiVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzbza.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:119:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023c A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:39:0x00e8, B:93:0x0231, B:95:0x023c, B:97:0x024d, B:100:0x0256, B:101:0x0265, B:103:0x026d, B:104:0x0274, B:105:0x0275, B:106:0x028b), top: B:119:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfl r21) throws com.google.android.gms.internal.ads.zzfz {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zzb(com.google.android.gms.internal.ads.zzfl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: Exception -> 0x0065, all -> 0x008b, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:15:0x0021, B:17:0x0029, B:23:0x0038, B:25:0x0048, B:27:0x0050), top: B:45:0x0021 }] */
    @Override // com.google.android.gms.internal.ads.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzfz {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzk     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L77
            java.net.HttpURLConnection r2 = r9.zzj     // Catch: java.lang.Throwable -> L8b
            long r3 = r9.zzo     // Catch: java.lang.Throwable -> L8b
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.zzq     // Catch: java.lang.Throwable -> L8b
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8b
            r8 = 19
            if (r7 == r8) goto L21
            int r7 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8b
            r8 = 20
            if (r7 == r8) goto L21
            goto L65
        L21:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L31
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            r4 = -1
            if (r3 == r4) goto L65
            goto L38
        L31:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L38
            goto L65
        L38:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            if (r4 != 0) goto L50
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            if (r3 == 0) goto L65
        L50:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
            r3.invoke(r2, r1)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8b
        L65:
            java.io.InputStream r2 = r9.zzk     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8b
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8b
            goto L77
        L6b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfz r3 = new com.google.android.gms.internal.ads.zzfz     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzfl r4 = r9.zzi     // Catch: java.lang.Throwable -> L8b
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L8b
            throw r3     // Catch: java.lang.Throwable -> L8b
        L77:
            r9.zzk = r1
            r9.zzn()
            boolean r1 = r9.zzl
            if (r1 == 0) goto L85
            r9.zzl = r0
            r9.zzh()
        L85:
            java.util.Set r0 = r9.zzs
            r0.clear()
            return
        L8b:
            r2 = move-exception
            r9.zzk = r1
            r9.zzn()
            boolean r1 = r9.zzl
            if (r1 == 0) goto L9a
            r9.zzl = r0
            r9.zzh()
        L9a:
            java.util.Set r0 = r9.zzs
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfa, com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzm(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzbza.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(byte[] r9, int r10, int r11) throws com.google.android.gms.internal.ads.zzfz {
        /*
            r8 = this;
            long r0 = r8.zzp     // Catch: java.io.IOException -> L8e
            long r2 = r8.zzn     // Catch: java.io.IOException -> L8e
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb
            goto L53
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.zzcdf.zzc     // Catch: java.io.IOException -> L8e
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.io.IOException -> L8e
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L8e
            if (r0 != 0) goto L1a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L8e
        L1a:
            long r1 = r8.zzp     // Catch: java.io.IOException -> L8e
            long r6 = r8.zzn     // Catch: java.io.IOException -> L8e
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L4e
            int r3 = r0.length     // Catch: java.io.IOException -> L8e
            long r6 = r6 - r1
            long r1 = (long) r3     // Catch: java.io.IOException -> L8e
            long r1 = java.lang.Math.min(r6, r1)     // Catch: java.io.IOException -> L8e
            int r2 = (int) r1     // Catch: java.io.IOException -> L8e
            java.io.InputStream r1 = r8.zzk     // Catch: java.io.IOException -> L8e
            int r1 = r1.read(r0, r4, r2)     // Catch: java.io.IOException -> L8e
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L8e
            if (r2 != 0) goto L48
            if (r1 == r5) goto L42
            long r2 = r8.zzp     // Catch: java.io.IOException -> L8e
            long r6 = (long) r1     // Catch: java.io.IOException -> L8e
            long r2 = r2 + r6
            r8.zzp = r2     // Catch: java.io.IOException -> L8e
            r8.zzg(r1)     // Catch: java.io.IOException -> L8e
            goto L1a
        L42:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L48:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L4e:
            java.util.concurrent.atomic.AtomicReference r1 = com.google.android.gms.internal.ads.zzcdf.zzc     // Catch: java.io.IOException -> L8e
            r1.set(r0)     // Catch: java.io.IOException -> L8e
        L53:
            if (r11 != 0) goto L56
            goto L8d
        L56:
            long r0 = r8.zzo     // Catch: java.io.IOException -> L8e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6f
            long r6 = r8.zzq     // Catch: java.io.IOException -> L8e
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L69
        L67:
            r4 = -1
            goto L8d
        L69:
            long r6 = (long) r11     // Catch: java.io.IOException -> L8e
            long r0 = java.lang.Math.min(r6, r0)     // Catch: java.io.IOException -> L8e
            int r11 = (int) r0     // Catch: java.io.IOException -> L8e
        L6f:
            java.io.InputStream r0 = r8.zzk     // Catch: java.io.IOException -> L8e
            int r4 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L8e
            if (r4 != r5) goto L84
            long r9 = r8.zzo     // Catch: java.io.IOException -> L8e
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L7e
            goto L67
        L7e:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L84:
            long r9 = r8.zzq     // Catch: java.io.IOException -> L8e
            long r0 = (long) r4     // Catch: java.io.IOException -> L8e
            long r9 = r9 + r0
            r8.zzq = r9     // Catch: java.io.IOException -> L8e
            r8.zzg(r4)     // Catch: java.io.IOException -> L8e
        L8d:
            return r4
        L8e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzfz r10 = new com.google.android.gms.internal.ads.zzfz
            com.google.android.gms.internal.ads.zzfl r11 = r8.zzi
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 2
            r10.<init>(r9, r11, r0, r1)
            goto L9b
        L9a:
            throw r10
        L9b:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.zza(byte[], int, int):int");
    }
}
