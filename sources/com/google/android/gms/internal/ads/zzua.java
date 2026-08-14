package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzua extends zzrt implements zztr {
    private final zzbg zza;
    private final zzay zzb;
    private final zzff zzc;
    private final zzpz zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzgi zzj;
    private final zztx zzk;
    private final zzwx zzl;

    /* synthetic */ zzua(zzbg zzbgVar, zzff zzffVar, zztx zztxVar, zzpz zzpzVar, zzwx zzwxVar, int i, zztz zztzVar, byte[] bArr) {
        zzay zzayVar = zzbgVar.zzd;
        zzayVar.getClass();
        this.zzb = zzayVar;
        this.zza = zzbgVar;
        this.zzc = zzffVar;
        this.zzk = zztxVar;
        this.zzd = zzpzVar;
        this.zzl = zzwxVar;
        this.zze = i;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbg zzbgVar = this.zza;
        zzun zzunVar = new zzun(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbgVar, z2 ? zzbgVar.zzf : null);
        zzo(this.zzf ? new zztw(this, zzunVar) : zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzF(zzsq zzsqVar) {
        ((zztv) zzsqVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final zzsq zzH(zzss zzssVar, zzwt zzwtVar, long j) {
        zzfg zzfgVarZza = this.zzc.zza();
        zzgi zzgiVar = this.zzj;
        if (zzgiVar != null) {
            zzfgVarZza.zzf(zzgiVar);
        }
        Uri uri = this.zzb.zza;
        zztx zztxVar = this.zzk;
        zzb();
        return new zztv(uri, zzfgVarZza, new zzrv(zztxVar.zza), this.zzd, zzc(zzssVar), this.zzl, zze(zzssVar), this, zzwtVar, null, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final zzbg zzI() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztr
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (!this.zzf && this.zzg == j && this.zzh == z && this.zzi == z2) {
            return;
        }
        this.zzg = j;
        this.zzh = z;
        this.zzi = z2;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected final void zzn(zzgi zzgiVar) {
        this.zzj = zzgiVar;
        Looper.myLooper().getClass();
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzy() {
    }
}
