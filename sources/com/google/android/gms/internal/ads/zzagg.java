package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagg {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzagh[] zzk;

    public zzagg(int i, int i2, long j, long j2, long j3, zzaf zzafVar, int i3, zzagh[] zzaghVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzafVar;
        this.zzg = i3;
        this.zzk = zzaghVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzagh zza(int i) {
        zzagh[] zzaghVarArr = this.zzk;
        if (zzaghVarArr == null) {
            return null;
        }
        return zzaghVarArr[i];
    }
}
