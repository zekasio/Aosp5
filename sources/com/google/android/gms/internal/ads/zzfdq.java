package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdq implements zzfdk {
    private final zzfdu zza;
    private final zzfds zzb;
    private final zzfdh zzc;

    public zzfdq(zzfdh zzfdhVar, zzfdu zzfduVar, zzfds zzfdsVar, byte[] bArr) {
        this.zzc = zzfdhVar;
        this.zza = zzfduVar;
        this.zzb = zzfdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final String zza(zzfdj zzfdjVar) {
        zzfdu zzfduVar = this.zza;
        Map mapZzj = zzfdjVar.zzj();
        this.zzb.zza(mapZzj);
        return zzfduVar.zza(mapZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final void zzb(zzfdj zzfdjVar) {
        this.zzc.zzb(zza(zzfdjVar));
    }
}
