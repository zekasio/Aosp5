package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbxr extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, zzbxv zzbxvVar, zzbxo zzbxoVar) throws RemoteException;

    void zzf(zzbsa zzbsaVar) throws RemoteException;

    void zzg(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException;
}
