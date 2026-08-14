package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {
    public final Uri zzc = null;
    public final String zzd = null;
    public static final zzbd zza = new zzbd(new zzbc());
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    private static final String zzg = zzew.zzP(2);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbb
    };

    private zzbd(zzbc zzbcVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        Uri uri = zzbdVar.zzc;
        if (zzew.zzU(null, null)) {
            String str = zzbdVar.zzd;
            if (zzew.zzU(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
