package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzffk {
    public abstract void zzb(View view, zzffq zzffqVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzffk zza(zzffl zzfflVar, zzffm zzffmVar) {
        if (zzffi.zzb()) {
            return new zzffo(zzfflVar, zzffmVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
