package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import cz.msebera.android.httpclient.HttpHeaders;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrk {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdnd zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdpr zzl;
    private final zzbzg zzm;
    private final zzdbf zzo;
    private final zzfep zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzs zze = new zzbzs();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdrk(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdnd zzdndVar, ScheduledExecutorService scheduledExecutorService, zzdpr zzdprVar, zzbzg zzbzgVar, zzdbf zzdbfVar, zzfep zzfepVar) {
        this.zzh = zzdndVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdprVar;
        this.zzm = zzbzgVar;
        this.zzo = zzdbfVar;
        this.zzp = zzfepVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdrk zzdrkVar, String str) {
        int i = 5;
        final zzfec zzfecVarZza = zzfeb.zza(zzdrkVar.zzf, 5);
        zzfecVarZza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfec zzfecVarZza2 = zzfeb.zza(zzdrkVar.zzf, i);
                zzfecVarZza2.zzh();
                zzfecVarZza2.zzd(next);
                final Object obj = new Object();
                final zzbzs zzbzsVar = new zzbzs();
                zzfut zzfutVarZzn = zzfuj.zzn(zzbzsVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbE)).longValue(), TimeUnit.SECONDS, zzdrkVar.zzk);
                zzdrkVar.zzl.zzc(next);
                zzdrkVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzfutVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzbzsVar, next, jElapsedRealtime, zzfecVarZza2);
                    }
                }, zzdrkVar.zzi);
                arrayList.add(zzfutVarZzn);
                final zzdrj zzdrjVar = new zzdrj(zzdrkVar, obj, next, jElapsedRealtime, zzfecVarZza2, zzbzsVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(TJAdUnitConstants.String.DATA);
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(TJAdUnitConstants.String.DATA);
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbjv(strOptString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdrkVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzezs zzezsVarZzc = zzdrkVar.zzh.zzc(next, new JSONObject());
                        zzdrkVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrf
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzn(zzezsVarZzc, zzdrjVar, arrayList2, next);
                            }
                        });
                    } catch (zzezc unused2) {
                        zzdrjVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzbza.zzh("", e);
                }
                i = 5;
            }
            zzfuj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrc
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzfecVarZza);
                    return null;
                }
            }, zzdrkVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdrkVar.zzo.zza("MalformedJson");
            zzdrkVar.zzl.zza("MalformedJson");
            zzdrkVar.zze.zze(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "AdapterInitializer.updateAdapterStatus");
            zzfep zzfepVar = zzdrkVar.zzp;
            zzfecVarZza.zzg(e2);
            zzfecVarZza.zzf(false);
            zzfepVar.zzb(zzfecVarZza.zzl());
        }
    }

    private final synchronized zzfut zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzfuj.zzh(strZzc);
        }
        final zzbzs zzbzsVar = new zzbzs();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzbzsVar);
            }
        });
        return zzbzsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbjl(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfec zzfecVar) throws Exception {
        this.zze.zzd(true);
        zzfep zzfepVar = this.zzp;
        zzfecVar.zzf(true);
        zzfepVar.zzb(zzfecVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbjl zzbjlVar = (zzbjl) this.zzn.get(str);
            arrayList.add(new zzbjl(str, zzbjlVar.zzb, zzbjlVar.zzc, zzbjlVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    final /* synthetic */ void zzn(zzezs zzezsVar, zzbjp zzbjpVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzezsVar.zzi(context, zzbjpVar, list);
            } catch (RemoteException e) {
                zzbza.zzh("", e);
            }
        } catch (zzezc unused) {
            zzbjpVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void zzo(final zzbzs zzbzsVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.lang.Runnable
            public final void run() {
                zzbzs zzbzsVar2 = zzbzsVar;
                String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (TextUtils.isEmpty(strZzc)) {
                    zzbzsVar2.zze(new Exception());
                } else {
                    zzbzsVar2.zzd(strZzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzbzs zzbzsVar, String str, long j, zzfec zzfecVar) {
        synchronized (obj) {
            if (!zzbzsVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfep zzfepVar = this.zzp;
                zzfecVar.zzc(HttpHeaders.TIMEOUT);
                zzfecVar.zzf(false);
                zzfepVar.zzb(zzfecVar.zzl());
                zzbzsVar.zzd(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbcq.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbD)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdra
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfut zzfutVarZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrd
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbF)).longValue(), TimeUnit.SECONDS);
                    zzfuj.zzq(zzfutVarZzu, new zzdri(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbjs zzbjsVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdre
            @Override // java.lang.Runnable
            public final void run() {
                zzdrk zzdrkVar = this.zza;
                try {
                    zzbjsVar.zzb(zzdrkVar.zzg());
                } catch (RemoteException e) {
                    zzbza.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
