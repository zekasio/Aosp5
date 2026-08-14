package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfc extends zzbuv {
    private static void zzr(final zzbvd zzbvdVar) {
        zzbza.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbyt.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbvd zzbvdVar2 = zzbvdVar;
                if (zzbvdVar2 != null) {
                    try {
                        zzbvdVar2.zze(1);
                    } catch (RemoteException e) {
                        zzbza.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final zzbut zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf(zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        zzr(zzbvdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzg(zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        zzr(zzbvdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzk(zzbuz zzbuzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzbve zzbveVar) throws RemoteException {
    }
}
