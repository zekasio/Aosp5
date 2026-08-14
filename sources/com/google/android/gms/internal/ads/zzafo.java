package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafo implements zzafm {
    private final int zza;
    private final int zzb;
    private final zzen zzc;

    public zzafo(zzafi zzafiVar, zzaf zzafVar) {
        zzen zzenVar = zzafiVar.zza;
        this.zzc = zzenVar;
        zzenVar.zzF(12);
        int iZzn = zzenVar.zzn();
        if ("audio/raw".equals(zzafVar.zzm)) {
            int iZzo = zzew.zzo(zzafVar.zzB, zzafVar.zzz);
            if (iZzn == 0 || iZzn % iZzo != 0) {
                zzee.zze("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzo + ", stsz sample size: " + iZzn);
                iZzn = iZzo;
            }
        }
        this.zza = iZzn == 0 ? -1 : iZzn;
        this.zzb = zzenVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
