package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdy extends zzfa implements zzgd {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzgc zzf;
    private zzfl zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    zzcdy(String str, zzgi zzgiVar, int i, int i2, long j, long j2) {
        super(true);
        zzdl.zzc(str);
        this.zze = str;
        this.zzf = new zzgc();
        this.zzc = i;
        this.zzd = i2;
        this.zzi = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
        if (zzgiVar != null) {
            zzf(zzgiVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e) {
                zzbza.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfz {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzo + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzs;
            long j6 = this.zzq;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzp;
                if (j6 < j8) {
                    long jMin = Math.min(j8, Math.max(((this.zzr + j7) - r3) - 1, (-1) + j7 + j4));
                    zzk(j7, jMin, 2);
                    this.zzq = jMin;
                    j6 = jMin;
                }
            }
            int i3 = this.zzj.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.zzn += (long) i3;
            zzg(i3);
            return i3;
        } catch (IOException e) {
            throw new zzfz(e, this.zzg, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws zzfz {
        this.zzg = zzflVar;
        this.zzn = 0L;
        long j = zzflVar.zzf;
        long j2 = zzflVar.zzg;
        long jMin = j2 == -1 ? this.zzr : Math.min(this.zzr, j2);
        this.zzo = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzh = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = zzflVar.zzg;
                    if (j5 != -1) {
                        this.zzm = j5;
                        this.zzp = Math.max(j3, (this.zzo + j5) - 1);
                    } else {
                        this.zzm = j4 - this.zzo;
                        this.zzp = j4 - 1;
                    }
                    this.zzq = j3;
                    this.zzk = true;
                    zzj(zzflVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzbza.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcdw(headerField, zzflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws zzfz {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzfz(e, this.zzg, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfa, com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j, long j2, int i) throws zzfz {
        String string = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", HTTP.IDENTITY_CODING);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String string2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcdx(this.zzl, headerFields, this.zzg, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    zzl();
                    throw new zzfz(e, this.zzg, 2000, i);
                }
            } catch (IOException e2) {
                zzl();
                throw new zzfz("Unable to connect to ".concat(String.valueOf(string2)), e2, this.zzg, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzfz("Unable to connect to ".concat(String.valueOf(string)), e3, this.zzg, 2000, i);
        }
    }
}
