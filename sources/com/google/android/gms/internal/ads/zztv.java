package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zztv implements zzsq, zzzx, zzwy, zzxd, zzuh {
    private static final Map zzb;
    private static final zzaf zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwx zzM;
    private final zzwt zzN;
    private final Uri zzd;
    private final zzfg zze;
    private final zzpz zzf;
    private final zztb zzg;
    private final zzpt zzh;
    private final zztr zzi;
    private final long zzj;
    private final zztl zzl;
    private zzsp zzq;
    private zzacy zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztu zzx;
    private zzaax zzy;
    private final zzxg zzk = new zzxg("ProgressiveMediaPeriod");
    private final zzdo zzm = new zzdo(zzdm.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zztm
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zztn
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzD();
        }
    };
    private final Handler zzp = zzew.zzD(null);
    private zztt[] zzt = new zztt[0];
    private zzui[] zzs = new zzui[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        zzb = Collections.unmodifiableMap(map);
        zzad zzadVar = new zzad();
        zzadVar.zzH("icy");
        zzadVar.zzS("application/x-icy");
        zzc = zzadVar.zzY();
    }

    public zztv(Uri uri, zzfg zzfgVar, zztl zztlVar, zzpz zzpzVar, zzpt zzptVar, zzwx zzwxVar, zztb zztbVar, zztr zztrVar, zzwt zzwtVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzfgVar;
        this.zzf = zzpzVar;
        this.zzh = zzptVar;
        this.zzM = zzwxVar;
        this.zzg = zztbVar;
        this.zzi = zztrVar;
        this.zzN = zzwtVar;
        this.zzj = i;
        this.zzl = zztlVar;
    }

    static /* bridge */ /* synthetic */ void zzB(final zztv zztvVar) {
        zztvVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzto
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE();
            }
        });
    }

    private final int zzP() {
        int iZzc = 0;
        for (zzui zzuiVar : this.zzs) {
            iZzc += zzuiVar.zzc();
        }
        return iZzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzQ(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzui[] r3 = r5.zzs
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zztu r4 = r5.zzx
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzg()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzQ(boolean):long");
    }

    private final zzabb zzR(zztt zzttVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzttVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzui zzuiVar = new zzui(this.zzN, this.zzf, this.zzh, null);
        zzuiVar.zzu(this);
        int i2 = length + 1;
        zztt[] zzttVarArr = (zztt[]) Arrays.copyOf(this.zzt, i2);
        zzttVarArr[length] = zzttVar;
        this.zzt = (zztt[]) zzew.zzad(zzttVarArr);
        zzui[] zzuiVarArr = (zzui[]) Arrays.copyOf(this.zzs, i2);
        zzuiVarArr[length] = zzuiVar;
        this.zzs = (zzui[]) zzew.zzad(zzuiVarArr);
        return zzuiVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdl.zzf(this.zzv);
        this.zzx.getClass();
        this.zzy.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            if (zzuiVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcp[] zzcpVarArr = new zzcp[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzafVarZzh = this.zzs[i2].zzh();
            zzafVarZzh.getClass();
            String str = zzafVarZzh.zzm;
            boolean zZzg = zzbt.zzg(str);
            boolean z = zZzg || zzbt.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzacy zzacyVar = this.zzr;
            if (zzacyVar != null) {
                if (zZzg || this.zzt[i2].zzb) {
                    zzbq zzbqVar = zzafVarZzh.zzk;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(-9223372036854775807L, zzacyVar) : zzbqVar.zzc(zzacyVar);
                    zzad zzadVarZzb = zzafVarZzh.zzb();
                    zzadVarZzb.zzM(zzbqVar2);
                    zzafVarZzh = zzadVarZzb.zzY();
                }
                if (zZzg && zzafVarZzh.zzg == -1 && zzafVarZzh.zzh == -1 && (i = zzacyVar.zza) != -1) {
                    zzad zzadVarZzb2 = zzafVarZzh.zzb();
                    zzadVarZzb2.zzv(i);
                    zzafVarZzh = zzadVarZzb2.zzY();
                }
            }
            zzcpVarArr[i2] = new zzcp(Integer.toString(i2), zzafVarZzh.zzc(this.zzf.zza(zzafVarZzh)));
        }
        this.zzx = new zztu(new zzur(zzcpVarArr), zArr);
        this.zzv = true;
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zztu zztuVar = this.zzx;
        boolean[] zArr = zztuVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzaf zzafVarZzb = zztuVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbt.zzb(zzafVarZzb.zzm), zzafVarZzb, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzp(false);
            }
            zzsp zzspVar = this.zzq;
            zzspVar.getClass();
            zzspVar.zzg(this);
        }
    }

    private final void zzW() {
        zztq zztqVar = new zztq(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdl.zzf(zzX());
            long j = this.zzz;
            if (j != -9223372036854775807L && this.zzH > j) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzaax zzaaxVar = this.zzy;
            zzaaxVar.getClass();
            zztq.zzf(zztqVar, zzaaxVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long jZza = this.zzk.zza(zztqVar, this, zzwx.zza(this.zzB));
        zzfl zzflVar = zztqVar.zzl;
        this.zzg.zzl(new zzsj(zztqVar.zzb, zzflVar, zzflVar.zza, Collections.emptyMap(), jZza, 0L, 0L), 1, -1, null, 0, null, zztqVar.zzk, this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    static /* bridge */ /* synthetic */ long zzq(zztv zztvVar, boolean z) {
        return zztvVar.zzQ(true);
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    final void zzG() throws IOException {
        this.zzk.zzi(zzwx.zza(this.zzB));
    }

    final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzI(zzxc zzxcVar, long j, long j2, boolean z) {
        zztq zztqVar = (zztq) zzxcVar;
        zzgh zzghVar = zztqVar.zzd;
        zzsj zzsjVar = new zzsj(zztqVar.zzb, zztqVar.zzl, zzghVar.zzh(), zzghVar.zzi(), j, j2, zzghVar.zzg());
        long unused = zztqVar.zzb;
        this.zzg.zzf(zzsjVar, 1, -1, null, 0, null, zztqVar.zzk, this.zzz);
        if (z) {
            return;
        }
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzsp zzspVar = this.zzq;
            zzspVar.getClass();
            zzspVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ void zzJ(zzxc zzxcVar, long j, long j2) {
        zzaax zzaaxVar;
        if (this.zzz == -9223372036854775807L && (zzaaxVar = this.zzy) != null) {
            boolean zZzh = zzaaxVar.zzh();
            long jZzQ = zzQ(true);
            long j3 = jZzQ == Long.MIN_VALUE ? 0L : jZzQ + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j3;
            this.zzi.zza(j3, zZzh, this.zzA);
        }
        zztq zztqVar = (zztq) zzxcVar;
        zzgh zzghVar = zztqVar.zzd;
        zzsj zzsjVar = new zzsj(zztqVar.zzb, zztqVar.zzl, zzghVar.zzh(), zzghVar.zzi(), j, j2, zzghVar.zzg());
        long unused = zztqVar.zzb;
        this.zzg.zzh(zzsjVar, 1, -1, null, 0, null, zztqVar.zzk, this.zzz);
        this.zzK = true;
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzK() {
        for (zzui zzuiVar : this.zzs) {
            zzuiVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzL(zzaf zzafVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzN(final zzaax zzaaxVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF(zzaaxVar);
            }
        });
    }

    final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        long j2;
        zzS();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzaav zzaavVarZzg = this.zzy.zzg(j);
        long j3 = zzaavVarZzg.zza.zzb;
        long j4 = zzaavVarZzg.zzb.zzb;
        long j5 = zzkqVar.zzf;
        if (j5 != 0) {
            j2 = j5;
        } else {
            if (zzkqVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long jZzx = zzew.zzx(j, j2, Long.MIN_VALUE);
        long jZzq = zzew.zzq(j, zzkqVar.zzg, Long.MAX_VALUE);
        boolean z = jZzx <= j3 && j3 <= jZzq;
        boolean z2 = jZzx <= j4 && j4 <= jZzq;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                return j4;
            }
        } else if (!z) {
            return z2 ? j4 : jZzx;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long jZzQ;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            jZzQ = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztu zztuVar = this.zzx;
                if (zztuVar.zzb[i] && zztuVar.zzc[i] && !this.zzs[i].zzw()) {
                    jZzQ = Math.min(jZzQ, this.zzs[i].zzg());
                }
            }
        } else {
            jZzQ = Long.MAX_VALUE;
        }
        if (jZzQ == Long.MAX_VALUE) {
            jZzQ = zzQ(false);
        }
        return jZzQ == Long.MIN_VALUE ? this.zzG : jZzQ;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (int i = 0; i < length; i++) {
                if (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) {
                }
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzxg zzxgVar = this.zzk;
        if (zzxgVar.zzl()) {
            for (zzui zzuiVar : this.zzs) {
                zzuiVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzxgVar.zzh();
            for (zzui zzuiVar2 : this.zzs) {
                zzuiVar2.zzp(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzwe zzweVar;
        zzS();
        zztu zztuVar = this.zzx;
        zzur zzurVar = zztuVar.zza;
        boolean[] zArr3 = zztuVar.zzc;
        int i = this.zzE;
        int i2 = 0;
        for (int i3 = 0; i3 < zzweVarArr.length; i3++) {
            zzuj zzujVar = zzujVarArr[i3];
            if (zzujVar != null && (zzweVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzts) zzujVar).zzb;
                zzdl.zzf(zArr3[i4]);
                this.zzE--;
                zArr3[i4] = false;
                zzujVarArr[i3] = null;
            }
        }
        if (this.zzC) {
            z = i == 0;
        } else if (j == 0) {
            j = 0;
        }
        for (int i5 = 0; i5 < zzweVarArr.length; i5++) {
            if (zzujVarArr[i5] == null && (zzweVar = zzweVarArr[i5]) != null) {
                zzdl.zzf(zzweVar.zzc() == 1);
                zzdl.zzf(zzweVar.zza(0) == 0);
                int iZza = zzurVar.zza(zzweVar.zze());
                zzdl.zzf(!zArr3[iZza]);
                this.zzE++;
                zArr3[iZza] = true;
                zzujVarArr[i5] = new zzts(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    zzui zzuiVar = this.zzs[iZza];
                    z = (zzuiVar.zzy(j, true) || zzuiVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzui[] zzuiVarArr = this.zzs;
                int length = zzuiVarArr.length;
                while (i2 < length) {
                    zzuiVarArr[i2].zzj();
                    i2++;
                }
                this.zzk.zzg();
            } else {
                for (zzui zzuiVar2 : this.zzs) {
                    zzuiVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzujVarArr.length) {
                if (zzujVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzC = true;
        return j;
    }

    final int zzg(int i, zzjo zzjoVar, zzgr zzgrVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int iZzd = this.zzs[i].zzd(zzjoVar, zzgrVar, i2, this.zzK);
        if (iZzd == -3) {
            zzV(i);
        }
        return iZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzS();
        return this.zzx.zza;
    }

    final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzui zzuiVar = this.zzs[i];
        int iZzb = zzuiVar.zzb(j, this.zzK);
        zzuiVar.zzv(iZzb);
        if (iZzb != 0) {
            return iZzb;
        }
        zzV(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zzq = zzspVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zZze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zZze;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final /* bridge */ /* synthetic */ zzxa zzt(zzxc zzxcVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzxa zzxaVarZzb;
        zzaax zzaaxVar;
        zztq zztqVar = (zztq) zzxcVar;
        zzgh zzghVar = zztqVar.zzd;
        zzsj zzsjVar = new zzsj(zztqVar.zzb, zztqVar.zzl, zzghVar.zzh(), zzghVar.zzi(), j, j2, zzghVar.zzg());
        long unused = zztqVar.zzk;
        int i2 = zzew.zza;
        if ((iOException instanceof zzbu) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzfy) || (iOException instanceof zzxf)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzfh) && ((zzfh) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzxaVarZzb = zzxg.zzd;
        } else {
            int iZzP = zzP();
            boolean z = iZzP > this.zzJ;
            if (this.zzF || !((zzaaxVar = this.zzy) == null || zzaaxVar.zze() == -9223372036854775807L)) {
                this.zzJ = iZzP;
            } else {
                boolean z2 = this.zzv;
                if (!z2 || zzY()) {
                    this.zzD = z2;
                    this.zzG = 0L;
                    this.zzJ = 0;
                    for (zzui zzuiVar : this.zzs) {
                        zzuiVar.zzp(false);
                    }
                    zztq.zzf(zztqVar, 0L, 0L);
                } else {
                    this.zzI = true;
                    zzxaVarZzb = zzxg.zzc;
                }
            }
            zzxaVarZzb = zzxg.zzb(z, jMin);
        }
        zzxa zzxaVar = zzxaVarZzb;
        boolean zZzc = zzxaVar.zzc();
        this.zzg.zzj(zzsjVar, 1, -1, null, 0, null, zztqVar.zzk, this.zzz, iOException, !zZzc);
        if (!zZzc) {
            long unused2 = zztqVar.zzb;
        }
        return zzxaVar;
    }

    final zzabb zzu() {
        return zzR(new zztt(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final zzabb zzv(int i, int i2) {
        return zzR(new zztt(i, false));
    }

    final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zzsp zzspVar = this.zzq;
        zzspVar.getClass();
        zzspVar.zzg(this);
    }

    final /* synthetic */ void zzF(zzaax zzaaxVar) {
        this.zzy = this.zzr == null ? zzaaxVar : new zzaaw(-9223372036854775807L, 0L);
        this.zzz = zzaaxVar.zze();
        boolean z = false;
        if (!this.zzF && zzaaxVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzaaxVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }
}
