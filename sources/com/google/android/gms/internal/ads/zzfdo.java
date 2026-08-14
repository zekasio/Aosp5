package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfdo {
    public final String zza;
    public final String zzb;

    public zzfdo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfdo)) {
            return false;
        }
        zzfdo zzfdoVar = (zzfdo) obj;
        return this.zza.equals(zzfdoVar.zza) && this.zzb.equals(zzfdoVar.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
