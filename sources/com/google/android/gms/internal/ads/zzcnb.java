package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnb {
    private final String zza;
    private final zzbmo zzb;
    private final Executor zzc;
    private zzcng zzd;
    private final zzbhp zze = new zzcmy(this);
    private final zzbhp zzf = new zzcna(this);

    public zzcnb(String str, zzbmo zzbmoVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbmoVar;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcnb zzcnbVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcnbVar.zza);
    }

    public final void zzc(zzcng zzcngVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcngVar;
    }

    public final void zzd(zzcei zzceiVar) {
        zzceiVar.zzad("/updateActiveView", this.zze);
        zzceiVar.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcei zzceiVar) {
        zzceiVar.zzau("/updateActiveView", this.zze);
        zzceiVar.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
