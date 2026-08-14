package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzait implements zzaim {
    final /* synthetic */ zzaiv zza;
    private final zzem zzb = new zzem(new byte[4], 4);

    public zzait(zzaiv zzaivVar) {
        this.zza = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzen zzenVar) {
        if (zzenVar.zzk() == 0 && (zzenVar.zzk() & 128) != 0) {
            zzenVar.zzG(6);
            int iZza = zzenVar.zza() / 4;
            for (int i = 0; i < iZza; i++) {
                zzenVar.zzA(this.zzb, 4);
                int iZzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (iZzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzf.get(iZzd2) == null) {
                        zzaiv zzaivVar = this.zza;
                        zzaivVar.zzf.put(iZzd2, new zzain(new zzaiu(zzaivVar, iZzd2)));
                        this.zza.zzl++;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzeu zzeuVar, zzzx zzzxVar, zzaiz zzaizVar) {
    }
}
