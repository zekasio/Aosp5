package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzub implements zzwn {
    public long zza;
    public long zzb;
    public zzwm zzc;
    public zzub zzd;

    public zzub(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzub zzb() {
        this.zzc = null;
        zzub zzubVar = this.zzd;
        this.zzd = null;
        return zzubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final zzwm zzc() {
        zzwm zzwmVar = this.zzc;
        zzwmVar.getClass();
        return zzwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final zzwn zzd() {
        zzub zzubVar = this.zzd;
        if (zzubVar == null || zzubVar.zzc == null) {
            return null;
        }
        return zzubVar;
    }

    public final void zze(long j, int i) {
        zzdl.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
