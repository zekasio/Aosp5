package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsk implements zzsq, zzsp {
    public final zzss zza;
    private final long zzb;
    private zzsu zzc;
    private zzsq zzd;
    private zzsp zze;
    private long zzf = -9223372036854775807L;
    private final zzwt zzg;

    public zzsk(zzss zzssVar, zzwt zzwtVar, long j, byte[] bArr) {
        this.zza = zzssVar;
        this.zzg = zzwtVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zza(j, zzkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zzf(zzweVarArr, zArr, zzujVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        zzsp zzspVar = this.zze;
        int i = zzew.zza;
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        return zzsqVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        zzsp zzspVar = this.zze;
        int i = zzew.zza;
        zzspVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        zzsqVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        zzsq zzsqVar = this.zzd;
        if (zzsqVar != null) {
            zzsqVar.zzk();
            return;
        }
        zzsu zzsuVar = this.zzc;
        if (zzsuVar != null) {
            zzsuVar.zzy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zze = zzspVar;
        zzsq zzsqVar = this.zzd;
        if (zzsqVar != null) {
            zzsqVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        zzsq zzsqVar = this.zzd;
        int i = zzew.zza;
        zzsqVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        zzsq zzsqVar = this.zzd;
        return zzsqVar != null && zzsqVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        zzsq zzsqVar = this.zzd;
        return zzsqVar != null && zzsqVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzss zzssVar) {
        long jZzv = zzv(this.zzb);
        zzsu zzsuVar = this.zzc;
        zzsuVar.getClass();
        zzsq zzsqVarZzH = zzsuVar.zzH(zzssVar, this.zzg, jZzv);
        this.zzd = zzsqVarZzH;
        if (this.zze != null) {
            zzsqVarZzH.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzsu zzsuVar) {
        zzdl.zzf(this.zzc == null);
        this.zzc = zzsuVar;
    }

    public final void zzt() {
        zzsq zzsqVar = this.zzd;
        if (zzsqVar != null) {
            zzsu zzsuVar = this.zzc;
            zzsuVar.getClass();
            zzsuVar.zzF(zzsqVar);
        }
    }
}
