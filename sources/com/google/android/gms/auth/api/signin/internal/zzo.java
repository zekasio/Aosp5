package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzo extends zzc {
    private final /* synthetic */ zzl zzcp;

    zzo(zzl zzlVar) {
        this.zzcp = zzlVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzf(Status status) throws RemoteException {
        this.zzcp.setResult(status);
    }
}
