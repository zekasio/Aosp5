package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesh {
    private final zzbtn zza;
    private final int zzb;

    public zzesh(zzbtn zzbtnVar, int i) {
        this.zza = zzbtnVar;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfoj.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    final boolean zzg() {
        return this.zza.zzl;
    }

    final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    final boolean zzi() {
        return this.zza.zzk;
    }
}
