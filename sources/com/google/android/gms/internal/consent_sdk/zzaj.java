package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaj extends zzd {
    private final zzaj zza = this;
    private final zzcl<Application> zzb;
    private final zzcl<zzam> zzc;
    private final zzcl<zzac> zzd;
    private final zzcl<zzas> zze;
    private final zzcl<zzba> zzf;
    private final zzcl<zzb> zzg;
    private final zzcl<zzn> zzh;
    private final zzcl<zzh> zzi;
    private final zzcl<zzak> zzj;
    private final zzcl<zzz> zzk;
    private final zzcl<zzv> zzl;
    private final zzcl<zzk> zzm;

    /* synthetic */ zzaj(Application application, zzaf zzafVar) {
        zzch zzchVarZza = zzci.zza(application);
        this.zzb = zzchVarZza;
        zzcl<zzam> zzclVarZza = zzcg.zza(new zzan(zzchVarZza));
        this.zzc = zzclVarZza;
        zzcl<zzac> zzclVarZza2 = zzcg.zza(zzad.zza);
        this.zzd = zzclVarZza2;
        zzaf zzafVar2 = new zzaf(this);
        this.zze = zzafVar2;
        zzcl<zzba> zzclVarZza3 = zzcg.zza(new zzbb(zzafVar2));
        this.zzf = zzclVarZza3;
        zzc zzcVar = new zzc(zzchVarZza);
        this.zzg = zzcVar;
        zzp zzpVar = new zzp(zzchVarZza, zzcVar, zzclVarZza);
        this.zzh = zzpVar;
        zzcl<zzh> zzclVarZza4 = zzcg.zza(new zzi(zzaq.zza));
        this.zzi = zzclVarZza4;
        zzal zzalVar = new zzal(zzchVarZza, zzclVarZza, zzaq.zza);
        this.zzj = zzalVar;
        zzab zzabVar = new zzab(zzclVarZza4, zzalVar, zzclVarZza);
        this.zzk = zzabVar;
        zzw zzwVar = new zzw(zzchVarZza, zzclVarZza2, zzao.zza, zzaq.zza, zzclVarZza, zzclVarZza3, zzpVar, zzabVar, zzclVarZza4);
        this.zzl = zzwVar;
        this.zzm = zzcg.zza(new zzl(zzclVarZza, zzwVar, zzclVarZza3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final zzk zzb() {
        return this.zzm.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final zzba zzc() {
        return this.zzf.zzb();
    }
}
