package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzflz {
    public static zzfly zzj() {
        zzfle zzfleVar = new zzfle();
        zzfleVar.zzd(BadgeDrawable.BOTTOM_START);
        zzfleVar.zze(-1.0f);
        zzfleVar.zzc(0);
        zzfleVar.zzf(false);
        return zzfleVar;
    }

    public abstract float zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract IBinder zze();

    public abstract String zzf();

    public abstract String zzg();

    public abstract String zzh();

    public abstract boolean zzi();
}
