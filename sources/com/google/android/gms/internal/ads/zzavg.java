package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavg {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbnc zzg = new zzbnc();
    private final com.google.android.gms.ads.internal.client.zzp zzh = com.google.android.gms.ads.internal.client.zzp.zza;

    public zzavg(Context context, String str, com.google.android.gms.ads.internal.client.zzdx zzdxVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdxVar;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVarZzd = com.google.android.gms.ads.internal.client.zzay.zza().zzd(this.zzb, com.google.android.gms.ads.internal.client.zzq.zzb(), this.zzc, this.zzg);
            this.zza = zzbuVarZzd;
            if (zzbuVarZzd != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzw(this.zze));
                }
                this.zza.zzH(new zzaut(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
