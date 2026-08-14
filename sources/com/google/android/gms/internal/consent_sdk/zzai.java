package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzai implements zzat {
    private final zzaj zza;
    private final zzai zzb = this;
    private final zzcl<zzbi> zzc;
    private final zzcl<zzbc> zzd;
    private final zzcl<zzay> zze;
    private final zzcl zzf;
    private final zzcl<zzbg> zzg;

    /* synthetic */ zzai(zzaj zzajVar, zzbc zzbcVar, zzaf zzafVar) {
        this.zza = zzajVar;
        zzcl<zzbi> zzclVarZza = zzcg.zza(new zzbj(zzajVar.zzb));
        this.zzc = zzclVarZza;
        zzch zzchVarZza = zzci.zza(zzbcVar);
        this.zzd = zzchVarZza;
        zzcf zzcfVar = new zzcf();
        this.zze = zzcfVar;
        zzbn zzbnVar = new zzbn(zzajVar.zzb, zzclVarZza, zzao.zza, zzaq.zza, zzajVar.zzi, zzajVar.zzj, zzcfVar, zzajVar.zzc);
        this.zzf = zzbnVar;
        zzbh zzbhVar = new zzbh(zzclVarZza, zzao.zza, zzbnVar);
        this.zzg = zzbhVar;
        zzcf.zza(zzcfVar, zzcg.zza(new zzaz(zzajVar.zzb, zzajVar.zzd, zzclVarZza, zzajVar.zzc, zzchVarZza, zzbhVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzat
    public final zzay zza() {
        return this.zze.zzb();
    }
}
