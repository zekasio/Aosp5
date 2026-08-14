package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbnf;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzco extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzda zzdaVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbnf zzbnfVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    void zzq(float f) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzbjs zzbjsVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzff zzffVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
