package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacl extends zzaai {
    private final long zza;

    public zzacl(zzzv zzzvVar, long j) {
        super(zzzvVar);
        zzdl.zzd(zzzvVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaai, com.google.android.gms.internal.ads.zzzv
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaai, com.google.android.gms.internal.ads.zzzv
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaai, com.google.android.gms.internal.ads.zzzv
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
