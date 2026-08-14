package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaaw implements zzaax {
    private final long zza;
    private final zzaav zzb;

    public zzaaw(long j, long j2) {
        this.zza = j;
        zzaay zzaayVar = j2 == 0 ? zzaay.zza : new zzaay(0L, j2);
        this.zzb = new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return false;
    }
}
