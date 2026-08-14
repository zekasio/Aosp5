package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaid implements zzaim {
    private zzaf zza;
    private zzeu zzb;
    private zzabb zzc;

    public zzaid(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        this.zza = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zzb);
        int i = zzew.zza;
        long jZzd = this.zzb.zzd();
        long jZze = this.zzb.zze();
        if (jZzd == -9223372036854775807L || jZze == -9223372036854775807L) {
            return;
        }
        zzaf zzafVar = this.zza;
        if (jZze != zzafVar.zzq) {
            zzad zzadVarZzb = zzafVar.zzb();
            zzadVarZzb.zzW(jZze);
            zzaf zzafVarZzY = zzadVarZzb.zzY();
            this.zza = zzafVarZzY;
            this.zzc.zzk(zzafVarZzY);
        }
        int iZza = zzenVar.zza();
        this.zzc.zzq(zzenVar, iZza);
        this.zzc.zzs(jZzd, 1, iZza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzeu zzeuVar, zzzx zzzxVar, zzaiz zzaizVar) {
        this.zzb = zzeuVar;
        zzaizVar.zzc();
        zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzc = zzabbVarZzv;
        zzabbVarZzv.zzk(this.zza);
    }
}
