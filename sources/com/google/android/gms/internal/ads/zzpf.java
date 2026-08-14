package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpf implements zzoi {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private byte[] zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzl zzS;
    private zzor zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private final zzov zzX;
    private final zznq zzd;
    private final zzon zze;
    private final zzpo zzf;
    private final zzfqk zzg;
    private final zzfqk zzh;
    private final zzdo zzi;
    private final zzom zzj;
    private final ArrayDeque zzk;
    private zzpd zzl;
    private final zzoy zzm;
    private final zzoy zzn;
    private final zzos zzo;
    private zzno zzp;
    private zzof zzq;
    private zzou zzr;
    private zzou zzs;
    private zzdb zzt;
    private AudioTrack zzu;
    private zzk zzv;
    private zzox zzw;
    private zzox zzx;
    private final zzby zzy;
    private long zzz;

    /* synthetic */ zzpf(zzot zzotVar, zzpe zzpeVar) {
        this.zzd = zzotVar.zzb;
        this.zzX = zzotVar.zzc;
        int i = zzew.zza;
        this.zzo = zzotVar.zza;
        zzdo zzdoVar = new zzdo(zzdm.zza);
        this.zzi = zzdoVar;
        zzdoVar.zze();
        this.zzj = new zzom(new zzpa(this, null));
        zzon zzonVar = new zzon();
        this.zze = zzonVar;
        zzpo zzpoVar = new zzpo();
        this.zzf = zzpoVar;
        this.zzg = zzfqk.zzr(new zzdi(), zzonVar, zzpoVar);
        this.zzh = zzfqk.zzp(new zzpn());
        this.zzH = 1.0f;
        this.zzv = zzk.zza;
        this.zzR = 0;
        this.zzS = new zzl(0, 0.0f);
        this.zzx = new zzox(zzby.zza, false, 0L, 0L, null);
        this.zzy = zzby.zza;
        this.zzk = new ArrayDeque();
        this.zzm = new zzoy(100L);
        this.zzn = new zzoy(100L);
    }

    static /* synthetic */ void zzD(AudioTrack audioTrack, zzdo zzdoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdoVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzdoVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        zzou zzouVar = this.zzs;
        return zzouVar.zzc == 0 ? this.zzz / ((long) zzouVar.zzb) : this.zzA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzG() {
        zzou zzouVar = this.zzs;
        return zzouVar.zzc == 0 ? this.zzB / ((long) zzouVar.zzd) : this.zzC;
    }

    private final AudioTrack zzH(zzou zzouVar) throws zzoe {
        try {
            return zzouVar.zzb(false, this.zzv, this.zzR);
        } catch (zzoe e) {
            zzof zzofVar = this.zzq;
            if (zzofVar != null) {
                zzofVar.zza(e);
            }
            throw e;
        }
    }

    private final zzox zzI() {
        zzox zzoxVar = this.zzw;
        return zzoxVar != null ? zzoxVar : !this.zzk.isEmpty() ? (zzox) this.zzk.getLast() : this.zzx;
    }

    private final void zzJ(long j) {
        zzby zzbyVar;
        boolean z;
        if (zzT()) {
            zzov zzovVar = this.zzX;
            zzbyVar = zzI().zza;
            zzovVar.zzc(zzbyVar);
        } else {
            zzbyVar = zzby.zza;
        }
        zzby zzbyVar2 = zzbyVar;
        if (zzT()) {
            zzov zzovVar2 = this.zzX;
            z = zzI().zzb;
            zzovVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzk.add(new zzox(zzbyVar2, z, Math.max(0L, j), this.zzs.zza(zzG()), null));
        zzO();
        zzof zzofVar = this.zzq;
        if (zzofVar != null) {
            ((zzpk) zzofVar).zza.zzc.zzs(z);
        }
    }

    private final void zzK() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzj.zzc(zzG());
        this.zzu.stop();
    }

    private final void zzL(long j) throws Exception {
        ByteBuffer byteBufferZzb;
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzI;
            if (byteBuffer == null) {
                byteBuffer = zzde.zza;
            }
            zzP(byteBuffer, j);
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                byteBufferZzb = this.zzt.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzP(byteBufferZzb, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzI;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zze(this.zzI);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void zzM(zzby zzbyVar, boolean z) {
        zzox zzoxVarZzI = zzI();
        if (zzbyVar.equals(zzoxVarZzI.zza) && z == zzoxVarZzI.zzb) {
            return;
        }
        zzox zzoxVar = new zzox(zzbyVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzR()) {
            this.zzw = zzoxVar;
        } else {
            this.zzx = zzoxVar;
        }
    }

    private final void zzN() {
        if (zzR()) {
            if (zzew.zza >= 21) {
                this.zzu.setVolume(this.zzH);
                return;
            }
            AudioTrack audioTrack = this.zzu;
            float f = this.zzH;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzO() {
        zzdb zzdbVar = this.zzs.zzi;
        this.zzt = zzdbVar;
        zzdbVar.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        zzof zzofVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzK;
            if (byteBuffer2 != null) {
                zzdl.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzK = byteBuffer;
                if (zzew.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.zzL;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.zzL = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.zzL, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.zzM = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (zzew.zza < 21) {
                int iZza = this.zzj.zza(this.zzB);
                if (iZza > 0) {
                    iWrite = this.zzu.write(this.zzL, this.zzM, Math.min(iRemaining2, iZza));
                    if (iWrite > 0) {
                        this.zzM += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.zzu.write(byteBuffer, iRemaining2, 1);
            }
            this.zzU = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                zzoh zzohVar = new zzoh(iWrite, this.zzs.zza, ((zzew.zza >= 24 && iWrite == -6) || iWrite == -32) && this.zzC > 0);
                zzof zzofVar2 = this.zzq;
                if (zzofVar2 != null) {
                    zzofVar2.zza(zzohVar);
                }
                if (zzohVar.zzb) {
                    throw zzohVar;
                }
                this.zzn.zzb(zzohVar);
                return;
            }
            this.zzn.zza();
            if (zzS(this.zzu)) {
                if (this.zzC > 0) {
                    this.zzW = false;
                }
                if (this.zzP && (zzofVar = this.zzq) != null && iWrite < iRemaining2 && !this.zzW) {
                    zzpl zzplVar = ((zzpk) zzofVar).zza;
                    if (zzplVar.zzl != null) {
                        zzplVar.zzl.zza();
                    }
                }
            }
            int i = this.zzs.zzc;
            if (i == 0) {
                this.zzB += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i != 0) {
                    zzdl.zzf(byteBuffer == this.zzI);
                    this.zzC += ((long) this.zzD) * ((long) this.zzJ);
                }
                this.zzK = null;
            }
        }
    }

    private final boolean zzQ() throws Exception {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer == null) {
                return true;
            }
            zzP(byteBuffer, Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzt.zzd();
        zzL(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzK;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzR() {
        return this.zzu != null;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        return zzew.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzT() {
        if (!"audio/raw".equals(this.zzs.zza.zzm)) {
            return false;
        }
        int i = this.zzs.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final int zza(zzaf zzafVar) {
        if (!"audio/raw".equals(zzafVar.zzm)) {
            if (!this.zzV) {
                int i = zzew.zza;
            }
            return this.zzd.zza(zzafVar) != null ? 2 : 0;
        }
        if (zzew.zzW(zzafVar.zzB)) {
            return zzafVar.zzB != 2 ? 1 : 2;
        }
        zzee.zze("DefaultAudioSink", "Invalid PCM encoding: " + zzafVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final long zzb(boolean z) {
        long jZzs;
        if (!zzR() || this.zzF) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zzb(z), this.zzs.zza(zzG()));
        while (!this.zzk.isEmpty() && jMin >= ((zzox) this.zzk.getFirst()).zzd) {
            this.zzx = (zzox) this.zzk.remove();
        }
        zzox zzoxVar = this.zzx;
        long j = jMin - zzoxVar.zzd;
        if (zzoxVar.zza.equals(zzby.zza)) {
            jZzs = this.zzx.zzc + j;
        } else if (this.zzk.isEmpty()) {
            jZzs = this.zzX.zza(j) + this.zzx.zzc;
        } else {
            zzox zzoxVar2 = (zzox) this.zzk.getFirst();
            jZzs = zzoxVar2.zzc - zzew.zzs(zzoxVar2.zzd - jMin, this.zzx.zza.zzc);
        }
        return jZzs + this.zzs.zza(this.zzX.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final zzby zzc() {
        return zzI().zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    @Override // com.google.android.gms.internal.ads.zzoi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzaf r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzod {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzd(com.google.android.gms.internal.ads.zzaf, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zze() {
        if (zzR()) {
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzW = false;
            this.zzD = 0;
            this.zzx = new zzox(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzG = 0L;
            this.zzw = null;
            this.zzk.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzO = false;
            this.zzN = false;
            this.zzf.zzp();
            zzO();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzS(this.zzu)) {
                zzpd zzpdVar = this.zzl;
                zzpdVar.getClass();
                zzpdVar.zzb(this.zzu);
            }
            if (zzew.zza < 21 && !this.zzQ) {
                this.zzR = 0;
            }
            zzou zzouVar = this.zzr;
            if (zzouVar != null) {
                this.zzs = zzouVar;
                this.zzr = null;
            }
            this.zzj.zzd();
            final AudioTrack audioTrack = this.zzu;
            final zzdo zzdoVar = this.zzi;
            zzdoVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzew.zzR("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpf.zzD(audioTrack, zzdoVar);
                    }
                });
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzf() {
        this.zzE = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzg() {
        this.zzP = false;
        if (zzR() && this.zzj.zzk()) {
            this.zzu.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzh() {
        this.zzP = true;
        if (zzR()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzi() throws zzoh {
        if (!this.zzN && zzR() && zzQ()) {
            zzK();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzj() {
        zze();
        zzfqk zzfqkVar = this.zzg;
        int size = zzfqkVar.size();
        for (int i = 0; i < size; i++) {
            ((zzde) zzfqkVar.get(i)).zzf();
        }
        zzfqk zzfqkVar2 = this.zzh;
        int size2 = zzfqkVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzde) zzfqkVar2.get(i2)).zzf();
        }
        zzdb zzdbVar = this.zzt;
        if (zzdbVar != null) {
            zzdbVar.zzf();
        }
        this.zzP = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzk(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzl(int i) {
        if (this.zzR != i) {
            this.zzR = i;
            this.zzQ = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzm(zzl zzlVar) {
        if (this.zzS.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        float f = zzlVar.zzb;
        if (this.zzu != null) {
            int i2 = this.zzS.zza;
        }
        this.zzS = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzn(zzof zzofVar) {
        this.zzq = zzofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzo(zzby zzbyVar) {
        zzM(new zzby(zzew.zza(zzbyVar.zzc, 0.1f, 8.0f), zzew.zza(zzbyVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzp(zzno zznoVar) {
        this.zzp = zznoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzr(boolean z) {
        zzM(zzI().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzs(float f) {
        if (this.zzH != f) {
            this.zzH = f;
            zzN();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0393 A[Catch: zzoe -> 0x0397, TryCatch #2 {zzoe -> 0x0397, blocks: (B:37:0x0089, B:50:0x00d4, B:52:0x00dc, B:54:0x00e2, B:55:0x00e9, B:56:0x00fb, B:58:0x00ff, B:60:0x0103, B:61:0x0108, B:65:0x011e, B:67:0x0132, B:69:0x0138, B:70:0x013d, B:46:0x009e, B:48:0x00a7, B:179:0x038b, B:181:0x0393, B:182:0x0396, B:40:0x0092, B:42:0x0096, B:43:0x009b), top: B:196:0x0089, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[Catch: zzoe -> 0x0397, SYNTHETIC, TRY_LEAVE, TryCatch #2 {zzoe -> 0x0397, blocks: (B:37:0x0089, B:50:0x00d4, B:52:0x00dc, B:54:0x00e2, B:55:0x00e9, B:56:0x00fb, B:58:0x00ff, B:60:0x0103, B:61:0x0108, B:65:0x011e, B:67:0x0132, B:69:0x0138, B:70:0x013d, B:46:0x009e, B:48:0x00a7, B:179:0x038b, B:181:0x0393, B:182:0x0396, B:40:0x0092, B:42:0x0096, B:43:0x009b), top: B:196:0x0089, inners: #3 }] */
    @Override // com.google.android.gms.internal.ads.zzoi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzt(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzu() {
        return zzR() && this.zzj.zzg(zzG());
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzv() {
        if (zzR()) {
            return this.zzN && !zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final boolean zzw(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final void zzq(AudioDeviceInfo audioDeviceInfo) {
        zzor zzorVar = audioDeviceInfo == null ? null : new zzor(audioDeviceInfo);
        this.zzT = zzorVar;
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzop.zza(audioTrack, zzorVar);
        }
    }
}
