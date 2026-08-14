package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeo {
    public static final zzeo zza = new zzeo(-1, -1);
    public static final zzeo zzb = new zzeo(0, 0);
    private final int zzc;
    private final int zzd;

    public zzeo(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzdl.zzd(z);
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeo) {
            zzeo zzeoVar = (zzeo) obj;
            if (this.zzc == zzeoVar.zzc && this.zzd == zzeoVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        int i2 = this.zzc;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
