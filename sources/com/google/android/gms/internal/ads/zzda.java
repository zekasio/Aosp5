package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzda {
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public static final zzda zza = new zzda(0, 0, 0, 1.0f);
    private static final String zzg = zzew.zzP(0);
    private static final String zzh = zzew.zzP(1);
    private static final String zzi = zzew.zzP(2);
    private static final String zzj = zzew.zzP(3);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcz
    };

    public zzda(int i, int i2, int i3, float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zzc == zzdaVar.zzc && this.zzd == zzdaVar.zzd && this.zze == zzdaVar.zze && this.zzf == zzdaVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
