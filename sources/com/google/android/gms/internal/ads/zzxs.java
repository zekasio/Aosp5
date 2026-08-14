package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.tapjoy.TJAdUnitConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxs extends zzra {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private zzda zzD;
    private zzda zzE;
    private int zzF;
    private zzxw zzG;
    private final Context zze;
    private final zzyd zzf;
    private final zzyo zzg;
    private final zzxr zzh;
    private final boolean zzi;
    private zzxq zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzxv zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzxs(Context context, zzqt zzqtVar, zzrc zzrcVar, long j, boolean z, Handler handler, zzyp zzypVar, int i, float f) {
        super(2, zzqtVar, zzrcVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzyd zzydVar = new zzyd(applicationContext);
        this.zzf = zzydVar;
        this.zzg = new zzyo(handler, zzypVar);
        this.zzh = new zzxr(zzydVar, this);
        this.zzi = "NVIDIA".equals(zzew.zzc);
        this.zzu = -9223372036854775807L;
        this.zzp = 1;
        this.zzD = zzda.zza;
        this.zzF = 0;
        this.zzE = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzT(com.google.android.gms.internal.ads.zzqx r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzT(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf):int");
    }

    protected static int zzU(zzqx zzqxVar, zzaf zzafVar) {
        if (zzafVar.zzn == -1) {
            return zzT(zzqxVar, zzafVar);
        }
        int size = zzafVar.zzo.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzafVar.zzo.get(i)).length;
        }
        return zzafVar.zzn + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083 A[Catch: all -> 0x07ad, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:514:0x07a5, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x0791, B:515:0x07a9), top: B:523:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaD(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzaD(java.lang.String):boolean");
    }

    private static List zzaE(Context context, zzrc zzrcVar, zzaf zzafVar, boolean z, boolean z2) throws zzrj {
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        List listZzf = zzrp.zzf(str, z, z2);
        String strZze = zzrp.zze(zzafVar);
        if (strZze == null) {
            return zzfqk.zzm(listZzf);
        }
        List listZzf2 = zzrp.zzf(strZze, z, z2);
        if (zzew.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzm) && !listZzf2.isEmpty() && !zzxp.zza(context)) {
            return zzfqk.zzm(listZzf2);
        }
        zzfqh zzfqhVarZzi = zzfqk.zzi();
        zzfqhVarZzi.zzh(listZzf);
        zzfqhVarZzi.zzh(listZzf2);
        return zzfqhVarZzi.zzi();
    }

    private final void zzaF(zzda zzdaVar) {
        if (zzdaVar.equals(zzda.zza) || zzdaVar.equals(this.zzE)) {
            return;
        }
        this.zzE = zzdaVar;
        this.zzg.zzt(zzdaVar);
    }

    private final void zzaG() {
        zzda zzdaVar = this.zzE;
        if (zzdaVar != null) {
            this.zzg.zzt(zzdaVar);
        }
    }

    private final void zzaH() {
        Surface surface = this.zzm;
        zzxv zzxvVar = this.zzn;
        if (surface == zzxvVar) {
            this.zzm = null;
        }
        zzxvVar.release();
        this.zzn = null;
    }

    private static boolean zzaI(long j) {
        return j < -30000;
    }

    private final boolean zzaJ(zzqx zzqxVar) {
        if (zzew.zza < 23 || zzaD(zzqxVar.zza)) {
            return false;
        }
        return !zzqxVar.zzf || zzxv.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    public final void zzD(float f, float f2) throws zzhj {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    @Override // com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzko
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzN() {
        zzxv zzxvVar;
        if (super.zzN() && (this.zzq || (((zzxvVar = this.zzn) != null && this.zzm == zzxvVar) || zzaj() == null))) {
            this.zzu = -9223372036854775807L;
            return true;
        }
        if (this.zzu == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzu) {
            return true;
        }
        this.zzu = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        float fMax = -1.0f;
        for (zzaf zzafVar2 : zzafVarArr) {
            float f2 = zzafVar2.zzt;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj {
        boolean z;
        if (!zzbt.zzh(zzafVar.zzm)) {
            return 128;
        }
        int i = 0;
        boolean z2 = zzafVar.zzp != null;
        List listZzaE = zzaE(this.zze, zzrcVar, zzafVar, z2, false);
        if (z2 && listZzaE.isEmpty()) {
            listZzaE = zzaE(this.zze, zzrcVar, zzafVar, false, false);
        }
        if (listZzaE.isEmpty()) {
            return 129;
        }
        if (!zzaw(zzafVar)) {
            return 130;
        }
        zzqx zzqxVar = (zzqx) listZzaE.get(0);
        boolean zZze = zzqxVar.zze(zzafVar);
        if (zZze) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listZzaE.size(); i2++) {
                zzqx zzqxVar2 = (zzqx) listZzaE.get(i2);
                if (zzqxVar2.zze(zzafVar)) {
                    zzqxVar = zzqxVar2;
                    z = false;
                    zZze = true;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zZze ? 3 : 4;
        int i4 = true != zzqxVar.zzf(zzafVar) ? 8 : 16;
        int i5 = true != zzqxVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (zzew.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzm) && !zzxp.zza(this.zze)) {
            i6 = 256;
        }
        if (zZze) {
            List listZzaE2 = zzaE(this.zze, zzrcVar, zzafVar, z2, true);
            if (!listZzaE2.isEmpty()) {
                zzqx zzqxVar3 = (zzqx) zzrp.zzg(listZzaE2, zzafVar).get(0);
                if (zzqxVar3.zze(zzafVar) && zzqxVar3.zzf(zzafVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzhc zzhcVarZzb = zzqxVar.zzb(zzafVar, zzafVar2);
        int i3 = zzhcVarZzb.zze;
        int i4 = zzafVar2.zzr;
        zzxq zzxqVar = this.zzj;
        if (i4 > zzxqVar.zza || zzafVar2.zzs > zzxqVar.zzb) {
            i3 |= 256;
        }
        if (zzU(zzqxVar, zzafVar2) > this.zzj.zzc) {
            i3 |= 64;
        }
        String str = zzqxVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhcVarZzb.zzd;
            i2 = 0;
        }
        return new zzhc(str, zzafVar, zzafVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzhc zzS(zzjo zzjoVar) throws zzhj {
        zzhc zzhcVarZzS = super.zzS(zzjoVar);
        this.zzg.zzf(zzjoVar.zza, zzhcVarZzS);
        return zzhcVarZzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        if (true == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (true == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011c, code lost:
    
        r3 = new android.graphics.Point(r13, r4);
     */
    @Override // com.google.android.gms.internal.ads.zzra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzqs zzV(com.google.android.gms.internal.ads.zzqx r20, com.google.android.gms.internal.ads.zzaf r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzV(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqs");
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj {
        return zzrp.zzg(zzaE(this.zze, zzrcVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzX(Exception exc) {
        zzee.zzc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzY(String str, zzqs zzqsVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzk = zzaD(str);
        zzqx zzqxVarZzal = zzal();
        zzqxVarZzal.getClass();
        boolean z = false;
        if (zzew.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzqxVarZzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = zzqxVarZzal.zzh();
            int length = codecProfileLevelArrZzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzl = z;
        this.zzh.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    protected final void zzaA(zzqu zzquVar, int i, long j) {
        int i2 = zzew.zza;
        Trace.beginSection("skipVideoBuffer");
        zzquVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaB(int i, int i2) {
        zzhb zzhbVar = this.zza;
        zzhbVar.zzh += i;
        int i3 = i + i2;
        zzhbVar.zzg += i3;
        this.zzw += i3;
        int i4 = this.zzx + i3;
        this.zzx = i4;
        zzhbVar.zzi = Math.max(i4, zzhbVar.zzi);
    }

    protected final void zzaC(long j) {
        zzhb zzhbVar = this.zza;
        zzhbVar.zzk += j;
        zzhbVar.zzl++;
        this.zzB += j;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzaa(zzaf zzafVar, MediaFormat mediaFormat) {
        zzqu zzquVarZzaj = zzaj();
        if (zzquVarZzaj != null) {
            zzquVarZzaj.zzq(this.zzp);
        }
        mediaFormat.getClass();
        int i = 0;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(TJAdUnitConstants.String.WIDTH);
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(TJAdUnitConstants.String.HEIGHT);
        float f = zzafVar.zzv;
        if (zzew.zza >= 21) {
            int i2 = zzafVar.zzu;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
        } else {
            i = zzafVar.zzu;
        }
        this.zzD = new zzda(integer, integer2, i, f);
        this.zzf.zzc(zzafVar.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzac() {
        this.zzq = false;
        int i = zzew.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzad(zzgr zzgrVar) throws zzhj {
        this.zzy++;
        int i = zzew.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzqv zzak(Throwable th, zzqx zzqxVar) {
        return new zzxo(th, zzqxVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzam(zzgr zzgrVar) throws zzhj {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzgrVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzqu zzquVarZzaj = zzaj();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzquVarZzaj.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzao(long j) {
        super.zzao(j);
        this.zzy--;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzap(zzaf zzafVar) throws zzhj {
        this.zzh.zzb(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzar() {
        super.zzar();
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final boolean zzav(zzqx zzqxVar) {
        return this.zzm != null || zzaJ(zzqxVar);
    }

    final void zzax() {
        this.zzs = true;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        this.zzg.zzq(this.zzm);
        this.zzo = true;
    }

    protected final void zzay(zzqu zzquVar, int i, long j) {
        zzaF(this.zzD);
        int i2 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzquVar.zzn(i, true);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzax();
    }

    protected final void zzaz(zzqu zzquVar, int i, long j, long j2) {
        zzaF(this.zzD);
        int i2 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzquVar.zzm(i, j2);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzs() {
        this.zzE = null;
        this.zzq = false;
        int i = zzew.zza;
        this.zzo = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzt(boolean z, boolean z2) throws zzhj {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(this.zza);
        this.zzr = z2;
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzu(long j, boolean z) throws zzhj {
        super.zzu(j, z);
        this.zzq = false;
        int i = zzew.zza;
        this.zzf.zzf();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzv() {
        try {
            super.zzv();
            if (this.zzn != null) {
                zzaH();
            }
        } catch (Throwable th) {
            if (this.zzn != null) {
                zzaH();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    protected final void zzw() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    protected final void zzx() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, jElapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = jElapsedRealtime;
        }
        int i = this.zzC;
        if (i != 0) {
            this.zzg.zzr(this.zzB, i);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzqu] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.zzyd] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.gms.internal.ads.zzxv] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkj
    public final void zzp(int i, Object obj) throws zzhj {
        if (i != 1) {
            if (i == 7) {
                this.zzG = (zzxw) obj;
                return;
            }
            if (i == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.zzF != iIntValue) {
                    this.zzF = iIntValue;
                    return;
                }
                return;
            }
            if (i == 13) {
                obj.getClass();
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int iIntValue2 = ((Integer) obj).intValue();
                this.zzp = iIntValue2;
                zzqu zzquVarZzaj = zzaj();
                if (zzquVarZzaj != null) {
                    zzquVarZzaj.zzq(iIntValue2);
                    return;
                }
                return;
            }
        }
        ?? Zza = obj instanceof Surface ? (Surface) obj : 0;
        if (Zza == 0) {
            zzxv zzxvVar = this.zzn;
            if (zzxvVar != null) {
                Zza = zzxvVar;
            } else {
                zzqx zzqxVarZzal = zzal();
                if (zzqxVarZzal != null && zzaJ(zzqxVarZzal)) {
                    Zza = zzxv.zza(this.zze, zzqxVarZzal.zzf);
                    this.zzn = Zza;
                }
            }
        }
        if (this.zzm == Zza) {
            if (Zza == 0 || Zza == this.zzn) {
                return;
            }
            zzaG();
            if (this.zzo) {
                this.zzg.zzq(this.zzm);
                return;
            }
            return;
        }
        this.zzm = Zza;
        this.zzf.zzi(Zza);
        this.zzo = false;
        int iZzbc = zzbc();
        ?? Zzaj = zzaj();
        if (Zzaj != 0) {
            if (zzew.zza < 23 || Zza == 0 || this.zzk) {
                zzaq();
                zzan();
            } else {
                Zzaj.zzo(Zza);
            }
        }
        if (Zza == 0 || Zza == this.zzn) {
            this.zzE = null;
            this.zzq = false;
            int i2 = zzew.zza;
        } else {
            zzaG();
            this.zzq = false;
            int i3 = zzew.zza;
            if (iZzbc == 2) {
                this.zzu = -9223372036854775807L;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final boolean zzaf(long j, long j2, zzqu zzquVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj {
        boolean z3;
        int iZzd;
        zzquVar.getClass();
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j;
        }
        if (j3 != this.zzz) {
            this.zzf.zzd(j3);
            this.zzz = j3;
        }
        long jZzai = zzai();
        long j4 = j3 - jZzai;
        if (z && !z2) {
            zzaA(zzquVar, i, j4);
            return true;
        }
        boolean z4 = zzbc() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double dZzah = zzah();
        double d = j3 - j;
        Double.isNaN(d);
        Double.isNaN(dZzah);
        long j5 = (long) (d / dZzah);
        if (z4) {
            j5 -= jElapsedRealtime - j2;
        }
        if (this.zzm == this.zzn) {
            if (!zzaI(j5)) {
                return false;
            }
            zzaA(zzquVar, i, j4);
            zzaC(j5);
            return true;
        }
        long j6 = jElapsedRealtime - this.zzA;
        boolean z5 = this.zzs ? !this.zzq : z4 || this.zzr;
        if (this.zzu == -9223372036854775807L && j >= jZzai && (z5 || (z4 && zzaI(j5) && j6 > 100000))) {
            long jNanoTime = System.nanoTime();
            if (zzew.zza >= 21) {
                zzaz(zzquVar, i, j4, jNanoTime);
            } else {
                zzay(zzquVar, i, j4);
            }
            zzaC(j5);
            return true;
        }
        if (!z4 || j == this.zzt) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jZza = this.zzf.zza((j5 * 1000) + jNanoTime2);
        long j7 = (jZza - jNanoTime2) / 1000;
        long j8 = this.zzu;
        if (j7 < -500000 && !z2 && (iZzd = zzd(j)) != 0) {
            if (j8 != -9223372036854775807L) {
                zzhb zzhbVar = this.zza;
                zzhbVar.zzd += iZzd;
                zzhbVar.zzf += this.zzy;
            } else {
                this.zza.zzj++;
                zzaB(iZzd, this.zzy);
            }
            zzat();
            return false;
        }
        if (zzaI(j7) && !z2) {
            if (j8 != -9223372036854775807L) {
                zzaA(zzquVar, i, j4);
                z3 = true;
            } else {
                int i4 = zzew.zza;
                Trace.beginSection("dropVideoBuffer");
                zzquVar.zzn(i, false);
                Trace.endSection();
                z3 = true;
                zzaB(0, 1);
            }
            zzaC(j7);
            return z3;
        }
        if (zzew.zza >= 21) {
            if (j7 >= 50000) {
                return false;
            }
            zzaz(zzquVar, i, j4, jZza);
            zzaC(j7);
            return true;
        }
        if (j7 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return false;
        }
        if (j7 > 11000) {
            try {
                Thread.sleep(((-10000) + j7) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        zzay(zzquVar, i, j4);
        zzaC(j7);
        return true;
    }
}
