package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbev zzbevVar) throws RemoteException;

    void zzg(zzbey zzbeyVar) throws RemoteException;

    void zzh(String str, zzbfe zzbfeVar, zzbfb zzbfbVar) throws RemoteException;

    void zzi(zzbkg zzbkgVar) throws RemoteException;

    void zzj(zzbfi zzbfiVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbfl zzbflVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbjx zzbjxVar) throws RemoteException;

    void zzo(zzbdl zzbdlVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
