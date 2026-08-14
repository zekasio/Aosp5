package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacm implements zzaax {
    final /* synthetic */ zzaax zza;
    final /* synthetic */ zzacn zzb;

    zzacm(zzacn zzacnVar, zzaax zzaaxVar) {
        this.zzb = zzacnVar;
        this.zza = zzaaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzaav zzaavVarZzg = this.zza.zzg(j);
        zzaay zzaayVar = zzaavVarZzg.zza;
        zzaay zzaayVar2 = new zzaay(zzaayVar.zzb, zzaayVar.zzc + this.zzb.zzb);
        zzaay zzaayVar3 = zzaavVarZzg.zzb;
        return new zzaav(zzaayVar2, new zzaay(zzaayVar3.zzb, zzaayVar3.zzc + this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
