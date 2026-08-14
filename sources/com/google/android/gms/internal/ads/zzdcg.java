package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcg {
    private final List zza;
    private final zzfff zzb;
    private boolean zzc;

    public zzdcg(zzeyc zzeycVar, zzfff zzfffVar) {
        this.zza = zzeycVar.zzq;
        this.zzb = zzfffVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
