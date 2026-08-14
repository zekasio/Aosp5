package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddt implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcwu zza;
    private final zzdbs zzb;

    public zzddt(zzcwu zzcwuVar, zzdbs zzdbsVar) {
        this.zza = zzcwuVar;
        this.zzb = zzdbsVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.zza.zzb();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        this.zza.zzbF();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        this.zza.zzby();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.zza.zzf(i);
        this.zzb.zza();
    }
}
