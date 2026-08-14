package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcfx(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcfx zza() {
        return new zzcfx(0, 0, 0);
    }

    public static zzcfx zzb(int i, int i2) {
        return new zzcfx(1, i, i2);
    }

    public static zzcfx zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzd ? new zzcfx(3, 0, 0) : zzqVar.zzi ? new zzcfx(2, 0, 0) : zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcfx zzd() {
        return new zzcfx(5, 0, 0);
    }

    public static zzcfx zze() {
        return new zzcfx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
