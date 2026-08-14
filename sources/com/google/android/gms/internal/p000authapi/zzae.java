package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzae extends IInterface {
    void zzc(Status status, PendingIntent pendingIntent) throws RemoteException;
}
