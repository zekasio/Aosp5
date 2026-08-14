package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgf {
    private static zzfgf zza;
    private float zzb = 0.0f;
    private final zzffy zzc;
    private final zzffw zzd;
    private zzffx zze;
    private zzffz zzf;

    public zzfgf(zzffy zzffyVar, zzffw zzffwVar) {
        this.zzc = zzffyVar;
        this.zzd = zzffwVar;
    }

    public static zzfgf zzb() {
        if (zza == null) {
            zza = new zzfgf(new zzffy(), new zzffw());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzffx(new Handler(), context, new zzffv(), this, null);
    }

    public final void zzd(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzffz.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzffo) it.next()).zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfga.zza().zzd(this);
        zzfga.zza().zzb();
        zzfhb.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfhb.zzd().zzj();
        zzfga.zza().zzc();
        this.zze.zzb();
    }
}
