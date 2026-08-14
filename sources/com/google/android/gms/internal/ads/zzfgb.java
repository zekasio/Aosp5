package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgb {
    private final zzfhi zza;
    private final String zzb;
    private final zzffq zzc;
    private final String zzd = "Ad overlay";

    public zzfgb(View view, zzffq zzffqVar, String str) {
        this.zza = new zzfhi(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzffqVar;
    }

    public final zzffq zza() {
        return this.zzc;
    }

    public final zzfhi zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
