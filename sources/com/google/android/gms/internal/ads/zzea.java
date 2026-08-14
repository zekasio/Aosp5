package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzea {
    public final Object zza;
    private zzy zzb = new zzy();
    private boolean zzc;
    private boolean zzd;

    public zzea(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzea) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdy zzdyVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzdyVar.zza(this.zza);
    }

    public final void zzb(zzdz zzdzVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzaa zzaaVarZzb = this.zzb.zzb();
        this.zzb = new zzy();
        this.zzc = false;
        zzdzVar.zza(this.zza, zzaaVarZzb);
    }

    public final void zzc(zzdz zzdzVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdzVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
