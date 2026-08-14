package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzur {
    public final int zzc;
    private final zzfqk zze;
    private int zzf;
    public static final zzur zza = new zzur(new zzcp[0]);
    private static final String zzd = zzew.zzP(0);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzuq
    };

    public zzur(zzcp... zzcpVarArr) {
        this.zze = zzfqk.zzn(zzcpVarArr);
        this.zzc = zzcpVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcp) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzee.zzc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzur zzurVar = (zzur) obj;
            if (this.zzc == zzurVar.zzc && this.zze.equals(zzurVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zze.hashCode();
        this.zzf = iHashCode;
        return iHashCode;
    }

    public final int zza(zzcp zzcpVar) {
        int iIndexOf = this.zze.indexOf(zzcpVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzcp zzb(int i) {
        return (zzcp) this.zze.get(i);
    }
}
