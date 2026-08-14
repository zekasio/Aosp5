package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzty implements zzte {
    private final zzff zzc;
    private int zzd;
    private final zztx zze;
    private final zzwx zzf;
    private final zzpq zzg;

    public zzty(zzff zzffVar, zztx zztxVar, byte[] bArr) {
        zzpq zzpqVar = new zzpq();
        zzwx zzwxVar = new zzwx(-1);
        this.zzc = zzffVar;
        this.zze = zztxVar;
        this.zzg = zzpqVar;
        this.zzf = zzwxVar;
        this.zzd = 1048576;
    }

    public final zzty zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzua zzb(zzbg zzbgVar) {
        zzbgVar.zzd.getClass();
        return new zzua(zzbgVar, this.zzc, this.zze, zzpz.zza, this.zzf, this.zzd, null, null);
    }
}
