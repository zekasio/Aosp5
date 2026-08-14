package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbqv extends IInterface {
    void zze(Intent intent) throws RemoteException;

    void zzf() throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;
}
