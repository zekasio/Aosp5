package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcy {
    private final zzfqk zzd;
    public static final zzcy zza = new zzcy(zzfqk.zzo());
    private static final String zzc = zzew.zzP(0);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcv
    };

    public zzcy(List list) {
        this.zzd = zzfqk.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzcy) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfqk zza() {
        return this.zzd;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            zzcx zzcxVar = (zzcx) this.zzd.get(i2);
            if (zzcxVar.zzc() && zzcxVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
