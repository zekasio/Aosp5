package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgea implements zzgeb {
    private final zzgoj zza;
    private final zzgld zzb;

    private zzgea(zzgld zzgldVar) {
        this.zzb = zzgldVar;
        this.zza = zzgek.zzb(zzgldVar.zzg());
    }

    public static zzgea zza(zzgld zzgldVar) {
        return new zzgea(zzgldVar);
    }

    public final zzgld zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final zzgoj zzd() {
        return this.zza;
    }
}
