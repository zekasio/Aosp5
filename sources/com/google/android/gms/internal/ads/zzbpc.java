package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbpc extends IInterface {
    com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException;

    zzbpq zzf() throws RemoteException;

    zzbpq zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpf zzbpfVar) throws RemoteException;

    void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbon zzbonVar, zzbnl zzbnlVar) throws RemoteException;

    void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException;

    void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException;

    void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbot zzbotVar, zzbnl zzbnlVar) throws RemoteException;

    void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar) throws RemoteException;

    void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar, zzbdl zzbdlVar) throws RemoteException;

    void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException;

    void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException;

    void zzq(String str) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
