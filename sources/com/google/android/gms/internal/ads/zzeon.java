package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeon implements zzepn {
    final String zza;
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final zzegx zzd;
    private final Context zze;
    private final zzeyx zzf;
    private final zzegt zzg;
    private final zzdnd zzh;
    private final zzdrm zzi;

    public zzeon(zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, String str, zzegx zzegxVar, Context context, zzeyx zzeyxVar, zzegt zzegtVar, zzdnd zzdndVar, zzdrm zzdrmVar) {
        this.zzb = zzfuuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzegxVar;
        this.zze = context;
        this.zzf = zzeyxVar;
        this.zzg = zzegtVar;
        this.zzh = zzdndVar;
        this.zzi = zzdrmVar;
    }

    public static /* synthetic */ zzfut zzc(zzeon zzeonVar) {
        Map mapZza = zzeonVar.zzd.zza(zzeonVar.zza, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzji)).booleanValue() ? zzeonVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzeonVar.zzf.zzf);
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbw)).booleanValue() ? zzeonVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfqn) mapZza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzeonVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzeonVar.zzf(str, list, bundle, true, true));
        }
        Iterator it2 = ((zzfqn) zzeonVar.zzd.zzb()).entrySet().iterator();
        while (it2.hasNext()) {
            zzehb zzehbVar = (zzehb) ((Map.Entry) it2.next()).getValue();
            String str2 = zzehbVar.zza;
            Bundle bundle3 = zzeonVar.zzf.zzd.zzm;
            arrayList.add(zzeonVar.zzf(str2, Collections.singletonList(zzehbVar.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzehbVar.zzb, zzehbVar.zzc));
        }
        return zzfuj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfut> list2 = arrayList;
                Bundle bundle4 = bundleZzg;
                JSONArray jSONArray = new JSONArray();
                for (zzfut zzfutVar : list2) {
                    if (((JSONObject) zzfutVar.get()) != null) {
                        jSONArray.put(zzfutVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeoo(jSONArray.toString(), bundle4);
            }
        }, zzeonVar.zzb);
    }

    private final zzfua zzf(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfua zzfuaVarZzv = zzfua.zzv(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbs)).booleanValue()) {
            zzfuaVarZzv = (zzfua) zzfuj.zzn(zzfuaVarZzv, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfua) zzfuj.zze(zzfuaVarZzv, Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzbza.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzg(zzbpc zzbpcVar, Bundle bundle, List list, zzeha zzehaVar) throws RemoteException {
        zzbpcVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzehaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return zzeon.zzc(this.zza);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzfut zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbpc zzbpcVarZzb;
        final zzbzs zzbzsVar = new zzbzs();
        if (z2) {
            this.zzg.zzb(str);
            zzbpcVarZzb = this.zzg.zza(str);
        } else {
            try {
                zzbpcVarZzb = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zzbza.zzh("Couldn't create RTB adapter : ", e);
                zzbpcVarZzb = null;
            }
        }
        if (zzbpcVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbn)).booleanValue()) {
                throw null;
            }
            zzeha.zzb(str, zzbzsVar);
        } else {
            final zzeha zzehaVar = new zzeha(str, zzbpcVarZzb, zzbzsVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbs)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzehaVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbx)).booleanValue()) {
                    final zzbpc zzbpcVar = zzbpcVarZzb;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbpcVar, bundle, list, zzehaVar, zzbzsVar);
                        }
                    });
                } else {
                    zzg(zzbpcVarZzb, bundle, list, zzehaVar);
                }
            } else {
                zzehaVar.zzd();
            }
        }
        return zzbzsVar;
    }

    final /* synthetic */ void zze(zzbpc zzbpcVar, Bundle bundle, List list, zzeha zzehaVar, zzbzs zzbzsVar) {
        try {
            zzg(zzbpcVar, bundle, list, zzehaVar);
        } catch (RemoteException e) {
            zzbzsVar.zze(e);
        }
    }
}
