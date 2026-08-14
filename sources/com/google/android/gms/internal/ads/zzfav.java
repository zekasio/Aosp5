package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfav implements zzfat {
    private final String zza;

    public zzfav(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfat
    public final boolean equals(Object obj) {
        if (obj instanceof zzfav) {
            return this.zza.equals(((zzfav) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfat
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
