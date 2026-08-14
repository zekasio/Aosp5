package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfld extends zzflo {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfld(String str, String str2, zzflc zzflcVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzflo) {
            zzflo zzfloVar = (zzflo) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfloVar.zzb()) : zzfloVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfloVar.zza()) : zzfloVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzflo
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflo
    public final String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
