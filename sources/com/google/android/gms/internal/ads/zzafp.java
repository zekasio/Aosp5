package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafp implements zzafm {
    private final zzen zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzafp(zzafi zzafiVar) {
        zzen zzenVar = zzafiVar.zza;
        this.zza = zzenVar;
        zzenVar.zzF(12);
        this.zzc = zzenVar.zzn() & 255;
        this.zzb = zzenVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzk();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzk = this.zza.zzk();
        this.zze = iZzk;
        return (iZzk & 240) >> 4;
    }
}
