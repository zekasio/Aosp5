package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsc implements zzul {
    protected final zzul[] zza;

    public zzsc(zzul[] zzulVarArr) {
        this.zza = zzulVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (zzul zzulVar : this.zza) {
            long jZzb = zzulVar.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (zzul zzulVar : this.zza) {
            long jZzc = zzulVar.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        for (zzul zzulVar : this.zza) {
            zzulVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (zzul zzulVar : this.zza) {
                long jZzc2 = zzulVar.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= j;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= zzulVar.zzo(j);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        for (zzul zzulVar : this.zza) {
            if (zzulVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
