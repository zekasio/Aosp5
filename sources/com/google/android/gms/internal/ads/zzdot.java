package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdot implements zzcxj, zzcwc, zzcur {
    private final zzdpd zza;
    private final zzdpn zzb;

    public zzdot(zzdpd zzdpdVar, zzdpn zzdpnVar) {
        this.zza = zzdpdVar;
        this.zzb = zzdpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        this.zza.zzb(zzeyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
        this.zza.zzc(zzbtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzn() {
        this.zza.zza().put("action", TJAdUnitConstants.String.VIDEO_LOADED);
        this.zzb.zze(this.zza.zza());
    }
}
