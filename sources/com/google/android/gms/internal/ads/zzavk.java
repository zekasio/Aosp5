package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzavm zza;

    zzavk(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzavm zzavmVar;
        synchronized (this.zza.zzc) {
            try {
                zzavmVar = this.zza;
            } catch (DeadObjectException e) {
                zzbza.zzh("Unable to obtain a cache service instance.", e);
                zzavm.zzh(this.zza);
            }
            if (zzavmVar.zzd != null) {
                zzavmVar.zzf = zzavmVar.zzd.zzq();
                this.zza.zzc.notifyAll();
            } else {
                this.zza.zzc.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
