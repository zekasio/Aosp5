package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfnq implements Serializable {
    zzfnq() {
    }

    public static zzfnq zzc() {
        return zzfmz.zza;
    }

    public static zzfnq zzd(@CheckForNull Object obj) {
        return obj == null ? zzfmz.zza : new zzfnz(obj);
    }

    public abstract zzfnq zza(zzfnj zzfnjVar);

    public abstract Object zzb(Object obj);
}
