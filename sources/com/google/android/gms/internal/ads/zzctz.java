package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctz {
    private final Context zza;
    private final zzeyx zzb;
    private final Bundle zzc;
    private final zzeyp zzd;
    private final zzctr zze;

    /* synthetic */ zzctz(zzctx zzctxVar, zzcty zzctyVar) {
        this.zza = zzctxVar.zza;
        this.zzb = zzctxVar.zzb;
        this.zzc = zzctxVar.zzc;
        this.zzd = zzctxVar.zzd;
        this.zze = zzctxVar.zze;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzctr zzc() {
        return this.zze;
    }

    final zzctx zzd() {
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zza);
        zzctxVar.zzh(this.zzb);
        zzctxVar.zze(this.zzc);
        zzctxVar.zzf(this.zze);
        return zzctxVar;
    }

    final zzeyp zze() {
        return this.zzd;
    }

    final zzeyx zzf() {
        return this.zzb;
    }
}
