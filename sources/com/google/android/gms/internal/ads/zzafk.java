package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafk {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzen zzf;
    private final zzen zzg;
    private int zzh;
    private int zzi;

    public zzafk(zzen zzenVar, zzen zzenVar2, boolean z) throws zzbu {
        this.zzg = zzenVar;
        this.zzf = zzenVar2;
        this.zze = z;
        zzenVar2.zzF(12);
        this.zza = zzenVar2.zzn();
        zzenVar.zzF(12);
        this.zzi = zzenVar.zzn();
        zzzy.zzb(zzenVar.zze() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzt() : this.zzf.zzs();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzn();
            this.zzg.zzG(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzn() : -1;
        }
        return true;
    }
}
