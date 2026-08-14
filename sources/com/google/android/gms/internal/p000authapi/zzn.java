package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzn extends zzo<Status> {
    private final /* synthetic */ Credential zzao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzn(zzj zzjVar, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.zzao = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzo
    protected final void zzc(Context context, zzx zzxVar) throws RemoteException {
        zzxVar.zzc(new zzp(this), new zzt(this.zzao));
    }
}
