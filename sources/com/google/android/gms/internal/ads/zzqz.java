package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqz extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqx zzc;
    public final String zzd;
    public final zzqz zze;

    public zzqz(zzaf zzafVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(zzafVar), th, zzafVar.zzm, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zzqz zza(zzqz zzqzVar, zzqz zzqzVar2) {
        return new zzqz(zzqzVar.getMessage(), zzqzVar.getCause(), zzqzVar.zza, false, zzqzVar.zzc, zzqzVar.zzd, zzqzVar2);
    }

    public zzqz(zzaf zzafVar, Throwable th, boolean z, zzqx zzqxVar) {
        this("Decoder init failed: " + zzqxVar.zza + ", " + String.valueOf(zzafVar), th, zzafVar.zzm, false, zzqxVar, (zzew.zza < 21 || !c$$ExternalSyntheticApiModelOutline0.m$2(th)) ? null : c$$ExternalSyntheticApiModelOutline0.m220m((Object) th).getDiagnosticInfo(), null);
    }

    private zzqz(String str, Throwable th, String str2, boolean z, zzqx zzqxVar, String str3, zzqz zzqzVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqxVar;
        this.zzd = str3;
        this.zze = zzqzVar;
    }
}
