package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbji implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzbjk zzb;

    zzbji(zzbjk zzbjkVar, zzbzs zzbzsVar) {
        this.zzb = zzbjkVar;
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
