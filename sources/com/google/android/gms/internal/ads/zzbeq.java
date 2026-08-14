package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbeq extends zzasw implements zzber {
    public zzbeq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzber zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzber ? (zzber) iInterfaceQueryLocalInterface : new zzbep(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String string = parcel.readString();
                zzasx.zzc(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzasx.zzc(parcel);
                zzbdx zzbdxVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbdxVarZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzasx.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzdqVarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzh = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, iObjectWrapperZzh);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                boolean zZzr = zzr(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zZzr);
                return true;
            case 11:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zZzq);
                return true;
            case 13:
                boolean zZzs = zzs();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zZzs);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzp(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbdu zzbduVarZzf = zzf();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzbduVarZzf);
                return true;
            default:
                return false;
        }
    }
}
