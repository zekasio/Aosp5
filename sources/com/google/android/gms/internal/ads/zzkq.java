package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkq {
    public static final zzkq zza;
    public static final zzkq zzb;
    public static final zzkq zzc;
    public static final zzkq zzd;
    public static final zzkq zze;
    public final long zzf;
    public final long zzg;

    static {
        zzkq zzkqVar = new zzkq(0L, 0L);
        zza = zzkqVar;
        zzb = new zzkq(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzkq(Long.MAX_VALUE, 0L);
        zzd = new zzkq(0L, Long.MAX_VALUE);
        zze = zzkqVar;
    }

    public zzkq(long j, long j2) {
        zzdl.zzd(j >= 0);
        zzdl.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkq zzkqVar = (zzkq) obj;
            if (this.zzf == zzkqVar.zzf && this.zzg == zzkqVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
