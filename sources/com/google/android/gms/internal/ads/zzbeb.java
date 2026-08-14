package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbeb extends IInterface {
    IObjectWrapper zzb(String str) throws RemoteException;

    void zzbs(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbt(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbu(zzbdu zzbduVar) throws RemoteException;

    void zzbv(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbw(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
