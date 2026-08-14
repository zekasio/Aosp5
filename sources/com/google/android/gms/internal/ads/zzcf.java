package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcf {
    public final Object zzb;
    public final int zzc;
    public final zzbg zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;
    private static final String zzk = zzew.zzP(0);
    private static final String zzl = zzew.zzP(1);
    private static final String zzm = zzew.zzP(2);
    private static final String zzn = zzew.zzP(3);
    private static final String zzo = zzew.zzP(4);
    private static final String zzp = zzew.zzP(5);
    private static final String zzq = zzew.zzP(6);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzce
    };

    public zzcf(Object obj, int i, zzbg zzbgVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbgVar;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcf zzcfVar = (zzcf) obj;
            if (this.zzc == zzcfVar.zzc && this.zzf == zzcfVar.zzf && this.zzg == zzcfVar.zzg && this.zzh == zzcfVar.zzh && this.zzi == zzcfVar.zzi && this.zzj == zzcfVar.zzj && zzfnp.zza(this.zzb, zzcfVar.zzb) && zzfnp.zza(this.zze, zzcfVar.zze) && zzfnp.zza(this.zzd, zzcfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
