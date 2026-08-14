package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdd extends zzccu implements zzcaz {
    public static final /* synthetic */ int zzd = 0;
    private zzcba zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccm zzi;
    private long zzj;
    private long zzk;

    public zzcdd(zzcbj zzcbjVar, zzcbi zzcbiVar) {
        super(zzcbjVar);
        zzcdv zzcdvVar = new zzcdv(zzcbjVar.getContext(), zzcbiVar, (zzcbj) this.zzc.get());
        zzbza.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcdvVar;
        zzcdvVar.zzK(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzbyt.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzccu, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcba zzcbaVar = this.zze;
        if (zzcbaVar != null) {
            zzcbaVar.zzK(null);
            this.zze.zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzC(int i, int i2) {
    }

    public final zzcba zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzK(null);
        zzcba zzcbaVar = this.zze;
        this.zze = null;
        return zzcbaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.zzccu, com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzccu, com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    final /* synthetic */ void zzb() throws Throwable {
        ?? r6;
        ?? BooleanValue;
        ?? r3;
        ?? LongValue;
        long jIntValue;
        ?? r32;
        long j;
        long j2;
        String str;
        long j3;
        String strZzc = zzc(this.zzf);
        ?? r17 = "error";
        try {
            LongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzv)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzu)).intValue();
            BooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            r6 = strZzc;
            BooleanValue = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) > LongValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzj) == LongValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzT()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = this.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = this.zze.zzv();
                                if (jZzv != this.zzk) {
                                    try {
                                        j2 = jIntValue;
                                        str = strZzc;
                                        try {
                                            zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, BooleanValue != 0 ? this.zze.zzA() : -1L, BooleanValue != 0 ? this.zze.zzx() : -1L, BooleanValue != 0 ? this.zze.zzB() : -1L, zzcba.zzs(), zzcba.zzu());
                                            BooleanValue = this;
                                            j = jZzv;
                                            try {
                                                BooleanValue.zzk = j;
                                                j3 = jZzz;
                                                BooleanValue = BooleanValue;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r6 = str;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            BooleanValue = this;
                                            r6 = str;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str = strZzc;
                                        BooleanValue = this;
                                    }
                                } else {
                                    j = jZzv;
                                    j2 = jIntValue;
                                    str = strZzc;
                                    BooleanValue = this;
                                    j3 = jZzz;
                                }
                                if (j >= j3) {
                                    BooleanValue.zzj(BooleanValue.zzf, str, j3);
                                    r3 = BooleanValue;
                                } else {
                                    long jZzw = BooleanValue.zze.zzw();
                                    r32 = BooleanValue;
                                    if (jZzw >= j2) {
                                        r32 = BooleanValue;
                                        if (j > 0) {
                                            r3 = BooleanValue;
                                        }
                                    }
                                }
                            } else {
                                r32 = this;
                            }
                            r32.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzw)).longValue());
                            return;
                        }
                        r3 = this;
                        com.google.android.gms.ads.internal.zzt.zzy().zzc(r3.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        r17 = LongValue;
                        r6 = i;
                    }
                } else {
                    r6 = strZzc;
                    BooleanValue = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + LongValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        r17 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                r6 = strZzc;
                BooleanValue = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                ?? r1 = r17;
                zzbza.zzj("Failed to preload url " + BooleanValue.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                release();
                BooleanValue.zzg(BooleanValue.zzf, r6, r1, zzd(r1, e));
                r3 = BooleanValue;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(r3.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzi(final boolean z, final long j) {
        final zzcbj zzcbjVar = (zzcbj) this.zzc.get();
        if (zzcbjVar != null) {
            zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbj zzcbjVar2 = zzcbjVar;
                    boolean z2 = z;
                    long j2 = j;
                    int i = zzcdd.zzd;
                    zzcbjVar2.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(String str, Exception exc) {
        zzbza.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzl(String str, Exception exc) {
        zzbza.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzp(int i) {
        this.zze.zzI(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzq(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzr(int i) {
        this.zze.zzL(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzs(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcbj] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzccu, com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcdd] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzccu] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        long j5;
        String str3;
        long j6;
        ?? r12;
        ?? r15 = this;
        ?? r13 = str;
        r15.zzf = r13;
        ?? r17 = "error";
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            r15.zze.zzE(uriArr, r15.zzb);
            ?? r0 = (zzcbj) r15.zzc.get();
            if (r0 != 0) {
                r0.zzt(strZzc, r15);
            }
            Clock clockZzB = com.google.android.gms.ads.internal.zzt.zzB();
            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzw)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzv)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzu)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue();
            ?? r14 = -1;
            long j7 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (r15.zzh) {
                            break;
                        }
                        if (!r15.zze.zzT()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzz = r15.zze.zzz();
                        if (jZzz > 0) {
                            long jZzv = r15.zze.zzv();
                            if (jZzv != r14) {
                                try {
                                    j4 = j7;
                                    long j8 = jZzz;
                                    j2 = jLongValue2;
                                    j5 = jLongValue;
                                    str3 = strZzc;
                                    try {
                                        zzo(str, strZzc, jZzv, j8, jZzv > 0, zBooleanValue ? r15.zze.zzA() : -1L, zBooleanValue ? r15.zze.zzx() : -1L, zBooleanValue ? r15.zze.zzB() : -1L, zzcba.zzs(), zzcba.zzu());
                                        r12 = jZzv;
                                        j6 = jZzz;
                                        r6 = j8;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = this;
                                        r6 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            ?? r16 = r17;
                                            zzbza.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r5.zzg(r6, str2, r16, zzd(r16, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str3 = strZzc;
                                }
                            } else {
                                j4 = j7;
                                j2 = jLongValue2;
                                j5 = jLongValue;
                                str3 = strZzc;
                                j6 = jZzz;
                                r12 = r14;
                                r6 = j7;
                            }
                            r5 = (jZzv > j6 ? 1 : (jZzv == j6 ? 0 : -1));
                            if (r5 >= 0) {
                                zzj(str, str3, j6);
                            } else {
                                try {
                                    zzcdd zzcddVar = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzcddVar.zze.zzw() < j4 || jZzv <= 0) {
                                        j3 = j5;
                                        r1 = r12;
                                        r5 = zzcddVar;
                                        j = j4;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j7;
                            j2 = jLongValue2;
                            r6 = r13;
                            str2 = strZzc;
                            r5 = r15;
                            j3 = jLongValue;
                            r1 = r14;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r17 = r1;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = r13;
                        str2 = strZzc;
                        r5 = r15;
                    }
                }
                jLongValue = j3;
                r15 = r5;
                r13 = r6;
                strZzc = str2;
                j7 = j;
                jLongValue2 = j2;
                r14 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = r13;
            str2 = strZzc;
            r5 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzv() {
        zzbza.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final boolean zzw(String str, String[] strArr, zzccm zzccmVar) {
        this.zzf = str;
        this.zzi = zzccmVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzE(uriArr, this.zzb);
            zzcbj zzcbjVar = (zzcbj) this.zzc.get();
            if (zzcbjVar != null) {
                zzcbjVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            zzbza.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }
}
