package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzi extends zzo<CredentialRequestResult> {
    private final /* synthetic */ CredentialRequest zzan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(zzj zzjVar, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.zzan = credentialRequest;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzo
    protected final void zzc(Context context, zzx zzxVar) throws RemoteException {
        zzxVar.zzc(new zzl(this), this.zzan);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return zzg.zzc(status);
    }
}
