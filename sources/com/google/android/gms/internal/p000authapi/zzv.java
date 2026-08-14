package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzv extends IInterface {
    void zzc(Status status, Credential credential) throws RemoteException;

    void zzc(Status status, String str) throws RemoteException;

    void zzd(Status status) throws RemoteException;
}
