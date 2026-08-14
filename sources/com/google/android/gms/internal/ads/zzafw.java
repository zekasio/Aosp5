package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafw {
    public final zzabb zza;
    public zzagj zzd;
    public zzafs zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzagi zzb = new zzagi();
    public final zzen zzc = new zzen();
    private final zzen zzj = new zzen(1);
    private final zzen zzk = new zzen();

    public zzafw(zzabb zzabbVar, zzagj zzagjVar, zzafs zzafsVar) {
        this.zza = zzabbVar;
        this.zzd = zzagjVar;
        this.zze = zzafsVar;
        zzh(zzagjVar, zzafsVar);
    }

    public final int zza() {
        int i = !this.zzl ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzen zzenVar;
        zzagh zzaghVarZzf = zzf();
        if (zzaghVarZzf == null) {
            return 0;
        }
        int i3 = zzaghVarZzf.zzd;
        if (i3 != 0) {
            zzenVar = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzew.zzH(zzaghVarZzf.zze);
            zzen zzenVar2 = this.zzk;
            int length = bArr.length;
            zzenVar2.zzD(bArr, length);
            zzenVar = this.zzk;
            i3 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzen zzenVar3 = this.zzj;
        zzenVar3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzenVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzenVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            this.zzc.zzC(8);
            zzen zzenVar4 = this.zzc;
            byte[] bArrZzH = zzenVar4.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 1;
            bArrZzH[2] = 0;
            bArrZzH[3] = (byte) i2;
            bArrZzH[4] = (byte) ((i >> 24) & 255);
            bArrZzH[5] = (byte) ((i >> 16) & 255);
            bArrZzH[6] = (byte) ((i >> 8) & 255);
            bArrZzH[7] = (byte) (i & 255);
            this.zza.zzr(zzenVar4, 8, 1);
            return i3 + 9;
        }
        zzen zzenVar5 = this.zzb.zzn;
        int iZzo = zzenVar5.zzo();
        zzenVar5.zzG(-2);
        int i4 = (iZzo * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzC(i4);
            byte[] bArrZzH2 = this.zzc.zzH();
            zzenVar5.zzB(bArrZzH2, 0, i4);
            int i5 = (((bArrZzH2[2] & UByte.MAX_VALUE) << 8) | (bArrZzH2[3] & UByte.MAX_VALUE)) + i2;
            bArrZzH2[2] = (byte) ((i5 >> 8) & 255);
            bArrZzH2[3] = (byte) (i5 & 255);
            zzenVar5 = this.zzc;
        }
        this.zza.zzr(zzenVar5, i4, 1);
        return i3 + 1 + i4;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzagi zzagiVar = this.zzb;
        return zzagiVar.zzi[this.zzf];
    }

    public final zzagh zzf() {
        if (!this.zzl) {
            return null;
        }
        zzafs zzafsVar = this.zzb.zza;
        int i = zzew.zza;
        int i2 = zzafsVar.zza;
        zzagh zzaghVarZza = this.zzb.zzm;
        if (zzaghVarZza == null) {
            zzaghVarZza = this.zzd.zza.zza(i2);
        }
        if (zzaghVarZza == null || !zzaghVarZza.zza) {
            return null;
        }
        return zzaghVarZza;
    }

    public final void zzh(zzagj zzagjVar, zzafs zzafsVar) {
        this.zzd = zzagjVar;
        this.zze = zzafsVar;
        this.zza.zzk(zzagjVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzagi zzagiVar = this.zzb;
        zzagiVar.zzd = 0;
        zzagiVar.zzp = 0L;
        zzagiVar.zzq = false;
        zzagiVar.zzk = false;
        zzagiVar.zzo = false;
        zzagiVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
