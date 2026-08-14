package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavl implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzavm zza;

    zzavl(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzavm zzavmVar = this.zza;
            if (zzavmVar.zzd != null) {
                zzavmVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
