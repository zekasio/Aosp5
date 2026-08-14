package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbpb extends zzasw implements zzbpc {
    public zzbpb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbpc ? (zzbpc) iInterfaceQueryLocalInterface : new zzbpa(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbpf] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzboz] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzbow] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzboz] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzbow] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbpb] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzboq] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzboq] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.zzbon] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbot] */
    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzbpdVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Bundle bundle = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbpdVar = iInterfaceQueryLocalInterface instanceof zzbpf ? (zzbpf) iInterfaceQueryLocalInterface : new zzbpd(strongBinder);
            }
            ?? r11 = zzbpdVar;
            zzasx.zzc(parcel);
            zzh(iObjectWrapperAsInterface, string, bundle, bundle2, zzqVar, r11);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbpq zzbpqVarZzf = zzf();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zzbpqVarZzf);
        } else if (i == 3) {
            zzbpq zzbpqVarZzg = zzg();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zzbpqVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zzdqVarZze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface2 instanceof zzboq ? (zzboq) iInterfaceQueryLocalInterface2 : new zzboo(strongBinder2);
                    }
                    ?? r5 = zzbpdVar;
                    zzbnl zzbnlVarZzb = zzbnk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzasx.zzc(parcel);
                    zzj(string2, string3, zzlVar, iObjectWrapperAsInterface2, r5, zzbnlVarZzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface3 instanceof zzbot ? (zzbot) iInterfaceQueryLocalInterface3 : new zzbor(strongBinder3);
                    }
                    ?? r7 = zzbpdVar;
                    zzbnl zzbnlVarZzb2 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzl(string4, string5, zzlVar2, iObjectWrapperAsInterface3, r7, zzbnlVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zZzs = zzs(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zZzs);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface4 instanceof zzboz ? (zzboz) iInterfaceQueryLocalInterface4 : new zzbox(strongBinder4);
                    }
                    ?? r112 = zzbpdVar;
                    zzbnl zzbnlVarZzb3 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzp(string6, string7, zzlVar3, iObjectWrapperAsInterface5, r112, zzbnlVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zZzt);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface5 instanceof zzbow ? (zzbow) iInterfaceQueryLocalInterface5 : new zzbou(strongBinder5);
                    }
                    ?? r113 = zzbpdVar;
                    zzbnl zzbnlVarZzb4 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzm(string8, string9, zzlVar4, iObjectWrapperAsInterface7, r113, zzbnlVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzasx.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface6 instanceof zzboz ? (zzboz) iInterfaceQueryLocalInterface6 : new zzbox(strongBinder6);
                    }
                    ?? r114 = zzbpdVar;
                    zzbnl zzbnlVarZzb5 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzo(string11, string12, zzlVar5, iObjectWrapperAsInterface8, r114, zzbnlVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface7 instanceof zzboq ? (zzboq) iInterfaceQueryLocalInterface7 : new zzboo(strongBinder7);
                    }
                    ?? r52 = zzbpdVar;
                    zzbnl zzbnlVarZzb6 = zzbnk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzasx.zzc(parcel);
                    zzk(string13, string14, zzlVar6, iObjectWrapperAsInterface9, r52, zzbnlVarZzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface8 instanceof zzbow ? (zzbow) iInterfaceQueryLocalInterface8 : new zzbou(strongBinder8);
                    }
                    ?? r115 = zzbpdVar;
                    zzbnl zzbnlVarZzb7 = zzbnk.zzb(parcel.readStrongBinder());
                    zzbdl zzbdlVar = (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR);
                    zzasx.zzc(parcel);
                    zzn(string15, string16, zzlVar7, iObjectWrapperAsInterface10, r115, zzbnlVarZzb7, zzbdlVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbpdVar = iInterfaceQueryLocalInterface9 instanceof zzbon ? (zzbon) iInterfaceQueryLocalInterface9 : new zzbol(strongBinder9);
                    }
                    ?? r72 = zzbpdVar;
                    zzbnl zzbnlVarZzb8 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzi(string17, string18, zzlVar8, iObjectWrapperAsInterface11, r72, zzbnlVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zZzr);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
