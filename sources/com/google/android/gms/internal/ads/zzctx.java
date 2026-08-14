package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctx {
    private Context zza;
    private zzeyx zzb;
    private Bundle zzc;
    private zzeyp zzd;
    private zzctr zze;

    public final zzctx zzd(Context context) {
        this.zza = context;
        return this;
    }

    public final zzctx zze(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzctx zzf(zzctr zzctrVar) {
        this.zze = zzctrVar;
        return this;
    }

    public final zzctx zzg(zzeyp zzeypVar) {
        this.zzd = zzeypVar;
        return this;
    }

    public final zzctx zzh(zzeyx zzeyxVar) {
        this.zzb = zzeyxVar;
        return this;
    }

    public final zzctz zzi() {
        return new zzctz(this, null);
    }
}
