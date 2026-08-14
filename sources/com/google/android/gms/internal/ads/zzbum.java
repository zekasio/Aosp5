package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbum extends zzasv implements zzbuo {
    zzbum(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzbh(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzm(IObjectWrapper iObjectWrapper, zzbup zzbupVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzbupVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(5, parcelZza);
    }
}
