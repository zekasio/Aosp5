package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends zzbe<Bundle> {
    zzaw(zzaq zzaqVar) {
    }

    @Override // com.google.android.gms.internal.games.zzbe
    protected final void zzb(com.google.android.gms.games.internal.zzf zzfVar, TaskCompletionSource<Bundle> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(zzfVar.zzah());
    }
}
