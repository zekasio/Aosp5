package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzap extends zzaj {
    private final /* synthetic */ TaskCompletionSource zzbq;

    zzap(zzak zzakVar, TaskCompletionSource taskCompletionSource) {
        this.zzbq = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzag
    public final void zzc(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, savePasswordResult, this.zzbq);
    }
}
