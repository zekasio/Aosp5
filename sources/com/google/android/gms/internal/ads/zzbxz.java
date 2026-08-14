package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbxz implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzs zzb;

    zzbxz(zzbya zzbyaVar, Context context, zzbzs zzbzsVar) {
        this.zza = context;
        this.zzb = zzbzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zze(e);
            zzbza.zzh("Exception while getting advertising Id info", e);
        }
    }
}
