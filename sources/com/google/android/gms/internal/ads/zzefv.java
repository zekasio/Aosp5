package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefv implements zzcvx {
    boolean zza = false;
    final /* synthetic */ zzeaw zzb;
    final /* synthetic */ zzbzs zzc;
    final /* synthetic */ zzefw zzd;

    zzefv(zzefw zzefwVar, zzeaw zzeawVar, zzbzs zzbzsVar) {
        this.zzd = zzefwVar;
        this.zzb = zzeawVar;
        this.zzc = zzbzsVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeY)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzeax(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzefw.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzefw.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}
