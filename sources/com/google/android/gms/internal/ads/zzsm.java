package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsm extends zzcn {
    private final zzbg zzc;

    public zzsm(zzbg zzbgVar) {
        this.zzc = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        return obj == zzsl.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        zzckVar.zzk(z ? 0 : null, z ? zzsl.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        zzcmVar.zza(zzcm.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcmVar.zzl = true;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        return zzsl.zzd;
    }
}
