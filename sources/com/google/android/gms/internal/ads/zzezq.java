package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezq {
    private static zzezq zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzezq(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzbza.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzezq zzd(Context context) {
        synchronized (zzezq.class) {
            zzezq zzezqVar = zza;
            if (zzezqVar != null) {
                return zzezqVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbcn.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVarZza = null;
            if (jLongValue > 0 && jLongValue <= 230500000) {
                zzclVarZza = zza(applicationContext);
            }
            zzezq zzezqVar2 = new zzezq(applicationContext, zzclVarZza);
            zza = zzezqVar2;
            return zzezqVar2;
        }
    }

    public final zzbnf zzb() {
        return (zzbnf) this.zzd.get();
    }

    public final zzbzg zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzbzg zzbzgVar = new zzbzg(ModuleDescriptor.MODULE_VERSION, i2, true, zZzA);
        if (!((Boolean) zzbcn.zzc.zze()).booleanValue()) {
            return zzbzgVar;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        com.google.android.gms.ads.internal.client.zzen liteSdkVersion = null;
        if (zzclVar != null) {
            try {
                liteSdkVersion = zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return liteSdkVersion == null ? zzbzgVar : new zzbzg(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.zza(), true, zZzA);
    }

    public final void zze(zzbnf zzbnfVar) {
        zzbnf adapterCreator;
        if (!((Boolean) zzbcn.zza.zze()).booleanValue()) {
            zzezp.zza(this.zzd, null, zzbnfVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbnfVar = adapterCreator;
        }
        zzezp.zza(atomicReference, null, zzbnfVar);
    }
}
