package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzm implements zzcg {
    protected final zzcm zza = new zzcm();

    protected zzm() {
    }

    public abstract void zza(int i, long j, int i2, boolean z);

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzb() {
        zzcn zzcnVarZzq = zzq();
        return !zzcnVarZzq.zzo() && zzcnVarZzq.zze(zzg(), this.zza, 0L).zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzc() {
        zzcn zzcnVarZzq = zzq();
        return !zzcnVarZzq.zzo() && zzcnVarZzq.zze(zzg(), this.zza, 0L).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzd() {
        zzcn zzcnVarZzq = zzq();
        return !zzcnVarZzq.zzo() && zzcnVarZzq.zze(zzg(), this.zza, 0L).zzh;
    }
}
