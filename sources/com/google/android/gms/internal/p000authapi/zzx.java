package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzx extends IInterface {
    void zzc(zzv zzvVar) throws RemoteException;

    void zzc(zzv zzvVar, CredentialRequest credentialRequest) throws RemoteException;

    void zzc(zzv zzvVar, zzt zztVar) throws RemoteException;

    void zzc(zzv zzvVar, zzz zzzVar) throws RemoteException;
}
