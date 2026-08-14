package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxp extends zzbsy {
    private final Context zza;
    private final zzfuu zzb;
    private final zzdyh zzc;
    private final zzclp zzd;
    private final ArrayDeque zze;
    private final zzfep zzf;
    private final zzbtz zzg;
    private final zzdye zzh;

    public zzdxp(Context context, zzfuu zzfuuVar, zzbtz zzbtzVar, zzclp zzclpVar, zzdyh zzdyhVar, ArrayDeque arrayDeque, zzdye zzdyeVar, zzfep zzfepVar, byte[] bArr) {
        zzbar.zzc(context);
        this.zza = context;
        this.zzb = zzfuuVar;
        this.zzg = zzbtzVar;
        this.zzc = zzdyhVar;
        this.zzd = zzclpVar;
        this.zze = arrayDeque;
        this.zzh = zzdyeVar;
        this.zzf = zzfepVar;
    }

    private final synchronized zzdxm zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdxm zzdxmVar = (zzdxm) it.next();
            if (zzdxmVar.zzc.equals(str)) {
                it.remove();
                return zzdxmVar;
            }
        }
        return null;
    }

    private static zzfut zzl(zzfut zzfutVar, zzfda zzfdaVar, zzbmf zzbmfVar, zzfen zzfenVar, zzfec zzfecVar) {
        zzblv zzblvVarZza = zzbmfVar.zza("AFMA_getAdDictionary", zzbmc.zza, new zzblx() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzblx
            public final Object zza(JSONObject jSONObject) {
                return new zzbtq(jSONObject);
            }
        });
        zzfem.zzd(zzfutVar, zzfecVar);
        zzfcf zzfcfVarZza = zzfdaVar.zzb(zzfcu.BUILD_URL, zzfutVar).zzf(zzblvVarZza).zza();
        zzfem.zzc(zzfcfVarZza, zzfenVar, zzfecVar);
        return zzfcfVarZza;
    }

    private static zzfut zzm(zzbtn zzbtnVar, zzfda zzfdaVar, final zzeqf zzeqfVar) {
        zzftq zzftqVar = new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzeqfVar.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj));
            }
        };
        return zzfdaVar.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzh(zzbtnVar.zza)).zzf(zzftqVar).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdxm zzdxmVar) {
        zzo();
        this.zze.addLast(zzdxmVar);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbcr.zzd.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(zzfut zzfutVar, zzbtj zzbtjVar) {
        zzfuj.zzq(zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzezw.zza((InputStream) obj));
            }
        }, zzbzn.zza), new zzdxl(this, zzbtjVar), zzbzn.zzf);
    }

    public final zzfut zzb(final zzbtn zzbtnVar, int i) {
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Split request is disabled."));
        }
        zzfaq zzfaqVar = zzbtnVar.zzi;
        if (zzfaqVar == null) {
            return zzfuj.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfaqVar.zzc == 0 || zzfaqVar.zzd == 0) {
            return zzfuj.zzg(new Exception("Caching is disabled."));
        }
        zzbmf zzbmfVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzeqfVarZzp = this.zzd.zzp(zzbtnVar, i);
        zzfda zzfdaVarZzc = zzeqfVarZzp.zzc();
        final zzfut zzfutVarZzm = zzm(zzbtnVar, zzfdaVarZzc, zzeqfVarZzp);
        zzfen zzfenVarZzd = zzeqfVarZzp.zzd();
        final zzfec zzfecVarZza = zzfeb.zza(this.zza, 9);
        final zzfut zzfutVarZzl = zzl(zzfutVarZzm, zzfdaVarZzc, zzbmfVarZzb, zzfenVarZzd, zzfecVarZza);
        return zzfdaVarZzc.zza(zzfcu.GET_URL_AND_CACHE_KEY, zzfutVarZzm, zzfutVarZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(zzfutVarZzl, zzfutVarZzm, zzbtnVar, zzfecVarZza);
            }
        }).zza();
    }

    public final zzfut zzc(zzbtn zzbtnVar, int i) {
        zzdxm zzdxmVarZzk;
        zzfcf zzfcfVarZza;
        zzbmf zzbmfVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzeqfVarZzp = this.zzd.zzp(zzbtnVar, i);
        zzblv zzblvVarZza = zzbmfVarZzb.zza("google.afma.response.normalize", zzdxo.zza, zzbmc.zzb);
        if (((Boolean) zzbcr.zza.zze()).booleanValue()) {
            zzdxmVarZzk = zzk(zzbtnVar.zzh);
            if (zzdxmVarZzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbtnVar.zzj;
            zzdxmVarZzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzdxm zzdxmVar = zzdxmVarZzk;
        zzfec zzfecVarZza = zzdxmVar == null ? zzfeb.zza(this.zza, 9) : zzdxmVar.zze;
        zzfen zzfenVarZzd = zzeqfVarZzp.zzd();
        zzfenVarZzd.zzd(zzbtnVar.zza.getStringArrayList("ad_types"));
        zzdyg zzdygVar = new zzdyg(zzbtnVar.zzg, zzfenVarZzd, zzfecVarZza);
        zzdyd zzdydVar = new zzdyd(this.zza, zzbtnVar.zzb.zza, this.zzg, i, null);
        zzfda zzfdaVarZzc = zzeqfVarZzp.zzc();
        zzfec zzfecVarZza2 = zzfeb.zza(this.zza, 11);
        if (zzdxmVar == null) {
            final zzfut zzfutVarZzm = zzm(zzbtnVar, zzfdaVarZzc, zzeqfVarZzp);
            final zzfut zzfutVarZzl = zzl(zzfutVarZzm, zzfdaVarZzc, zzbmfVarZzb, zzfenVarZzd, zzfecVarZza);
            zzfec zzfecVarZza3 = zzfeb.zza(this.zza, 10);
            final zzfcf zzfcfVarZza2 = zzfdaVarZzc.zza(zzfcu.HTTP, zzfutVarZzl, zzfutVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyf((JSONObject) zzfutVarZzm.get(), (zzbtq) zzfutVarZzl.get());
                }
            }).zze(zzdygVar).zze(new zzfei(zzfecVarZza3)).zze(zzdydVar).zza();
            zzfem.zza(zzfcfVarZza2, zzfenVarZzd, zzfecVarZza3);
            zzfem.zzd(zzfcfVarZza2, zzfecVarZza2);
            zzfcfVarZza = zzfdaVarZzc.zza(zzfcu.PRE_PROCESS, zzfutVarZzm, zzfutVarZzl, zzfcfVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxe
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdxo((zzdyc) zzfcfVarZza2.get(), (JSONObject) zzfutVarZzm.get(), (zzbtq) zzfutVarZzl.get());
                }
            }).zzf(zzblvVarZza).zza();
        } else {
            zzdyf zzdyfVar = new zzdyf(zzdxmVar.zzb, zzdxmVar.zza);
            zzfec zzfecVarZza4 = zzfeb.zza(this.zza, 10);
            final zzfcf zzfcfVarZza3 = zzfdaVarZzc.zzb(zzfcu.HTTP, zzfuj.zzh(zzdyfVar)).zze(zzdygVar).zze(new zzfei(zzfecVarZza4)).zze(zzdydVar).zza();
            zzfem.zza(zzfcfVarZza3, zzfenVarZzd, zzfecVarZza4);
            final zzfut zzfutVarZzh = zzfuj.zzh(zzdxmVar);
            zzfem.zzd(zzfcfVarZza3, zzfecVarZza2);
            zzfcfVarZza = zzfdaVarZzc.zza(zzfcu.PRE_PROCESS, zzfcfVarZza3, zzfutVarZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfut zzfutVar = zzfcfVarZza3;
                    zzfut zzfutVar2 = zzfutVarZzh;
                    return new zzdxo((zzdyc) zzfutVar.get(), ((zzdxm) zzfutVar2.get()).zzb, ((zzdxm) zzfutVar2.get()).zza);
                }
            }).zzf(zzblvVarZza).zza();
        }
        zzfem.zza(zzfcfVarZza, zzfenVarZzd, zzfecVarZza2);
        return zzfcfVarZza;
    }

    public final zzfut zzd(zzbtn zzbtnVar, int i) {
        zzbmf zzbmfVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        if (!((Boolean) zzbcw.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Signal collection disabled."));
        }
        zzeqf zzeqfVarZzp = this.zzd.zzp(zzbtnVar, i);
        final zzepq zzepqVarZza = zzeqfVarZzp.zza();
        zzblv zzblvVarZza = zzbmfVarZzb.zza("google.afma.request.getSignals", zzbmc.zza, zzbmc.zzb);
        zzfec zzfecVarZza = zzfeb.zza(this.zza, 22);
        zzfcf zzfcfVarZza = zzeqfVarZzp.zzc().zzb(zzfcu.GET_SIGNALS, zzfuj.zzh(zzbtnVar.zza)).zze(new zzfei(zzfecVarZza)).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzepqVarZza.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj));
            }
        }).zzb(zzfcu.JS_SIGNALS).zzf(zzblvVarZza).zza();
        zzfen zzfenVarZzd = zzeqfVarZzp.zzd();
        zzfenVarZzd.zzd(zzbtnVar.zza.getStringArrayList("ad_types"));
        zzfem.zzb(zzfcfVarZza, zzfenVarZzd, zzfecVarZza);
        if (((Boolean) zzbck.zze.zze()).booleanValue()) {
            zzdyh zzdyhVar = this.zzc;
            zzdyhVar.getClass();
            zzfcfVarZza.zzc(new zzdxc(zzdyhVar), this.zzb);
        }
        return zzfcfVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzp(zzb(zzbtnVar, Binder.getCallingUid()), zzbtjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzp(zzd(zzbtnVar, Binder.getCallingUid()), zzbtjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzfut zzfutVarZzc = zzc(zzbtnVar, Binder.getCallingUid());
        zzp(zzfutVarZzc, zzbtjVar);
        if (((Boolean) zzbck.zzc.zze()).booleanValue()) {
            zzdyh zzdyhVar = this.zzc;
            zzdyhVar.getClass();
            zzfutVarZzc.zzc(new zzdxc(zzdyhVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(String str, zzbtj zzbtjVar) {
        zzp(zzi(str), zzbtjVar);
    }

    public final zzfut zzi(String str) {
        if (((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzfuj.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfuj.zzh(new zzdxk(this));
        }
        return zzfuj.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(zzfut zzfutVar, zzfut zzfutVar2, zzbtn zzbtnVar, zzfec zzfecVar) throws Exception {
        String strZzc = ((zzbtq) zzfutVar.get()).zzc();
        zzn(new zzdxm((zzbtq) zzfutVar.get(), (JSONObject) zzfutVar2.get(), zzbtnVar.zzh, strZzc, zzfecVar));
        return new ByteArrayInputStream(strZzc.getBytes(zzfnh.zzc));
    }
}
