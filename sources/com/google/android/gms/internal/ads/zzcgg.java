package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcgg {
    private final zzbzg zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcgg(zzcge zzcgeVar, zzcgf zzcgfVar) {
        this.zza = zzcgeVar.zza;
        this.zzb = zzcgeVar.zzb;
        this.zzc = zzcgeVar.zzc;
    }

    final Context zza() {
        return this.zzb;
    }

    public final zzapw zzb() {
        return new zzapw(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    final zzbde zzc() {
        return new zzbde(this.zzb);
    }

    final zzbzg zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    final WeakReference zzf() {
        return this.zzc;
    }
}
