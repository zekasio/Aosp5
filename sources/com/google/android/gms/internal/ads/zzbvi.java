package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvi {
    public static final zzbuw zza(Context context, String str, zzbnf zzbnfVar) {
        try {
            IBinder iBinderZze = ((zzbva) zzbze.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbzc() { // from class: com.google.android.gms.internal.ads.zzbvh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzc
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbva ? (zzbva) iInterfaceQueryLocalInterface : new zzbva(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbnfVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbuw ? (zzbuw) iInterfaceQueryLocalInterface : new zzbuu(iBinderZze);
        } catch (RemoteException | zzbzd e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
