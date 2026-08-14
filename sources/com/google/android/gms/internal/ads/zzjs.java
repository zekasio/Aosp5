package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjs {
    public final zzss zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzjs(zzss zzssVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzdl.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzdl.zzd(z5);
        this.zza = zzssVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjs zzjsVar = (zzjs) obj;
            if (this.zzb == zzjsVar.zzb && this.zzc == zzjsVar.zzc && this.zzd == zzjsVar.zzd && this.zze == zzjsVar.zze && this.zzg == zzjsVar.zzg && this.zzh == zzjsVar.zzh && this.zzi == zzjsVar.zzi && zzew.zzU(this.zza, zzjsVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int i = (int) this.zzb;
        int i2 = (int) this.zzc;
        return (((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzjs zza(long j) {
        return j == this.zzc ? this : new zzjs(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzjs zzb(long j) {
        return j == this.zzb ? this : new zzjs(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
