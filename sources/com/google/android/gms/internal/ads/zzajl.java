package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajl implements zzaax {
    private final zzaji zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzajl(zzaji zzajiVar, int i, long j, long j2) {
        this.zza = zzajiVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzajiVar.zzd);
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzew.zzw(j * ((long) this.zzb), 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long jZzr = zzew.zzr((((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc + (((long) this.zza.zzd) * jZzr);
        long jZza = zza(jZzr);
        zzaay zzaayVar = new zzaay(jZza, j2);
        if (jZza >= j || jZzr == this.zzd - 1) {
            return new zzaav(zzaayVar, zzaayVar);
        }
        long j3 = jZzr + 1;
        return new zzaav(zzaayVar, new zzaay(zza(j3), this.zzc + (((long) this.zza.zzd) * j3)));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
