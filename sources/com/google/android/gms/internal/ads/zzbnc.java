package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnc extends zzbne {
    private static final zzbpg zza = new zzbpg();

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzbni zzb(String str) throws RemoteException {
        zzbof zzbofVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbnc.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbof((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbof((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                zzbza.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                zzbza.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzbza.zze("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbofVar = new zzbof(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            zzbofVar = new zzbof(new AdMobAdapter());
            return zzbofVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzbpc zzc(String str) throws RemoteException {
        return new zzbpo((RtbAdapter) Class.forName(str, false, zzbpg.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbnc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbza.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbnc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbza.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
