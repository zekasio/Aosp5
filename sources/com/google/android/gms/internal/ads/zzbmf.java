package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbmf {
    static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbmd();
    static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbme();
    private final zzblr zzc;

    public zzbmf(Context context, zzbzg zzbzgVar, String str, @Nullable zzfep zzfepVar) {
        this.zzc = new zzblr(context, zzbzgVar, str, zza, zzb, zzfepVar);
    }

    public final zzblv zza(String str, zzbly zzblyVar, zzblx zzblxVar) {
        return new zzbmj(this.zzc, str, zzblyVar, zzblxVar);
    }

    public final zzbmo zzb() {
        return new zzbmo(this.zzc);
    }
}
