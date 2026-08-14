package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefm extends zzbun {
    final /* synthetic */ zzcwu zza;
    final /* synthetic */ zzcum zzb;
    final /* synthetic */ zzcvv zzc;
    final /* synthetic */ zzdcl zzd;

    zzefm(zzefn zzefnVar, zzcwu zzcwuVar, zzcum zzcumVar, zzcvv zzcvvVar, zzdcl zzdclVar) {
        this.zza = zzcwuVar;
        this.zzb = zzcumVar;
        this.zzc = zzcvvVar;
        this.zzd = zzdclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzm(IObjectWrapper iObjectWrapper, zzbup zzbupVar) {
        this.zzd.zza(zzbupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
