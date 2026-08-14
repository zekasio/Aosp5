package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzui implements zzabb {
    private boolean zzA;
    private boolean zzB;
    private zzqa zzC;
    private final zzuc zza;
    private final zzpz zzd;
    private final zzpt zze;
    private zzuh zzf;
    private zzaf zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzaf zzy;
    private zzaf zzz;
    private final zzue zzb = new zzue();
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaba[] zzn = new zzaba[1000];
    private final zzup zzc = new zzup(new zzdp() { // from class: com.google.android.gms.internal.ads.zzud
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    protected zzui(zzwt zzwtVar, zzpz zzpzVar, zzpt zzptVar, byte[] bArr) {
        this.zzd = zzpzVar;
        this.zze = zzptVar;
        this.zza = new zzuc(zzwtVar, null);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzB(zzjo zzjoVar, zzgr zzgrVar, boolean z, boolean z2, zzue zzueVar) {
        zzgrVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzaf zzafVar = this.zzz;
                if (zzafVar == null || (!z && zzafVar == this.zzg)) {
                    return -3;
                }
                zzG(zzafVar, zzjoVar);
                return -5;
            }
            zzgrVar.zzc(4);
            return -4;
        }
        zzaf zzafVar2 = ((zzug) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzafVar2 == this.zzg) {
            int iZzA = zzA(this.zzr);
            if (!zzK(iZzA)) {
                zzgrVar.zzc = true;
                return -3;
            }
            zzgrVar.zzc(this.zzl[iZzA]);
            long j = this.zzm[iZzA];
            zzgrVar.zzd = j;
            if (j < this.zzs) {
                zzgrVar.zza(Integer.MIN_VALUE);
            }
            zzueVar.zza = this.zzk[iZzA];
            zzueVar.zzb = this.zzj[iZzA];
            zzueVar.zzc = this.zzn[iZzA];
            return -4;
        }
        zzG(zzafVar2, zzjoVar);
        return -5;
    }

    private final synchronized long zzC(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int iZzz = zzz(i3, i2, j, false);
                if (iZzz == -1) {
                    return -1L;
                }
                return zzE(iZzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzE(i);
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, zzaba zzabaVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int iZzA = zzA(i3 - 1);
            zzdl.zzd(this.zzj[iZzA] + ((long) this.zzk[iZzA]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int iZzA2 = zzA(this.zzo);
        this.zzm[iZzA2] = j;
        this.zzj[iZzA2] = j2;
        this.zzk[iZzA2] = i2;
        this.zzl[iZzA2] = i;
        this.zzn[iZzA2] = zzabaVar;
        this.zzi[iZzA2] = 0;
        if (this.zzc.zzf() || !((zzug) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpy zzpyVar = zzpy.zzb;
            zzup zzupVar = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzaf zzafVar = this.zzz;
            if (zzafVar == null) {
                throw null;
            }
            zzupVar.zzc(i4, new zzug(zzafVar, zzpyVar, null));
        }
        int i5 = this.zzo + 1;
        this.zzo = i5;
        int i6 = this.zzh;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzaba[] zzabaVarArr = new zzaba[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzabaVarArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i9, i10);
            System.arraycopy(this.zzm, 0, jArr2, i9, i10);
            System.arraycopy(this.zzl, 0, iArr2, i9, i10);
            System.arraycopy(this.zzk, 0, iArr3, i9, i10);
            System.arraycopy(this.zzn, 0, zzabaVarArr, i9, i10);
            System.arraycopy(this.zzi, 0, iArr, i9, i10);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzabaVarArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i7;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzaf zzafVar) {
        this.zzx = false;
        if (zzew.zzU(zzafVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzug) this.zzc.zzb()).zza.equals(zzafVar)) {
            this.zzz = zzafVar;
        } else {
            this.zzz = ((zzug) this.zzc.zzb()).zza;
        }
        zzaf zzafVar2 = this.zzz;
        this.zzA = zzbt.zzf(zzafVar2.zzm, zzafVar2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zzug zzugVar) {
        zzpy zzpyVar = zzugVar.zzb;
        int i = zzpx.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j, boolean z) {
        int i = this.zzr;
        int iZzA = zzA(i);
        if (zzJ() && j >= this.zzm[iZzA]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int iZzz = zzz(iZzA, this.zzo - i, j, true);
            if (iZzz == -1) {
                return 0;
            }
            return iZzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzjo r9, com.google.android.gms.internal.ads.zzgr r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zzue r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzuc r9 = r8.zza
            com.google.android.gms.internal.ads.zzue r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzuc r9 = r8.zza
            com.google.android.gms.internal.ads.zzue r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzui.zzd(com.google.android.gms.internal.ads.zzjo, com.google.android.gms.internal.ads.zzgr, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaaz.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzrVar, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzaf zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        this.zza.zzc(zzC(j, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzk(zzaf zzafVar) {
        this.zzy = zzafVar;
        boolean zZzL = zzL(zzafVar);
        zzuh zzuhVar = this.zzf;
        if (zzuhVar == null || !zZzL) {
            return;
        }
        zzuhVar.zzL(zzafVar);
    }

    public final void zzm() throws IOException {
        zzqa zzqaVar = this.zzC;
        if (zzqaVar != null) {
            throw zzqaVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final /* synthetic */ void zzq(zzen zzenVar, int i) {
        zzaaz.zzb(this, zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzr(zzen zzenVar, int i, int i2) {
        this.zza.zzh(zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzs(long j, int i, int i2, int i3, zzaba zzabaVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzee.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzb() - ((long) i2)) - ((long) i3), i2, zzabaVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zzuh zzuhVar) {
        this.zzf = zzuhVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdl.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zzug) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzaf zzafVar = this.zzz;
            if (zzafVar == null) {
                z2 = false;
            } else if (zzafVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(long j, boolean z) {
        zzI();
        int i = this.zzr;
        int iZzA = zzA(i);
        if (!zzJ() || j < this.zzm[iZzA] || (j > this.zzu && !z)) {
            return false;
        }
        int iZzz = zzz(iZzA, this.zzo - i, j, true);
        if (iZzz == -1) {
            return false;
        }
        this.zzs = j;
        this.zzr += iZzz;
        return true;
    }

    private final void zzG(zzaf zzafVar, zzjo zzjoVar) {
        zzaf zzafVar2 = this.zzg;
        boolean z = zzafVar2 == null;
        zzx zzxVar = z ? null : zzafVar2.zzp;
        this.zzg = zzafVar;
        zzx zzxVar2 = zzafVar.zzp;
        zzjoVar.zza = zzafVar.zzc(this.zzd.zza(zzafVar));
        zzjoVar.zzb = this.zzC;
        if (z || !zzew.zzU(zzxVar, zzxVar2)) {
            zzqa zzqaVar = zzafVar.zzp != null ? new zzqa(new zzpr(new zzqc(1), 6001)) : null;
            this.zzC = zzqaVar;
            zzjoVar.zzb = zzqaVar;
        }
    }

    private final long zzE(int i) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzA = zzA(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzm[iZzA]);
                if ((this.zzl[iZzA] & 1) != 0) {
                    break;
                }
                iZzA--;
                if (iZzA == -1) {
                    iZzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        int i8 = i7 - 1;
        return this.zzj[i8] + ((long) this.zzk[i8]);
    }
}
