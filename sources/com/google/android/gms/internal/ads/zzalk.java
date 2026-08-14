package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalk implements zzajy {
    private final zzalj zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzalk(zzalj zzaljVar, int i) {
        this.zzc = zzaljVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    static String zzh(zzali zzaliVar) throws IOException {
        return new String(zzm(zzaliVar, zzf(zzaliVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzali zzaliVar, long j) throws IOException {
        long jZza = zzaliVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaliVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jZza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzalh zzalhVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzalhVar.zza - ((zzalh) this.zza.get(str)).zza;
        } else {
            this.zzb += zzalhVar.zza;
        }
        this.zza.put(str, zzalhVar);
    }

    private final void zzp(String str) {
        zzalh zzalhVar = (zzalh) this.zza.remove(str);
        if (zzalhVar != null) {
            this.zzb -= zzalhVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final synchronized zzajx zza(String str) {
        zzalh zzalhVar = (zzalh) this.zza.get(str);
        if (zzalhVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzali zzaliVar = new zzali(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzalh zzalhVarZza = zzalh.zza(zzaliVar);
                if (!TextUtils.equals(str, zzalhVarZza.zzb)) {
                    zzala.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzalhVarZza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] bArrZzm = zzm(zzaliVar, zzaliVar.zza());
                zzajx zzajxVar = new zzajx();
                zzajxVar.zza = bArrZzm;
                zzajxVar.zzb = zzalhVar.zzc;
                zzajxVar.zzc = zzalhVar.zzd;
                zzajxVar.zzd = zzalhVar.zze;
                zzajxVar.zze = zzalhVar.zzf;
                zzajxVar.zzf = zzalhVar.zzg;
                List<zzakg> list = zzalhVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzakg zzakgVar : list) {
                    treeMap.put(zzakgVar.zza(), zzakgVar.zzb());
                }
                zzajxVar.zzg = treeMap;
                zzajxVar.zzh = Collections.unmodifiableList(zzalhVar.zzh);
                return zzajxVar;
            } finally {
                zzaliVar.close();
            }
        } catch (IOException e) {
            zzala.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final synchronized void zzb() {
        File fileZza = this.zzc.zza();
        if (!fileZza.exists()) {
            if (fileZza.mkdirs()) {
                return;
            }
            zzala.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileZza.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    zzali zzaliVar = new zzali(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        zzalh zzalhVarZza = zzalh.zza(zzaliVar);
                        zzalhVarZza.zza = length;
                        zzo(zzalhVarZza.zzb, zzalhVarZza);
                        zzaliVar.close();
                    } catch (Throwable th) {
                        zzaliVar.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final synchronized void zzc(String str, boolean z) {
        zzajx zzajxVarZza = zza(str);
        if (zzajxVarZza != null) {
            zzajxVarZza.zzf = 0L;
            zzajxVarZza.zze = 0L;
            zzd(str, zzajxVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final synchronized void zzd(String str, zzajx zzajxVar) {
        long j;
        long j2 = this.zzb;
        int length = zzajxVar.zza.length;
        long j3 = j2 + ((long) length);
        int i = this.zzd;
        if (j3 <= i || length <= i * 0.9f) {
            File fileZzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                zzalh zzalhVar = new zzalh(str, zzajxVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzalhVar.zzb);
                    String str2 = zzalhVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzalhVar.zzd);
                    zzk(bufferedOutputStream, zzalhVar.zze);
                    zzk(bufferedOutputStream, zzalhVar.zzf);
                    zzk(bufferedOutputStream, zzalhVar.zzg);
                    List<zzakg> list = zzalhVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzakg zzakgVar : list) {
                            zzl(bufferedOutputStream, zzakgVar.zza());
                            zzl(bufferedOutputStream, zzakgVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzajxVar.zza);
                    bufferedOutputStream.close();
                    zzalhVar.zza = fileZzg.length();
                    zzo(str, zzalhVar);
                    if (this.zzb >= this.zzd) {
                        if (zzala.zzb) {
                            zzala.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.zzb;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = jElapsedRealtime;
                                break;
                            }
                            zzalh zzalhVar2 = (zzalh) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzalhVar2.zzb).delete()) {
                                j = jElapsedRealtime;
                                this.zzb -= zzalhVar2.zza;
                            } else {
                                j = jElapsedRealtime;
                                String str3 = zzalhVar2.zzb;
                                zzala.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            } else {
                                jElapsedRealtime = j;
                            }
                        }
                        if (zzala.zzb) {
                            zzala.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (IOException e) {
                    zzala.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzala.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileZzg.delete()) {
                    zzala.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzala.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzala.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzalk(File file, int i) {
        this.zzc = new zzalg(this, file);
    }
}
