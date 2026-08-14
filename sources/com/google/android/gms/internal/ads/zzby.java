package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzby {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzby zza = new zzby(1.0f, 1.0f);
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbx
    };

    public zzby(float f, float f2) {
        zzdl.zzd(f > 0.0f);
        zzdl.zzd(f2 > 0.0f);
        this.zzc = f;
        this.zzd = f2;
        this.zzg = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (this.zzc == zzbyVar.zzc && this.zzd == zzbyVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return zzew.zzI("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * ((long) this.zzg);
    }
}
