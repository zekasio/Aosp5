package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabl implements zzaax {
    final /* synthetic */ zzabo zza;
    private final long zzb;

    public zzabl(zzabo zzaboVar, long j) {
        this.zza = zzaboVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzaav zzaavVarZza = this.zza.zzg[0].zza(j);
        int i = 1;
        while (true) {
            zzabo zzaboVar = this.zza;
            if (i >= zzaboVar.zzg.length) {
                return zzaavVarZza;
            }
            zzaav zzaavVarZza2 = zzaboVar.zzg[i].zza(j);
            if (zzaavVarZza2.zza.zzc < zzaavVarZza.zza.zzc) {
                zzaavVarZza = zzaavVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
