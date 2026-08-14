package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaio {
    private final List zza;
    private final zzabb[] zzb;

    public zzaio(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    public final void zza(long j, zzen zzenVar) {
        zzzh.zza(j, zzenVar, this.zzb);
    }

    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaizVar.zzc();
            zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.zza.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdl.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String strZzb = zzafVar.zzb;
            if (strZzb == null) {
                strZzb = zzaizVar.zzb();
            }
            zzad zzadVar = new zzad();
            zzadVar.zzH(strZzb);
            zzadVar.zzS(str);
            zzadVar.zzU(zzafVar.zze);
            zzadVar.zzK(zzafVar.zzd);
            zzadVar.zzu(zzafVar.zzE);
            zzadVar.zzI(zzafVar.zzo);
            zzabbVarZzv.zzk(zzadVar.zzY());
            this.zzb[i] = zzabbVarZzv;
        }
    }
}
