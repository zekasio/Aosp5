package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjr {
    final zzfju zza;
    final boolean zzb;

    private zzfjr(zzfju zzfjuVar) {
        this.zza = zzfjuVar;
        this.zzb = zzfjuVar != null;
    }

    public static zzfjr zzb(Context context, String str, String str2) {
        zzfju zzfjsVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfjsVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfjsVar = iInterfaceQueryLocalInterface instanceof zzfju ? (zzfju) iInterfaceQueryLocalInterface : new zzfjs(iBinderInstantiate);
                    }
                    zzfjsVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfjr(zzfjsVar);
                } catch (Exception e) {
                    throw new zzfit(e);
                }
            } catch (Exception e2) {
                throw new zzfit(e2);
            }
        } catch (RemoteException | zzfit | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfjr(new zzfjv());
        }
    }

    public static zzfjr zzc() {
        zzfjv zzfjvVar = new zzfjv();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfjr(zzfjvVar);
    }

    public final zzfjq zza(byte[] bArr) {
        return new zzfjq(this, bArr, null);
    }
}
