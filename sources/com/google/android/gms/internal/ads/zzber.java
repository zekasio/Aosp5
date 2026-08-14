package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzber extends IInterface {
    com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException;

    zzbdu zzf() throws RemoteException;

    zzbdx zzg(String str) throws RemoteException;

    IObjectWrapper zzh() throws RemoteException;

    String zzi() throws RemoteException;

    String zzj(String str) throws RemoteException;

    List zzk() throws RemoteException;

    void zzl() throws RemoteException;

    void zzm() throws RemoteException;

    void zzn(String str) throws RemoteException;

    void zzo() throws RemoteException;

    void zzp(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzq() throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;
}
