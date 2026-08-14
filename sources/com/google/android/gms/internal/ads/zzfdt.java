package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdt implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzfdt(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfds zzb() {
        return new zzfds(((zzcgj) this.zza).zza(), ((zzcgu) this.zzb).zza());
    }
}
