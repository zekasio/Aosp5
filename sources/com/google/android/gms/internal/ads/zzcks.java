package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcks extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final zzbzg zzb;
    private final zzdnd zzc;
    private final zzeav zzd;
    private final zzegx zze;
    private final zzdrk zzf;
    private final zzbxf zzg;
    private final zzdni zzh;
    private final zzdsf zzi;
    private final zzbde zzj;
    private final zzfep zzk;
    private final zzezq zzl;
    private final zzbas zzm;
    private boolean zzn = false;

    zzcks(Context context, zzbzg zzbzgVar, zzdnd zzdndVar, zzeav zzeavVar, zzegx zzegxVar, zzdrk zzdrkVar, zzbxf zzbxfVar, zzdni zzdniVar, zzdsf zzdsfVar, zzbde zzbdeVar, zzfep zzfepVar, zzezq zzezqVar, zzbas zzbasVar) {
        this.zza = context;
        this.zzb = zzbzgVar;
        this.zzc = zzdndVar;
        this.zzd = zzeavVar;
        this.zze = zzegxVar;
        this.zzf = zzdrkVar;
        this.zzg = zzbxfVar;
        this.zzh = zzdniVar;
        this.zzi = zzdsfVar;
        this.zzj = zzbdeVar;
        this.zzk = zzfepVar;
        this.zzl = zzezqVar;
        this.zzm = zzbasVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbza.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbmz zzbmzVar : ((zzbna) it.next()).zza) {
                    String str = zzbmzVar.zzk;
                    for (String str2 : zzbmzVar.zzc) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeaw zzeawVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzeawVarZza != null) {
                        zzezs zzezsVar = (zzezs) zzeawVarZza.zzb;
                        if (!zzezsVar.zzC() && zzezsVar.zzB()) {
                            zzezsVar.zzj(this.zza, (zzecr) zzeawVarZza.zzc, (List) entry.getValue());
                            zzbza.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzezc e) {
                    zzbza.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        zzfaa.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzn) {
            zzbza.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbar.zzc(this.zza);
        this.zzm.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdA)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjk)).booleanValue()) {
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcu)).booleanValue()) {
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String strZzn;
        Runnable runnable;
        zzbar.zzc(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdE)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            strZzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
        } else {
            strZzn = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzn) ? str : strZzn;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdz)).booleanValue() | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaK)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaK)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzckq
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcks zzcksVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckr
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcksVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdse.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbza.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzbza.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbnf zzbnfVar) throws RemoteException {
        this.zzl.zze(zzbnfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbar.zzc(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdz)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbjs zzbjsVar) throws RemoteException {
        this.zzf.zzs(zzbjsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziD)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbsk());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfkw.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
