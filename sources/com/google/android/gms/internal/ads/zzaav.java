package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaav {
    public final zzaay zza;
    public final zzaay zzb;

    public zzaav(zzaay zzaayVar, zzaay zzaayVar2) {
        this.zza = zzaayVar;
        this.zzb = zzaayVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaav zzaavVar = (zzaav) obj;
            if (this.zza.equals(zzaavVar.zza) && this.zzb.equals(zzaavVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "[" + this.zza.toString() + (this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
