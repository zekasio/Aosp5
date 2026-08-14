package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvt {
    private final zzfuu zza;
    private final zzduz zzb;
    private final zzgws zzc;
    private final zzfep zzd;
    private final Context zze;
    private final zzbzg zzf;

    public zzdvt(zzfuu zzfuuVar, zzduz zzduzVar, zzgws zzgwsVar, zzfep zzfepVar, Context context, zzbzg zzbzgVar) {
        this.zza = zzfuuVar;
        this.zzb = zzduzVar;
        this.zzc = zzgwsVar;
        this.zzd = zzfepVar;
        this.zze = context;
        this.zzf = zzbzgVar;
    }

    private final zzfut zzh(final zzbtn zzbtnVar, zzdvs zzdvsVar, final zzdvs zzdvsVar2, final zzftq zzftqVar) {
        String str = zzbtnVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfuj.zzf(zzfuj.zzm(zzfua.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfuj.zzg(new zzdvi(1)) : zzfuj.zzf(zzdvsVar.zza(zzbtnVar), ExecutionException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvj
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfuj.zzg(cause2);
            }
        }, this.zza)), zzftqVar, this.zza), zzdvi.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(zzdvsVar2, zzbtnVar, zzftqVar, (zzdvi) obj);
            }
        }, this.zza);
    }

    public final zzfut zza(final zzbtn zzbtnVar) {
        zzftq zzftqVar = new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvo
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                zzbtn zzbtnVar2 = zzbtnVar;
                zzbtnVar2.zzj = new String(zzfsm.zza((InputStream) obj), zzfnh.zzc);
                return zzfuj.zzh(zzbtnVar2);
            }
        };
        final zzduz zzduzVar = this.zzb;
        return zzh(zzbtnVar, new zzdvs() { // from class: com.google.android.gms.internal.ads.zzdvp
            @Override // com.google.android.gms.internal.ads.zzdvs
            public final zzfut zza(zzbtn zzbtnVar2) {
                return zzduzVar.zzb(zzbtnVar2);
            }
        }, new zzdvs() { // from class: com.google.android.gms.internal.ads.zzdvq
            @Override // com.google.android.gms.internal.ads.zzdvs
            public final zzfut zza(zzbtn zzbtnVar2) {
                return this.zza.zzd(zzbtnVar2);
            }
        }, zzftqVar);
    }

    public final zzfut zzb(JSONObject jSONObject) {
        return zzfuj.zzm(zzfua.zzv(zzfuj.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbmc.zza, new zzblx() { // from class: com.google.android.gms.internal.ads.zzdvn
            @Override // com.google.android.gms.internal.ads.zzblx
            public final Object zza(JSONObject jSONObject2) {
                return new zzbtq(jSONObject2);
            }
        }), this.zza);
    }

    final /* synthetic */ zzfut zzc(zzdvs zzdvsVar, zzbtn zzbtnVar, zzftq zzftqVar, zzdvi zzdviVar) throws Exception {
        return zzfuj.zzm(zzdvsVar.zza(zzbtnVar), zzftqVar, this.zza);
    }

    final /* synthetic */ zzfut zzd(zzbtn zzbtnVar) {
        return ((zzdxp) this.zzc.zzb()).zzb(zzbtnVar, Binder.getCallingUid());
    }

    final /* synthetic */ zzfut zze(zzbtn zzbtnVar) {
        return this.zzb.zzc(zzbtnVar.zzh);
    }

    final /* synthetic */ zzfut zzf(zzbtn zzbtnVar) {
        return ((zzdxp) this.zzc.zzb()).zzi(zzbtnVar.zzh);
    }

    public final zzfut zzg(zzbtn zzbtnVar) {
        return zzh(zzbtnVar, new zzdvs() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // com.google.android.gms.internal.ads.zzdvs
            public final zzfut zza(zzbtn zzbtnVar2) {
                return this.zza.zze(zzbtnVar2);
            }
        }, new zzdvs() { // from class: com.google.android.gms.internal.ads.zzdvm
            @Override // com.google.android.gms.internal.ads.zzdvs
            public final zzfut zza(zzbtn zzbtnVar2) {
                return this.zza.zzf(zzbtnVar2);
            }
        }, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvk
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(null);
            }
        });
    }
}
