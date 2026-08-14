package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlc {
    public final long zza;
    public final zzcn zzb;
    public final int zzc;
    public final zzss zzd;
    public final long zze;
    public final zzcn zzf;
    public final int zzg;
    public final zzss zzh;
    public final long zzi;
    public final long zzj;

    public zzlc(long j, zzcn zzcnVar, int i, zzss zzssVar, long j2, zzcn zzcnVar2, int i2, zzss zzssVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzcnVar;
        this.zzc = i;
        this.zzd = zzssVar;
        this.zze = j2;
        this.zzf = zzcnVar2;
        this.zzg = i2;
        this.zzh = zzssVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlc zzlcVar = (zzlc) obj;
            if (this.zza == zzlcVar.zza && this.zzc == zzlcVar.zzc && this.zze == zzlcVar.zze && this.zzg == zzlcVar.zzg && this.zzi == zzlcVar.zzi && this.zzj == zzlcVar.zzj && zzfnp.zza(this.zzb, zzlcVar.zzb) && zzfnp.zza(this.zzd, zzlcVar.zzd) && zzfnp.zza(this.zzf, zzlcVar.zzf) && zzfnp.zza(this.zzh, zzlcVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
