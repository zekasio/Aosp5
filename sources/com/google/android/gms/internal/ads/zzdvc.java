package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvc implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdvc(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvb zzb() {
        return new zzdvb(((zzcgj) this.zza).zza(), (zzbxf) this.zzb.zzb());
    }
}
