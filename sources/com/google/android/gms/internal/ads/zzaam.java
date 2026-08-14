package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaam implements zzaax {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaam(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdl.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        if (!this.zzd) {
            zzaay zzaayVar = zzaay.zza;
            return new zzaav(zzaayVar, zzaayVar);
        }
        int iZzd = zzew.zzd(this.zzb, j, true, true);
        zzaay zzaayVar2 = new zzaay(this.zzb[iZzd], this.zza[iZzd]);
        if (zzaayVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (iZzd != jArr.length - 1) {
                int i = iZzd + 1;
                return new zzaav(zzaayVar2, new zzaay(jArr[i], this.zza[i]));
            }
        }
        return new zzaav(zzaayVar2, zzaayVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zzd;
    }
}
