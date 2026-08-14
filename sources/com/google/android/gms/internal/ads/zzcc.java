package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcc {
    private final zzaa zzd;
    public static final zzcc zza = new zzca().zze();
    private static final String zzc = zzew.zzP(0);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbz
    };

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcc) {
            return this.zzd.equals(((zzcc) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }
}
