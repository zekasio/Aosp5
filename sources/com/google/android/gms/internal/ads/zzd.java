package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    private final zzc[] zzj;
    public static final zzd zza = new zzd(null, new zzc[0], 0, -9223372036854775807L, 0);
    private static final zzc zze = new zzc(0).zzb(0);
    private static final String zzf = zzew.zzP(1);
    private static final String zzg = zzew.zzP(2);
    private static final String zzh = zzew.zzP(3);
    private static final String zzi = zzew.zzP(4);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zza
    };
    public final long zzd = 0;
    public final int zzc = 0;

    private zzd(Object obj, zzc[] zzcVarArr, long j, long j2, int i) {
        this.zzj = zzcVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzew.zzU(null, null) && Arrays.equals(this.zzj, zzdVar.zzj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.zzj);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }

    public final zzc zza(int i) {
        return i < 0 ? zze : this.zzj[i];
    }
}
