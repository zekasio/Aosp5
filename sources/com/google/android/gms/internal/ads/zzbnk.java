package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnk extends zzasw implements zzbnl {
    public zzbnk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbnl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbnl ? (zzbnl) iInterfaceQueryLocalInterface : new zzbnj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                zzasx.zzc(parcel);
                zzg(i3);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof zzbnp) {
                    }
                }
                zzasx.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzasx.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbeq.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzasx.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzbup zzbupVar = (zzbup) zzasx.zza(parcel, zzbup.CREATOR);
                zzasx.zzc(parcel);
                zzs(zzbupVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbut zzbutVarZzb = zzbus.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzt(zzbutVarZzb);
                break;
            case 17:
                int i4 = parcel.readInt();
                zzasx.zzc(parcel);
                zzj(i4);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzasx.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                zzasx.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                zzasx.zzc(parcel);
                zzi(i5, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzasx.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzasx.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
