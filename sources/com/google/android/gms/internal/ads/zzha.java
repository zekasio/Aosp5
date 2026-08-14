package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzha implements zzkn, zzko {
    private final int zza;
    private zzkp zzc;
    private int zzd;
    private zzno zze;
    private int zzf;
    private zzuj zzg;
    private zzaf[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zzjo zzb = new zzjo();
    private long zzj = Long.MIN_VALUE;

    public zzha(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzhj {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzA() {
        zzdl.zzf(this.zzf == 0);
        zzjo zzjoVar = this.zzb;
        zzjoVar.zzb = null;
        zzjoVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzB(long j) throws zzhj {
        zzP(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public /* synthetic */ void zzD(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzE() throws zzhj {
        zzdl.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzF() {
        zzdl.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final boolean zzH() {
        return this.zzk;
    }

    protected final zzaf[] zzJ() {
        zzaf[] zzafVarArr = this.zzh;
        zzafVarArr.getClass();
        return zzafVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzko
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final int zzbc() {
        return this.zzf;
    }

    protected final int zzbd(zzjo zzjoVar, zzgr zzgrVar, int i) {
        zzuj zzujVar = this.zzg;
        zzujVar.getClass();
        int iZza = zzujVar.zza(zzjoVar, zzgrVar, i);
        if (iZza == -4) {
            if (zzgrVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j = zzgrVar.zzd + this.zzi;
            zzgrVar.zzd = j;
            this.zzj = Math.max(this.zzj, j);
        } else if (iZza == -5) {
            zzaf zzafVar = zzjoVar.zza;
            zzafVar.getClass();
            long j2 = zzafVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzad zzadVarZzb = zzafVar.zzb();
                zzadVarZzb.zzW(j2 + this.zzi);
                zzjoVar.zza = zzadVarZzb.zzY();
                return -5;
            }
        }
        return iZza;
    }

    protected final zzhj zzbe(Throwable th, zzaf zzafVar, boolean z, int i) {
        int i2;
        if (zzafVar == null || this.zzl) {
            i2 = 4;
        } else {
            this.zzl = true;
            try {
                int iZzO = zzO(zzafVar) & 7;
                this.zzl = false;
                i2 = iZzO;
            } catch (zzhj unused) {
                this.zzl = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
        }
        return zzhj.zzb(th, zzK(), this.zzd, zzafVar, i2, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public int zze() throws zzhj {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final long zzf() {
        return this.zzj;
    }

    protected final zzjo zzh() {
        zzjo zzjoVar = this.zzb;
        zzjoVar.zzb = null;
        zzjoVar.zza = null;
        return zzjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public zzjq zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzko zzj() {
        return this;
    }

    protected final zzkp zzk() {
        zzkp zzkpVar = this.zzc;
        zzkpVar.getClass();
        return zzkpVar;
    }

    protected final zzno zzl() {
        zzno zznoVar = this.zze;
        zznoVar.getClass();
        return zznoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzuj zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzn() {
        zzdl.zzf(this.zzf == 1);
        zzjo zzjoVar = this.zzb;
        zzjoVar.zzb = null;
        zzjoVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzo(zzkp zzkpVar, zzaf[] zzafVarArr, zzuj zzujVar, long j, boolean z, boolean z2, long j2, long j3) throws zzhj {
        zzdl.zzf(this.zzf == 0);
        this.zzc = zzkpVar;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzafVarArr, zzujVar, j2, j3);
        zzP(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public void zzp(int i, Object obj) throws zzhj {
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzq(int i, zzno zznoVar) {
        this.zzd = i;
        this.zze = zznoVar;
    }

    protected void zzs() {
        throw null;
    }

    protected void zzt(boolean z, boolean z2) throws zzhj {
    }

    protected void zzu(long j, boolean z) throws zzhj {
        throw null;
    }

    protected void zzv() {
    }

    protected void zzw() throws zzhj {
    }

    protected void zzx() {
    }

    protected void zzy(zzaf[] zzafVarArr, long j, long j2) throws zzhj {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzz(zzaf[] zzafVarArr, zzuj zzujVar, long j, long j2) throws zzhj {
        zzdl.zzf(!this.zzk);
        this.zzg = zzujVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzafVarArr;
        this.zzi = j2;
        zzy(zzafVarArr, j, j2);
    }

    protected final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zzuj zzujVar = this.zzg;
        zzujVar.getClass();
        return zzujVar.zze();
    }

    protected final int zzd(long j) {
        zzuj zzujVar = this.zzg;
        zzujVar.getClass();
        return zzujVar.zzb(j - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzr() throws IOException {
        zzuj zzujVar = this.zzg;
        zzujVar.getClass();
        zzujVar.zzd();
    }
}
