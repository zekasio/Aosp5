package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsd implements zzcwc, com.google.android.gms.ads.internal.client.zza, zzcxj, zzcvi, zzcuo, zzczv {
    private final Clock zza;
    private final zzbyc zzb;

    public zzcsd(Clock clock, zzbyc zzbycVar) {
        this.zza = clock;
        this.zzb = zzbycVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzbr() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zze(zzawz zzawzVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzf(zzawz zzawzVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzi(zzawz zzawzVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzj() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzk(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzp(zzbud zzbudVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final void zzq() {
    }
}
