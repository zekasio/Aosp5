package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzov {
    private final zzde[] zza;
    private final zzpm zzb;
    private final zzdh zzc;

    public zzov(zzde... zzdeVarArr) {
        zzpm zzpmVar = new zzpm();
        zzdh zzdhVar = new zzdh();
        zzde[] zzdeVarArr2 = {zzpmVar, zzdhVar};
        this.zza = zzdeVarArr2;
        System.arraycopy(zzdeVarArr, 0, zzdeVarArr2, 0, 0);
        this.zzb = zzpmVar;
        this.zzc = zzdhVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzby zzc(zzby zzbyVar) {
        this.zzc.zzk(zzbyVar.zzc);
        this.zzc.zzj(zzbyVar.zzd);
        return zzbyVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzde[] zze() {
        return this.zza;
    }
}
