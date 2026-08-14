package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexr implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzext zzb;

    zzexr(zzext zzextVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzextVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzh != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzbza.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
