package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzegh implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzeyo zzb;
    final /* synthetic */ zzeyc zzc;
    final /* synthetic */ zzegn zzd;
    final /* synthetic */ zzegi zze;

    zzegh(zzegi zzegiVar, zzbzs zzbzsVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzegn zzegnVar) {
        this.zze = zzegiVar;
        this.zza = zzbzsVar;
        this.zzb = zzeyoVar;
        this.zzc = zzeycVar;
        this.zzd = zzegnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.zza.zzd(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
