package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfm implements zzff {
    private final Context zza;
    private final zzff zzb;

    public zzfm(Context context) {
        zzfo zzfoVar = new zzfo();
        this.zza = context.getApplicationContext();
        this.zzb = zzfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzff
    public final /* bridge */ /* synthetic */ zzfg zza() {
        return new zzfn(this.zza, ((zzfo) this.zzb).zza());
    }
}
