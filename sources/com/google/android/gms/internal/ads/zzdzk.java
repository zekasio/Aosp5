package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzk implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdzk(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzj zzb() {
        return new zzdzj(((zzdzc) this.zza).zzb(), ((zzcgh) this.zzb).zzb());
    }
}
