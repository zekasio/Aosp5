package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzi implements zzaax {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzzi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(this.zzc) + ", timeUs=" + Arrays.toString(this.zze) + ", durationsUs=" + Arrays.toString(this.zzd) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        int iZzd = zzew.zzd(this.zze, j, true, true);
        zzaay zzaayVar = new zzaay(this.zze[iZzd], this.zzc[iZzd]);
        if (zzaayVar.zzb >= j || iZzd == this.zza - 1) {
            return new zzaav(zzaayVar, zzaayVar);
        }
        int i = iZzd + 1;
        return new zzaav(zzaayVar, new zzaay(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
