package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zztf implements zzwe {
    private final zzwe zza;
    private final zzcp zzb;

    public zztf(zzwe zzweVar, zzcp zzcpVar) {
        this.zza = zzweVar;
        this.zzb = zzcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztf)) {
            return false;
        }
        zztf zztfVar = (zztf) obj;
        return this.zza.equals(zztfVar.zza) && this.zzb.equals(zztfVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzaf zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzcp zze() {
        return this.zzb;
    }
}
