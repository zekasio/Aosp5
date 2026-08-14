package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzqv extends zzgp {
    public final zzqx zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqv(Throwable th, zzqx zzqxVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqxVar == null ? null : zzqxVar.zza)), th);
        String diagnosticInfo = null;
        this.zza = zzqxVar;
        if (zzew.zza >= 21 && c$$ExternalSyntheticApiModelOutline0.m$2(th)) {
            diagnosticInfo = c$$ExternalSyntheticApiModelOutline0.m220m((Object) th).getDiagnosticInfo();
        }
        this.zzb = diagnosticInfo;
    }
}
