package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcc extends zzasv implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(13, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zze(parcelZza, zzqVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(10, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(9, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeb zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, iObjectWrapper2);
        Parcel parcelZzbg = zzbg(5, parcelZza);
        zzbeb zzbebVarZzbx = zzbea.zzbx(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbebVarZzbx;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeh zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, iObjectWrapper2);
        zzasx.zzg(parcelZza, iObjectWrapper3);
        Parcel parcelZzbg = zzbg(11, parcelZza);
        zzbeh zzbehVarZze = zzbeg.zze(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbehVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbip zzk(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i, zzbim zzbimVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzasx.zzg(parcelZza, zzbimVar);
        Parcel parcelZzbg = zzbg(16, parcelZza);
        zzbip zzbipVarZzb = zzbio.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbipVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbqv zzl(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        zzbqv zzbqvVarZzb = zzbqu.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbqvVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrc zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(8, parcelZza);
        zzbrc zzbrcVarZzF = zzbrb.zzF(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbrcVarZzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbug zzn(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuw zzo(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(12, parcelZza);
        zzbuw zzbuwVarZzq = zzbuv.zzq(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbuwVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxr zzp(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzasx.zzg(parcelZza, iObjectWrapper);
        zzasx.zzg(parcelZza, zzbnfVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzbg = zzbg(14, parcelZza);
        zzbxr zzbxrVarZzb = zzbxq.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbxrVarZzb;
    }
}
