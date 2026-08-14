package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfo implements zzff {
    private zzgi zzb;
    private String zzc;
    private boolean zzf;
    private final zzgc zza = new zzgc();
    private int zzd = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    private int zze = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;

    public final zzfo zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzfo zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfo zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzfo zze(zzgi zzgiVar) {
        this.zzb = zzgiVar;
        return this;
    }

    public final zzfo zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzff
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzft zza() {
        zzft zzftVar = new zzft(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzgi zzgiVar = this.zzb;
        if (zzgiVar != null) {
            zzftVar.zzf(zzgiVar);
        }
        return zzftVar;
    }
}
