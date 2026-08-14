package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbns extends zzasv implements zzbnu {
    zzbns(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzbg = zzbg(18, zza());
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzbg = zzbg(17, zza());
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final double zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        double d = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(23, zza());
        float f = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(25, zza());
        float f = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(24, zza());
        float f = parcelZzbg.readFloat();
        parcelZzbg.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzbg = zzbg(16, zza());
        Bundle bundle = (Bundle) zzasx.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel parcelZzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final zzbdp zzk() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        zzbdp zzbdpVarZzj = zzbdo.zzj(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbdpVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final zzbdx zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        zzbdx zzbdxVarZzg = zzbdw.zzg(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbdxVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(14, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel parcelZzbg = zzbg(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzp() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzq() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzr() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzs() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzt() throws RemoteException {
        Parcel parcelZzbg = zzbg(10, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzu() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final List zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        ArrayList arrayListZzb = zzasx.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzx() throws RemoteException {
        zzbh(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, iObjectWrapper2);
        zzasx.zzg(parcelZza, iObjectWrapper3);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(22, parcelZza);
    }
}
