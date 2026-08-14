package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajj {
    public final int zza;
    public final long zzb;

    private zzajj(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzajj zza(zzzv zzzvVar, zzen zzenVar) throws IOException {
        ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, 8, false);
        zzenVar.zzF(0);
        return new zzajj(zzenVar.zze(), zzenVar.zzq());
    }
}
