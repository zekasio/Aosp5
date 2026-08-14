package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbng extends zzasv implements zzbni {
    zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzd(parcelZza, z);
        zzbh(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzbh(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzbg = zzbg(22, zza());
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        boolean zZzh = zzasx.zzh(parcelZzbg);
        parcelZzbg.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnq zzO() throws RemoteException {
        zzbnq zzbnqVar;
        Parcel parcelZzbg = zzbg(15, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbnqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbnqVar = iInterfaceQueryLocalInterface instanceof zzbnq ? (zzbnq) iInterfaceQueryLocalInterface : new zzbnq(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnr zzP() throws RemoteException {
        zzbnr zzbnrVar;
        Parcel parcelZzbg = zzbg(16, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbnrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbnrVar = iInterfaceQueryLocalInterface instanceof zzbnr ? (zzbnr) iInterfaceQueryLocalInterface : new zzbnr(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzber zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbno zzj() throws RemoteException {
        zzbno zzbnmVar;
        Parcel parcelZzbg = zzbg(36, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbnmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbnmVar = iInterfaceQueryLocalInterface instanceof zzbno ? (zzbno) iInterfaceQueryLocalInterface : new zzbnm(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnu zzk() throws RemoteException {
        zzbnu zzbnsVar;
        Parcel parcelZzbg = zzbg(27, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbnsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbnsVar = iInterfaceQueryLocalInterface instanceof zzbnu ? (zzbnu) iInterfaceQueryLocalInterface : new zzbns(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(33, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(parcelZzbg, zzbpq.CREATOR);
        parcelZzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(34, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(parcelZzbg, zzbpq.CREATOR);
        parcelZzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuo zzbuoVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(null);
        zzasx.zzg(parcelZza, zzbuoVar);
        parcelZza.writeString(str2);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzq(IObjectWrapper iObjectWrapper, zzbjp zzbjpVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbjpVar);
        parcelZza.writeTypedList(list);
        zzbh(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzr(IObjectWrapper iObjectWrapper, zzbuo zzbuoVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbuoVar);
        parcelZza.writeStringList(list);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar, zzbdl zzbdlVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzasx.zzg(parcelZza, zzbnlVar);
        zzasx.zze(parcelZza, zzbdlVar);
        parcelZza.writeStringList(list);
        zzbh(14, parcelZza);
    }
}
