package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzax extends zzah {
    private final /* synthetic */ TaskCompletionSource zzbq;

    zzax(zzao zzaoVar, TaskCompletionSource taskCompletionSource) {
        this.zzbq = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzae
    public final void zzc(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zzbq);
    }
}
