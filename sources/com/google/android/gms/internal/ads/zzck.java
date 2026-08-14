package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzck {
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;
    private static final String zzh = zzew.zzP(0);
    private static final String zzi = zzew.zzP(1);
    private static final String zzj = zzew.zzP(2);
    private static final String zzk = zzew.zzP(3);
    private static final String zzl = zzew.zzP(4);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcj
    };

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzck zzckVar = (zzck) obj;
            if (zzew.zzU(this.zzb, zzckVar.zzb) && zzew.zzU(this.zzc, zzckVar.zzc) && this.zzd == zzckVar.zzd && this.zze == zzckVar.zze && this.zzg == zzckVar.zzg && zzew.zzU(this.zzm, zzckVar.zzm)) {
                return true;
            }
        }
        return false;
    }

    public final int zza(int i) {
        return this.zzm.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        return -1;
    }

    public final int zze(int i) {
        return this.zzm.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.zzm.zza(i).zza(i2);
    }

    public final long zzg(int i, int i2) {
        zzc zzcVarZza = this.zzm.zza(i);
        if (zzcVarZza.zzc != -1) {
            return zzcVarZza.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i) {
        long j = this.zzm.zza(i).zzb;
        return 0L;
    }

    public final long zzi() {
        long j = this.zzm.zzd;
        return 0L;
    }

    public final long zzj(int i) {
        long j = this.zzm.zza(i).zzg;
        return 0L;
    }

    public final zzck zzk(Object obj, Object obj2, int i, long j, long j2, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0L;
        this.zzm = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i) {
        boolean z = this.zzm.zza(i).zzh;
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzc;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzd;
        long j = this.zze;
        return (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzm.hashCode();
    }
}
