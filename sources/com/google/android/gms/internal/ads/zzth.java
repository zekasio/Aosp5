package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzth implements zzuj {
    private final zzuj zza;
    private final long zzb;

    public zzth(zzuj zzujVar, long j) {
        this.zza = zzujVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zza(zzjo zzjoVar, zzgr zzgrVar, int i) {
        int iZza = this.zza.zza(zzjoVar, zzgrVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzgrVar.zzd = Math.max(0L, zzgrVar.zzd + this.zzb);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzuj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final boolean zze() {
        return this.zza.zze();
    }
}
